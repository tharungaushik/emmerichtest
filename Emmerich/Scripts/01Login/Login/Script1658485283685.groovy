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

WebUI.navigateToUrl('http://3.21.160.104/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login/Page_Home  The Northside Sun/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Log in  The Northside Sun/input_Username or Email Address_name'), 
    'rajapriya.m@innoppl.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Log in  The Northside Sun/input_Password_pass'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Login/Page_Log in  The Northside Sun/button_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Home  The Northside Sun/a_My account'), 'My account')

