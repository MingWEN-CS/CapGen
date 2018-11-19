#!/usr/bin/env python

import json
import os

rootDataset = os.path.join(os.path.dirname(__file__), '../dataset/')
introclassJSONPath = os.path.join(os.path.dirname(__file__), '../dataset/introclass.json')

with open(introclassJSONPath) as data_file:
	results = json.load(data_file)

	summaryTable = {}
	equivalentCount = 0
	current = 0

	for id in results:
		result = results[id]
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
| Project   | # wb ok | # wb ko | # bb ok | # bb ko | # both ko | # program |
|-----------|---------|---------|---------|---------|-----------|-----------|"""
	for id in summaryTable:
		summary = summaryTable[id]
		resultsTest['wbok'] += summary['wbok']
		resultsTest['wbko'] += summary['wbko']
		resultsTest['bbok'] += summary['bbok']
		resultsTest['bbko'] += summary['bbko']
		resultsTest['bothko'] += summary['bothko']
		resultsTest['total'] += summary['total']
		print "| {0:9} | {1:7} | {2:7} | {3:7} | {4:7} | {5:9} | {6:9} |".format(
			id,
			summary['wbok'],
			summary['wbko'],
			summary['bbok'],
			summary['bbko'],
			summary['bothko'],
			summary['total'])
	print "| {0:9} | {1:7} | {2:7} | {3:7} | {4:7} | {5:9} | {6:9} |".format(
			6,
			resultsTest['wbok'],
			resultsTest['wbko'],
			resultsTest['bbok'],
			resultsTest['bbko'],
			resultsTest['bothko'],
			resultsTest['total'])