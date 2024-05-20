package StepDefinition;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
//import testselement.screens.android.AndroidPLPScreen;


//import cucumber.api.java.en.And;
//import testselement.screens.android.AndroidHomepageScreen;

public class PLP_Notifyme {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();	

//	@And("user click on buy button")
//	public void user_click_on_buy_button() throws InterruptedException {
//		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
//		Thread.sleep(4000);
		
	
	
	 @And ("user select some filters from PLP")

		public void user_select_some_filters_from_PLP() throws InterruptedException {
		 
		 	driver.manage().window().maximize();
			prm.click(driver, cr.valueOnTheKey("plp_Filters"), "xpath");
			Thread.sleep(3000);

			prm.click(driver, cr.valueOnTheKey("plp_filtersBrandsModels"), "xpath");
			Thread.sleep(3000);

			prm.click(driver, cr.valueOnTheKey("plp_filtersBrandSelected"), "xpath");
			Thread.sleep(3000);

			prm.click(driver, cr.valueOnTheKey("plp_filtersColors"), "xpath");
			Thread.sleep(3000);

			prm.click(driver, cr.valueOnTheKey("plp_filtersColorSelected"), "xpath");
			Thread.sleep(3000);

			prm.click(driver, cr.valueOnTheKey("plp_filtersfeatures"), "xpath");
			Thread.sleep(3000);

			prm.click(driver, cr.valueOnTheKey("plp_filtersFeatureSelected"), "xpath");
			Thread.sleep(3000);
			
			prm.click(driver, cr.valueOnTheKey("plp_filtersSeats"), "xpath");
			Thread.sleep(3000);
			
			prm.click(driver, cr.valueOnTheKey("plp_filtersSeatsSelected"), "xpath");
			Thread.sleep(3000);
			
		}


	@And ("Application of filter")
    
    public void Application_of_filter() throws InterruptedException {
   	 WebElement FilterApplyButton = driver.findElement(By.xpath(cr.valueOnTheKey("plp_filterApplyButton")));
   	 Assert.assertEquals(true, FilterApplyButton.isDisplayed());
   	 FilterApplyButton.click();
   	 Thread.sleep(3000);
	
}
	
	 @And ("user scroll down to view notify me widget")
	 public void user_scroll_down_to_view_notify_me_widget() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,800)");
			Thread.sleep(3000);
	 }
	 
	 @And ("Enter a number and click on notify me")
	 public void Enter_a_number_and_click_on_notify_me()     {
			try {
			Thread.sleep(2000);
			
			prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_notifyme"),("xpath"),(cr.valueOnTheKey("MobileNumber")));
			Thread.sleep(4000);
			prm.click(driver, cr.valueOnTheKey("plp_notifyme_button"), "xpath");
			Thread.sleep(4000);
			
			prm.click(driver, cr.valueOnTheKey("login_otp"), "xpath");
			
			prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_otp"), ("xpath"), (cr.valueOnTheKey("otp")));
			Thread.sleep(10000);
			
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
			
		   	@And ("Validate the arrival of view all cars widget")
		    public void Validate_the_arrival_of_view_all_cars_widget() throws InterruptedException {

		   	WebElement plp_viewAllCarsWidget = driver.findElement(By.xpath(cr.valueOnTheKey("plp_viewAllCarsWidget")));
		 	Assert.assertEquals(true, plp_viewAllCarsWidget.isDisplayed());
	      	
	      	 Thread.sleep(3000);	
	      	prm.click(driver, cr.valueOnTheKey("plp_viewAllCarsButton"), "xpath");
	      	Thread.sleep(3000);	
	     	WebElement plp_landingOnPLP = driver.findElement(By.xpath(cr.valueOnTheKey("plp_landingOnPLP")));
		 	Assert.assertEquals(true, plp_landingOnPLP.isDisplayed());
		      	
	      	 Thread.sleep(6000);	

		}
		   	
  @And ("user selects filter of Booked car")
  
  public void user_selects_filter_of_Booked_car() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_Filters"), "xpath");
		Thread.sleep(3000);
		
		prm.click(driver, cr.valueOnTheKey("plp_filtersSeats"), "xpath");
		Thread.sleep(3000);
		
		prm.click(driver, cr.valueOnTheKey("plp_filtersSeatsSelected"), "xpath");
		Thread.sleep(3000);
		
		prm.click(driver, cr.valueOnTheKey("plp_filterAvailability"), "xpath");
		Thread.sleep(3000);
		
		prm.click(driver, cr.valueOnTheKey("plp_filtersBookedSelected"), "xpath");
		Thread.sleep(3000);
		
		
//		prm.click(driver, cr.valueOnTheKey("plp_filterAvailability"), "xpath");
//		Thread.sleep(3000);
//		
//		prm.click(driver, cr.valueOnTheKey("plp_filtersBookedSelected"), "xpath");
//		Thread.sleep(3000);
  
}
  
  @And ("user click on car card")
  
  public void user_click_on_car_card() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_carCard"), "xpath");
		Thread.sleep(4000);
		
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_notifymeBookedCar"),("xpath"),(cr.valueOnTheKey("MobileNumber")));
		Thread.sleep(4000);
		
		WebElement plp_notifymeButtonforbookedcar = driver.findElement(By.xpath(cr.valueOnTheKey("plp_notifymeButtonforbookedcar")));
	 	Assert.assertEquals(true, plp_notifymeButtonforbookedcar.isDisplayed());
	 	
	 	prm.click(driver, cr.valueOnTheKey("plp_notifymeButtonforbookedcar"), "xpath");
		Thread.sleep(4000);
		
		prm.click(driver, cr.valueOnTheKey("login_otp"), "xpath");
		
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_otp"), ("xpath"), (cr.valueOnTheKey("otp")));
		Thread.sleep(8000);
	 	
	 	WebElement plp_similarCarsSection = driver.findElement(By.xpath(cr.valueOnTheKey("plp_similarCarsSection")));
	 	Assert.assertEquals(true, plp_similarCarsSection.isDisplayed());
  }
  
  @And ("user selects filter of upcoming car")
  public void user_selects_filter_of_upcoming_car() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_Filters"), "xpath");
		Thread.sleep(3000);
		
		prm.click(driver, cr.valueOnTheKey("plp_filtersSeats"), "xpath");
		Thread.sleep(3000);
		
		prm.click(driver, cr.valueOnTheKey("plp_filtersSeatsSelected"), "xpath");
		Thread.sleep(3000);
		
		prm.click(driver, cr.valueOnTheKey("plp_filterAvailability"), "xpath");
		Thread.sleep(3000);
		
		prm.click(driver, cr.valueOnTheKey("plp_filtersUpcomingSelected"), "xpath");
		Thread.sleep(3000);
		
}
}
	 