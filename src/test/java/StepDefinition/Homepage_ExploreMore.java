
package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_ExploreMore {

	public Homepage_ExploreMore() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("user scroll down to explore more section")
	public void user_scroll_down_to_explore_more_section() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,6000)");
		Thread.sleep(2000);
		WebElement exploreMoreSectionContainer = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_exploreMoreSectionContainer")));
		Assert.assertEquals(true, exploreMoreSectionContainer.isDisplayed());
	}

	@And("click on check eligibility")
	public void click_on_check_eligiblity() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("homepage_checkEligiblity"), "xpath");
		Thread.sleep(2000);
		WebElement SpinnyCapitaContainer = driver.findElement(By.xpath(cr.valueOnTheKey("applyFinance_spinnyCapitalContainer")));
		Assert.assertEquals(true, SpinnyCapitaContainer.isDisplayed());
		WebElement usedCarLoanLandingSection = driver.findElement(By.xpath(cr.valueOnTheKey("applyFinance_usedCarLoanLandingSection")));
		Assert.assertEquals(true, usedCarLoanLandingSection.isDisplayed());
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,5500)");
		Thread.sleep(2000);
	}

	@And("click on get exchange price")
	public void click_on_get_exchange_price() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_getExchangePrice"), "xpath");
		Thread.sleep(3000);
		WebElement sellPageCardHeading = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_sellFormCardHeading")));
		Assert.assertEquals(true, sellPageCardHeading.isDisplayed());
		WebElement sellToggleGetPriceSellFormOverlay = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_sellToggleGetPriceSellFormOverlay")));
		Assert.assertEquals(true, sellToggleGetPriceSellFormOverlay.isDisplayed());
		driver.navigate().back();
		Thread.sleep(2000);
	}

	@And("click on explore buyback")
	public void click_on_explore_buyback() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_exploreBuyBack"), "xpath");
		Thread.sleep(4000);
		WebElement BuyBackBannerImage = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_buyBackBannerImage")));
		Assert.assertEquals(true, BuyBackBannerImage.isDisplayed());
	//	WebElement exploreMoreWatchTheFilmButton = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_exploreMoreSectionBuyBackWatchTheFilmButton")));
	//	Assert.assertEquals(true, exploreMoreWatchTheFilmButton.isDisplayed());
		WebElement buyBackContainer = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_buyBackContainer")));
		Assert.assertEquals(true, buyBackContainer.isDisplayed());
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,0)");
		Thread.sleep(2000);
	}
}
