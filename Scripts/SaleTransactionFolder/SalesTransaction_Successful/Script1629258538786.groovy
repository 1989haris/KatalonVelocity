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

WebUI.click(findTestObject('Object Repository/VelocityPayment/IssueTransactionsPage/a_Authorization  Capture (Sale) - Keyboard Entry'))

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input__cardName'), 'pappu')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input__address'), '23 broad street')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input__zip'), '235456')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input_City_city'), 'Elizabeth')

WebUI.selectOptionByValue(findTestObject('VelocityPayment/SalePaymentEntryPage/select_State'), 
    'Arizona', true)

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input__cardNumber'), '4111111111111111')

WebUI.selectOptionByValue(findTestObject('VelocityPayment/SalePaymentEntryPage/select_MM'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('VelocityPayment/SalePaymentEntryPage/select_YYYY'), 
    '2021', true)

WebUI.selectOptionByValue(findTestObject('VelocityPayment/SalePaymentEntryPage/Select_TransactionCategory'), 
    'MOTO', true)

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input__amount'), '111.00')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input_Email Address_emailAddress'), 
    'pappu@gmail.com')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input__userDefined1'), 'pappu')

WebUI.click(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input_UDF2_submit'))

WebUI.verifyTextPresent('Transaction Successful', false)

