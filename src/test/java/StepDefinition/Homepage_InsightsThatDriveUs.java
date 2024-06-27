
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

public class Homepage_InsightsThatDriveUs {

	public Homepage_InsightsThatDriveUs() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll down to insights that drive us")
	public void scroll_down_to_insights_that_drve_us() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,6500)");
		Thread.sleep(2000);
	}

	@Then("user is able to see insights that drive us section")
	public void user_is_able_to_see_insights_that_drive_us_section() throws InterruptedException {
		WebElement insightsThatDriveUsContainer = driver
				.findElement(By.xpath(cr.valueOnTheKey("homepage_insightsThatDriveUsSection")));
		Assert.assertEquals(true, insightsThatDriveUsContainer.isDisplayed());
		Thread.sleep(2000);
	}
}
