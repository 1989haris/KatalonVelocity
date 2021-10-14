package velocityPackage

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

public class achPersonalPaymentEntryPage 
{
	@Keyword
	def achPersonal()
	
	{
		
		WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__firstName'), 'guddu')
		
		WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__lastName'), 'munnu')
		
		WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__address'), '7 broad street')
		
		WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__zip'), '342156')
		
		WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__routingNumber'), '256072691')
		
		WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__accountNumber'), '4111111111111111')
		
		WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__amount'), '10')
		
		WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__userDefined1'), 'Guddu')
		
	}

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	