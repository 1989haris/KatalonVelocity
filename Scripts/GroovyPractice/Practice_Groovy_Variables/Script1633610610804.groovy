import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//How to define Variables in Groovy.

def name = 'Haris'
println name

//How to use the method + (concatination)

def _name = 'Monu'
println 'Name is '+_name

//some more ways for eg: "${}"

def _name1 = 'Sonu'
println "Name is ${_name1}"

//groovy is case sensitive

def x = 12
def X = 23
println x
println X

//Groovy is dynamically typed language.The type of the Variable is resolved during the runtime?

def _name2 = 'Munnu'
_name2 = 12
println = _name2
 
//Multiple assignments in Groovy.

def (a,b,c) = [3,2,3]
println a
println b
println c

def (String f, int d, Double h) = [39,22,99]
println a
println b
println c








