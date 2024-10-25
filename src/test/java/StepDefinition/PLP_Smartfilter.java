package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class PLP_Smartfilter {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
			
        
    }
	@And("user selects brandmodels")
    public void user_selects_brandmodel()throws InterruptedException {
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("smart_brandmodel"), "xpath");
    	Thread.sleep(2000);
    	//prm.click(driver, cr.valueOnTheKey("smart_brand1"), "xpath");
    	//Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("smart_brand2"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter1 = driver.findElement(By.xpath(cr.valueOnTheKey("smart_applied_filter1")));
		Assert.assertEquals(true, applied_filter1.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("smart_apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement car1 = driver.findElement(By.xpath(cr.valueOnTheKey("smart_car1")));
		Assert.assertEquals(true, car1.isDisplayed());
		Thread.sleep(2000);
    	//WebElement car2 = driver.findElement(By.xpath(cr.valueOnTheKey("smart_car1")));
		//Assert.assertEquals(true, car2.isDisplayed());
		
		
    }

	
    @And("user should able to see Smart filter")
    public void userClicksOnBrowseCarButton() throws InterruptedException{
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2800)");
		Thread.sleep(2000);
		
		//WebElement plp_quickfilters = driver.findElement(By.xpath("plp_smartFilter"));
		//Assert.assertEquals(true, plp_quickfilters.isDisplayed());
		
		WebElement plp_smartfilterClick = driver.findElement(By.xpath(cr.valueOnTheKey("plp_smartfilterClick")));
		Actions actions = new Actions(driver);
		actions.moveToElement(plp_smartfilterClick).click().build().perform();
		Thread.sleep(2000);
		WebElement plp_smartFilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("plp_smartFilterApplied")));
		Assert.assertEquals(true, plp_smartFilterApplied.isDisplayed());
		
       
    }

   }