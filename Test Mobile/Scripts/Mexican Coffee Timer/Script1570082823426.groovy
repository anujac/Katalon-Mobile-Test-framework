import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_IOSApp, RunConfiguration.getProjectDir())
Mobile.startApplication(appPath, true)

Mobile.verifyElementText(findTestObject('ios/Spy/XCUIElementTypeStaticText - Mexican'), 'Mexican')

Mobile.tap(findTestObject('ios/XCUIElementTypeStaticText - Mexican'), 0)

Mobile.tap(findTestObject('ios/XCUIElementTypeButton - Start'), 0)

Mobile.tap(findTestObject('ios/XCUIElementTypeStaticText - 317'), 0)

Mobile.tap(findTestObject('ios/XCUIElementTypeButton - Stop'), 0)

Mobile.tap(findTestObject('ios/XCUIElementTypeButton - Back'), 0)


Mobile.closeApplication()

