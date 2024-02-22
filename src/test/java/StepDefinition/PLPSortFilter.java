
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

public class PLPSortFilter {

	public PLPSortFilter() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("select sort filter")
	public void select_sort_filter() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilter"), "xpath");
	Thread.sleep(2000);
	
	}
	
	@And("click on price low to high")
	public void click_on_price_low_to_high() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilterPriceLowToHigh"), "xpath");
	Thread.sleep(2000);
	WebElement priceLowToHigh = driver.findElement(By.xpath(cr.valueOnTheKey("plp_floatingSortFilterPriceLowToHighAppliedPLP")));
	Assert.assertEquals(true, priceLowToHigh.isDisplayed());
	
/*	WebElement firstCardCard = driver.findElement(AndroidPLPScreen.plp_firstcarcard);
	WebElement secondCardCard = driver.findElement(AndroidPLPScreen.plp_secondcarcard);
	
	value1 = float(firstCardCard.getText());
	value2 = float(secondCardCard.getText());
	
	assert value1 <= value2; */

	}

	
	@And("click on price high to low")
	public void click_on_price_high_to_low() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilterPriceLowToHighAppliedPLP"), "xpath");
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilterPriceHighToLow"), "xpath");
	Thread.sleep(2000);
	WebElement priceHighToLow = driver.findElement(By.xpath(cr.valueOnTheKey("plp_floatingSortFilterPriceHighToLowAppliedPLP")));
	Assert.assertEquals(true, priceHighToLow.isDisplayed());
	}	

	@And("click on km driven low to high")
	public void click_on_km_driven_low_to_high() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilterPriceHighToLowAppliedPLP"), "xpath");
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilterKMDrivenLowToHigh"), "xpath");
	Thread.sleep(2000);
	WebElement kmDrivenLowToHigh = driver.findElement(By.xpath(cr.valueOnTheKey("plp_floatingSortFilterKMDrivenLowToHighAppliedPLP")));
	Assert.assertEquals(true, kmDrivenLowToHigh.isDisplayed());
	
	}
	
	@And("click on year new to old")
	public void click_on_year_new_to_old() throws InterruptedException {		
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilterKMDrivenLowToHighAppliedPLP"), "xpath");
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilterYearNewToOld"), "xpath");
	Thread.sleep(2000);
	WebElement yearNewToOld = driver.findElement(By.xpath(cr.valueOnTheKey("plp_floatingSortFilterYearNewToOldAppliedPLP")));
	Assert.assertEquals(true, yearNewToOld.isDisplayed());
	
	}
	
	@And("click on newest first")
	public void click_on_newest_first() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilterYearNewToOldAppliedPLP"), "xpath");
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilterNewestFirst"), "xpath");
	Thread.sleep(2000);
	WebElement newestFirst = driver.findElement(By.xpath(cr.valueOnTheKey("plp_floatingSortFilterNewestFirstAppliedPLP")));
	Assert.assertEquals(true, newestFirst.isDisplayed());
	
	}
}