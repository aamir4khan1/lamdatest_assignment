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
//import testselement.screens.android.AndroidPDPScreen;


//import cucumber.api.java.en.And;
//import testselement.screens.android.AndroidHomepageScreen;

public class PDP_PhotoGallery {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();	
	
	@And("click on car image")
	public void user_click_on_car_image () throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImage"), "xpath");
		
		WebElement photoGalleryBookNow = driver.findElement(By.xpath(cr.valueOnTheKey("photoGalleryBookNow")));
		Assert.assertEquals(true, photoGalleryBookNow.isDisplayed());
		Thread.sleep(4000);
		
		WebElement photoGalleryFreeTestDrive = driver.findElement(By.xpath(cr.valueOnTheKey("photoGalleryFreeTestDrive")));
		Assert.assertEquals(true, photoGalleryFreeTestDrive.isDisplayed());
		Thread.sleep(4000);
	}
	
	@And("click on interior tab")
	public void click_on_interior_tab () throws InterruptedException {
		
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImageInteriorTab"), "xpath");
		Thread.sleep(2000);
		
		WebElement threeSixtyContainer = driver.findElement(By.xpath(cr.valueOnTheKey("threeSixtyContainer")));
		Assert.assertEquals(true, threeSixtyContainer.isDisplayed());
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImageInteriorTabDashboardVideo"), "xpath");
		Thread.sleep(2000);
		
		WebElement dashboardVideoPlayer = driver.findElement(By.xpath(cr.valueOnTheKey("dashboardVideoPlayer")));
		Assert.assertEquals(true, dashboardVideoPlayer.isDisplayed());
		Thread.sleep(2000);
		
		
		
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImageInteriorTabDashboardVideoCloseButton"), "xpath");
		Thread.sleep(2000);

	}
	
	@And("click on gallery tab")
	public void click_on_gallery_tab () throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImageGalleryTab"), "xpath");
		Thread.sleep(2000);
	}
	
	@Then("click on different tabs under gallery section")
	public void click_on_different_tabs_under_gallery_section () throws InterruptedException {
		
		WebElement galleryExteriorImages = driver.findElement(By.xpath(cr.valueOnTheKey("galleryExteriorImages")));
		Assert.assertEquals(true, galleryExteriorImages.isDisplayed());
		Thread.sleep(2000);

		
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImageGalleryTabInteriorImagesTab"), "xpath");
		Thread.sleep(2000);
		
		
		WebElement pdp_carCardImageGalleryTabInteriorImages = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_carCardImageGalleryTabInteriorImages")));
		Assert.assertEquals(true, pdp_carCardImageGalleryTabInteriorImages.isDisplayed());
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImageGalleryTabEngineTab"), "xpath");
		Thread.sleep(2000);
		
		WebElement galleryEngineImages = driver.findElement(By.xpath(cr.valueOnTheKey("galleryEngineImages")));
		Assert.assertEquals(true, galleryEngineImages.isDisplayed());
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImageGalleryTabTyresTab"), "xpath");
		Thread.sleep(2000);
		
		WebElement galleryTyresImages = driver.findElement(By.xpath(cr.valueOnTheKey("galleryTyresImages")));
		Assert.assertEquals(true, galleryTyresImages.isDisplayed());
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImageGalleryTabTopFeaturesTab"), "xpath");
		Thread.sleep(2000);
		
		WebElement galleryTopFeaturesImages = driver.findElement(By.xpath(cr.valueOnTheKey("galleryTopFeaturesImages")));
		Assert.assertEquals(true, galleryTopFeaturesImages.isDisplayed());
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImageGalleryTabExtraTab"), "xpath");
		Thread.sleep(2000);
		
		WebElement galleryExtraImages = driver.findElement(By.xpath(cr.valueOnTheKey("galleryExtraImages")));
		Assert.assertEquals(true, galleryExtraImages.isDisplayed());
		Thread.sleep(2000);
	}
	
	@And("click on three sixty degree button")
	public void click_on_three_sixty_degree_button () throws InterruptedException {
		
		prm.click(driver, cr.valueOnTheKey("pdp_carCardImageGalleryTabThreeSixtyButton"), "xpath");
		Thread.sleep(2000);
	
		WebElement threeSixtyContainer = driver.findElement(By.xpath(cr.valueOnTheKey("threeSixtyContainer")));
		Assert.assertEquals(true, threeSixtyContainer.isDisplayed());
		Thread.sleep(2000);
		
	}
}