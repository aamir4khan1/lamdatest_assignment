package StepDefinition;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//package StepDefinition;
//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import testselement.screens.android.AndroidPLPScreen;
//import testselement.screens.android.AndroidPDPScreen;


//import cucumber.api.java.en.And;
//import testselement.screens.android.AndroidHomepageScreen;

public class PDP_CarSpecifications {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();	
	
	
	@Then("user selects first car card")
	public void user_selects_first_car_car() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_carCard"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("user scroll down to car specifications section")
	public void user_scroll_down_to_car_specifications_section() throws InterruptedException {
		Thread.sleep(2000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    //	WebElement topFeaturesSection = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(cr.valueOnTheKey("pdp_topFeaturesSection"))));
    //	js.executeScript("arguments[0].scrollIntoView(true);", topFeaturesSection);
    	
		js.executeScript("window.scroll(0,2300)");
		Thread.sleep(2000);
		
		WebElement carSpecificationsSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_carSpecificationsSection")));
		Assert.assertEquals(true, carSpecificationsSection.isDisplayed());
		
	}
	
	@And("click on view all specifications button")
	public void click_on_view_all_specifications_button() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("pdp_carSpecificationsButton"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("validate different sections under car specifications")
	public void validate_different_sections_under_car_specifications() throws InterruptedException {
		WebElement DimensionsAndCapacityH2Header = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_carSpecificationsDimensionsAndCapacityH2Header")));
		Assert.assertEquals(true, DimensionsAndCapacityH2Header.isDisplayed());	
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("pdp_carSpecificationsEngineAndTransmissionTab"), "xpath");
		Thread.sleep(2000);
		WebElement EngineAndTransmissionH2Header = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_carSpecificationsEngineAndTransmissionH2Header")));
		Assert.assertEquals(true, EngineAndTransmissionH2Header.isDisplayed());	
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("pdp_carSpecificationsFuelAndPerformanceTab"), "xpath");
		Thread.sleep(2000);
		WebElement FuelAndPerformanceH2Header = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_carSpecificationsFuelAndPerformanceH2Header")));
		Assert.assertEquals(true, FuelAndPerformanceH2Header.isDisplayed());	
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("pdp_carSpecificationsSuspensionSteeringAndBrakesTab"), "xpath");
		Thread.sleep(2000);
		WebElement SuspensionSteeringAndBrakesH2Header = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_carSpecificationsSuspensionSteeringAndBrakesH2Header")));
		Assert.assertEquals(true, SuspensionSteeringAndBrakesH2Header.isDisplayed());	
		Thread.sleep(2000);
		
	}
	
}