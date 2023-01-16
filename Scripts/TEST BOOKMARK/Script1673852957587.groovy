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

WebUI.setText(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/input_Login To ANIME-W_username'), 
    'koonlookhin')

WebUI.setEncryptedText(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/input_Username_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/button_Submit'))

WebUI.click(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/button_Bookmark'))

WebUI.click(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/div_initial d final stageYou give a score 5 Delete'))

WebUI.click(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/div_initial d second stageYou give a score _20bd8b'))

WebUI.click(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/div_road of narutoYou give a score 4 Delete'))

WebUI.click(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/div_narutoYou give a score 1 Delete'))

WebUI.click(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/div_bleach sennen kessenhenYou give a score_d38d47'))

WebUI.click(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/div_black lagoonYou give a score 1 Delete'))

WebUI.click(findTestObject('Object Repository/TEST OPEN BOOK MARK/Page_ir_pj_fontend/div_naruto x utYou give a score 1 Delete'))

