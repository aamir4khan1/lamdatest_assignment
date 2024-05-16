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
public class HubTestDrive {
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

    @And("user select a car card")
    public void userSelectACarCard() throws InterruptedException{
    	Thread.sleep(2000);
		WebElement plp_quickfilters = driver.findElement(By.xpath(cr.valueOnTheKey("plp_quickfilters")));
		Assert.assertEquals(true, plp_quickfilters.isDisplayed());
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,750)");}
		Thread.sleep(1000);
		prm.click(driver, cr.valueOnTheKey("HubTDcard"), "xpath");
		Thread.sleep(2000);
        
    }

    @And("user click on the Free test drive button")
    public void userClickOnFreeTestDriveButton() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("FreeHubTD"), "xpath");
		Thread.sleep(2000);
       
    }

    @And("user selects date")
    public void user_Selects_date() throws InterruptedException{
    	Thread.sleep(6000);
		prm.click(driver, cr.valueOnTheKey("HubTDdate"), "xpath");
		Thread.sleep(2000);
       
    }
    
    	
	@And("user chooses time")
    public void userchoosesTime()throws InterruptedException {
    	
    		Thread.sleep(2000);
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("document.getElementsByClassName('ScheduleTestDrive__container')[0].scroll(0, 600)");
    		Thread.sleep(2000);
    	WebElement HubTDtimeselect = driver.findElement(By.xpath(cr.valueOnTheKey("HubTDtimeselect")));
		Assert.assertEquals(true, HubTDtimeselect.isDisplayed());
		Thread.sleep(2000);
       // prm.clickByJavaScript(driver, cr.valueOnTheKey("Home_testdrive_timee"),"xpath");
        prm.click(driver, cr.valueOnTheKey("Hub_testdrive_time"), "xpath");
   	
    }

    @And("user clicks on Schedule hub test drive")
    public void user_clicks_on_Schedule_hub_test_drive() throws InterruptedException{
    	Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("Hub_testdrive_schedule"), "xpath");
        Thread.sleep(6000);
        WebElement Home_TDC_page = driver.findElement(By.xpath(cr.valueOnTheKey("Hub_TDC_page")));
		Assert.assertEquals(true, Home_TDC_page.isDisplayed());
        
        Thread.sleep(2000);
        
    }

    @And("user clicks on cancel button")
    public void user_clicks_on_cancel_button() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("cancel_button"), "xpath");
		Thread.sleep(3000);
		WebElement cancel_reason_screen = driver.findElement(By.xpath(cr.valueOnTheKey("cancel_reason_screen")));
		Assert.assertEquals(true, cancel_reason_screen.isDisplayed());
    }

    @And("user chooses reason for cancellation")
    public void user_chooses_reason_for_cancellation() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("reason_select"), "xpath");
    }

    @And("user selects cancel CTA")
    public void user_selects_cancel_CTA() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("cancel_CTA"), "xpath");
		Thread.sleep(3000);
		WebElement cancel_screen = driver.findElement(By.xpath(cr.valueOnTheKey("cancel_screen")));
		Assert.assertEquals(true, cancel_screen.isDisplayed());
    	
    }
}





