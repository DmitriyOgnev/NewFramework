package Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features"
		,glue={"Step_Definitions"}
//		,dryRun=true
		)
 
public class TestRunner {
 
}
