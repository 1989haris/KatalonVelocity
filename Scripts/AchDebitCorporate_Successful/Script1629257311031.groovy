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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.velocitypayment.com/admin/imtiazdemo')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/LoginPage/input_Username_user'), 'iahmed')

WebUI.setEncryptedText(findTestObject('Object Repository/VelocityPayment/LoginPage/input_Password_password'), 
    'ReH0Zrvn+OVqGz5NDrNXZg==')

WebUI.click(findTestObject('Object Repository/VelocityPayment/LoginPage/input_Password_button2'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/DashboardPage/a_Access No Convenience Fees'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/IssueTransactionsPage/a_Debit'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/SelectPersonalorCorporateCheckPage/input_Corporate_achtype'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/SelectPersonalorCorporateCheckPage/input'))

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input__companyName'), 
    'Electroshack')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input__address'), 
    '23 Broad Street')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input_Address Line 2_address2'), 
    'Main Street')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input__zip'), '256072691')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input__city'), 'AMHERSTDALE')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input__zip'), '256072')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input__routingNumber'), 
    '256072691')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input__accountNumber'), 
    '4111111111111111')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input__amount'), 
    '111')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input_Email Address_emailAddress'), 
    'electro@gmail.com')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input__userDefined1'), 
    'electro')

WebUI.click(findTestObject('Object Repository/VelocityPayment/CorporateCheckPaymentEntryPage/input_UDF2_submit'))

WebUI.verifyTextPresent('Transaction Successful', false)

