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

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA Web/Page_CURA Healthcare Service/p_Seoul CURA Healthcare Center'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA Web/Page_CURA Healthcare Service/p_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA Web/Page_CURA Healthcare Service/p_None'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA Web/Page_CURA Healthcare Service/p_29052024'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA Web/Page_CURA Healthcare Service/p_Booking Seoul'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA Web/Page_CURA Healthcare Service/a_Go to Homepage'), 0)

