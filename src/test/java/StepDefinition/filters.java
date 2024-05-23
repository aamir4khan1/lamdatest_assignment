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
public class filters {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
			
        
    }

    @And("user clicks on the filter button")
    public void user_clicks_on_the_filter_button() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
		Thread.sleep(2000);
	    try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{
	        
		WebElement filter_page = driver.findElement(By.xpath(cr.valueOnTheKey("filter_page")));
		Assert.assertEquals(true, filter_page.isDisplayed());
       
		/*
		 * }
		 * 
		 * @And("user selects price filter") public void user_selects_price_filter()
		 * throws InterruptedException{ Thread.sleep(6000); prm.click(driver,
		 * cr.valueOnTheKey("HubTDdate"), "xpath"); Thread.sleep(2000);
		 */       
    
	        	}
	        } 
		    
		    catch (NoSuchElementException e) 
		    {
		        // Handle the case if the heading element is not found
		        e.printStackTrace();
		        Assert.fail("Heading element not found");
		    }

  
    
    	
    }
    	
	@And("user selects brandmodel")
    public void user_selects_brandmodel()throws InterruptedException {
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("brandmodel"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("brand1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("brand2"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter1 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter1")));
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
    	prm.click(driver, cr.valueOnTheKey("clear"), "xpath");
    	
   	
    }

    @And("user selects year")
    public void user_selects_year() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{
	    	    
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("year"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("year_select"), "xpath");
		Thread.sleep(2000);
    	WebElement applied_filter2 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter2")));
		Assert.assertEquals(true, applied_filter2.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement year_applied = driver.findElement(By.xpath(cr.valueOnTheKey("year_applied")));
		Assert.assertEquals(true, year_applied.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("year_applied"), "xpath");
	        	}
} 

catch (NoSuchElementException e) 
{
    // Handle the case if the heading element is not found
    e.printStackTrace();
    Assert.fail("Heading element not found");
}

        
        
    }

    @And("user slects kmsDriven")
    public void user_slects_kmsDriven() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
		
try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{
	    Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("kmdriven"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("km_select"), "xpath");
		Thread.sleep(2000);
    	WebElement applied_filter3 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter3")));
		Assert.assertEquals(true, applied_filter3.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement km_applied = driver.findElement(By.xpath(cr.valueOnTheKey("km_applied")));
		Assert.assertEquals(true, km_applied.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("km_applied"), "xpath");

    }
} 

catch (NoSuchElementException e) 
{
    // Handle the case if the heading element is not found
    e.printStackTrace();
    Assert.fail("Heading element not found");
}
    }

    @And("user selects fuel type")
    public void user_selects_fuel_type() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
		            Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{

    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("fuel_type"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("fuel1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("fuel2"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("fuel3"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter4 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter4")));
		Assert.assertEquals(true, applied_filter4.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement fuel_type1 = driver.findElement(By.xpath(cr.valueOnTheKey("fuel_type1")));
		Assert.assertEquals(true, fuel_type1.isDisplayed());
		Thread.sleep(2000);
    	WebElement fuel_type2 = driver.findElement(By.xpath(cr.valueOnTheKey("fuel_type2")));
		Assert.assertEquals(true, fuel_type2.isDisplayed());
		Thread.sleep(2000);
    	WebElement fuel_type3 = driver.findElement(By.xpath(cr.valueOnTheKey("fuel_type3")));
		Assert.assertEquals(true, fuel_type3.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("clear"), "xpath");
	        	} 
	        }

	        catch (NoSuchElementException e) 
	        {
	            // Handle the case if the heading element is not found
	            e.printStackTrace();
	            Assert.fail("Heading element not found");
	        }
	            }
    
    
    

    @And("user selects Body type")
    public void user_selects_Body_type() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{


    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("body_type"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("body1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("body2"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("body3"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("body4"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter5 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter5")));
		Assert.assertEquals(true, applied_filter5.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement body_type1 = driver.findElement(By.xpath(cr.valueOnTheKey("body_type1")));
		Assert.assertEquals(true, body_type1.isDisplayed());
		Thread.sleep(2000);
    	WebElement body_type2 = driver.findElement(By.xpath(cr.valueOnTheKey("body_type2")));
		Assert.assertEquals(true, body_type2.isDisplayed());
		Thread.sleep(2000);
    	WebElement body_type3 = driver.findElement(By.xpath(cr.valueOnTheKey("body_type3")));
		Assert.assertEquals(true, body_type3.isDisplayed());
		Thread.sleep(2000);
    	WebElement body_type4 = driver.findElement(By.xpath(cr.valueOnTheKey("body_type4")));
		Assert.assertEquals(true, body_type4.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("clear"), "xpath");
	        	}
}

catch (NoSuchElementException e) 
{
    // Handle the case if the heading element is not found
    e.printStackTrace();
    Assert.fail("Heading element not found");
}

    }
    @And("user selects Transmission")
    public void user_selects_Transmission()throws InterruptedException {
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{

    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("transmission_type"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("transmission1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("transmission2"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter6 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter6")));
		Assert.assertEquals(true, applied_filter6.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement transmission_type1 = driver.findElement(By.xpath(cr.valueOnTheKey("transmission_type1")));
		Assert.assertEquals(true, transmission_type1.isDisplayed());
		Thread.sleep(2000);
    	WebElement transmission_type2 = driver.findElement(By.xpath(cr.valueOnTheKey("transmission_type2")));
		Assert.assertEquals(true, transmission_type2.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("clear"), "xpath");
	        	}
	        	}

	        	catch (NoSuchElementException e) 
	        	{
	        	    // Handle the case if the heading element is not found
	        	    e.printStackTrace();
	        	    Assert.fail("Heading element not found");
	        	}

    }
    @And("user selects color")
    public void user_selects_color()throws InterruptedException {
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{

    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("color"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("color_type1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("color_type2"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter7 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter7")));
		Assert.assertEquals(true, applied_filter7.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement color_1 = driver.findElement(By.xpath(cr.valueOnTheKey("color_1")));
		Assert.assertEquals(true, color_1.isDisplayed());
		Thread.sleep(2000);
    	WebElement color_2 = driver.findElement(By.xpath(cr.valueOnTheKey("color_2")));
		Assert.assertEquals(true, color_2.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("clear"), "xpath");
	        	}
}

catch (NoSuchElementException e) 
{
    // Handle the case if the heading element is not found
    e.printStackTrace();
    Assert.fail("Heading element not found");
}

    }
    @And("user selects features")
    public void user_selects_features()throws InterruptedException {
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{

    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("feature"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("feature_type1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("feature_type2"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter8 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter8")));
		Assert.assertEquals(true, applied_filter8.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement feature_1 = driver.findElement(By.xpath(cr.valueOnTheKey("feature_1")));
		Assert.assertEquals(true, feature_1.isDisplayed());
		Thread.sleep(2000);
    	WebElement feature_2 = driver.findElement(By.xpath(cr.valueOnTheKey("feature_2")));
		Assert.assertEquals(true, feature_2.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("clear"), "xpath");
	        	}
	        	}

	        	catch (NoSuchElementException e) 
	        	{
	        	    // Handle the case if the heading element is not found
	        	    e.printStackTrace();
	        	    Assert.fail("Heading element not found");
	        	}

    
    	
    }

    @And("user selects seats")
    public void user_selects_seats() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{

    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("seats"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("seats1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("seats2"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("seats3"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("seats4"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter9 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter9")));
		Assert.assertEquals(true, applied_filter9.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement seats_type1 = driver.findElement(By.xpath(cr.valueOnTheKey("seats_type1")));
		Assert.assertEquals(true, seats_type1.isDisplayed());
		Thread.sleep(2000);
    	WebElement seats_type2 = driver.findElement(By.xpath(cr.valueOnTheKey("seats_type2")));
		Assert.assertEquals(true, seats_type2.isDisplayed());
		Thread.sleep(2000);
    	WebElement seats_type3 = driver.findElement(By.xpath(cr.valueOnTheKey("seats_type3")));
		Assert.assertEquals(true, seats_type3.isDisplayed());
		Thread.sleep(2000);
    	WebElement seats_type4 = driver.findElement(By.xpath(cr.valueOnTheKey("seats_type4")));
		Assert.assertEquals(true, seats_type4.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("clear"), "xpath");
	        	}
}

catch (NoSuchElementException e) 
{
    // Handle the case if the heading element is not found
    e.printStackTrace();
    Assert.fail("Heading element not found");
}

    }
    	@And("user selects RTO")
        public void user_selects_RTO() throws InterruptedException{
        	Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    		try {
    	        
    	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
    	      int LoginModalSize =login.size();
    	     
    	        if (LoginModalSize>0)
    	        	
    	        {
    	        	{
    	        		Thread.sleep(2000);
    	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
    		        }} 
    	        	else
    	        	{

        	Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("rto"), "xpath");
        	Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("rto_1"), "xpath");
        	Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("rto_2"), "xpath");
        	Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("rto_3"), "xpath");
        	Thread.sleep(2000);
        	WebElement applied_filter10 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter10")));
    		Assert.assertEquals(true, applied_filter10.isDisplayed());
    		Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
        	Thread.sleep(2000);
        	WebElement rto_type1 = driver.findElement(By.xpath(cr.valueOnTheKey("rto_type1")));
    		Assert.assertEquals(true, rto_type1.isDisplayed());
    		Thread.sleep(2000);
        	WebElement rto_type2 = driver.findElement(By.xpath(cr.valueOnTheKey("rto_type2")));
    		Assert.assertEquals(true, rto_type2.isDisplayed());
    		Thread.sleep(2000);
        	WebElement rto_type3 = driver.findElement(By.xpath(cr.valueOnTheKey("rto_type3")));
    		Assert.assertEquals(true, rto_type3.isDisplayed());
    		Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("clear"), "xpath");
    	        	}
    		}

    		catch (NoSuchElementException e) 
    		{
    		    // Handle the case if the heading element is not found
    		    e.printStackTrace();
    		    Assert.fail("Heading element not found");
    		}

        

    }

    @And("user selects owner")
    public void user_selects_owner() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
		try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{


		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("owner"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("owner_select"), "xpath");
		Thread.sleep(2000);
    	WebElement applied_filter11 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter11")));
		Assert.assertEquals(true, applied_filter11.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement owner_applied = driver.findElement(By.xpath(cr.valueOnTheKey("owner_applied")));
		Assert.assertEquals(true, owner_applied.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("owner_applied"), "xpath");
	        	}
		}

		catch (NoSuchElementException e) 
		{
		    // Handle the case if the heading element is not found
		    e.printStackTrace();
		    Assert.fail("Heading element not found");
		}


    }

    @And("user selects car category")
    public void user_selects_car_category() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{

    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_2"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_3"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter12 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter12")));
		Assert.assertEquals(true, applied_filter12.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement category_type1 = driver.findElement(By.xpath(cr.valueOnTheKey("category_type1")));
		Assert.assertEquals(true, category_type1.isDisplayed());
		Thread.sleep(2000);
    	WebElement category_type2 = driver.findElement(By.xpath(cr.valueOnTheKey("category_type2")));
		Assert.assertEquals(true, category_type2.isDisplayed());
		Thread.sleep(2000);
    	WebElement category_type3 = driver.findElement(By.xpath(cr.valueOnTheKey("category_type3")));
		Assert.assertEquals(true, category_type3.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("clear"), "xpath");
	        	}
}

catch (NoSuchElementException e) 
{
    // Handle the case if the heading element is not found
    e.printStackTrace();
    Assert.fail("Heading element not found");
}

    }
    @And("user selects spinny hubs")
    public void user_selects_spinny_hubs()throws InterruptedException {
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
try {
	        
	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
	      int LoginModalSize =login.size();
	     
	        if (LoginModalSize>0)
	        	
	        {
	        	{
	        		Thread.sleep(2000);
	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		        }} 
	        	else
	        	{


    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("spinny_hubs"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hub1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hub2"), "xpath");
    	Thread.sleep(2000);
    	WebElement applied_filter13 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter13")));
		Assert.assertEquals(true, applied_filter13.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement hub_1 = driver.findElement(By.xpath(cr.valueOnTheKey("hub_1")));
		Assert.assertEquals(true, hub_1.isDisplayed());
		Thread.sleep(2000);
    	WebElement hub_2 = driver.findElement(By.xpath(cr.valueOnTheKey("hub_2")));
		Assert.assertEquals(true, hub_2.isDisplayed());
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("clear"), "xpath");
	        	}
	        	}

	        	catch (NoSuchElementException e) 
	        	{
	        	    // Handle the case if the heading element is not found
	        	    e.printStackTrace();
	        	    Assert.fail("Heading element not found");
	        	}

    }
    	@And("user selects Availability")
        public void user_selects_Availability() throws InterruptedException{
        	Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    		try {
    	        
    	        List<WebElement> login = driver.findElements(By.xpath(cr.valueOnTheKey("login")));
    	      int LoginModalSize =login.size();
    	     
    	        if (LoginModalSize>0)
    	        	
    	        {
    	        	{
    	        		Thread.sleep(2000);
    	        		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
    		        }} 
    	        	else
    	        	{

    		Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("availability"), "xpath");
    		Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("In_stock"), "xpath");
    		Thread.sleep(2000);
        	WebElement applied_filter14 = driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter14")));
    		Assert.assertEquals(true, applied_filter14.isDisplayed());
    		Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
        	Thread.sleep(2000);
        	WebElement Instock_cars = driver.findElement(By.xpath(cr.valueOnTheKey("Instock_cars")));
    		Assert.assertEquals(true, Instock_cars.isDisplayed());
    		Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("Instock_cars"), "xpath");
    	        	}
        	}

        	catch (NoSuchElementException e) 
        	{
        	    // Handle the case if the heading element is not found
        	    e.printStackTrace();
        	    Assert.fail("Heading element not found");
        	}


    }
}





