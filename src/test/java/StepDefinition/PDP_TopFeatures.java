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

public class PDP_TopFeatures {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();	
	
	
	@And("user scroll down to top features section")
	public void user_scroll_down_to_top_features_section() throws InterruptedException {
		Thread.sleep(2000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3000)");
		Thread.sleep(2000);
		WebElement topFeaturesSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_topFeaturesSection")));
		Assert.assertEquals(true, topFeaturesSection.isDisplayed());
	}
	
	@And("user click on view all features")
	public void user_click_on_view_all_features() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("pdp_topFeaturesButton"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("user validate different sections under top features")
	public void user_validate_different_sections_under_top_features() throws InterruptedException {
		WebElement topFeaturesSafetyTabH2Header = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_topFeaturesSafetyTabH2Header")));
		Assert.assertEquals(true, topFeaturesSafetyTabH2Header.isDisplayed());		
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("pdp_topFeaturesComfortAndConvenienceTab"), "xpath");
		Thread.sleep(2000);	
		WebElement topFeaturesComfortAndConvenienceTabH2Header = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_topFeaturesComfortAndConvenienceTabH2Header")));
		Assert.assertEquals(true, topFeaturesComfortAndConvenienceTabH2Header.isDisplayed());	
		
		prm.click(driver, cr.valueOnTheKey("pdp_topFeaturesEntertainmentAndCommunicationTab"), "xpath");
		Thread.sleep(2000);	
		WebElement topFeaturesEntertainmentAndCommunicationTabH2Header = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_topFeaturesEntertainmentAndCommunicationTabH2Header")));
		Assert.assertEquals(true, topFeaturesEntertainmentAndCommunicationTabH2Header.isDisplayed());
		
		prm.click(driver, cr.valueOnTheKey("pdp_topFeaturesInteriorTab"), "xpath");
		Thread.sleep(2000);	
		WebElement topFeaturesInteriorTabH2Header = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_topFeaturesInteriorTabH2Header")));
		Assert.assertEquals(true, topFeaturesInteriorTabH2Header.isDisplayed());
		
		prm.click(driver, cr.valueOnTheKey("pdp_topFeaturesExteriorTab"), "xpath");
		Thread.sleep(2000);	
		WebElement topFeaturesExteriorTabH2Header = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_topFeaturesExteriorTabH2Header")));
		Assert.assertEquals(true, topFeaturesExteriorTabH2Header.isDisplayed());
		}
	
	}
	
	
	
	