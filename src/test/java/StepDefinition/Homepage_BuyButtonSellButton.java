
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Homepage_BuyButtonSellButton {

	public Homepage_BuyButtonSellButton() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();
	// BaseSteps baseSteps;

	// public HomepageBuyButton_SellButton(BaseSteps baseSteps) {
	// this.baseSteps = baseSteps;
	// }

	// Sell_button__Test_Case//

	@Then("user click on sell button")
	public void user_click_on_sell_button() throws InterruptedException {
		Thread.sleep(4000);
		prm.click(driver, cr.valueOnTheKey("homepage_sellButton"), "xpath");
		Thread.sleep(2000);
	}

	@And("land on sell page")
	public void land_on_sell_page() throws InterruptedException {
		prm.takeSceenshot(driver);
	//	WebElement sellBanner = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_spinnySellBanner")));
	//	Assert.assertEquals(true, sellBanner.isDisplayed());
	//	WebElement sellPageContainer = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_sellPageContainer")));
	//	Assert.assertEquals(true, sellPageContainer.isDisplayed());
		Thread.sleep(2000);
	}

	// Buy_button__Test_Case//

	@Then("user click on buy button")
	public void user_click_on_buy_button() throws InterruptedException {
		Thread.sleep(4000);
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(4000);
	}

	@And("land on product listing page")
	public void land_on_product_listing_page() throws InterruptedException {
		prm.takeSceenshot(driver);
		WebElement numberofusedcarsincity = driver.findElement(By.xpath(cr.valueOnTheKey("plp_headingcontent")));
		Assert.assertEquals(true, numberofusedcarsincity.isDisplayed());
	//	WebElement listingMainBanner = driver.findElement(By.xpath(cr.valueOnTheKey("plp_listingMainBanner")));
	//	Assert.assertEquals(true, listingMainBanner.isDisplayed());
		Thread.sleep(2000);
	}
}
