#!/usr/bin/env python

import shutil
import json
import os
import subprocess
import glob
import time
import datetime
from Queue import Queue
from threading import Thread

rootJavaIntroclass= os.path.dirname(__file__) + "/../dataset"
rootIntroclass="/home/thomas/Downloads/IntroClass"


class Worker(Thread):
	"""Thread executing tasks from a given tasks queue"""
	def __init__(self, tasks):
		Thread.__init__(self)
		self.tasks = tasks
		self.daemon = True
		self.start()
	
	def run(self):
		while True:
			func, args, kargs = self.tasks.get()
			try: func(*args, **kargs)
			except Exception, e: print e
			self.tasks.task_done()

class ThreadPool:
	"""Pool of threads consuming tasks from a queue"""
	def __init__(self, num_threads):
		self.tasks = Queue(num_threads)
		for _ in range(num_threads): Worker(self.tasks)

	def add_task(self, func, *args, **kargs):
		"""Add a task to the queue"""
		self.tasks.put((func, args, kargs))

	def wait_completion(self):
		"""Wait for completion of all the tasks in the queue"""
		self.tasks.join()

def execJava(directory, classname, args):
	"""Execute the java program"""
	cmd = """
cd %s/target/classes;
java  introclassJava.%s "%s"  2> /dev/null 
""" % (directory, classname, args.replace('"', '\\"'))
	p = subprocess.Popen(cmd, shell=True, stderr=subprocess.STDOUT, stdout=subprocess.PIPE)
	out, err = p.communicate()
	return out.strip(' \t\n\r')

def execC(directory, project, args):
	"""Execute the c program"""
	p = subprocess.Popen("""
cd %s;
echo "%s" | ./%s  2> /dev/null 
""" % (directory, args.replace('"', '\\"'), project), shell=True, stderr=subprocess.STDOUT, stdout=subprocess.PIPE)
	out, err = p.communicate()
	return out.strip(' \t\n\r')

equivalentCount = 0
current = 0
notCompiledCount = 0
startTime = time.time()
toRemove = []

def processResult(result, results):
	"""Compare the output of C and Java program"""
	global equivalentCount, current, startTime, notCompiledCount, toRemove
	pathJavaProject = os.path.join(rootJavaIntroclass, result['projectName'], result['projectUser'], result['projectUserVersion'])
	pathCProject    = os.path.join(rootIntroclass, result['projectName'], result['projectUser'], result['projectUserVersion'])
	classname       = result['projectName'] + "_" + result['projectUser'][0:8] + "_" + result['projectUserVersion']
	testsPath = os.path.join(rootIntroclass, result['projectName'], 'tests')
	inputFiles = glob.glob(testsPath + "/whitebox/*.in" )
	inputFiles += glob.glob(testsPath + "/blackbox/*.in" )
	count = 0
	for test in inputFiles:
		f = open(test, 'r')
		input_data = f.read().strip(' \t\n\r').replace("\n", " ").replace('"', '\\"')
		outputJava = execJava(pathJavaProject, classname, input_data)
		outputC = execC(pathCProject, result['projectName'], input_data)
		equivalent = outputJava == outputC
		result['equivalent'] = equivalent
		count += 1
		if not equivalent:
			print result
			print """
Output java Main "%s" (%d):
%s
----
Output C %s "%s" (%d):
%s
----""" % (input_data.replace('"', '\\"'), len(outputJava), outputJava, result['projectName'], input_data.replace('"', '\\"'), len(outputC), outputC)
			folder = os.path.join(rootJavaIntroclass, result['projectName'], result['projectUser'], result['projectUserVersion'])
			toRemove+= [result['projectName']+'/'+result['projectUser']+'/'+result['projectUserVersion']]
			if os.path.isfile(folder):
				shutil.rmtree(folder)
			break
	if result['equivalent']:
		equivalentCount += 1
	current += 1
	print "%s %s (%d/%d, %2.2f%%) %s Equivalent: %d/%d %d" % (
		result['projectName'],
		result['projectUser'][0:3] + ' ' + result['projectUserVersion'],
		current,
		len(results),
		float(current) / float(len(results)) * 100,
		datetime.timedelta(seconds=int(time.time() - startTime)),
		equivalentCount,
		len(results) - notCompiledCount,
		count)

def init():
	global equivalentCount, current, startTime, notCompiledCount, toRemove

	summaryTable = {}
	resultsPath = os.path.join(rootJavaIntroclass, 'introclass.json')
	with open(resultsPath) as data_file:
		results = json.load(data_file)

		pool = ThreadPool(20)
		for id in results:
			result = results[id]
			if not result['compiled']:
				current += 1
				notCompiledCount += 1
				folder = os.path.join(rootJavaIntroclass, result['projectName'], result['projectUser'], result['projectUserVersion'])
				if os.path.isfile(folder):
					shutil.rmtree(folder)
				toRemove+= [result['projectName']+'/'+result['projectUser']+'/'+result['projectUserVersion']]
				#del results[id]
				continue
			if not result['projectName'] in summaryTable:
				summaryTable[result['projectName']] = {
					'total': 0,
					'wbok': 0,
					'bbok': 0,
					'wbko': 0,
					'bbko': 0,
					'allok': 0,
					'bothko': 0
				}
			summaryTable[result['projectName']]['total'] += 1
			summaryTable[result['projectName']]['wbok'] += 1 if result['wbko'] == 0 else 0
			summaryTable[result['projectName']]['bbok'] += 1 if result['bbko'] == 0 else 0
			summaryTable[result['projectName']]['wbko'] += 1 if result['wbko'] > 0 else 0
			summaryTable[result['projectName']]['bbko'] += 1 if result['bbko'] > 0 else 0
			summaryTable[result['projectName']]['allok'] += 1 if result['wbko'] == 0 and result['bbko'] == 0 else 0
			summaryTable[result['projectName']]['bothko'] += 1 if result['wbko'] > 0 and result['bbko'] > 0 else 0
			if "equivalent" in result and result['equivalent']:
				current += 1
				equivalentCount += 1
				continue
			pool.add_task(processResult, result, results)

		pool.wait_completion()

		print "Equivalent: %d/%d" % (equivalentCount,len(results) - notCompiledCount)
		for toR in toRemove:
			del results[toR]
		print json.dumps(summaryTable, indent=4, sort_keys=True)
		resultsTest = {
			'bbko': 0,
			'bbok': 0,
			'wbko': 0,
			'wbok': 0,
			'allok': 0,
			'bothko': 0,
			'total': 0
		}
		print """
| Project   | # wb ok | # wb ko | # bb ok | # bb ko | # all ok | # both ko | # program |
|-----------|---------|---------|---------|---------|----------|-----------|-----------|"""
		for id in summaryTable:
			summary = summaryTable[id]
			resultsTest['wbok'] += summary['wbok']
			resultsTest['wbko'] += summary['wbko']
			resultsTest['bbok'] += summary['bbok']
			resultsTest['bbko'] += summary['bbko']
			resultsTest['allok'] += summary['allok']
			resultsTest['bothko'] += summary['bothko']
			resultsTest['total'] += summary['total']
			print "| {0:9} | {1:7} | {2:7} | {3:7} | {4:7} | {5:8} | {6:9} | {7:9} |".format(
				id,
				summary['wbok'],
				summary['wbko'],
				summary['bbok'],
				summary['bbko'],
				summary['allok'],
				summary['bothko'],
				summary['total'])
		print "| {0:9} | {1:7} | {2:7} | {3:7} | {4:7} | {5:8} | {6:9} | {7:9} |".format(
				6,
				resultsTest['wbok'],
				resultsTest['wbko'],
				resultsTest['bbok'],
				resultsTest['bbko'],
				resultsTest['allok'],
				resultsTest['bothko'],
				resultsTest['total'])
		file = open(resultsPath, "w")
		file.write(json.dumps(results, indent=4, sort_keys=True))
		file.close()

if __name__ == '__main__':
	init()