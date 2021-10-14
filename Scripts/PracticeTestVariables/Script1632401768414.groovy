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

//Define the Variable and then assign the value.
def name ="Raghav"
println name

//Define the Variable
def name1
//Assign the Value to the Variable.
name1 = "Mohit"
println name1

//Defining Methods()
// The Method Sum has two Parameters/Arguments/Variables.Any code inside the curly brackets will belong to the Method.
/*
 * def sum(int a, int b) { println "Sum is "+(a+b) }
 */
//Calling the Method sum with the same number of Arguments, in this case 2 arguments int a, int b.
//sum(5,2)

//Define Methods().Defining and Calling the Method in the same script.

//def sub(int a, int b) {
	//println "Sub is "+ (a-b)
//}

//sub(10,5)

//

CustomKeywords.'myTestPackage.myTestKeyword.mySum'(5, 2)

CustomKeywords.'myTestPackage.myTestKeyword.mySub'(9, 2)

CustomKeywords.'myTestPackage.myTestKeyword.myDivide'(10, 9)

CustomKeywords.'myTestPackage.myTestKeyword.myMultiply'(8, 7)

CustomKeywords.'myTestPackage.myTestKeyword.myAdd'(7, 12)




