package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Feature"},
        glue = {"StepDefinition"}, 
        		plugin = {
        			    "pretty",
        			    "html:target/cucumber-html-reports", // HTML report path
        			    "json:target/cucumber-reports/CucumberTestReport.json" // JSON report
        			},
        // tags = {"@change"},

       

        monochrome = true)
public class TestRunner {
	
}
