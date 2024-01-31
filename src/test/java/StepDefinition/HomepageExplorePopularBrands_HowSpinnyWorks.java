
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;

public class HomepageExplorePopularBrands_HowSpinnyWorks {
	
	public HomepageExplorePopularBrands_HowSpinnyWorks() {
		
	}
	
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();
	//BaseSteps baseSteps;

	//public HomepageBuyButton_SellButton(BaseSteps baseSteps) {
	//	this.baseSteps = baseSteps;
	//}

	// Explore_Popular_Brands__Test_Case//

		@And("user scroll to explore popular brands section")
		public void user_scroll_to_explore_popular_brands_section() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,3400)");
			Thread.sleep(2000);
			WebElement popularBrandsContainer = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_popularbrandscontainer")));
			Assert.assertEquals(true, popularBrandsContainer.isDisplayed());
		}

		@And("click on maruti suzuki")
		public void click_on_maruti_suzuki() throws InterruptedException {
			prm.click(driver, cr.valueOnTheKey("homepage_marutisuzukibrand"), "xpath");
			Thread.sleep(2000);
			WebElement quickFilterMarutiSuzuki = driver.findElement(By.xpath(cr.valueOnTheKey("plp_quickfiltermarutisuzuki")));
			Assert.assertEquals(true, quickFilterMarutiSuzuki.isDisplayed());
			Thread.sleep(2000);

		}

		@And("redirect back to explore popular brands section")
		public void redirect_back_to_explore_popular_brands_section() throws InterruptedException {
			driver.navigate().back();
			Thread.sleep(2000);

		}

		@And("click on view all brands")
		public void click_on_view_all_brands() throws InterruptedException {
			prm.click(driver, cr.valueOnTheKey("homepage_explorePopularBrandsViewAllBrands"), "xpath");
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,4000)");

		}

		@And("click on view all cars")
		public void click_on_view_all_cars() throws InterruptedException {
			prm.click(driver, cr.valueOnTheKey("homepage_explorePopularBrandsViewAllCars"), "xpath");
			Thread.sleep(4000);
			WebElement plpHeadingContent = driver.findElement(By.xpath(cr.valueOnTheKey("plp_headingcontent")));
			Assert.assertEquals(true, plpHeadingContent.isDisplayed());
			Thread.sleep(4000);
			prm.click(driver, cr.valueOnTheKey("homepage_SpinnyLogo"), "xpath");
			Thread.sleep(2000);

		}

		// How_Spinny_Works__Test_Case//

		@And("user scroll down to how spinny works section")
		public void user_scroll_down_to_how_spinny_works_section() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1700)");
			Thread.sleep(2000);
			WebElement HowSpinnyWorksContainer = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_HowSpinnyWorksContainer")));
			Assert.assertEquals(true, HowSpinnyWorksContainer.isDisplayed());

		}

		@And("click on watch how it works")
		public void click_on_watch_how_it_works() throws InterruptedException {
			prm.click(driver, cr.valueOnTheKey("homepage_watchHowItWorks"), "xpath");
			Thread.sleep(2000);
			WebElement videoOverlayContainer = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_videoOverlayContainer")));
			Assert.assertEquals(true, videoOverlayContainer.isDisplayed());
			Thread.sleep(3000);
			prm.click(driver, cr.valueOnTheKey("homepage_videoOverlayCloseButton"), "xpath");
			Thread.sleep(4000);

		}

		@And("click on learn more")
		public void click_on_learn_more() throws InterruptedException {
			prm.click(driver, cr.valueOnTheKey("homepage_watchHowItWorksLearnMore"), "xpath");
			Thread.sleep(2000);
			WebElement howSpinnyWorksBottomSheet = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_watchHowItWorksBottomSheetOverlay")));
			Assert.assertEquals(true, howSpinnyWorksBottomSheet.isDisplayed());
			Thread.sleep(2000);
			WebElement howSpinnyWorksWatchTheFilmButton = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_HowSpinnyWorksLearnMoreWatchTheFilmButton")));
			Assert.assertEquals(true, howSpinnyWorksWatchTheFilmButton.isDisplayed());
			prm.click(driver, cr.valueOnTheKey("homepage_watchHowItWorksCloseButton"), "xpath");
		}
}
