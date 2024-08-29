package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class Homepage_Searchpage {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("user clicks on search bar on top")
	public void user_clicks_on_search_bar_on_top() throws InterruptedException {
		
		prm.click(driver, cr.valueOnTheKey("homepage_searchpage"), "xpath");
		Thread.sleep(3000);
		WebElement plp_landingOnPLP = driver.findElement(By.xpath(cr.valueOnTheKey("searchpageAsseartion")));
	 	Assert.assertEquals(true, plp_landingOnPLP.isDisplayed());
	      	}
	@And("user clicks on  popular search")
	public void user_clicks_on_popular_search() throws InterruptedException {
		Thread.sleep(2000);
		WebElement popularsearch = driver.findElement(By.xpath(cr.valueOnTheKey("popularsearch")));
		Actions actions = new Actions(driver);
		actions.moveToElement(popularsearch).click().build().perform();
		Thread.sleep(2000);
		WebElement searchfilter = driver.findElement(By.xpath(cr.valueOnTheKey("searchfilter")));
	 	Assert.assertEquals(true, searchfilter.isDisplayed());
		Thread.sleep(2000);
		
	      	}
	@And("verify searchpage assertions")
	public void verifysearchpageassertions() throws InterruptedException {
		
		WebElement searchpagePLP = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLP")));
		Actions actions = new Actions(driver);
		actions.moveToElement(searchpagePLP).click().build().perform();
		Thread.sleep(2000);
		WebElement recentsearchassertion = driver.findElement(By.xpath(cr.valueOnTheKey("recentsearchassertion")));
	 	Assert.assertEquals(true, recentsearchassertion.isDisplayed());
		Thread.sleep(2000);
		//WebElement popularsearch = driver.findElement(By.xpath(cr.valueOnTheKey("deletimage")));
		//Actions actionss = new Actions(driver);
		//actionss.moveToElement(popularsearch).click().build().perform();
		
	      	}
	@And("Verify single filters")
	public void Verify_single_filters () throws InterruptedException {
		Thread.sleep(2000);
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("search"), "xpath", (cr.valueOnTheKey("searchvalue1")));
		Thread.sleep(6000);
		 WebElement searchoption1 = driver.findElement(By.xpath(cr.valueOnTheKey("searchoption1")));
			Actions actions = new Actions(driver);
			actions.moveToElement(searchoption1).click().build().perform();
		Thread.sleep(2000);
		WebElement searchoptionassert1 = driver.findElement(By.xpath(cr.valueOnTheKey("searchoptionassert1")));
 	    Assert.assertEquals(true, searchoptionassert1.isDisplayed());
 	   Thread.sleep(6000);
 	   WebElement searchpagePLP = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLP")));
		Actions actionss = new Actions(driver);
		actionss.moveToElement(searchpagePLP).click().build().perform();
		Thread.sleep(2000);
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("search"), "xpath", (cr.valueOnTheKey("searchvalue2")));
		Thread.sleep(6000);
		prm.click(driver, cr.valueOnTheKey("searchoption2"),"xpath");
		Thread.sleep(2000);
		WebElement searchoptionassert2= driver.findElement(By.xpath(cr.valueOnTheKey("searchoptionassert2")));
 	    Assert.assertEquals(true, searchoptionassert2.isDisplayed());
 	   Thread.sleep(6000);
 	  WebElement searchpagePLPs = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLPs")));
		Actions actionsss = new Actions(driver);
		actionsss.moveToElement(searchpagePLPs).click().build().perform();
		Thread.sleep(2000);
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("search"), "xpath", (cr.valueOnTheKey("searchvalue3")));
		Thread.sleep(6000);
		prm.click(driver, cr.valueOnTheKey("searchoption3"),"xpath");
		Thread.sleep(2000);
		WebElement searchoptionassert3= driver.findElement(By.xpath(cr.valueOnTheKey("searchoptionassert3")));
 	    Assert.assertEquals(true, searchoptionassert3.isDisplayed());
 	   Thread.sleep(6000);
 	  WebElement searchpagePLPss = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLPss")));
		Actions actionssss = new Actions(driver);
		actionssss.moveToElement(searchpagePLPss).click().build().perform();
		}
	
	@And("verify two filters")
	public void verifytwofilters() throws InterruptedException {
		Thread.sleep(2000);
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("search"), "xpath", (cr.valueOnTheKey("searchvalue4")));
		Thread.sleep(6000);
		prm.click(driver, cr.valueOnTheKey("searchoption4"),"xpath");
		Thread.sleep(2000);
		WebElement searchoptionassert14 = driver.findElement(By.xpath(cr.valueOnTheKey("searchoptionassert14")));
 	    Assert.assertEquals(true, searchoptionassert14.isDisplayed());
 	   Thread.sleep(2000);
 	  WebElement searchoptionassert24 = driver.findElement(By.xpath(cr.valueOnTheKey("searchoptionassert24")));
	   Assert.assertEquals(true, searchoptionassert24.isDisplayed());
	   Thread.sleep(6000);
 	  WebElement searchpagePLPs = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLPs")));
		Actions actionssss = new Actions(driver);
		actionssss.moveToElement(searchpagePLPs).click().build().perform();
	 	 
	 	}
	@And("user verify more than two Filters combination")
	public void userverifymorethantwoFilterscombination() throws InterruptedException {
		Thread.sleep(2000);
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("search"), "xpath", (cr.valueOnTheKey("searchvalue7")));
		Thread.sleep(6000);
		prm.click(driver, cr.valueOnTheKey("searchoption7"),"xpath");
		Thread.sleep(2000);
		WebElement searchoptionassert17 = driver.findElement(By.xpath(cr.valueOnTheKey("searchoptionassert17")));
 	    Assert.assertEquals(true, searchoptionassert17.isDisplayed());
 	   Thread.sleep(2000);
 	   WebElement searchoptionassert27 = driver.findElement(By.xpath(cr.valueOnTheKey("searchoptionassert27")));
	    Assert.assertEquals(true, searchoptionassert27.isDisplayed());
	    Thread.sleep(2000);
	 	   WebElement searchoptionassert37 = driver.findElement(By.xpath(cr.valueOnTheKey("searchoptionassert37")));
		    Assert.assertEquals(true, searchoptionassert37.isDisplayed());
	    Thread.sleep(6000);
	    WebElement searchpagePLPs = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLPs")));
	  		Actions actionssss = new Actions(driver);
	  		actionssss.moveToElement(searchpagePLPs).click().build().perform();
	  		 Thread.sleep(4000);
	 	 WebElement recentsearchassertion = driver.findElement(By.xpath(cr.valueOnTheKey("recentsearchassertion")));
		 Assert.assertEquals(true, recentsearchassertion.isDisplayed());
	 	   Thread.sleep(2000);
	 	   WebElement deleteCTASearch = driver.findElement(By.xpath(cr.valueOnTheKey("deleteCTASearch")));
			Actions actionz = new Actions(driver);
			actionz.moveToElement(deleteCTASearch).click().build().perform();
	 	
	 	}
	
}