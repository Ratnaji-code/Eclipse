package com.ecommerce.testRunner;
//import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
//@io.cucumber.testng.CucumberOptions(
//		features="Features",
//		glue= {"stepDefination"},
//		monochrome=true
//
//		)
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features",
	    glue={"stepDefination"},
	    monochrome=true,
	    dryRun=true,
	    tags= "@RegressionTest",
	    plugin={"pretty","json:target/JSONReports/reports.json",
		   "html:target/HTMLReports/reports.html"}
				)


public class TestRunner  extends AbstractTestNGCucumberTests {
	
	

}
