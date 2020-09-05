package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/feature/Login.feature"}, 
								glue="step",
								monochrome=true
						)
public class Runlogin extends AbstractTestNGCucumberTests{ }
