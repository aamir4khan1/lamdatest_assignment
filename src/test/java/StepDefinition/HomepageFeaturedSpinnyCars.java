
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

public class HomepageFeaturedSpinnyCars {

	public HomepageFeaturedSpinnyCars() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("scroll down to featured spinny cars section")
	public void scroll_down_to_featured_spinny_cars_section() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2300)");
		WebElement featuredSpinnyCarsContainer = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_featuredSpinnyCarsContainer")));
		Assert.assertEquals(true, featuredSpinnyCarsContainer.isDisplayed());

	}

	@And("clicked on car card under best buy for you tab")
	public void click_on_car_card_under_best_buy_for_you_tab() throws InterruptedException {
		Thread.sleep(4000);
		prm.click(driver, cr.valueOnTheKey("homepage_featuredBestBuyCarCard"), "xpath");
		Thread.sleep(4000);
		WebElement whatsappIcon = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_whatsappIcon")));
		Assert.assertEquals(true, whatsappIcon.isDisplayed());
		WebElement cardCardThreeSixtyView = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_threeSixtyViewCard")));
		Assert.assertEquals(true, cardCardThreeSixtyView.isDisplayed());
		driver.navigate().back();
		Thread.sleep(2000);

	}

	/*
	 * @And("click on shortlist icon under best buy for you tab") public void
	 * click_on_shortlist_icon_under_best_buy_for_you_tab() throws
	 * InterruptedException {
	 * 
	 * 
	 * 
	 * }
	 */
	@And("click on view all spinny cars under best buy for you tab")
	public void click_on_view_all_spinny_cars_under_best_buy_for_you_tab() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_featuredSpinnyCarsViewAllSpinnyCars"), "xpath");
		Thread.sleep(3000);
		WebElement numberofusedcarsincity = driver.findElement(By.xpath(cr.valueOnTheKey("plp_headingcontent")));
		Assert.assertEquals(true, numberofusedcarsincity.isDisplayed());
		driver.navigate().back();
	}

	@Then("click on newly added tab")
	public void click_on_newly_addded_tab() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("homepage_featuredNewlyAddedTab"), "xpath");
		Thread.sleep(2000);
		WebElement newlyAddedContainer = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_featuredSpinnyCarsNewAddedContainer")));
		Assert.assertEquals(true, newlyAddedContainer.isDisplayed());
	}

	@And("clicks on car card under newly added tab")
	public void click_on_car_card_under_newly_added_tab() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_featuredNewlyAddedCarCard"), "xpath");
		Thread.sleep(2000);
		WebElement whatsappIcon = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_whatsappIcon")));
		Assert.assertEquals(true, whatsappIcon.isDisplayed());
		WebElement cardCardThreeSixtyView = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_threeSixtyViewCard")));
		Assert.assertEquals(true, cardCardThreeSixtyView.isDisplayed());
		driver.navigate().back();
		Thread.sleep(2000);

	}

	/*
	 * @And("click on shortlist icon under newly added tab") public void
	 * click_on_shortlist_icon_under_newly_added_tab() throws InterruptedException {
	 * 
	 * }
	 */
	@And("click view all cars under newly added tab")
	public void click_view_all_cars_under_newly_added_tab() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_featuredNewlyAddedTab"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("homepage_featuredSpinnyCarsViewAllSpinnyCars"), "xpath");
		Thread.sleep(2000);
		WebElement numberofusedcarsincity = driver.findElement(By.xpath(cr.valueOnTheKey("plp_headingcontent")));
		Assert.assertEquals(true, numberofusedcarsincity.isDisplayed());
		driver.navigate().back();
	}
}