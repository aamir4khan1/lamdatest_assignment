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
public class PDP_tagscategory {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
			
   
       
	
	        	}
	         
    @And("user verifies assured category tag")
    
    public void user_verifies_assured_category_tag()throws InterruptedException {
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_1"), "xpath");
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement category_type1 = driver.findElement(By.xpath(cr.valueOnTheKey("category_type1")));
		Assert.assertEquals(true, category_type1.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("car_car_cad"), "xpath");
		Thread.sleep(2000);
		WebElement Assured_tag = driver.findElement(By.xpath(cr.valueOnTheKey("Assured_tag")));
		Assert.assertEquals(true, Assured_tag.isDisplayed());
		driver.navigate().back();
		prm.click(driver, cr.valueOnTheKey("filter_assured"), "xpath");
    }
    
    @And("user verifies budget category tag")
    
    public void user_verifies_budget_category_tag()throws InterruptedException {
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_2"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement category_type2 = driver.findElement(By.xpath(cr.valueOnTheKey("category_type2")));
		Assert.assertEquals(true, category_type2.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("car_car_cad"), "xpath");
		Thread.sleep(2000);
		WebElement Budget_tag = driver.findElement(By.xpath(cr.valueOnTheKey("Budget_tag")));
		Assert.assertEquals(true, Budget_tag.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back(); 
		prm.click(driver,cr.valueOnTheKey("budget_filter_2"), "xpath");
		 
}
    
    @And("user verifies max category tag")
    
    public void user_verifies_max_category_tag()throws InterruptedException {
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_3"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement category_type2 = driver.findElement(By.xpath(cr.valueOnTheKey("category_type3")));
		Assert.assertEquals(true, category_type2.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("car_car_cad"), "xpath");
		Thread.sleep(2000);
		WebElement Max_tag = driver.findElement(By.xpath(cr.valueOnTheKey("Max_tag")));
		Assert.assertEquals(true, Max_tag.isDisplayed());
		
    	
    	
   	
    

    }
}





