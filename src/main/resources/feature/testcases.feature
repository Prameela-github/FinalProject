@Practice.AutomationTesting.in
Feature: Practice_Automation_Testing website

@TS_01_Login
Scenario: Login in to the web application
Given open the url in a browser
When url is launched click the MyAccount button
When enter the email id and password in the excel sheet to register click login and assert

@TS_02
Scenario: Demosite registration-Invalid details
Given the user launch the browser
When the user opens the Practice automation website
Then the user enter the email and password
Then click_the_login_button
Then click_the Demo site button
Then fill all the invalid details in the register form
Then click on submit button

@TS_03
Scenario: Demosite -Mandatory fields
Given open_the_url_in a browser
When the url is opened click on demosite
Then fill only mandatory fields in the register form
Then click_on submit button

@TS_04
Scenario: Demosite-Refresh
Given the user has launched the browser
When the url is open and click on demosite
Then fill all the details
Then click on refresh

@TS_05
Scenario: Demosite registration-Leave mandatory fields
Given the url is open in the browser
When the demosite is clicked
When the details are given and leaving the mandatory fields
Then click on submit and take screenshot