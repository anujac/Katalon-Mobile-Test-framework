package ios
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class CoffeeTimerSteps {

	@When("I start the timer for (.*) coffee")
	def I_check_for_the_value_in_step(String coffeeType) {
		Mobile.tap(findTestObject('Object Repository/ios/Spy/XCUIElementTypeStaticText - Mexican'), 0)
		Mobile.tap(findTestObject('Object Repository/ios/XCUIElementTypeButton - Start'), 0)
	}

	@When("I stop the timer at (.*)")
	def I_want_to_write_a_step_with_name(String time) {
		Mobile.tap(findTestObject('Object Repository/ios/XCUIElementTypeStaticText - 317'), 0)
	}


	@Then("I see the (.*) coffee option")
	def I_see_the_coffee_option_step(String coffeeType) {
		Mobile.verifyElementText(findTestObject('Object Repository/ios/Spy/XCUIElementTypeStaticText - Mexican'), coffeeType)
	}

	@Then("I have the option to start timer again")
	def I_can_start_timer_step(String coffeeType) {
		Mobile.verifyElementVisible(findTestObject('Object Repository/ios/XCUIElementTypeButton - Start'), true)
		Mobile.closeApplication()
	}
}