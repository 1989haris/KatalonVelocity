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

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__zip'), '342156')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__routingNumber'), '256072691')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__accountNumber'), '4111111111111111')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__amount'), '5')

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__userDefined1'), 'Guddu')

WebUI.click(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input_UDF2_submit'))

WebUI.verifyTextPresent('Transaction Successful', false)

//Grab entire text from the ReceiptPage.
result3 = WebUI.getText(findTestObject('Object Repository/VelocityPayment/ReceiptPage/div_Transaction Successful'))

//Grab the remittance ID from the captured ReceiptPage.
def remID = result3.substring(203,227).trim()

//print remittanceID.
System.out.println('remID is:'+remID)

//Click IssueTransactions link.
WebUI.click(findTestObject('Object Repository/VelocityPayment/IssueTransactionsPage/a_Issue Transactions'))

//Click onlineCheck CreditorVoid.
WebUI.click(findTestObject('Object Repository/VelocityPayment/OnlineDebitIssueTransactionsPage/a_Credit or Void'))

//Set remittanceID in the searchBar that we grab from the ReceiptPage on the CreditorVoid Page.
WebUI.setText(findTestObject('Object Repository/VelocityPayment/CreditOrVoidPage/input_Search Value_searchValue'),remID)

//Click the Search button on the CreditorVoid page.
WebUI.click(findTestObject('Object Repository/VelocityPayment/CreditOrVoidPage/input_AdvancedSearch_sbutton'))

//Grab the entire text from the ReceiptPage.
result4 = WebUI.getText(findTestObject('Object Repository/VelocityPayment/SearchResultsPage/div_document'))

//Define the Variable(PaymentId) that stores the value from the result4 variable by using the method substring.
def PaymentId = result4.substring(249,256).trim()

//what does println step will do in this case?
println("the paymentId is: "+PaymentId)

// The name of the method and it's parameters will define the Method Signature.
def remIDLink = WebUI.modifyObjectProperty(findTestObject('Object Repository/VelocityPayment/SearchResultsPage/a_2718322'), 'text', 'equals', PaymentId, true )


WebUI.click(remIDLink)







