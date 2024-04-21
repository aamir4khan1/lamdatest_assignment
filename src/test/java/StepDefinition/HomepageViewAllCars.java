
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomepageViewAllCars {

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("user click on view all cars")
	public void user_click_on_view_all_cars() throws InterruptedException {
		Thread.sleep(3000);
		prm.click(driver, cr.valueOnTheKey("homepage_viewAllCars"), "xpath");
		Thread.sleep(4000);
		WebElement citySelectorContainer = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorContainer")));
		Assert.assertEquals(true, citySelectorContainer.isDisplayed());
		WebElement usedCarsInDelhiNCR = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInDelhiNCR")));
		Assert.assertEquals(true, usedCarsInDelhiNCR.isDisplayed());
	}

	@And("user select city selector on plp")
	public void user_select_city_selector_on_plp() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
		Thread.sleep(2000);
	}

	@And("user select bangalore city")
	public void user_select_bangalore_city() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("plp_citySelectBangalore"), "xpath");
		Thread.sleep(4000);
	}

	@And("user click on spinny logo")
	public void user_click_on_spinny_logo() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_SpinnyLogo"), "xpath");
		Thread.sleep(2000);
	}
	
	@Then("user click on city selector on homepage")
	public void user_click_on_city_selector_on_homepage() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("homepage_CitySelector"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("user select ahmedabad city")
	public void user_select_ahmedabad_city() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("homepage_citySelectorAhmedabad"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("user click on view all cars again")
	public void user_click_on_view_all_cars_again() throws InterruptedException {
		Thread.sleep(3000);
		prm.click(driver, cr.valueOnTheKey("homepage_viewAllCars"), "xpath");
		Thread.sleep(4000);
		WebElement citySelectorContainer = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorContainer")));
		Assert.assertEquals(true, citySelectorContainer.isDisplayed());
		WebElement numberofusedcarsincity = driver.findElement(By.xpath(cr.valueOnTheKey("plp_headingcontent")));
		Assert.assertEquals(true, numberofusedcarsincity.isDisplayed());
		WebElement usedCarsInAhmedabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInAhmedabad")));
		Assert.assertEquals(true, usedCarsInAhmedabad.isDisplayed());
	}
	
}