package StepDefinition;

import org.openqa.selenium.WebDriver;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BaseSteps {
    static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();

    @Given("user land on spinny website")
    public void user_land_on_spinny_website() throws Exception {
        driver.get(cr.valueOnTheKey(("URL")));
        driver.manage().window().maximize();

        if (System.getProperty("URL") != null) {
            driver.get(cr.valueOnTheKey(System.getProperty("URL")));
        } else {
            driver.get(cr.valueOnTheKey("URL"));
        }
    }

    @When("^Wait for the application page to load completely$")
    public void wait_for_the_page_to_load_completely() {
        Wait.implicitWait(2, driver);
    }

    @And("user selects location")
    public void select_location() throws InterruptedException {
        prm.click(driver, cr.valueOnTheKey("homepage_selectManually"), "xpath");
        Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("homepage_DelhiNCR"), "xpath");
        Thread.sleep(2000);
    }
}
