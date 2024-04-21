
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

public class Bottom_Navigation {

	public Bottom_Navigation() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("botnav is visible and home icon selected")
	public void botnav_is_visible_and_home_icon_selected() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("botnav_home"), "xpath");
		prm.takeSceenshot(driver);
		WebElement bottomNavigationBar = driver.findElement(By.xpath(cr.valueOnTheKey("botnav_bottomNavBar")));
		Assert.assertEquals(true, bottomNavigationBar.isDisplayed());
		Thread.sleep(2000);
	}

	@And("user click on bottom navigation buy car icon")
	public void user_click_on_bottom_navigation_buy_car_icon() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("botnav_buyCar"), "xpath");
		Thread.sleep(2000);
		prm.takeSceenshot(driver);
		WebElement quickfilters = driver.findElement(By.xpath(cr.valueOnTheKey("plp_quickfilters")));
		Assert.assertEquals(true, quickfilters.isDisplayed());
		Thread.sleep(2000);
	}

	@And("user click on shortlists icon")
	public void user_click_on_shortlists_icon() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_SpinnyLogo"), "xpath");
		Thread.sleep(4000);
		prm.click(driver, cr.valueOnTheKey("botnav_shortlist"), "xpath");
		Thread.sleep(4000);
		prm.takeSceenshot(driver);
		WebElement loginModalText = driver.findElement(By.xpath(cr.valueOnTheKey("shortlists_loginModalText")));
		Assert.assertEquals(true, loginModalText.isDisplayed());
		prm.click(driver, cr.valueOnTheKey("shortlists_backIcon"), "xpath");
		Thread.sleep(2000);
	}

	@And("user click on sell car icon")
	public void user_click_on_sell_car_icon() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("botnav_sellCar"), "xpath");
		Thread.sleep(6000);
		prm.takeSceenshot(driver);
		WebElement SpinnySellBanner = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_spinnySellBanner")));
		Assert.assertEquals(true, SpinnySellBanner.isDisplayed());
		WebElement buyACar = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_buyACar")));
		Assert.assertEquals(true, buyACar.isDisplayed());

	}

	@And("user click on account icon")
	public void user_click_on_account_icon() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("botnav_account"), "xpath");
		Thread.sleep(2000);
		prm.takeSceenshot(driver);
		WebElement AccountLoginModalContainer = driver
				.findElement(By.xpath(cr.valueOnTheKey("account_loginModalContainer")));
		Assert.assertEquals(true, AccountLoginModalContainer.isDisplayed());

	}
}