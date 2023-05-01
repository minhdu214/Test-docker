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

WebUI.navigateToUrl('https://uat.ccm.tutenlabs.dev/')

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_Tutenlabs/input_Usuario o correo electrnico_email'), 'userkatalon@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Tutenlabs/input_Contrasea_password'), 'vM3z4HUS+Q/F3V5GW3e8Tg==')

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/span_Suscripciones'))

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/svg_Control_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/span_Administracin'))

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/span_Protocolos'))

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/span_Crear nuevo'))

WebUI.closeBrowser()

