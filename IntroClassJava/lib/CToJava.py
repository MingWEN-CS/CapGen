#!/usr/bin/env python

import xml.etree.ElementTree as ET
import os
import re
import shutil
import glob
import subprocess
import md5
import atexit
import time
import datetime
import json

domain = '{http://www.srcML.org/srcML/src}'

indent = "    "
variables = {}
methods = {}
prevType = None

def parseType(type):
	global prevType
	if type is None:
		return None
	if type.get("ref") == "prev":
		return prevType
	name = type.find(domain  + 'name')
	if(name is None):
		return None
	name = name.text
	if name == "int" or name == "integer":
		prevType = "IntObj"
		return "IntObj"
	elif name == "char":
		prevType = "CharObj"
		return "CharObj"
	elif name == "float":
		prevType = "FloatObj"
		return "FloatObj"
	elif name == "long":
		prevType = "LongObj"
		return "LongObj"
	elif name == "double":
		prevType = "DoubleObj"
		return "DoubleObj"
	return name

def parseParameters(parameter_list):
	parms = []
	for parm in parameter_list:
		type = parseElement(parm, parameter_list)
		if(type is None):
			continue
		parms += [type.replace(".value", "") ]
	pass
	return parms
def parseFunction(function):
	global indent , methods
	type = parseElement(function.find(domain  + 'type'), parent=function)
	modifier = 'public'
	name = function.find(domain  + 'name').text
	parameter_list = parseParameters(function.find(domain  + 'parameter_list'))
	blockElem = function.find(domain  + 'block')
	hasReturn = False
	if name == 'main':
		type = 'void'
		name = 'exec'
		parameter_list = []
		returnElems = blockElem.iterfind(".//" + domain + "return")
		for returnElem in returnElems:
			content = "if(true)return;"
			returnElem.tag = domain + "expr_stmt"
			returnElem.clear()
			returnElem = ET.SubElement(returnElem, domain + "expr")
			returnLit = ET.SubElement(returnElem, domain + "literal")
			returnLit.text = content
			hasReturn = True
	content = indent + modifier + " " + type + " " + name +" (" + (", ".join(parameter_list)) + ") throws Exception "
	block = parseElement(blockElem, parent=function)
	content += block + "\n"
	methods[name] = type
	return content


def parseDecl(typeDecl, content = "", type=None, parent=None):
	global variables
	if parent is not None:
		(parentType, _) = parseTag(parent.tag)
	typeElem = typeDecl.find(domain  + 'type')
	if typeElem is not None:
		type = parseType(typeElem)
		if typeElem.get("ref") is None:
			content += type + " "
		typeDecl.remove(typeElem)

	nameElem = typeDecl.find(domain  + 'name')
	if(nameElem is None):
		if(type == "void"):
			return ""
	else:
		typeDecl.remove(nameElem)
	nameIndex = nameElem.find(domain + "index")
	if(nameIndex is not None):
		name = parseElement(nameElem.find(domain + "name"))
		if type == "DoubleObj":
			type = "double"
		elif type == "IntObj":
			type = "int"
		elif type == "CharObj":
			type = "char"
		elif type == "LongObj":
			type = "long"
		elif type == "FloatObj":
			type = "float"
		variables[name] = type;
		content = type + "[]" + ' ' + name 
		if parentType != "parameter_list":
			content += " = new " + type + parseElement(nameIndex)
		nameElem.remove(nameIndex)
	else:
		name = parseElement(nameElem)
		name = name.replace(".value", "")
		variables[name] = type;
		content += name
	if len(typeDecl) == 0:
		if(nameIndex is None):
			if parentType != "parameter_list":
				return content + " = new " + type + "()"
		return content
	elem = typeDecl[0]
	(tag, dd) = parseTag(elem.tag)
	if tag == "init":
		if parentType != "parameter_list":
			content += " = new " + type + "(" + parseElement(elem[0]) + ")"
		typeDecl.remove(elem)
		if len(typeDecl) == 0:
			return content
		elem = typeDecl[0]
		(tag, dd) = parseTag(elem.tag)
	if tag == "operator":
		content += parseElement(elem) + " "
		typeDecl.remove(elem)
		if len(typeDecl) == 0:
			return content
		elem = typeDecl[0]
		(tag, dd) = parseTag(elem.tag)
	if tag == "name":
		content = parseDecl(typeDecl, content, type, parent)
	return content

def parseDeclStmt (decl):
	global indent, variables
	content = ""
	type = None
	decls = decl.findall(domain + "decl")
	for elem in decls:
		string = parseElement(elem, parent=decl)
		if string is None:
			continue
		type = parseElement(elem.find(domain + "type"), parent=decl)
		(tag, dd) = parseTag(elem.tag)
		if tag == "decl":
			type 
		content += string + (" = new " + parseElement(decl[0].find(domain + "type")) + "()" if type is not None and not " new " in string  else "")
		if elem != decls[-1]:
			content += ", "
	
	return indent + content + ";\n"

def parseExprStmt (expr):
	global indent
	if(expr[0][0].text == "*"):
		expr[0].remove(expr[0][0])
	expr = parseElement(expr[0])
	if(expr is None):
		return None
	return indent + expr + ";\n"

def parseExpr (expr):
	global variables
	content = ""
	if(expr[0].text == "*"):
		expr.remove(expr[0])
	prev = None
	for elem in expr:
		#if(prev is not None and parseTag(prev.tag)[0] == "operator" and (elem.text == "*" )) :
		#	continue
		string = parseElement(elem)
		if string is None:
			continue
		content += string
		prev = elem
	for variable in variables:
		content = content.replace("&%s.value" % variable, "%s.value" % variable)
	return content

def parseReturn (content):
	global indent
	string = parseElement(content[0])
	if string is None:
		return None
	return indent + "return " + string + ";\n"

def parseAgrs(argument_list):
	args = []
	for elem in argument_list:
		arg = parseElement(elem[0])
		for variable in variables:
			arg = arg.replace("&%s.value"%variable, variable)
		args+=  [arg]
	return args

def parseName(nameElem):
	global variables
	string = nameElem.find(domain + "name")
	if string is not None:
		string = ""
		for elem in nameElem:
			string += parseElement(elem)
	else:
		string = nameElem.text
		if string == "final":
			string += "l"
		elif string == "new":
			string += "w"
		elif string in variables and variables[string] in ['IntObj', 'DoubleObj', 'CharObj', 'FloatObj', 'LongObj']:
			string += ".value"
		elif string == "EOF":
			string = "(char) -1"
	return string

tran_line = 0
def parseCall (methodCall):
	global indent, methods, tran_line, variables
	name = parseElement(methodCall.find(domain  + 'name'))
	if(name is None):
		return None

	args = parseAgrs(methodCall.find(domain  + 'argument_list'))
	if(name == "printf"):
		args[0] = args[0].replace("lf", "f").replace("%lld", "%d").replace("%i", "%d").replace("%.0d", "%d")
		name = "output += (String.format(" + ", ".join(args) + "))"
		return name
	elif name == "getchar":
		name = 'scanner.findInLine(".").charAt(0);'
		return name
	elif name == "putchar":
		name = "output += (" + ", ".join(args) + ")"
		return name
	elif(name == "char"):
		name = "(char) (" + ", ".join(args) + ")"
		return name
	elif(name == "int"):
		name = "(int) (" + ", ".join(args) + ")"
		return name
	elif name == "float":
		name = "(float) (" + ", ".join(args) + ")"
		return name
	elif(name == "ceil"):
		name = "Math.ceil(" + ", ".join(args) + ")"
		return name
	elif(name == "log10"):
		name = "Math.log10(" + ", ".join(args) + ")"
		return name
	elif(name == "floor"):
		name = "Math.floor(" + ", ".join(args) + ")"
		return name
	elif(name == "abs" or name == "fabs"):
		name = "Math.abs(" + ", ".join(args) + ")"
		return name
	elif(name == "pow"):
		name = "Math.pow(" + ", ".join(args) + ")"
		return name
	elif(name == "strlen"):
		variable = args[0]
		name = "%s.length" % variable
		return name
	elif name == "scanf":
		tran_line += 1
		content = ""
		for arg in args[1::]:
			key = arg.replace(".value", "").replace("*","").replace("&","")
			if key not in variables:
				continue
			else:
				type = variables[key]
				if type == "DoubleObj":
					content += indent + arg + ' = scanner.nextDouble();\n'
				elif type == "IntObj":
					content += indent + arg + ' = scanner.nextInt();\n'
				elif type == "CharObj":
					content += indent + ("try {\n" + 
					indent + "    " + arg + ' = scanner.findInLine(".").charAt(0);\n' + 
					indent + "} catch (java.lang.NullPointerException e) {\n" + 
					indent + "    " + arg + " = '\\n';\n" + 
					indent + "} \n")
				elif type == "LongObj":
					content += indent + arg + ' = scanner.nextLong();\n'
				elif type == "FloatObj":
					content += indent + arg + ' = scanner.nextFloat();\n'
				else:
					content += indent + arg + ' = scanner.next().toCharArray();\n'
		if len(content) > 2:
			return content[len(indent):-2]
		else:
			return ""
	elif name == "fgets":
		variable = args[0]
		name = variable + ' = (scanner.nextLine() + "\\n").toCharArray()'
		return name
	elif name == "gets":
		variable = args[0]
		name = variable + ' = scanner.nextLine().toCharArray()'
		return name
	if name in methods:
		newArgs = []
		for arg in args:
			for variable in variables:
				arg = arg.replace("%s.value" % variable, variable)
			newArgs += [arg]
		args = newArgs
	modifierElem = methodCall.find('{http://www.srcML.org/srcML/modifier}modifier')
	modifier = parseElement(modifierElem)
	if modifier is None:
		modifier = ""
	return name + modifier + '(' + ", ".join(args) + ')'

def parseCondition(expr):
	global variables
	condition = ""
	for elem in expr:
		string = parseElement(elem)
		if string is None:
			continue
		condition += string
	if condition == "1":
		condition = "true"
	elif condition == "0":
		condition = "false"
	if(condition.replace(".value", "") in variables and (
		variables[condition.replace(".value", "")] == "IntObj" or
		variables[condition.replace(".value", "")] == "FloatObj" or
		variables[condition.replace(".value", "")] == "DoubleObj" or 
		variables[condition.replace(".value", "")] == "LongObj")) :
		condition+= " != 0"
	return condition
def parseWhile (expr):
	global indent
	content = parseElement(expr.find(domain + "block"))
	if content is None:
		content = indent + "    " + parseElement(expr.find(domain + "expr_stmt"))
	if content is None:
		raise
	condition = parseElement(expr.find(domain + "condition"))
	try:
		return indent + "while(" + condition + ")" +  content + "\n"
	except Exception, e:
		for elem in expr:
			print elem
		raise e
	

def parseFor (expr):
	global indent
	init = parseElement(expr[0].find(domain + "init")[0])
	condition = parseElement(expr[0].find(domain + "condition"))
	incr = parseElement(expr[0].find(domain + "incr")[0])
	content = parseElement(expr.find(domain + "block"))
	if content is None:
		content = indent + "    " + parseElement(expr[3])
	return indent + "for(" + init +"; " + condition + "; " + incr +") " +  content + "\n"

def parseSwitch (expr):
	global indent
	value = parseElement(expr.find(domain + "condition"))
	content = parseElement(expr.find(domain + "block"))
	if content is None:
		content = indent + "    " + parseElement(expr.find(domain + "expr_stmt"))
	return indent + "switch(" + value +") " +  content + "\n"

def parseCase (expr):
	global indent
	indent += "    "
	value = parseElement(expr[0])
	content = ""
	for elem in expr[1::]:
		content += parseElement(elem)
	indent = indent[4::]
	return indent + "case " + value +":\n" +  content

def parseDefault (expr):
	global indent
	indent += "    "
	content = ""
	for elem in expr:
		content += parseElement(elem)
	indent = indent[4::]
	return indent + "default:\n" +  content + "\n"

def parseIf (expr):
	global indent, variables
	condition = parseElement(expr.find(domain + "condition"))
	content = indent + "if(" + condition + ")"
	thenExpr = expr.find(domain + "then")
	content += parseElement(thenExpr)
	previousIsBlock = thenExpr.find(domain + 'block') != None
	for elseif in expr.findall(domain + 'elseif'):
		elseifExpr = elseif[0]
		elseifContent = parseElement(elseifExpr)[len(indent):-1]
		if not previousIsBlock:
			content += indent
		content += " else " + elseifContent
		previousIsBlock = elseifExpr.find(domain + 'block') != None
	contentElse =  parseElement(expr.find(domain + "else"))
	if contentElse is not None:
		if not previousIsBlock:
			content += indent
		content += " else " + contentElse
	
	return content + "\n"

def parseDo (expr):
	global indent
	content = parseElement(expr.find(domain + "block"))
	if content is None:
		content = "\n" + indent + parseElement(expr.find(domain + "expr_stmt")) + "\n" + indent
	condition = parseElement(expr.find(domain + "condition"))
	return indent + "do " + content + " while(" + condition + ");\n"

def parseDefine(expr):
	global indent
	content = indent + "public static int "
	macro = parseElement(expr.find('{http://www.srcML.org/srcML/cpp}macro')[0])
	value = expr.find('{http://www.srcML.org/srcML/cpp}value').text
	content += macro + " = " + value + ";\n"
	return content

def parseBlock(block):
	global indent
	indent += "    "
	content = "{\n"
	for elem in block:
		string = parseElement(elem)
		if string is None:
			continue
		content += string
	indent = indent[4::]
	return content + indent + "}"
def parseElement(elem, parent=None):
	global indent, methods
	if elem is None:
		return None
	(tagName, tagDomain) = parseTag(elem.tag)
	if (tagName == 'include' or
	   tagName == 'comment'):
		# ignore
		return ""
	if (tagName == "modifier"):
		return elem.text
	if (tagName == "define"):
		return parseDefine(elem)	
	if tagName == "function_decl":
		methods[parseElement(elem.find(domain + "name"))] = parseElement(elem.find(domain + "type"))
		return ""
	if (tagName == "function"):
		return parseFunction(elem)
	if tagName == "decl_stmt":
		return parseDeclStmt(elem)
	if tagName == "parameter":
		return parseDecl(elem[0], parent=parent)
	if tagName == "decl":
		return parseDecl(elem, parent=parent)
	if tagName == "expr_stmt":
		return parseExprStmt(elem)
	if tagName == "expr":
		return parseExpr(elem)
	if tagName == "return":
		return parseReturn(elem)
	if tagName == "operator":
		if elem.text in ['+', '-', '&&', '||', '/', '%', '=', '==', '<', '<=', '>', '>=']:
			return " %s " % elem.text
		return elem.text
	if tagName == "literal":
		if 'type' in elem.attrib and elem.attrib['type'] == 'number':
			number = elem.text
			if "." not in number and (float(number) > 2147483647 or float(number) < -2147483647):
				return elem.text+"L"
		return elem.text
	if tagName == "sizeof":
		return parseElement(elem[0][0][0]) + ".length"
	if tagName == "name":
		return parseName(elem)
	if tagName == "type":
		return parseType(elem)
	if tagName == "index":
		content = parseElement(elem.find(domain + "expr"))
		if content is None:
			return "[0]"
		return "[" + content + "]"
	if tagName == "break":
		return indent + "break;\n"
	if tagName == "continue":
		return indent + "continue;\n"
	if tagName == "empty_stmt":
		return indent + ";\n"
	if tagName == "call":
		return parseCall(elem)
	if tagName == "if":
		return parseIf(elem)
	if tagName == "do":
		return parseDo(elem)
	if tagName == "condition":
		return parseCondition(elem)
	if tagName == "while":
		return parseWhile(elem)
	if tagName == "for":
		return parseFor(elem)
	if tagName == "switch":
		return parseSwitch(elem)
	if tagName == "case":
		return parseCase(elem)
	if tagName == "default":
		return parseDefault(elem)
	if tagName == "block":
		return parseBlock(elem)
	if (tagName == "then" or
		tagName == "else"):
		content = ""
		for t in elem:
			(tag, _) = parseTag(t.tag)
			contentTmp = parseElement(t)
			if tag != "block":
				content += "\n    " + contentTmp
			else:
				content += contentTmp
		return  content
	print elem
	raise 
	pass

def parseTag(tag):
	split = tag.split('}')
	return (
		split[1], split[0][1:]
	)

total = 0
errors = 0
uniqueProject = {}
filePath = os.path.join(os.path.dirname(__file__), '../dataset/introclass.json')
rootDataset=os.path.join(os.path.dirname(__file__), '../dataset/')
try:
	results = json.load(open(filePath, "r"))	
except Exception, e:
	results = {}


def init():
	global tran_line, indent, variables, methods, total, errors, uniqueProject, results
	path = os.path.join(os.path.dirname(__file__), 'data', 'dataset.xml')
	tree = ET.parse(path)
	ids = {}
	cFile = tree.getroot()
	totalCfile = len(cFile)
	startTime = time.time()
	for file in cFile:
		total += 1
		indent = "    "
		variables = {}
		methods = {}
		tran_line = 0
		filename = file.attrib['filename'].replace(".c", "")
		projectName = os.path.basename(filename)
		projectUserVersion = os.path.basename(filename.replace("/" + projectName, ""))
		projectUser = os.path.basename(filename.replace("/" + projectUserVersion + "/" + projectName, ""))
		if projectUserVersion == "tests":
			continue
		if projectName not in ids:
			ids[projectName] = 1
		id = ids[projectName]
		print "%s_%d (%d/%d, %2.2f%%) %s" % (projectName, id, total, totalCfile, float(total) / float(totalCfile) * 100, datetime.timedelta(seconds=int(time.time() - startTime)))
		className = (projectName + "_" + projectUser[0:8] + "_" + projectUserVersion)
		header = """package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class %s {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		%s mainClass = new %s();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

""" % (className, className, className)
		content = ""
		for elem in file:
			string = parseElement(elem)
			if(string is not None):
				content += string
		content += "}"
		if(content not in uniqueProject):
			uniqueProject[content] = []
			uniqueProject[content] += [filename]
		else:
			uniqueProject[content] += [filename]
			continue
		if ("%s/%s/%s" % (projectName, projectUser, projectUserVersion) in results and 
			'equivalent' in results["%s/%s/%s" % (projectName, projectUser, projectUserVersion)] and
			results["%s/%s/%s" % (projectName, projectUser, projectUserVersion)]['equivalent']):
			id += 1
			ids[projectName] = id
			continue
		createTestClass(filename, projectName, projectUser, projectUserVersion)
		createPom(projectName, projectUser, projectUserVersion)
		filePath = os.path.join(os.path.dirname(__file__), '../dataset', projectName, projectUser, projectUserVersion, "src/main/java/introclassJava" )
		if not os.path.exists(filePath):
			os.makedirs(filePath)
		fo = open(filePath + '/%s.java' % className, 'w+')
		fo.write(header + content)
		fo.close()
		p = subprocess.Popen("""cd %s/../../../../;
	MAVEN_OPTS= -XX:TieredStopAtLevel=1
	mvn -T 1C test -am --offline
	""" % (filePath), shell=True, stderr=subprocess.STDOUT, stdout=subprocess.PIPE)
		out, err = p.communicate()
		regexbb = re.compile(ur'BlackboxTest\nTests run: (\d+), Failures: (\d+), Errors: (\d+), Skipped: (\d+)')
		matchObjbb = re.search(regexbb, out)
		regexwb = re.compile(ur'WhiteboxTest\nTests run: (\d+), Failures: (\d+), Errors: (\d+), Skipped: (\d+)')
		matchObjwb = re.search(regexwb, out)
		result = {
			"projectName": projectName,
			"projectUser": projectUser,
			"projectUserVersion": projectUserVersion,
			"compiled": False,
			'bbko': 0,
			'bbok': 0,
			'wbko': 0,
			'wbok': 0
		}
		if matchObjbb is not None:
			result["compiled"] = True
			result["bbko"] = int(matchObjbb.group(2))
			result["bbok"] =  int(matchObjbb.group(1)) - result["bbko"]
			result["wbko"] = int(matchObjwb.group(2))
			result["wbok"] =  int(matchObjwb.group(1)) - result["wbko"]
		else:
			regex2 = re.compile(ur'OK \((\d+) tests\)')
			matchObj = re.search(regex2, out)
			if matchObj is not None:
				result["compiled"] = True
				result["failing"] = 0
				result["passed"] = int(matchObj.group(1))
			else:
				result["error"] = out
				errors += 1
				print id, filename, out 
		results["%s/%s/%s" % (projectName, projectUser, projectUserVersion)] = result
		id += 1
		saveResults()
		ids[projectName] = id

def createPom(projectName, projectUser, projectUserVersion):
	content = """<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>fr.inria.lille.spirals</groupId>
	<artifactId>introclassJava</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>%s-%s-%s</name>
	<description>introclassJava dataset</description>
	<inceptionYear>2015</inceptionYear>
	<properties>
		<default.encoding>UTF-8</default.encoding>
		<maven.compiler.source>1.7</maven.compiler.source>
		<maven.compiler.target>1.7</maven.compiler.target>
	</properties>
	<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
		</dependency>
	</dependencies>
</project>
""" % (projectName,  projectUser, projectUserVersion)
	filePath = os.path.join(os.path.dirname(__file__), '../dataset', projectName, projectUser, projectUserVersion )
	if not os.path.exists(filePath):
		os.makedirs(filePath)
	fo = open(filePath + '/pom.xml', 'w+')
	fo.write(content)
	pass

def createTest(name, className, tests):
	content = """package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class %s%sTest {
""" % (className, name)
	for test in sorted(tests):
		base = os.path.basename(test).replace(".in", "")
		f = open(test, 'r')
		input_data = f.read().strip(' \t\n\r').replace("\n", " ").replace('"', '\\"')
		f = open(test.replace(".in", ".out"), 'r')
		expected_data = f.read().strip(' \t\n\r').replace("\n", " ").replace('"', '\\"')
		content+="""
	@Test(timeout=1000)
	public void test%s() throws Exception {
		%s mainClass = new %s();
		String expected = "%s";
		mainClass.scanner = new java.util.Scanner("%s");
		mainClass.exec();
		String out = mainClass.output.replace("\\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}""" % (base, className, className, expected_data, input_data)
	content += "\n}"
	return content

def createTestClass(file, projectName, projectUser, projectUserVersion):
	testPath = os.path.join(os.path.dirname(file), '../../tests/')
	whitebox = glob.glob("/" + testPath + "whitebox/*.in" )
	blackbox = glob.glob("/" + testPath + "blackbox/*.in" )

	filePath = os.path.join(os.path.dirname(__file__), '../dataset', projectName, projectUser, projectUserVersion, "src/test/java/introclassJava" )
	if not os.path.exists(filePath):
		os.makedirs(filePath)
	fo = open(filePath + '/%sWhiteboxTest.java' % (projectName + '_' + projectUser[0:8] + '_' + projectUserVersion), 'w+')
	fo.write(createTest("Whitebox", (projectName + '_' + projectUser[0:8] + '_' + projectUserVersion), whitebox))
	fo = open(filePath + '/%sBlackboxTest.java' % (projectName + '_' + projectUser[0:8] + '_' + projectUserVersion) , 'w+')
	fo.write(createTest("Blackbox", (projectName + '_' + projectUser[0:8] + '_' + projectUserVersion), blackbox))

def saveResults():
	global results, rootDataset
	filePath = os.path.join(rootDataset, 'introclass.json')
	file = open(filePath, "w")
	file.write(json.dumps(results, indent=4, sort_keys=True))
	file.close()

def printSummary():
	global results, total, errors, uniqueProject, rootDataset
	saveResults()
	nbEquivalent = 0
	resultsTest = {
		'bbko': 0,
		'bbok': 0,
		'wbko': 0,
		'wbok': 0
	}
	print "# total %d" % total
	print "# compilation errors %d" %errors
	print "# compiled projects %d" %(len(uniqueProject) - errors)
	print "# unique projects %d\n" %(len(uniqueProject))

	print """
| Project   | Id      | Compiled | Equivalent | # wb ok | # wb ko | # bb ok | # bb ko | # ok | # ko |
|===========|=========|==========|============|=========|=========|=========|=========|======|======|"""
	for id in results:
		project = results[id]
		if 'equivalent' in project and project['equivalent']: 
			nbEquivalent += 1
		resultsTest['wbok'] += project['wbok']
		resultsTest['wbko'] += project['wbko']
		resultsTest['bbok'] += project['bbok']
		resultsTest['bbko'] += project['bbko']
		print "| {1:9} | {0:7} | {2:8} | {3:10} | {4:7} | {5:7} | {6:7} | {7:7} | {8:4} | {9:4} |".format(
			project['projectUser'][0:3] + ' ' + project['projectUserVersion'],
			project['projectName'],
			'-' if project['compiled'] else 'False',
			'True' if 'equivalent' in project and project['equivalent'] else 'False',
			project['wbok'],
			project['wbko'],
			project['bbok'],
			project['bbko'],
			project['bbok'] + project['wbok'],
			project['bbko'] + project['wbko'])
	print "|===========|=========|==========|============|=========|=========|=========|=========|======|======|"
	print "| {1:9} | {0:7} | {2:8} | {3:10} | {4:7} | {5:7} | {6:7} | {7:7} | {8:4} | {9:4} |".format(
			len(uniqueProject),
			6,
			len(uniqueProject) - errors,
			nbEquivalent,
			resultsTest['wbok'],
			resultsTest['wbko'],
			resultsTest['bbok'],
			resultsTest['bbko'],
			resultsTest['bbok'] + resultsTest['wbok'],
			resultsTest['bbko'] + resultsTest['wbko'])

atexit.register(printSummary)
init()


