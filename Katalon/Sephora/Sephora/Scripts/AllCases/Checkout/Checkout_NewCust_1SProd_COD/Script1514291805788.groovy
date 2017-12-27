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

WebUI.callTestCase(findTestCase('UnitCases/openSite'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Buy Eye Shadow Palette - Prism/span_Add to Basket'))

WebUI.click(findTestObject('Page_Buy Eye Shadow Palette - Prism/a_Checkout'))

WebUI.click(findTestObject('Page_Basket/span_Checkout'))

WebUI.setText(findTestObject('Page_Customer Login/input_loginusername'), 'rbdtest@mailinator.com')

WebUI.setText(findTestObject('Page_Customer Login/input_loginpassword'), 'Password123')

WebUI.click(findTestObject('Page_Customer Login/span_Log in'))

WebUI.click(findTestObject('Page_Checkout/input_shipping_method'))

WebUI.click(findTestObject('Page_Checkout/button_Continue'))

WebUI.click(findTestObject('Page_Checkout/input_paymentmethod'))

WebUI.click(findTestObject('Page_Checkout/button_Continue_1'))

WebUI.click(findTestObject('Page_Checkout/h2_Order review'))

WebUI.click(findTestObject('Page_Checkout/img_product-image'))

WebUI.click(findTestObject('Page_Checkout/h2_Huda Beauty'))

WebUI.click(findTestObject('Page_Checkout/a_Liquid Matte Minis - The Red'))

WebUI.click(findTestObject('Page_Checkout/span_1'))

WebUI.click(findTestObject('Page_Checkout/span_158.00 AED'))

WebUI.click(findTestObject('Page_Checkout/img_product-image_1'))

WebUI.click(findTestObject('Page_Checkout/h2_Huda Beauty'))

WebUI.click(findTestObject('Page_Checkout/a_Liquid Matte Lipstick'))

WebUI.click(findTestObject('Page_Checkout/dd_Trophy Wife'))

WebUI.click(findTestObject('Page_Checkout/span_1'))

WebUI.click(findTestObject('Page_Checkout/span_105.00 AED'))

WebUI.click(findTestObject('Page_Checkout/span_505.00 AED'))

WebUI.click(findTestObject('Page_Checkout/span_0.00 AED'))

WebUI.click(findTestObject('Page_Checkout/span_20.00 AED'))

WebUI.click(findTestObject('Page_Checkout/span_525.00 AED'))

WebUI.click(findTestObject('Page_Checkout/label_Please agree to the  bef'))

WebUI.click(findTestObject('Page_Checkout/div_fullname'))

WebUI.click(findTestObject('Page_Checkout/div_12 the core'))

WebUI.click(findTestObject('Page_Checkout/div_12 the core'))

WebUI.click(findTestObject('Page_Checkout/div_city-region-postcode'))

WebUI.click(findTestObject('Page_Checkout/div_United Arab Emirates'))

WebUI.click(findTestObject('Page_Checkout/div_T'))

WebUI.click(findTestObject('Page_Checkout/div_fullname_1'))

WebUI.click(findTestObject('Page_Checkout/div_12 the core'))

WebUI.click(findTestObject('Page_Checkout/div_12 the core'))

WebUI.click(findTestObject('Page_Checkout/div_city-region-postcode_1'))

WebUI.click(findTestObject('Page_Checkout/div_United Arab Emirates'))

WebUI.click(findTestObject('Page_Checkout/div_T'))

WebUI.click(findTestObject('Page_Checkout/div_Shipping Method'))

WebUI.click(findTestObject('Page_Checkout/dd_2-3 business days'))

WebUI.click(findTestObject('Page_Checkout/p_subtitle'))

WebUI.rightClick(findTestObject('Page_Checkout/button_Order'))

WebUI.acceptAlert()

