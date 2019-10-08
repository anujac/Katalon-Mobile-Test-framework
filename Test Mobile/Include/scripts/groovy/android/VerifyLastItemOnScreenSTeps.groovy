package android
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager as AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType as MobileDriverType
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import static internal.GlobalVariable.* 
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
import groovy.json.JsonSlurper
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class VerifyLastItemOnScreenSTeps {
	def appPath 
	def driver
	def capabilitiesJsonFile

	@Given("that I have started the (.*) application")
	public void that_I_have_started_an_application(String appPlatform) {

		if("ios".contentEquals(appPlatform)) {
			appPath = PathUtil.relativeToAbsolutePath(G_IOSApp, RunConfiguration.getProjectDir())
			capabilitiesJsonFile = new File(PathUtil.relativeToAbsolutePath("Data/DeviceList/Kobiton-iPhone-6s.json", RunConfiguration.getProjectDir()))
			driver = MobileDriverType.IOS_DRIVER
		} else {
			appPath = PathUtil.relativeToAbsolutePath(G_AndroidApp, RunConfiguration.getProjectDir())
			driver = MobileDriverType.ANDROID_DRIVER
			capabilitiesJsonFile = new File(PathUtil.relativeToAbsolutePath("Data/DeviceList/Kobiton-LG.json", RunConfiguration.getProjectDir()))
		}
		
		//Uncomment to run test on simulator/emulator
		//Mobile.startApplication(appPath, false)
		
		//For Kobiton devices -
		DesiredCapabilities capabilities = new DesiredCapabilities(new JsonSlurper().parse(capabilitiesJsonFile))
		AppiumDriverManager.createMobileDriver(driver, capabilities, new URL(G_KobitonServerUrl))
	}

	@Given("I navigate the application to Graphics form")
	public void i_navigate_the_application_to_Graphics_form() {
		Mobile.tap(findTestObject('Application/android.widget.TextView - Graphics'), G_Timeout)
	}

	@When("I scroll to {string} text")
	public void i_scroll_to_text(String scrollToText) {
		Mobile.scrollToText(scrollToText)
	}

	@Then("the current screen should show {string} text after scrolling")
	public void the_current_screen_should_show_text_after_scrolling(String scrolledToText) {
		'Get item\'s label'
		def itemText = Mobile.getText(findTestObject('Application/Graphics/android.widget.TextView - '+scrolledToText), G_Timeout)

		Mobile.verifyEqual(itemText, scrolledToText)

		Mobile.closeApplication()
	}
}