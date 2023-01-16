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

WebUI.setText(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/input_Login To ANIME-W_username'), 
    'koonlookhin')

WebUI.setEncryptedText(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/input_Username_password'), 
    'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/input_Username_password'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/input_Selected search_input'), 
    'initial')

WebUI.sendKeys(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/input_Selected search_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/img_initial d extra stage 2_rounded shadow _68c8d3'))

WebUI.click(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/li_1'))

WebUI.click(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/a_5'))

WebUI.click(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/button_Add Favorite'))

WebUI.click(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/button_Bookmark'))

WebUI.click(findTestObject('Object Repository/TEST ADD FAVORITE AND GIVE SCORE/Page_ir_pj_fontend/div_initial d fifth stageYou give a score 5 Delete'))

