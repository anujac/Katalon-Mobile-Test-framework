import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager as AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType as MobileDriverType
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

Mobile.comment('Story: Verify correct alarm message')

Mobile.comment('Given that user has started an application')

'Get full directory\'s path of android application'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)
//String kobitonServerUrl = 'https://anujac:c68a9208-7408-47c5-a86f-f5ff8bfb8904@api.kobiton.com/wd/hub'
//
//DesiredCapabilities capabilities = new DesiredCapabilities()
//
//// The generated session will be visible to you only. 
//capabilities.setCapability('sessionName', 'Automation test session')
//
//capabilities.setCapability('sessionDescription', '')
//
//capabilities.setCapability('deviceOrientation', 'portrait')
//
//capabilities.setCapability('captureScreenshots', true)
//
//// The maximum size of application is 500MB
//// By default, HTTP requests from testing library are expired
//// in 2 minutes while the app copying and installation may
//// take up-to 30 minutes. Therefore, you need to extend the HTTP
//// request timeout duration in your testing library so that
//// it doesn't interrupt while the device is being initialized.
//capabilities.setCapability('app', 'kobiton-store:40231')
//
//capabilities.setCapability('deviceGroup', 'KOBITON')

// For deviceName, platformVersion Kobiton supports wildcard
// character *, with 3 formats: *text, text* and *text*
// If there is no *, Kobiton will match the exact text provided
capabilities.setCapability('deviceName', 'Xperia X')

capabilities.setCapability('platformVersion', '7.0')

capabilities.setCapability('platformName', 'Android')

AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(kobitonServerUrl))

Mobile.comment('And he navigates the application to Graphics form')

Mobile.tap(findTestObject('Application/android.widget.TextView - Graphics'), GlobalVariable.G_Timeout)

Mobile.comment('When he scroll to Xfermodes text')

Mobile.scrollToText('Xfermodes')

Mobile.comment('Then the current screen should show Xfermodes text after scrolling')

'Get item\'s label'
def itemText = Mobile.getText(findTestObject('Application/Graphics/android.widget.TextView - Xfermodes'), GlobalVariable.G_Timeout)

Mobile.verifyEqual(itemText, 'Xfermodes')

Mobile.closeApplication()

