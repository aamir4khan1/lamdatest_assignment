
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

public class HomepageBuySellToggle_HubLocation {

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	// Buy_Sell_Toggle__Test_Case//

	@Then("user click on buy toggle")
	public void user_click_on_buy_toggle() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,200)");
		prm.click(driver, cr.valueOnTheKey("homepage_buyToggle"), "xpath");
		Thread.sleep(4000);
	//	prm.takeSceenshot(driver);
		WebElement buycontentSection = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_buyContentSection")));
		Assert.assertEquals(true, buycontentSection.isDisplayed());
		WebElement buySectionContainer = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_buySectionContainer")));
		Assert.assertEquals(true, buySectionContainer.isDisplayed());
		Thread.sleep(2000);

	}

	@And("user click on learn more button")
	public void user_click_on_learn_more_button() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buySectionLearnMore"), "xpath");
		Thread.sleep(4000);
		//prm.takeSceenshot(driver);
		WebElement spinnyAssuredContainer = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_buyLearnMoreSpinnyAssuredContainer")));
		Assert.assertEquals(true, spinnyAssuredContainer.isDisplayed());
		Thread.sleep(2000);
//		WebElement AssuredLandingBackgroundImage = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_buySectionLearnMoreAssuredLandingBackgroundImage")));
//		Assert.assertEquals(true, AssuredLandingBackgroundImage.isDisplayed());

	}

	@And("click on browse car")
	public void click_on_browse_car() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buySectionLearnMoreClose"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("homepage_browseCars"), "xpath");
		Thread.sleep(2000);
		prm.takeSceenshot(driver);
		WebElement numberofusedcarsincity = driver.findElement(By.xpath(cr.valueOnTheKey("plp_headingcontent")));
		Assert.assertEquals(true, numberofusedcarsincity.isDisplayed());
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(2000);
	}

	@Then("click on sell toggle")
	public void click_on_sell_toggle() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_sellToggle"), "xpath");
		Thread.sleep(4000);
		prm.takeSceenshot(driver);
		WebElement sellcontentSection = driver
				.findElement(By.xpath(cr.valueOnTheKey("homepage_sellSectionContentSection")));
		Assert.assertEquals(true, sellcontentSection.isDisplayed());
		WebElement sellToggleImageSection = driver
				.findElement(By.xpath(cr.valueOnTheKey("homepage_sellToggleImageSection")));
		Assert.assertEquals(true, sellToggleImageSection.isDisplayed());
		WebElement sellToggleBenefitsSection = driver
				.findElement(By.xpath(cr.valueOnTheKey("homepage_sellToggleBenefitsSection")));
		Assert.assertEquals(true, sellToggleBenefitsSection.isDisplayed());
		WebElement sellToggleBrandsContainer = driver
				.findElement(By.xpath(cr.valueOnTheKey("homepage_sellToggleBrandsContainer")));
		Assert.assertEquals(true, sellToggleBrandsContainer.isDisplayed());
		Thread.sleep(4000);

	}

	@And("click on get price")
	public void click_on_get_price() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_getPrice"), "xpath");
		Thread.sleep(2000);
		prm.takeSceenshot(driver);
		WebElement sellPageCardHeading = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_sellFormCardHeading")));
		Assert.assertEquals(true, sellPageCardHeading.isDisplayed());

		WebElement sellToggleGetPriceSellFormOverlay = driver
				.findElement(By.xpath(cr.valueOnTheKey("homepage_sellToggleGetPriceSellFormOverlay")));
		Assert.assertEquals(true, sellToggleGetPriceSellFormOverlay.isDisplayed());
		Thread.sleep(2000);
	}

	// Hub_location__Test_Case//

	@Then("user scroll down to hub location")
	public void user_scroll_down_to_hub_location() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,5000)");
		Thread.sleep(6000);
		prm.takeSceenshot(driver);
		WebElement hubLocationSection = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_hublocationSection")));
		Assert.assertEquals(true, hubLocationSection.isDisplayed()); // assertion hub location modal //
	//	WebElement hubCardDistance = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_hublocationSectionHubCardDistance")));
	//	Assert.assertEquals(true, hubCardDistance.isDisplayed());
		Thread.sleep(2000);
	}

	@And("click on view cars")
	public void click_on_view_cars() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_hublocationViewCars"), "xpath");
		Thread.sleep(3000);
		prm.takeSceenshot(driver);
		WebElement hubfilterapplied = driver.findElement(By.xpath(cr.valueOnTheKey("plp_hubFilterApplied")));
		Assert.assertEquals(true, hubfilterapplied.isDisplayed()); // assertion hub location modal //
		driver.navigate().back();
		Thread.sleep(4000);

	}

	@And("click view all cars in delhi ncr")
	public void click_view_all_cars_in_delhi_ncr() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,5000)");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("homepage_hublocationViewAllCarsinGurgaon"), "xpath");
		Thread.sleep(2000);
		prm.takeSceenshot(driver);
		WebElement numberofusedcarsincity = driver.findElement(By.xpath(cr.valueOnTheKey("plp_headingcontent")));
		Assert.assertEquals(true, numberofusedcarsincity.isDisplayed());
	}

}