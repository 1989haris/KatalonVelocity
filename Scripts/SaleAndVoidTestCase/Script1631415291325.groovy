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

//To Open the Browser
WebUI.openBrowser('')

//To Open the Url demo.velocitypayment.com/admin/imtiazdemo
WebUI.navigateToUrl('https://demo.velocitypayment.com/admin/imtiazdemo')

//To set text iahmed as username in the username section
WebUI.setText(findTestObject('Object Repository/VelocityPayment/LoginPage/input_Username_user'), 'iahmed')

//to set encryptedtext that is password in the password section
WebUI.setEncryptedText(findTestObject('Object Repository/VelocityPayment/LoginPage/input_Password_password'),
	'ReH0Zrvn+OVqGz5NDrNXZg==')

//click the password button or image on the page.
WebUI.click(findTestObject('Object Repository/VelocityPayment/LoginPage/input_Password_button2'))
//select the link for payment application
WebUI.click(findTestObject('Object Repository/VelocityPayment/DashboardPage/a_Access No Convenience Fees'))
//
WebUI.click(findTestObject('Object Repository/VelocityPayment/IssueTransactionsPage/a_Authorization  Capture (Sale) - Keyboard Entry'))

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input__cardName'), 'pappu')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input__address'), '23 broad street')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input__zip'), '235456')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/SalePaymentEntryPage/input_City_city'), 'Elizabeth')

//to select an state from the dropdown menu.
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

//To Verify a particular text is present on the page.
WebUI.verifyTextPresent('Transaction Successful', false)

//To Grab the entire text of the page on Receipt Page.
result = WebUI.getText(findTestObject('Object Repository/VelocityPayment/ReceiptPage/div_Transaction Successful'))

//println("The Result: "+result)

// Grab the Remittance id from the Text of the Page.(to get AR from HARIS.)
def remID = result.substring(203, 227).trim()
//def abc = 123
//def xyz = 'My Name is Haris'
System.out.println('remID: ' + remID)

//WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/VelocityPayment/IssueTransactionsPage/a_Issue Transactions'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/IssueTransactionsPage/a_Credit or Void'))

WebUI.setText(findTestObject('Object Repository/VelocityPayment/CreditOrVoidPage/input_Search Value_searchValue'), remID)

WebUI.click(findTestObject('Object Repository/VelocityPayment/CreditOrVoidPage/input_AdvancedSearch_sbutton'))

result2 = WebUI.getText(findTestObject('Object Repository/VelocityPayment/SearchResultsPage/div_document'))

//println("The Result2: "+result2)

def paymentID = result2.substring(249,256).trim()

println("The paymentID is: "+paymentID)


/*
 * WebUI.click(findTestObject('Object
 * Repository/VelocityPayment/SearchResultsPage/a_2717329'))
 * 
 * WebUI.click(findTestObject('Object
 * Repository/VelocityPayment/TransactionDetailsPage/a_Void this transaction'))
 * 
 * WebUI.click(findTestObject('Object
 * Repository/VelocityPayment/VoidConfirmPage/input_Date_submit'))
 * 
 * //Verify that Transaction Successful text is present on the VoidReceiptPage.
 * WebUI.verifyTextPresent('Transaction Successful', false)
 */

















