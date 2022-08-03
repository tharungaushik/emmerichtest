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

WebUI.callTestCase(findTestCase('Post/01Submit new post'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Createpost/Page_Public Post  The Northside Sun/p_How to Log InIt is not necessary to regis_6403c2'), 
    0)

WebUI.click(findTestObject('Object Repository/Createpost/Page_Public Post  The Northside Sun/a_Create Post'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Createpost/Page_Public Post  The Northside Sun/select_PublicFriends'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Createpost/Page_Public Post  The Northside Sun/input_Rajapriya Muthuvel_feed-title'), 
    'Test Post')

WebUI.setText(findTestObject('Object Repository/Createpost/Page_Public Post  The Northside Sun/textarea_Rajapriya Muthuvel_feed-body'), 
    'Posting it for Automation testing')

WebUI.click(findTestObject('Object Repository/Createpost/Page_Public Post  The Northside Sun/button_Image'))

WebUI.setText(findTestObject('Object Repository/Createpost/Page_Public Post  The Northside Sun/textarea_X_field_friends_images_caption_0'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/Createpost/Page_Public Post  The Northside Sun/button_Post'))

WebUI.navigateToUrl('https://www.northsidesun.com/friends/my-post?post=new')

