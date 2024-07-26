
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

public class PLP_HubLocation {

	public PLP_HubLocation() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll down to hub location functionality")
	public void scroll_down_to_hub_location_functionality() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,7800)");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,7800)");

	}
	
	@And("validate hub location modal")
	public void validate_hub_location_modal() throws InterruptedException {
		WebElement hublocationModal = driver.findElement(By.xpath(cr.valueOnTheKey("plp_hubLocationModal")));
		Assert.assertEquals(true, hublocationModal.isDisplayed());
		
	}
	
	@And("click on view cars under hub location modal")
	public void click_on_view_cars_under_hub_location_modal() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_hubLocationModalViewCars"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("user land on plp with hub filter applied")
	public void user_land_on_plp_with_hub_filter_applied() throws InterruptedException {
		WebElement FilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("plp_hubLocationModalFilterApplied")));
		Assert.assertEquals(true, FilterApplied.isDisplayed());
		WebElement saveFilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("savedFiltericon")));
		Assert.assertEquals(true, saveFilterApplied.isDisplayed()); // assertion save filter chip //
		
	}
}