package com.cucumber.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "./src/test/resources/features/UserLIst.feature" , 
		glue = "com.cucumber.stepdefination",
		monochrome = true, 
		dryRun = false,
				plugin = { "pretty" ,
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		)
public class UserLilstTestRunner {

}
