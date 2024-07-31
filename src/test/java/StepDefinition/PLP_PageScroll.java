
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

public class PLP_PageScroll {

	public PLP_PageScroll() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll down the plp")
	public void scroll_down_to_page_two() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,4500)");
		Thread.sleep(1000);
		WebElement card30 = driver.findElement(By.xpath(cr.valueOnTheKey("plp_card30")));
		Assert.assertEquals(true, card30.isDisplayed());
	}
	
	@And("scroll down to page three")
	public void scroll_down_to_page_three() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,11000)");
		Thread.sleep(1000);
		WebElement card45 = driver.findElement(By.xpath(cr.valueOnTheKey("plp_card45")));
		Assert.assertEquals(true, card45.isDisplayed());
	}
	
	@And("scroll down to page four")
	public void scroll_down_to_page_four() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,17500)");
		Thread.sleep(1000);
		WebElement card65 = driver.findElement(By.xpath(cr.valueOnTheKey("plp_card65")));
		Assert.assertEquals(true, card65.isDisplayed());
	}
	
}