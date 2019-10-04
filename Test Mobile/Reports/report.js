$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ios/CoffeeTimer.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ios"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "that I have started the ios application",
  "keyword": "Given "
});
formatter.match({
  "location": "VerifyLastItemOnScreenSTeps.that_I_have_started_an_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the Mexican coffee option",
  "keyword": "Then "
});
formatter.match({
  "location": "CoffeeTimerSteps.I_see_the_coffee_option_step(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I start the timer for Mexican coffee",
  "keyword": "When "
});
formatter.match({
  "location": "CoffeeTimerSteps.I_check_for_the_value_in_step(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I stop the timer at 3.17",
  "keyword": "And "
});
formatter.match({
  "location": "CoffeeTimerSteps.I_want_to_write_a_step_with_name(String)"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Object Object Repository/ios/XCUIElementTypeStaticText - 317 not found\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.stepFailed(KeywordMain.groovy:50)\n\tat com.kms.katalon.core.mobile.keyword.internal.MobileKeywordMain.stepFailed(MobileKeywordMain.groovy:40)\n\tat com.kms.katalon.core.mobile.keyword.builtin.TapKeyword$_tap_closure1.doCall(TapKeyword.groovy:79)\n\tat com.kms.katalon.core.mobile.keyword.builtin.TapKeyword$_tap_closure1.call(TapKeyword.groovy)\n\tat com.kms.katalon.core.mobile.keyword.internal.MobileKeywordMain.runKeyword(MobileKeywordMain.groovy:21)\n\tat com.kms.katalon.core.mobile.keyword.builtin.TapKeyword.tap(TapKeyword.groovy:86)\n\tat com.kms.katalon.core.mobile.keyword.builtin.TapKeyword.execute(TapKeyword.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:56)\n\tat com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords.tap(MobileBuiltInKeywords.groovy:520)\n\tat com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords$tap$1.call(Unknown Source)\n\tat ios.CoffeeTimerSteps.I_want_to_write_a_step_with_name(CoffeeTimerSteps.groovy:60)\n\tat ✽.I stop the timer at 3.17(Include/features/ios/CoffeeTimer.feature:10)\n",
  "status": "failed"
});
formatter.step({
  "name": "I have the option to start timer again",
  "keyword": "Then "
});
formatter.match({
  "location": "CoffeeTimerSteps.I_can_start_timer_step(String)"
});
formatter.result({
  "status": "skipped"
});
});