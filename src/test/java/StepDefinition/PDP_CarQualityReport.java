package StepDefinition;

import java.util.NoSuchElementException;

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


//import cucumber.api.java.en.And;
//import testselement.screens.android.AndroidHomepageScreen;

public class PDP_CarQualityReport {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();	


	   @And ("scroll down to inspection report section")
	   
	   public void scroll_down_to_inspection_report_section () throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1300)");
			
			WebElement inspectionReportSection = driver.findElement(By.xpath(cr.valueOnTheKey("inspectionReportSection")));
			Assert.assertEquals(true, inspectionReportSection.isDisplayed());
			Thread.sleep(2000);
			
	   }
	   
	   @Then("click on view full report")
		
	   public void click_on_view_full_details () throws InterruptedException {
		   
		   WebElement pdp_inspectionReportViewFullReport = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_inspectionReportViewFullReport")));
			Assert.assertEquals(true, pdp_inspectionReportViewFullReport.isDisplayed());
		   prm.click(driver, cr.valueOnTheKey("pdp_inspectionReportViewFullReport"), "xpath");
			Thread.sleep(4000);
}
	   
	   @And("click on different tabs under car condition section")
		public void click_on_different_tabs_under_car_condition_section () throws InterruptedException {
		   
		   WebElement inspectionReportModalBasic = driver.findElement(By.xpath(cr.valueOnTheKey("inspectionReportModalBasic")));
			Assert.assertEquals(true, inspectionReportModalBasic.isDisplayed());
			Thread.sleep(1000);
			
			WebElement inspectionReportModalDetail = driver.findElement(By.xpath(cr.valueOnTheKey("inspectionReportModalDetail")));
			Assert.assertEquals(true, inspectionReportModalDetail.isDisplayed());
			Thread.sleep(1000);
			
			prm.click(driver, cr.valueOnTheKey("pdp_inspectionReportCarConditionTab"), "xpath");
			Thread.sleep(1000);
			WebElement pdp_Car_conditionSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_Car_conditionSection")));
			Assert.assertEquals(true, pdp_Car_conditionSection.isDisplayed());
			Thread.sleep(1000);

			
			prm.click(driver, cr.valueOnTheKey("pdp_EngineAndPeripherals"), "xpath");
			Thread.sleep(1000);
			
			WebElement pdp_EngineSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_EngineSection")));
			Assert.assertEquals(true, pdp_EngineSection.isDisplayed());
			Thread.sleep(3000);
			
			prm.click(driver, cr.valueOnTheKey("pdp_CarQualityReportDashboardVideo"), "xpath");
			Thread.sleep(5000);
			WebElement pdp_CarQualityReportVideoPlayerSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_CarQualityReportVideoPlayerSection")));
			Assert.assertEquals(true, pdp_CarQualityReportVideoPlayerSection.isDisplayed());
			Thread.sleep(3000);
			prm.click(driver, cr.valueOnTheKey("pdp_CarQualityReportVideoClose"), "xpath");
			Thread.sleep(2000);
			prm.click(driver, cr.valueOnTheKey("pdp_EngineAndPeripherals"), "xpath");
			Thread.sleep(1000);
			JavascriptExecutor Scroll1 = (JavascriptExecutor) driver;
			Scroll1.executeScript("window.scroll(0,600)");

			
			prm.click(driver, cr.valueOnTheKey("pdp_Drivetrain"), "xpath");
			Thread.sleep(1000);
			WebElement pdp_DriveTrainSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_DriveTrainSection")));
			Assert.assertEquals(true, pdp_DriveTrainSection.isDisplayed());
			Thread.sleep(1000);
			prm.click(driver, cr.valueOnTheKey("pdp_Drivetrain"), "xpath");
			Thread.sleep(1000);
			JavascriptExecutor Scroll2 = (JavascriptExecutor) driver;
			Scroll2.executeScript("window.scroll(0,800)");
			
			
			prm.click(driver, cr.valueOnTheKey("pdp_BodyStructure"), "xpath");
			Thread.sleep(1000);
			WebElement pdp_BodyStructureSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_BodyStructureSection")));
			Assert.assertEquals(true, pdp_BodyStructureSection.isDisplayed());
			Thread.sleep(1000);
			prm.click(driver, cr.valueOnTheKey("pdp_BodyStructure"), "xpath");
			Thread.sleep(1000);
			JavascriptExecutor Scroll3 = (JavascriptExecutor) driver;
			Scroll3.executeScript("window.scroll(0,1000)");
			
			prm.click(driver, cr.valueOnTheKey("pdp_Mechanical"), "xpath");
			Thread.sleep(1000);
			WebElement pdp_MechanicalSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_MechanicalSection")));
			Assert.assertEquals(true, pdp_MechanicalSection.isDisplayed());
			Thread.sleep(1000);
			prm.click(driver, cr.valueOnTheKey("pdp_Mechanical"), "xpath");
			Thread.sleep(1000);
			JavascriptExecutor Scroll4 = (JavascriptExecutor) driver;
			Scroll4.executeScript("window.scroll(0,1300)");
						
			
			prm.click(driver, cr.valueOnTheKey("pdp_Exterior"), "xpath");
			Thread.sleep(1000);
			WebElement pdp_ExteriorSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_ExteriorSection")));
			Assert.assertEquals(true, pdp_ExteriorSection.isDisplayed());
			Thread.sleep(1000);
			prm.click(driver, cr.valueOnTheKey("pdp_Exterior"), "xpath");
			Thread.sleep(1000);
			JavascriptExecutor Scroll5 = (JavascriptExecutor) driver;
			Scroll5.executeScript("window.scroll(0,1600)");
			
			prm.click(driver, cr.valueOnTheKey("pdp_Interior"), "xpath");
			Thread.sleep(1000);
			WebElement pdp_InteriorSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_InteriorSection")));
			Assert.assertEquals(true, pdp_InteriorSection.isDisplayed());
			Thread.sleep(1000);
			prm.click(driver, cr.valueOnTheKey("pdp_Interior"), "xpath");
			Thread.sleep(1000);
			JavascriptExecutor Scroll6 = (JavascriptExecutor) driver;
			Scroll6.executeScript("window.scroll(0,2000)");

	   }
	   
	   @And("click on different tabs under fixes done section")
	 		public void click_on_different_tabs_under_fixes_done_section () throws InterruptedException {
	 			
	 			prm.click(driver, cr.valueOnTheKey("pdp_inspectionReportfixesdoneTab"), "xpath");
	 			Thread.sleep(1000);
	 			WebElement pdp_FixesDoneSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_FixesDoneSection")));
	 			Assert.assertEquals(true, pdp_FixesDoneSection.isDisplayed());
	 			Thread.sleep(1000);
	 	   }
	  
	   @And("click on different tabs under customised section")
	 		public void click_on_different_tabs_under_customised_section () throws InterruptedException {
	 		
		   try {
		        // Find the element 
			  
		        WebElement pdp_customised_Tab = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_customised_Tab")));
		        
		        
		        if (pdp_customised_Tab.isDisplayed())
		        	
		        {
		        	//Click on it and validate the assertion
		        	prm.click(driver, cr.valueOnTheKey("pdp_customised_Tab"), "xpath");
		 			Thread.sleep(1000);
		 			WebElement pdp_customisedSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_customisedSection")));
		 			Assert.assertEquals(true, pdp_customisedSection.isDisplayed());
		 			Thread.sleep(1000);
		        }
		   }
		   
		        
		        catch (NoSuchElementException e) {
		        	 System.out.println("Customised tab not present. Skipping related code.");
	           
		        }
		   
		   catch (Exception e) {
			    // Handle any other unexpected exceptions
			    e.printStackTrace();
			}
	 	   }
	   
	   @And("click on different tabs under tyre life remaining section")
		public void click_on_different_tabs_under_tyre_life_remaining_section () throws InterruptedException {
			
			prm.click(driver, cr.valueOnTheKey("pdp_tyre_life_remaining_Tab"), "xpath");
			Thread.sleep(1000);
			WebElement pdp_tyreliferemainingSection = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_tyreliferemainingSection")));
			Assert.assertEquals(true, pdp_tyreliferemainingSection.isDisplayed());
			Thread.sleep(1000);
			
	   }
	   
	  @And ("scroll to full checklist section")
	  
	  public void scroll_to_full_checklist_section () throws InterruptedException {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,3300)");
	  }
	   
	   @And("Validate download inspection report button")
		public void click_on_download_inspection_report_icon () throws InterruptedException {
		   
		   WebElement pdp_carQualityReportDownloadButton = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_carQualityReportDownloadButton")));
			Assert.assertEquals(true, pdp_carQualityReportDownloadButton.isDisplayed());
			Thread.sleep(1000);
			
			WebElement pdp_carQualityReportOnWhatsapp = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_carQualityReportOnWhatsapp")));
			Assert.assertEquals(true, pdp_carQualityReportOnWhatsapp.isDisplayed());
			Thread.sleep(1000);
		
	}
	   
	   @And ("Validate book now and free test drive cta")
		public void Validate_book_now_and_free_test_drive_ctas () throws InterruptedException {

		WebElement inspectionReportBookNow = driver.findElement(By.xpath(cr.valueOnTheKey("inspectionReportBookNow")));
		Assert.assertEquals(true, inspectionReportBookNow.isDisplayed());
		
		WebElement inspectionReportFreeTestDrive = driver.findElement(By.xpath(cr.valueOnTheKey("inspectionReportFreeTestDrive")));
		Assert.assertEquals(true, inspectionReportFreeTestDrive.isDisplayed());
		
	}
	   
	   @And("click on view full checklist")	// NA for Max Cars //
		public void click_on_view_full_checklist () throws InterruptedException {
		 
		WebElement pdp_CarQualityChecklist = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_CarQualityChecklist")));
		Assert.assertEquals(true, pdp_CarQualityChecklist.isDisplayed());
		Thread.sleep(2000);
				
		prm.click(driver, cr.valueOnTheKey("pdp_CarQualityChecklistCTA"), "xpath");
		Thread.sleep(2000);
		
		WebElement pdp_CarQualityChecklistBottomsheet = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_CarQualityChecklistBottomsheet")));
		Assert.assertEquals(true, pdp_CarQualityChecklistBottomsheet.isDisplayed());
		
}
}