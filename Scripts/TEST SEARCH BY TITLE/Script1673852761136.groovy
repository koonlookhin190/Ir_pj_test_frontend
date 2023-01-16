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

WebUI.setText(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/input_Login To ANIME-W_username'), 'koonlookhin')

WebUI.click(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/input_Username_password'), 'MKsyMw//mPnhSW0oO9apCcK7/ppdwbjc')

WebUI.sendKeys(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/input_Username_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/div_Login To ANIME-WUsernamePassword Submit'))

WebUI.setEncryptedText(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/input_Username_password'), 'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/input_Username_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/li_Selected search'))

WebUI.click(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/a_Title'))

WebUI.setText(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/input_Title_input'), 'naruto')

WebUI.sendKeys(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/input_Title_input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/h3_naruto'))

WebUI.click(findTestObject('Object Repository/SEARCH BY TITLE/Page_ir_pj_fontend/p_naruto'))

