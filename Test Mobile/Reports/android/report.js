$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/VerifyLastItemsInTheList.feature");
formatter.feature({
  "name": "Verify last item in the List",
  "description": "  As a user, \n  I want to scroll to the end of the screen, \n  So that I can interact with the last item in the list.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@android"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@android"
    }
  ]
});
formatter.step({
  "name": "that I have started the android application",
  "keyword": "Given "
});
formatter.match({
  "location": "VerifyLastItemOnScreenSTeps.that_I_have_started_an_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate the application to Graphics form",
  "keyword": "And "
});
formatter.match({
  "location": "VerifyLastItemOnScreenSTeps.i_navigate_the_application_to_Graphics_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scroll to \"Xfermodes\" text",
  "keyword": "When "
});
formatter.match({
  "location": "VerifyLastItemOnScreenSTeps.i_scroll_to_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the current screen should show \"Xfermodes\" text after scrolling",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyLastItemOnScreenSTeps.the_current_screen_should_show_text_after_scrolling(String)"
});
formatter.result({
  "status": "passed"
});
});