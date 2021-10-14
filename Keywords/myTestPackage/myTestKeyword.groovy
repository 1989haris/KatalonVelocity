package myTestPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class myTestKeyword {
	@Keyword
	def mySum(int a, int b) {

		println "My sum is "+(a+b)
	}
	@Keyword
	def mySub(int a, int b) {
		println "MY sub is "+ (a-b)
	}

	@Keyword
	def myDivide(int a,int b) {
		println "My Divide is "+ (a/b)
	}

	@Keyword
	def myMultiply(int a, int b) {
		println "My Multiply is "+ (a*b)
	}

	@Keyword
	def myAdd(int a, int b) {
		println "My Add is "+ (a+b)
	}
}









