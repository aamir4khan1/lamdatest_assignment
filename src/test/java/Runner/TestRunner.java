package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Feature"},
        glue = {"StepDefinition"},
        plugin = {
            "pretty",
            "html:target/cucumber-reports/cucumber-pretty",
            "json:target/cucumber-reports/CucumberTestReport.json",
            "rerun:target/cucumber-reports/rerun.txt"
        },
        monochrome = true,
        dryRun = false
)
public class TestRunner {
	
}
