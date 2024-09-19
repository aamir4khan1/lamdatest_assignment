package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Feature"},
        glue = {"StepDefinition"},
        plugin = {"json:target/cucumber.json"},
        //tags = {"@change"},
        monochrome = true)
public class TestRunner {
	
}
