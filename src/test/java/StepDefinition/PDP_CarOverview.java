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

public class PDP_CarOverview {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();	
	
	@And("user view Car Overview Section")
	public void user_view_Car_Overview_Section () throws InterruptedException {
		Thread.sleep(2000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,800)");
		Thread.sleep(2000);
		WebElement Pdp_Caroverview = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_Caroverview")));
		Assert.assertEquals(true,Pdp_Caroverview.isDisplayed());
		Thread.sleep(2000);
		WebElement Pdp_caroverviewMakeYear = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_caroverviewMakeYear")));
		Assert.assertEquals(true,Pdp_caroverviewMakeYear.isDisplayed());
		Thread.sleep(2000);	
		WebElement Pdp_caroverviewReg = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_caroverviewReg")));
		Assert.assertEquals(true,Pdp_caroverviewReg.isDisplayed());
		Thread.sleep(2000);	
		WebElement Pdp_caroverviewFuel = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_caroverviewFuel")));
		Assert.assertEquals(true,Pdp_caroverviewFuel.isDisplayed());
		Thread.sleep(2000);	
		WebElement Pdp_caroverviewKM = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_caroverviewKM")));
		Assert.assertEquals(true,Pdp_caroverviewKM.isDisplayed());
		Thread.sleep(2000);	
		WebElement Pdp_caroverviewTransmission = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_caroverviewTransmission")));
		Assert.assertEquals(true,Pdp_caroverviewTransmission.isDisplayed());
		Thread.sleep(2000);	
		WebElement Pdp_caroverviewOwner = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_caroverviewOwner")));
		Assert.assertEquals(true,Pdp_caroverviewOwner.isDisplayed());
		Thread.sleep(2000);	
		WebElement Pdp_caroverviewInsurance = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_caroverviewInsurance")));
		Assert.assertEquals(true,Pdp_caroverviewInsurance.isDisplayed());
		Thread.sleep(2000);	
		WebElement Pdp_caroverviewInsuranceType = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_caroverviewInsuranceType")));
		Assert.assertEquals(true,Pdp_caroverviewInsuranceType.isDisplayed());
		Thread.sleep(2000);	
		WebElement Pdp_caroverviewRTO = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_caroverviewRTO")));
		Assert.assertEquals(true,Pdp_caroverviewRTO.isDisplayed());
		Thread.sleep(2000);	
		WebElement Pdp_caroverviewlocation = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_caroverviewlocation")));
		Assert.assertEquals(true,Pdp_caroverviewlocation.isDisplayed());
		Thread.sleep(2000);	
		
	}
	
	
	
}