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

WebUI.navigateToUrl('http://localhost:8080/login')

WebUI.setText(findTestObject('Object Repository/TEST INPUT DESCRIPTION/Page_ir_pj_fontend/input_Login To ANIME-W_username'), 
    'koonlookhin')

WebUI.setEncryptedText(findTestObject('Object Repository/TEST INPUT DESCRIPTION/Page_ir_pj_fontend/input_Username_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/TEST INPUT DESCRIPTION/Page_ir_pj_fontend/button_Submit'))

WebUI.click(findTestObject('Object Repository/TEST INPUT DESCRIPTION/Page_ir_pj_fontend/li_Selected search'))

WebUI.click(findTestObject('Object Repository/TEST INPUT DESCRIPTION/Page_ir_pj_fontend/a_Description'))

WebUI.setText(findTestObject('Object Repository/TEST INPUT DESCRIPTION/Page_ir_pj_fontend/input_Description_input'), 'moments prior to naruto uzumakis birth a huge demon')

WebUI.sendKeys(findTestObject('Object Repository/TEST INPUT DESCRIPTION/Page_ir_pj_fontend/input_Description_input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TEST INPUT DESCRIPTION/Page_ir_pj_fontend/img_Logout_rounded shadow h-90 w-80'))

WebUI.click(findTestObject('Object Repository/TEST INPUT DESCRIPTION/Page_ir_pj_fontend/p_moments prior to naruto uzumakis birth a _6b993c'))

WebUI.check(findTestObject('TEST INPUT DESCRIPTION/Page_ir_pj_fontend/input_Description_input'))

WebUI.closeBrowser()

