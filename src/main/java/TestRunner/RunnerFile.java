package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"Features"},
                 glue={"steps_proceedings"}, 
                 plugin = {"pretty","html:target/cucumber-reports",
                           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = true )

public class RunnerFile extends AbstractTestNGCucumberTests{
	
	
 }

	
	

