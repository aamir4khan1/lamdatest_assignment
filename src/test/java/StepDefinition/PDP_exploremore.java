
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PDP_exploremore {

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("user views explore more section")
	public void user_views_explore_more_section() throws InterruptedException {
		Thread.sleep(2000);
        WebElement explore_more = driver.findElement(By.xpath(cr.valueOnTheKey("explore_more")));
		Assert.assertEquals(true, explore_more.isDisplayed());
		
	}

	@And("user selects first filter")
	public void user_selects_first_filter() throws InterruptedException {
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("first_filter"), "xpath");
		Thread.sleep(2000);
		WebElement filter_1 = driver.findElement(By.xpath(cr.valueOnTheKey("filter_1")));
		Assert.assertEquals(true, filter_1.isDisplayed());
		driver.navigate().back();
	}

	@And("user selects second filter")
	public void user_selects_second_filter() throws InterruptedException {
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("second_filter"), "xpath");
		Thread.sleep(2000);
		WebElement filter_1 = driver.findElement(By.xpath(cr.valueOnTheKey("filter_1")));
		Assert.assertEquals(true, filter_1.isDisplayed());
		driver.navigate().back();
	}

	@And("user selects third filter")
	public void user_selects_third_filter() throws InterruptedException {
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("third_filter"), "xpath");
		Thread.sleep(2000);
		WebElement filter_1 = driver.findElement(By.xpath(cr.valueOnTheKey("filter_1")));
		Assert.assertEquals(true, filter_1.isDisplayed());
		driver.navigate().back();
	}

	@And("user selects fourth filter")
	public void user_selects_fourth_filter() throws InterruptedException {
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("fourth_filter"), "xpath");
		Thread.sleep(2000);
		WebElement filter_1 = driver.findElement(By.xpath(cr.valueOnTheKey("filter_1")));
		Assert.assertEquals(true, filter_1.isDisplayed());
		driver.navigate().back();
	}

	@And("user selects fifth filter")
	public void user_selects_fifth_filter() throws InterruptedException {
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("fifth_filter"), "xpath");
		Thread.sleep(2000);
		WebElement filter_1 = driver.findElement(By.xpath(cr.valueOnTheKey("filter_1")));
		Assert.assertEquals(true, filter_1.isDisplayed());
		
}}