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
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class reschedulehubtestdrive {
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

    @And("user clicks on reschedule button")
    public void user_clicks_on_reschedule_button() throws InterruptedException{
    	Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("reschedule"), "xpath");
        Thread.sleep(6000);
        WebElement reschedule_page = driver.findElement(By.xpath(cr.valueOnTheKey("reschedule_page")));
		Assert.assertEquals(true, reschedule_page.isDisplayed());
        
        Thread.sleep(2000);
    }

    @And("user click date")
    public void user_click_date() throws InterruptedException{
    	Thread.sleep(3000);
        WebElement date_head = driver.findElement(By.xpath(cr.valueOnTheKey("date_head")));
		Assert.assertEquals(true, date_head.isDisplayed());
    	Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("date_picker"), "xpath");
        
        Thread.sleep(2000);
    }

    @And("user click time")
    public void user_click_time() throws InterruptedException{
    	Thread.sleep(3000);
        WebElement time_head = driver.findElement(By.xpath(cr.valueOnTheKey("time_head")));
		Assert.assertEquals(true, time_head.isDisplayed());
    	Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("time_picker"), "xpath");
        
        Thread.sleep(2000);
    }

    @And("user click saveedit button")
    public void user_click_saveedit_button() throws InterruptedException{
    	Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("saved_edit"), "xpath");
        Thread.sleep(6000);
        WebElement Hub_TDC_page = driver.findElement(By.xpath(cr.valueOnTheKey("Hub_TDC_page")));
		Assert.assertEquals(true, Hub_TDC_page.isDisplayed());
        
        Thread.sleep(2000);




        
        }
}





