package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(   // com.stepdef path
		features = "src/main/java/com/features",
		glue = "com.stepdef",   //glue mins stepdef path
		plugin = "html:target",
		monochrome=true  ,   //for readable output
		dryRun= false   ,   //true dryRun to compile feature file
//		tags = {"@login ,@error"}//two Scenario run use tags
		tags = "@login"
		)

public class TestRunner {

}
