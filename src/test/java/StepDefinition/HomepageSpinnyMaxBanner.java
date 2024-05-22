
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

public class HomepageSpinnyMaxBanner {

	public HomepageSpinnyMaxBanner() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("scroll down to spinny max banner")
	public void scroll_down_to_spinny_max_banner() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,4000)");
		Thread.sleep(3000);
		WebElement spinnyMaxBannerHeading = driver
				.findElement(By.xpath(cr.valueOnTheKey("homepage_spinnyMaxHeadingBanner")));
		Assert.assertEquals(true, spinnyMaxBannerHeading.isDisplayed());
		WebElement spinnyMaxBannerContainer = driver
				.findElement(By.xpath(cr.valueOnTheKey("homepage_spinnyMaxBannerContainer")));
		Assert.assertEquals(true, spinnyMaxBannerContainer.isDisplayed());
		Thread.sleep(3000);

	}

	@And("click on car card")
	public void click_on_car_card() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_spinnyMaxBannerFirstCarCard"), "xpath");
		Thread.sleep(3000);
		WebElement whatsappIcon = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_whatsappIcon")));
		Assert.assertEquals(true, whatsappIcon.isDisplayed());
		WebElement cardCardThreeSixtyView = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_threeSixtyViewCard")));
		Assert.assertEquals(true, cardCardThreeSixtyView.isDisplayed());
		driver.navigate().back();
		Thread.sleep(4000);
	//	driver.navigate().back();
	//	Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,4200)");
		Thread.sleep(5000);
	}

	@And("click on explore button")
	public void click_on_explore_button() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_spinnyMaxBannerExploreButton"), "xpath");
		Thread.sleep(5000);
		WebElement spinnyMaxFilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("plp_SpinnyMaxCars_filter_applied")));
		Assert.assertEquals(true, spinnyMaxFilterApplied.isDisplayed());
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3900)");
		Thread.sleep(4000);
	}

/*	@And("click on shortlist icon")
	public void click_on_shortlist_icon() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_spinnyMaxBannerShortlistIcon"), "xpath");
		Thread.sleep(5000);
		WebElement loginModalContainer = driver.findElement(By.xpath(cr.valueOnTheKey("account_loginModalContainer")));
		Assert.assertEquals(true, loginModalContainer.isDisplayed());
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,4000)");
		Thread.sleep(3000);
	}
*/
	@And("click on view more luxury cars")
	public void click_on_view_more_luxury_cars() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_spinnyMaxBannerViewMoreLuxuryCars"), "xpath");
		Thread.sleep(3000);
		WebElement spinnyMaxFilterApplied = driver
				.findElement(By.xpath(cr.valueOnTheKey("plp_SpinnyMaxCars_filter_applied")));
		Assert.assertEquals(true, spinnyMaxFilterApplied.isDisplayed());

	}

}