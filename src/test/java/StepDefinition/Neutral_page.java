
package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Neutral_page {

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("user lands on neutral page")
	public void user_lands_on_neutral_page() throws InterruptedException {
		Thread.sleep(2000);
        driver.get("https://www.spinny.com/home");
        Thread.sleep(2000);
        WebElement neutral_page = driver.findElement(By.xpath(cr.valueOnTheKey("neutral_page")));
		Assert.assertEquals(true, neutral_page.isDisplayed());
		
	}

	@And("user selects buy car button")
	public void user_selects_buy_car_button() throws InterruptedException {
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");}
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("buy_car"), "xpath");
		Thread.sleep(2000);
		WebElement PLP_page_confirmation = driver.findElement(By.xpath(cr.valueOnTheKey("PLP_page_confirmation")));
		Assert.assertEquals(true, PLP_page_confirmation.isDisplayed());
		driver.navigate().back();
	}

	@And("user selects sell car button")
	public void user_selects_sell_car_button() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("sell_car_cta"), "xpath");
		Thread.sleep(2000);
		WebElement sell_page_confirmation = driver.findElement(By.xpath(cr.valueOnTheKey("sell_page_confirmation")));
		Assert.assertEquals(true, sell_page_confirmation.isDisplayed());
		driver.navigate().back();
	}

	@And("user verify car finder section")
	public void user_verify_car_finder_section() throws InterruptedException {
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,800)");}
		Thread.sleep(2000);
		WebElement car_finder_section = driver.findElement(By.xpath(cr.valueOnTheKey("car_finder_section")));
		Assert.assertEquals(true, car_finder_section.isDisplayed());
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("car_finder_cta"), "xpath");
		Thread.sleep(2000);
		WebElement car_finder_confirmation = driver.findElement(By.xpath(cr.valueOnTheKey("car_finder_confirmation")));
		Assert.assertEquals(true, car_finder_confirmation.isDisplayed());
		driver.navigate().back();
	}

	@And("user verify sell add section")
	public void user_Verify_sell_add_section() throws InterruptedException {
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1300)");}
		Thread.sleep(2000);
		WebElement sell_add_section = driver.findElement(By.xpath(cr.valueOnTheKey("sell_add_section")));
		Assert.assertEquals(true, sell_add_section.isDisplayed());
		Thread.sleep(2000);
		WebElement sell_1 = driver.findElement(By.xpath(cr.valueOnTheKey("sell_1")));
		Assert.assertEquals(true, sell_1.isDisplayed());
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("sell_get_quote"), "xpath");
		Thread.sleep(2000);
		WebElement sell_page_confirmation = driver.findElement(By.xpath(cr.valueOnTheKey("sell_page_confirmation")));
		Assert.assertEquals(true, sell_page_confirmation.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement sell_2 = driver.findElement(By.xpath(cr.valueOnTheKey("sell_2")));
		Assert.assertEquals(true, sell_2.isDisplayed());
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("sell_schedule_evaluation"), "xpath");
		Thread.sleep(2000);
		WebElement sell_page_confirmation2 = driver.findElement(By.xpath(cr.valueOnTheKey("sell_page_confirmation")));
		Assert.assertEquals(true, sell_page_confirmation2.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement sell_3 = driver.findElement(By.xpath(cr.valueOnTheKey("sell_3")));
		Assert.assertEquals(true, sell_3.isDisplayed());
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("sell_sell_car"), "xpath");
		Thread.sleep(2000);
		WebElement sell_page_confirmation3 = driver.findElement(By.xpath(cr.valueOnTheKey("sell_page_confirmation")));
		Assert.assertEquals(true, sell_page_confirmation3.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("watch_film"), "xpath");
		Thread.sleep(8000);
		WebElement video_player = driver.findElement(By.xpath(cr.valueOnTheKey("video_player")));
		Assert.assertEquals(true, video_player.isDisplayed());
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("close_button_1"), "xpath");
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1400)");}
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("learn_more"), "xpath");
		Thread.sleep(4000);
		WebElement sell_page_confirmation4 = driver.findElement(By.xpath(cr.valueOnTheKey("sell_page_confirmation")));
		Assert.assertEquals(true, sell_page_confirmation4.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
		
	}

	@And("user verify insignts that drive us section")
	public void user_verify_insignts_that_drive_us_section() throws InterruptedException {
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");}
		Thread.sleep(2000);
		WebElement drive_us = driver.findElement(By.xpath(cr.valueOnTheKey("drive_us")));
		Assert.assertEquals(true, drive_us.isDisplayed());
	}

	@And("user verify love story section")
	public void user_verify_love_story_section() throws InterruptedException {
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2200)");}
		Thread.sleep(2000);
		WebElement love_story = driver.findElement(By.xpath(cr.valueOnTheKey("love_story")));
		Assert.assertEquals(true, love_story.isDisplayed());
		
}}