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


if (Execute == "Y") {

WebUI.callTestCase(findTestCase('Call_TestCase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/VelocityPayment/DashboardPage/a_Access No Convenience Fees'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/IssueTransactionsPage/a_Debit'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/SelectPersonalorCorporateCheckPage/input_Personal_achtype'))

WebUI.click(findTestObject('Object Repository/VelocityPayment/SelectPersonalorCorporateCheckPage/input'))

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__firstName'), FNOC)

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__lastName'), LNOC)

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__address'), AL1)

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__zip'), ZIPCode)

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__routingNumber'), RTN)

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__accountNumber'), AN)

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__amount'), Amount)

WebUI.setText(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input__userDefined1'), UDF1)

WebUI.click(findTestObject('Object Repository/VelocityPayment/PersonalCheckPaymentEntryPage/input_UDF2_submit'))

WebUI.verifyTextPresent(ExpectedResult, false)
}
else
{
	println("Value of Execute is not Y")
	}





