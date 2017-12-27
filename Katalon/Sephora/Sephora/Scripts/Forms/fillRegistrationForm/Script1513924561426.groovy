import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('RegistrationPage/Prefix Radio Button'))

WebUI.setText(findTestObject('RegistrationPage/Firstname Input Textfield'), firstname)

WebUI.setText(findTestObject('RegistrationPage/Lastname Input Textfield'), lastname)

WebUI.selectOptionByValue(findTestObject('RegistrationPage/Day Dropdown'), day, true)

WebUI.selectOptionByValue(findTestObject('RegistrationPage/Month Dropdown'), month, true)

WebUI.selectOptionByValue(findTestObject('RegistrationPage/Year Dropdown'), year, true)

WebUI.setText(findTestObject('RegistrationPage/Email Input Textfield'), WebUI.callTestCase(findTestCase('Binaries/createEmailAddress'), 
        [:], FailureHandling.STOP_ON_FAILURE))

WebUI.setText(findTestObject('RegistrationPage/Password  Input Textfield'), password)

WebUI.setText(findTestObject('RegistrationPage/Password Confirmation Input Textfield'), password)

WebUI.click(findTestObject('RegistrationPage/Input Agreement Checkbox'))

