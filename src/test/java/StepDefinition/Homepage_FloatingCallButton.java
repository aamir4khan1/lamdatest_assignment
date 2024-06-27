
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Homepage_FloatingCallButton {

	public Homepage_FloatingCallButton() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("user land on plp")
	public void user_land_on_plp() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("botnav_buyCar"), "xpath");
	Thread.sleep(4000);
	}
	
	@And("scroll down the page")
	public void scroll_down_the_page() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,6000)");
	Thread.sleep(2000);
	js.executeScript("window.scroll(0,7000)");
	Thread.sleep(2000);
	js.executeScript("window.scroll(0,8000)");
	Thread.sleep(2000);
	
	}
	
	@And("validate floating call button is visible")
	public void validate_floating_call_button_is_visible() throws InterruptedException {
		WebElement floatingCallButton = driver.findElement(By.xpath(cr.valueOnTheKey("plp_floatingCallButton")));
		Assert.assertEquals(true, floatingCallButton.isDisplayed());
	}
}