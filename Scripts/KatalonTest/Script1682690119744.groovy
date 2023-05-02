import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String chromedriverLog = System.getProperty("user.dir") + "/chromedriver.log"
println chromedriverLog
System.setProperty("webdriver.chrome.logfile", chromedriverLog);
System.setProperty("webdriver.chrome.verboseLogging", "true");
System.setProperty('webdriver.chrome.driver', 'PATH\\chromedriver.exe')
WebDriver driver = new ChromeDriver()
DriverFactory.changeWebDriver(driver)
driver.get('https://www.google.com')
WebUI.delay(30)

WebUI.setViewPortSize(1920, 1080)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_Tutenlabs/input_Usuario o correo electrnico_email'), 'userkatalon@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Tutenlabs/input_Contrasea_password'), 'vM3z4HUS+Q/F3V5GW3e8Tg==')

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/span_Suscripciones'))

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/svg_Control_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/span_Administracin'))

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/span_Protocolos'))

WebUI.click(findTestObject('Object Repository/Page_Tutenlabs/span_Crear nuevo'))

WebUI.closeBrowser()

