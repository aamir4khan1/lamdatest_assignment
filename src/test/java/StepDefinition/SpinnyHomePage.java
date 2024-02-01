package StepDefinition;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpinnyHomePage {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Given("^User land to Spinny website$")
	public void user_land_to_spinny_website() {
		driver.get(cr.valueOnTheKey("URL"));
	}

	@When("^Wait for the page to load completely$")
	public void wait_for_the_page_to_load_completely() {
		Wait.implicitWait(1, driver);
	}

	@Then("^User is able to see the Spinny Website$")
	public void user_is_able_to_see_the_spinny_website() {
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("Spinny_logo"));
		boolean logoVisible = driver.findElement(By.xpath(cr.valueOnTheKey("Spinny_logo"))).isDisplayed();
		Assert.assertFalse(logoVisible);
	}
}