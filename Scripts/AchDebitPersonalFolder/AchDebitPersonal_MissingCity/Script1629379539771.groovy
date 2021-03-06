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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Call_TestCase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/VelocityPayment/DashboardPage/a_Access No Convenience Fees'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/IssueTransactionsPage/a_Debit'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/SelectPersonalorCorporateCheckPage/input_Personal_achtype'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/SelectPersonalorCorporateCheckPage/input'))

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__firstName'), 'guddu')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__lastName'), 'munnu')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__address'), '7 broad street')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__zip'), '3421')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__city'), '')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/select_Select OneArmed Forces AmericasArmed_3dceb0'))

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__routingNumber'), '256072691')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__accountNumber'), '4111111111111111')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__amount'), '111')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__userDefined1'), 'Guddu')

WebUI.click(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input_UDF2_submit'))

WebUI.verifyTextPresent('City is required', false)

