package StepDefinition;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.devtools.v85.emulation.Emulation;


import com.google.common.base.Optional;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;

import java.util.List;

import org.junit.Assert;

public class PDP_HomeTD {
	
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

  

	/*
	 * @Given("user lands on spinny website") public void userLandsOnSpinnyWebsite()
	 * { // Code to navigate to Spinny website
	 * driver.get("https://www.spinny.com/"); }
	 */
	
	@And("User clicks on the homepage")
	 public void UserClicksOnTheomepage() throws InterruptedException{
		wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_detect_Loc"));
		//prm.click(driver, cr.valueOnTheKey("account_homeButton"), "xpath");
		WebElement Home_detect_Loc = driver.findElement(By.xpath(cr.valueOnTheKey("Home_detect_Loc")));
		Assert.assertEquals(true,Home_detect_Loc.isDisplayed());
		
	}

    @And("user clicks on the browse car button")
    public void userClicksOnBrowseCarButton() throws InterruptedException{
    	Wait.implicitWait(3, driver);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,800)");
		wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("homepage_browseCars"));
		prm.click(driver, cr.valueOnTheKey("homepage_browseCars"), "xpath");
       
    }

    @And("user selects a car card")
    public void userSelectsACarCard() throws InterruptedException{
    	wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("plp_quickfilters"));
		WebElement plp_quickfilters = driver.findElement(By.xpath(cr.valueOnTheKey("plp_quickfilters")));
		Assert.assertEquals(true, plp_quickfilters.isDisplayed());
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,750)");}
		wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("plp_homeTD_CarCard"));
		prm.click(driver, cr.valueOnTheKey("plp_homeTD_CarCard"), "xpath");
	
		
        
    }

    @And("user clicks on the Free test drive button")
    public void userClicksOnFreeTestDriveButton() throws InterruptedException{
    	wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("pdp_freeTDButton"));
		prm.click(driver, cr.valueOnTheKey("pdp_freeTDButton"), "xpath");
		
       
    }

    @And("user selects my location")
    public void userSelectsMyLocation() throws InterruptedException{
    	wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("HomeTDLoactionTab"));
		prm.click(driver, cr.valueOnTheKey("HomeTDLoactionTab"), "xpath");
		
       
    }
    
    @And("user enters home address")
    public void userEntersHomeAddress() throws InterruptedException{
    	wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_testdrive_addlable"));
    	WebElement Home_testdrive_addlable = driver.findElement(By.xpath(cr.valueOnTheKey("Home_testdrive_addlable")));
		Assert.assertEquals(true, Home_testdrive_addlable.isDisplayed());
		
		}
    	/*   WebElement HomeTD_EnterAddress = driver.findElement(By.xpath(cr.valueOnTheKey("HomeTD_EnterAddress")));
   	    Assert.assertEquals(true, HomeTD_EnterAddress.isDisplayed());
   	 String userInput = HomeTD_EnterAddress.getText();
   	 if (isStringNotEmpty(userInput))
	        
     {
   		WebElement Home_testdrive_change = driver.findElement(By.xpath(cr.valueOnTheKey("Home_testdrive_change")));
		Assert.assertEquals(true, Home_testdrive_change.isDisplayed());
		Thread.sleep(2000);
     } 
   	 else {
     
		prm.click(driver, cr.valueOnTheKey("Home_testdrive_enterAdd"), "xpath");
		Thread.sleep(2000);
		WebElement HomeTD_change = driver.findElement(By.xpath(cr.valueOnTheKey("HomeTD_change")));
		Assert.assertEquals(true, HomeTD_change.isDisplayed());
		Thread.sleep(2000);
		//prm.sendTextToTextBox(driver, cr.valueOnTheKey("Home_testdrive_add"), ("xpath"), (cr.valueOnTheKey("Hub1")));
		//Thread.sleep(2000);
		//prm.clickByJavaScript(driver, cr.valueOnTheKey("Home_testdrive_enterAdd"),"xpath");
		prm.click(driver, cr.valueOnTheKey("Home_testdrive_confirmbutton"), "xpath");
		Thread.sleep(2000);
		//prm.sendTextToTextBox(driver, cr.valueOnTheKey("Home_testdrive_confirmbutton"), ("xpath"), (cr.valueOnTheKey("Hub1")));
		//Thread.sleep(2000);
		WebElement Home_testdrive_loactionPicker = driver.findElement(By.xpath(cr.valueOnTheKey("Home_testdrive_loactionPicker")));
		Assert.assertEquals(true,Home_testdrive_loactionPicker.isDisplayed());
		WebElement HTD_LocationPickerChange = driver.findElement(By.xpath(cr.valueOnTheKey("HTD_LocationPickerChange")));
		Assert.assertEquals(true,HTD_LocationPickerChange.isDisplayed());
		//prm.click(driver, cr.valueOnTheKey("Home_testdrive_add1"), "xpath");
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("Home_testdrive_add1"), ("xpath"), (cr.valueOnTheKey("Add2")));
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("Home_testdrive_add2"), ("xpath"), (cr.valueOnTheKey("Add3")));
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("Home_testdrive_add3"), ("xpath"), (cr.valueOnTheKey("Add4")));
		prm.click(driver, cr.valueOnTheKey("Home_TD_SaveAddress"), "xpath");
		//prm.click(driver, cr.valueOnTheKey("Home_testdrive_address_click"), "xpath");
		Thread.sleep(3000);
		WebElement Home_testdrive_change = driver.findElement(By.xpath(cr.valueOnTheKey("Home_testdrive_change")));
		Assert.assertEquals(true, Home_testdrive_change.isDisplayed());
		Thread.sleep(2000);
		//WebElement Home_testdrive_change = driver.findElement(By.xpath(cr.valueOnTheKey("Home_testdrive_change")));
		//Assert.assertEquals(true, Home_testdrive_change.isDisplayed();
		//Thread.sleep(2000);
		
		}}

    private boolean isStringNotEmpty(String userInput) {
		// TODO Auto-generated method stub
		return false;
	}*/


	@And("user select date")
    public void userSelectDate()throws InterruptedException {
		wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_testdrive_select_Date"));
		WebElement Home_testdrive_change = driver.findElement(By.xpath(cr.valueOnTheKey("Home_testdrive_select_Date")));
		Assert.assertEquals(true, Home_testdrive_change.isDisplayed());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName(\"ScheduleTestDrive__container\")[0].scrollTo(0,600)");
		/*
		 * Thread.sleep(2000); prm.click(driver,
		 * cr.valueOnTheKey("Home_testdrive_see_all"), "xpath");
		 * 
		 */
		List<WebElement> availableDates = driver.findElements(By.xpath(cr.valueOnTheKey("Home_testdrive_date_selected")));
		if (!availableDates.isEmpty() && availableDates.get(0).isDisplayed() && availableDates.get(0).isEnabled()) {
	        availableDates.get(0).click();
	    } else {
	        // If not available, click "See all dates" and pick a date
	        prm.click(driver, cr.valueOnTheKey("Home_testdrive_see_all"), "xpath");
	        wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("Home_testdrive_date_selected"));
	        prm.click(driver, cr.valueOnTheKey("Home_testdrive_date_selected"), "xpath");
	    }
			      
	}
		/*
		 * Thread.sleep(2000); prm.click(driver,
		 * cr.valueOnTheKey("Home_testdrive_date"), "xpath"); Thread.sleep(2000);
		 */
		
       



	@And("user selects time")
    public void userSelectsTime()throws InterruptedException {
    	
	
    		/*JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("document.getElementsByClassName('ScheduleTestDrive__container')[0].scroll(0, 600)");
    		wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_testdrive_time_slot_v"));
    		WebElement Home_testdrive_time_slot_v = driver.findElement(By.xpath(cr.valueOnTheKey("Home_testdrive_time_slot_v")));
    		Assert.assertEquals(true, Home_testdrive_time_slot_v.isDisplayed());
    		wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_testdrive_timee"));       // prm.clickByJavaScript(driver, cr.valueOnTheKey("Home_testdrive_timee"),"xpath");
        prm.click(driver, cr.valueOnTheKey("Home_testdrive_timee"), "xpath");*/
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("document.getElementsByClassName('ScheduleTestDrive__container')[0].scroll(0, 600)");

		    // Wait until "Select time slot" section is visible
		    wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("Home_testdrive_time_slot_v"));
		    WebElement timeSlotLabel = driver.findElement(By.xpath(cr.valueOnTheKey("Home_testdrive_time_slot_v")));
		    Assert.assertTrue(timeSlotLabel.isDisplayed());
		   
		    wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("Home_testdrive_timee"));
		    Thread.sleep(2000);
		    WebElement firstSlot = driver.findElement(By.xpath(cr.valueOnTheKey("Home_testdrive_timee")));
		   

		    try {
		        firstSlot.click();
		    } catch (Exception e) {
		        js.executeScript("arguments[0].click();", firstSlot); // fallback
		    }
    	    	  
	}

    	     
    	    	
   	
    

    @And("user clicks on the schedule myloc test drive button")
    public void userClicksOnScheduleYloctestDriveButton() throws InterruptedException{
    	
    	//driver.manage().window().setSize(new Dimension(375, (int)(812 * 0.61)));
		/*
		 * DevTools devTools = ((ChromeDriver) driver).getDevTools();
		 * devTools.createSession();
		 * //devTools.send(Emulation.setDeviceMetricsOverride(375, 812, 3, true, null,
		 * null, null, null, null, null, 0.61, null, null));
		 * devTools.send(Emulation.setDeviceMetricsOverride( 375, 812, 3, true,
		 * Optional.ofNullable(null), // optional width Optional.ofNullable(null), //
		 * optional height Optional.ofNullable(null), // optional screen width
		 * Optional.ofNullable(null), // optional screen height
		 * Optional.ofNullable(null), // optional position x Optional.ofNullable(null),
		 * // optional position y 0.61, // scale factor Optional.ofNullable(null), //
		 * optional screen orientation Optional.ofNullable(null), // optional viewport
		 * Optional.ofNullable(null) // optional display feature ));
		 */
    	wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_testdrive_schedule")); 
        prm.click(driver, cr.valueOnTheKey("Home_testdrive_schedule"), "xpath");
        wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_TDC_page"));
        WebElement Home_TDC_page = driver.findElement(By.xpath(cr.valueOnTheKey("Home_TDC_page")));
		Assert.assertEquals(true, Home_TDC_page.isDisplayed());
        
    	
    }
    
    @And("user scroll to verify other elements")
    public void userScrolltoverifyotherelements()throws InterruptedException{
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_testdrive_booknowCTA")); 
        prm.click(driver, cr.valueOnTheKey("Home_testdrive_booknowCTA"), "xpath");
        wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_testdrive_bookCTABack")); 
        prm.click(driver, cr.valueOnTheKey("Home_testdrive_bookCTABack"), "xpath");
        wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_testdrive_loanlearnmore")); 
        prm.click(driver, cr.valueOnTheKey("Home_testdrive_loanlearnmore"), "xpath");
        wait.presenceOfElementLocated(driver,"xpath", cr.valueOnTheKey("Home_testdrive_loanlearnmoreBack")); 
        prm.click(driver, cr.valueOnTheKey("Home_testdrive_loanlearnmoreBack"), "xpath");
        
		
		}
    	
    }
