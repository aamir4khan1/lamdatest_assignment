
package StepDefinition;

import org.openqa.selenium.By;
//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;

public class HomepageBuyButton_SellButton {
	
	public HomepageBuyButton_SellButton() {
		
	}
	
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();
	//BaseSteps baseSteps;

	//public HomepageBuyButton_SellButton(BaseSteps baseSteps) {
	//	this.baseSteps = baseSteps;
	//}

	// Sell_button__Test_Case//

	@And("user click on sell button")
	public void user_click_on_sell_button() throws InterruptedException {
		Thread.sleep(4000);
		prm.click(driver, cr.valueOnTheKey("homepage_sellButton"), "xpath");
		Thread.sleep(2000);
	}

	@And("land on sell page")
	public void land_on_sell_page() throws InterruptedException {
		WebElement sellBanner = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_spinnySellBanner")));
		Assert.assertEquals(true, sellBanner.isDisplayed());
		WebElement sellPageContainer = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_sellPageContainer")));
		Assert.assertEquals(true, sellPageContainer.isDisplayed());
		Thread.sleep(2000);
	} 	
	
	// Buy_button__Test_Case//

		@And("user click on buy button")
		public void user_click_on_buy_button() throws InterruptedException {
			Thread.sleep(4000);
			prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
			Thread.sleep(2000);
		}

		@And("land on product listing page")
		public void land_on_product_listing_page() throws InterruptedException {
			WebElement numberofusedcarsincity = driver.findElement(By.xpath(cr.valueOnTheKey("plp_headingcontent")));
			Assert.assertEquals(true, numberofusedcarsincity.isDisplayed());
			WebElement listingMainBanner = driver.findElement(By.xpath(cr.valueOnTheKey("plp_listingMainBanner")));
			Assert.assertEquals(true, listingMainBanner.isDisplayed());
			Thread.sleep(2000);
		}	
}
