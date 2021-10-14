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

public class SalespaymentEntryPage {
	@Keyword
	def paymententry() {


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
	}
}
