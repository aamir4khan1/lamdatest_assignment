package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class PDP_cancelscheduleHUBTD {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
			/*
			 * }
			 * 
			 * 
			 * 
			 * 
			 * @And("user clicks on the browse car button") public void
			 * userClicksOnBrowseCarButton() throws InterruptedException{
			 * Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scroll(0,800)"); prm.click(driver,
			 * cr.valueOnTheKey("homepage_browseCars"), "xpath"); Thread.sleep(2000);
			 */       
   
    }

    @And("user select cancellation reason")
    public void user_select_cancellation_reason() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("reschedule_hub"), "xpath");
    }

    @And("user chooses cancel button")
    public void user_chooses_cancel_button() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("cancel_CTA"), "xpath");
		Thread.sleep(3000);
		WebElement reschedule_cnf_page = driver.findElement(By.xpath(cr.valueOnTheKey("reschedule_cnf_page")));
		Assert.assertEquals(true, reschedule_cnf_page.isDisplayed());
    }

    @And("user chooses option from dropdown")
    public void user_chooses_option_from_dropdown() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("hub_dropdown"), "xpath");
		Thread.sleep(3000);
		WebElement hub_dropdown_option_select = driver.findElement(By.xpath(cr.valueOnTheKey("hub_dropdown_option_select")));
		Assert.assertEquals(true, hub_dropdown_option_select.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("Home_option_select"), "xpath");
		Thread.sleep(2000);
		WebElement Home_option_selected = driver.findElement(By.xpath(cr.valueOnTheKey("Home_option_selected")));
		Assert.assertEquals(true, Home_option_selected.isDisplayed());
    }

    @And("user chooses hub TD option from the dropdown")
    public void user_chooses_hub_TD_option_from_the_dropdown() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("hub_dropdown"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("hub_option_select"), "xpath");
		Thread.sleep(3000);
		WebElement hub_cnf = driver.findElement(By.xpath(cr.valueOnTheKey("hub_cnf")));
		Assert.assertEquals(true, hub_cnf.isDisplayed());
    	
    }
}





