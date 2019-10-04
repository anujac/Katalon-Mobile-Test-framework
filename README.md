# Katalon Mobile Test framework
This repo has a POC for Mobile tests (android and iOS) using Cucumber in Katalon studio.
Katalon studio uses Appium for interacting with the apps.


### Open the "Test Mobile" project folder in Katalon studio. 
There are 2 test cases in the **Test Cases** folder, 1 each for android and ios. 

If you have android emulator running, you only need to run the test with android option. Open **RunCucumberAndroid** test case, find the green play button on the top nav, click on the down arrow to see the run options and select **Android** from the list.


Similarly, if you have xcode dev-tools (ios simulator) setup on your machine, open **RunCucumberIOS** file from Test Cases folder.
Select **iOS** option from the Run test list.


Cucumber feature files are inside the **Include** folder. 

To run the android and iOS tests in parallel, open the test suite collection **Mobile Tests** from the **Test Suites** folder. The run configurations have been setup already. Just click on the **Execute** button


Some links to refer for writing tests

https://docs.katalon.com/katalon-studio/docs/katalon_mobile_recorder_introduction.html#script-mode
https://appiumpro.com/editions
