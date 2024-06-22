
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

public class Homepage_SpinnyBuzz {

	public Homepage_SpinnyBuzz() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("scroll down spinny buzz section")
	public void scroll_down_spinny_buzz_section() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,6000)");
		Thread.sleep(2000);
	}

	@And("user able to see spinny buzz")
	public void user_able_to_see_spinny_buzz() throws InterruptedException {
		WebElement spinnyBuzzSection = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_spinnyBuzzSection")));
		Assert.assertEquals(true, spinnyBuzzSection.isDisplayed());
		Thread.sleep(2000);
	}

}