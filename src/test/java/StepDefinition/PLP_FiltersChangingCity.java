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

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class PLP_FiltersChangingCity {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
			
        
    }
	@And("user apply some filter")
    public void user_apply_some_filter() throws InterruptedException{
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("brandmodel"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("brand1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("brand2"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter2 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter")));
		Assert.assertEquals(true, applied_filter2.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
   		Thread.sleep(2000);
	}
	@And("Change the city to bangalore and validate")
    public void Change_the_city_to_bangalore_and_validate() throws InterruptedException{
		prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
    	Thread.sleep(3000);
    	
		prm.click(driver, cr.valueOnTheKey("plp_selectCityBangalore"), "xpath");
    	Thread.sleep(3000);
    	
    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
		Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
		Thread.sleep(2000);
		
		WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
		Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
		Thread.sleep(2000);
}
	 @And("Change the city to hyderabad and validate")
	    public void Change_the_city_to_hyderabad_and_validate() throws InterruptedException{
		prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
	    Thread.sleep(3000);
	    	
		prm.click(driver, cr.valueOnTheKey("plp_selectCityHyderabad"), "xpath");
	    Thread.sleep(3000);
	    	
	    WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
		Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
		Thread.sleep(2000);
			
		WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
		Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
		Thread.sleep(2000);
	 }
	 

		@And("Change the city to mumbai and validate")
	    public void Change_the_city_to_mumbai_and_validate() throws InterruptedException{
			prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
	    	Thread.sleep(3000);
	    	
			prm.click(driver, cr.valueOnTheKey("plp_selectCityMumbai"), "xpath");
	    	Thread.sleep(3000);
	    	
	    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
			Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
			Thread.sleep(2000);
			
			WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
			Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
			Thread.sleep(2000);
	 
}
	 @And("Change the city to pune and validate")
	    public void Change_the_city_to_pune_and_validate() throws InterruptedException{
		prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
	    Thread.sleep(3000);
	    	
		prm.click(driver, cr.valueOnTheKey("plp_selectCityPune"), "xpath");
	    Thread.sleep(3000);
	    	
	    WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
		Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
		Thread.sleep(2000);
			
		WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
		Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
		Thread.sleep(2000);
		
	 }
	 
		@And("Change the city to delhi and validate")
	    public void Change_the_city_to_delhi_and_validate() throws InterruptedException{
			prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
	    	Thread.sleep(3000);
	    	
			prm.click(driver, cr.valueOnTheKey("plp_selectCityDelhi"), "xpath");
	    	Thread.sleep(3000);
	    	
	    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
			Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
			Thread.sleep(2000);
			
			WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
			Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
			Thread.sleep(2000);

}
		
		@And("Change the city to gurgaon and validate")
	    public void Change_the_city_to_gurgaon_and_validate() throws InterruptedException{
			prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
	    	Thread.sleep(3000);
	    	
			prm.click(driver, cr.valueOnTheKey("plp_selectCityGurgaon"), "xpath");
	    	Thread.sleep(3000);
	    	
	    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
			Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
			Thread.sleep(2000);
			
			WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
			Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
			Thread.sleep(2000);
		}
		
		@And("Change the city to noida and validate")
	    public void Change_the_city_to_noida_and_validate() throws InterruptedException{
			prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
	    	Thread.sleep(3000);
	    	
			prm.click(driver, cr.valueOnTheKey("plp_selectCityNoida"), "xpath");
	    	Thread.sleep(3000);
	    	
	    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
			Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
			Thread.sleep(2000);
			
			WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
			Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
			Thread.sleep(2000);
		}
		@And("Change the city to ahemdabad and validate")
	    public void Change_the_city_to_ahembdabad_and_validate() throws InterruptedException{
			prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
	    	Thread.sleep(3000);
	    	
			prm.click(driver, cr.valueOnTheKey("plp_selectCityAhemedabad"), "xpath");
	    	Thread.sleep(3000);
	    	
	    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
			Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
			Thread.sleep(2000);
			
			WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
			Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
			Thread.sleep(2000);
		}
		@And("Change the city to chennai and validate")
	    public void Change_the_city_to_chennai_and_validate() throws InterruptedException{
			prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
	    	Thread.sleep(3000);
	    	
			prm.click(driver, cr.valueOnTheKey("plp_selectCityChennai"), "xpath");
	    	Thread.sleep(3000);
	    	
	    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
			Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
			Thread.sleep(2000);
			
			WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
			Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
			Thread.sleep(2000);
		}

		
		@And("Change the city to kolkata and validate")
		   public void Change_the_city_to_kolkata_and_validate() throws InterruptedException{
				prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
		    	Thread.sleep(3000);
		    	
				prm.click(driver, cr.valueOnTheKey("plp_selectCityKolkata"), "xpath");
		    	Thread.sleep(3000);
		    	
		    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
				Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
				Thread.sleep(2000);
				
				WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
				Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
				Thread.sleep(2000);
		}
		
		@And("Change the city to lucknow and validate")
		   public void Change_the_city_to_lucknow_and_validate() throws InterruptedException{
				prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
		    	Thread.sleep(3000);
		    	
				prm.click(driver, cr.valueOnTheKey("plp_selectCityLucknow"), "xpath");
		    	Thread.sleep(3000);
		    	
		    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
				Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
				Thread.sleep(2000);
				
				WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
				Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
				Thread.sleep(2000);
		}
		@And("Change the city to jaipur and validate")
		   public void Change_the_city_to_jaipur_and_validate() throws InterruptedException{
				prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
		    	Thread.sleep(3000);
		    	
				prm.click(driver, cr.valueOnTheKey("plp_selectCityJaipur"), "xpath");
		    	Thread.sleep(3000);
		    	
		    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
				Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
				Thread.sleep(2000);
				
				WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
				Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
				Thread.sleep(2000);

}
		@And("Change the city to chandigarh and validate")
		   public void Change_the_city_to_chandigarh_and_validate() throws InterruptedException{
				prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
		    	Thread.sleep(3000);
		    	
				prm.click(driver, cr.valueOnTheKey("plp_selectCityChandigarh"), "xpath");
		    	Thread.sleep(3000);
		    	
		    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
				Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
				Thread.sleep(2000);
				
				WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
				Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
				Thread.sleep(2000);
}
		@And("Change the city to coimbatore and validate")
		   public void Change_the_city_to_coimbatore_and_validate() throws InterruptedException{
				prm.click(driver, cr.valueOnTheKey("plp_citySelectorContainer"), "xpath");
		    	Thread.sleep(3000);
		    	
				prm.click(driver, cr.valueOnTheKey("plp_selectCityCoimbatore"), "xpath");
		    	Thread.sleep(3000);
		    	
		    	WebElement appliedFilterConfirm1 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm1")));
				Assert.assertEquals(true, appliedFilterConfirm1.isDisplayed());
				Thread.sleep(2000);
				
				WebElement appliedFilterConfirm2 = driver.findElement(By.xpath(cr.valueOnTheKey("appliedFilterConfirm2")));
				Assert.assertEquals(true, appliedFilterConfirm2.isDisplayed());
				Thread.sleep(2000);
		
}
}

