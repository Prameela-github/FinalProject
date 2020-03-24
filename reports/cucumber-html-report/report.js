$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/testcases.feature");
formatter.feature({
  "line": 2,
  "name": "Practice_Automation_Testing website",
  "description": "",
  "id": "practice-automation-testing-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Practice.AutomationTesting.in"
    }
  ]
});
formatter.scenario({
  "line": 35,
  "name": "Demosite registration-Leave mandatory fields",
  "description": "",
  "id": "practice-automation-testing-website;demosite-registration-leave-mandatory-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@TS_05"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "the url is open in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "the demosite is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "the details are given and leaving the mandatory fields",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "click on submit and take screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "Leavemandatory_step.the_url_is_open_in_the_browser()"
});
formatter.result({
  "duration": 15765747600,
  "status": "passed"
});
formatter.match({
  "location": "Leavemandatory_step.the_demosite_is_clicked()"
});
formatter.result({
  "duration": 1002645600,
  "status": "passed"
});
formatter.match({
  "location": "Leavemandatory_step.the_details_are_given_and_leaving_the_mandatory_fields()"
});
formatter.result({
  "duration": 11568452500,
  "status": "passed"
});
formatter.match({
  "location": "Leavemandatory_step.click_on_submit_and_take_screenshot()"
});
formatter.result({
  "duration": 8892391800,
  "status": "passed"
});
});