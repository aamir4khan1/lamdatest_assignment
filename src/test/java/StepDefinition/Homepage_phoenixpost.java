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
public class Homepage_phoenixpost {
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
		prm.click(driver, cr.valueOnTheKey("back_button_12"), "xpath");
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement phoenix_post = driver.findElement(By.xpath(cr.valueOnTheKey("phoenix_post")));
		Assert.assertEquals(true, phoenix_post.isDisplayed());
    }
    
	
	@And("user clicks on booknow button")
    public void user_clicks_on_booknow_button()throws InterruptedException {
    	Thread.sleep(2000);
    	WebElement phoenix_booknow_cta = driver.findElement(By.xpath(cr.valueOnTheKey("phoenix_booknow_cta")));
		Assert.assertEquals(true, phoenix_booknow_cta.isDisplayed());
		Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("phoenix_booknow_cta"), "xpath");
        Thread.sleep(2000);
    	WebElement phoenix_checkout_page = driver.findElement(By.xpath(cr.valueOnTheKey("phoenix_checkout_page")));
		Assert.assertEquals(true, phoenix_checkout_page.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
	  }
    
	
		@And("user clicks on gethelp button")
	    public void user_clicks_on_gethelp_button()throws InterruptedException {
	    	Thread.sleep(2000);
	    	WebElement phoenix_gethelp = driver.findElement(By.xpath(cr.valueOnTheKey("phoenix_gethelp")));
			Assert.assertEquals(true, phoenix_gethelp.isDisplayed());
			Thread.sleep(2000);
	        prm.click(driver, cr.valueOnTheKey("phoenix_gethelp"), "xpath");
	        Thread.sleep(2000);
	    	WebElement phoenix_questions = driver.findElement(By.xpath(cr.valueOnTheKey("phoenix_questions")));
			Assert.assertEquals(true, phoenix_questions.isDisplayed());
			Thread.sleep(2000);
			prm.click(driver, cr.valueOnTheKey("phoenix_quicktips"), "xpath");
			Thread.sleep(2000);
			prm.click(driver, cr.valueOnTheKey("phoenix_background"), "xpath");
			
		
}
    
	
	@And("user clicks on Addmorecar button")
    public void user_clicks_on_Addmorecar_button()throws InterruptedException {
    	Thread.sleep(2000);
    	WebElement phoenix_addmorecar_cta = driver.findElement(By.xpath(cr.valueOnTheKey("phoenix_addmorecar_cta")));
		Assert.assertEquals(true, phoenix_addmorecar_cta.isDisplayed());
		Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("phoenix_addmorecar_click"), "xpath");
        Thread.sleep(2000);
    	WebElement phoenix_add_cars_page = driver.findElement(By.xpath(cr.valueOnTheKey("phoenix_add_cars_page")));
		Assert.assertEquals(true, phoenix_add_cars_page.isDisplayed());
		Thread.sleep(2000);
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("phoenix_search_box"),("xpath"),(cr.valueOnTheKey("phoenix_car_name")));
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("phoenix_addcar_1"), "xpath");
		Thread.sleep(20000);
		driver.navigate().refresh();
		driver.navigate().back();
		
}
    
	
	@And("user clicks on phoenix card")
    public void user_clicks_on_phoenix_card()throws InterruptedException {
    	Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("phoenix_card_click"), "xpath");
        Thread.sleep(2000);
    	WebElement phoenix_TD_confirm_page = driver.findElement(By.xpath(cr.valueOnTheKey("phoenix_TD_confirm_page")));
		Assert.assertEquals(true, phoenix_TD_confirm_page.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("phoenix_locate_hub"), "xpath");
		Thread.sleep(2000);
		WebElement phoenix_locate_hub = driver.findElement(By.xpath(cr.valueOnTheKey("phoenix_locate_hub")));
		Assert.assertEquals(true, phoenix_locate_hub.isDisplayed());


		
		
		
        
		
    }
}