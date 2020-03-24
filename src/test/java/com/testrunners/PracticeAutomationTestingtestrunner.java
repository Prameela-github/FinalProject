package com.testrunners;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\main\\resources\\feature\\testcases.feature",
plugin = {"pretty", "html:reports/cucumber-html-report"},
tags = {"@TS_01_Login,@TS_02,@TS_03,@TS_04,@TS_05"},
glue = {"com/stepdefinitions"},
monochrome = true
)

public class PracticeAutomationTestingtestrunner {

}
