package StepDefinition;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

//import cucumber.api.java.en.And;
//import testselement.screens.android.AndroidHomepageScreen;

public class PLP_Save_deleteFilter {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();
	
	
	@And ("user apply some filters")
	 public void user_apply_some_filters()throws InterruptedException {
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("brandmodel"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("brand1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("brand2"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter1 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter")));
		Assert.assertEquals(true, applied_filter1.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement car1 = driver.findElement(By.xpath(cr.valueOnTheKey("car1")));
		Assert.assertEquals(true, car1.isDisplayed());
		Thread.sleep(2000);
    	WebElement car2 = driver.findElement(By.xpath(cr.valueOnTheKey("car2")));
		Assert.assertEquals(true, car2.isDisplayed());
		Thread.sleep(2000);
	}

  @And ("user click on save button") 
  
  public void user_click_on_save_button() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("PLP_FiltersaveButton"), "xpath");
		Thread.sleep(2000);
  }
		
 @And ("user validate the saved filters assertions")
 
 public void user_validate_the_saved_filters_assertions() throws InterruptedException {
	 
	    Thread.sleep(2000);
		
		WebElement savedFiltericon = driver.findElement(By.xpath(cr.valueOnTheKey("savedFiltericon")));
		Assert.assertEquals(true, savedFiltericon.isDisplayed());
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		Thread.sleep(2000);
		
		WebElement savedFilterBottomIcon = driver.findElement(By.xpath(cr.valueOnTheKey("savedFilterBottomIcon")));
		Assert.assertEquals(true, savedFilterBottomIcon.isDisplayed());
		Thread.sleep(2000);
		
	}
 
     @And ("user delete filter and validate")
 
        public void user_delete_filter_and_validate() throws InterruptedException {
    	 
    	 
    	prm.click(driver, cr.valueOnTheKey("savedFiltericon"), "xpath");
	    Thread.sleep(2000);
		
		WebElement plp_deleteFilterIcon = driver.findElement(By.xpath(cr.valueOnTheKey("plp_deleteFilterIcon")));
		Assert.assertEquals(true, plp_deleteFilterIcon.isDisplayed());
		Thread.sleep(2000);

		
		prm.click(driver, cr.valueOnTheKey("plp_deleteFilterIcon"), "xpath");
		Thread.sleep(2000);
		
		WebElement plp_deleteFilterPopup = driver.findElement(By.xpath(cr.valueOnTheKey("plp_deleteFilterPopup")));
		Assert.assertEquals(true, plp_deleteFilterPopup.isDisplayed());
		Thread.sleep(2000);
		
		
		prm.click(driver, cr.valueOnTheKey("plp_deleteFilterPopupBackbutton"), "xpath");
		Thread.sleep(2000);
		
		
		WebElement plp_removeDeleteFilterPopup = driver.findElement(By.xpath(cr.valueOnTheKey("plp_removeDeleteFilterPopup")));
		Assert.assertEquals(true, plp_removeDeleteFilterPopup.isDisplayed());
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("plp_deleteFilterIcon"), "xpath");
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("plp_deleteButton"), "xpath");
		Thread.sleep(2000);
		
		
     }
  
  
}