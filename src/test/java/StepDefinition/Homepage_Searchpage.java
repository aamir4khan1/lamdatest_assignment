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
	@And("user tries to change location")
	public void user_tries_to_change_location() throws InterruptedException {
		
		WebElement searchpagePLP = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLP")));
		Actions actions = new Actions(driver);
		actions.moveToElement(searchpagePLP).click().build().perform();
		Thread.sleep(2000);
		WebElement plp_landingOnPLP = driver.findElement(By.xpath(cr.valueOnTheKey("searchpageAsseartion")));
	 	Assert.assertEquals(true, plp_landingOnPLP.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("searchpage_locator"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("searchpageCitySelect"), "xpath");
		Thread.sleep(2000);
		WebElement searchpageassert = driver.findElement(By.xpath(cr.valueOnTheKey("searchpageassert")));
	 	Assert.assertEquals(true, searchpageassert.isDisplayed());
	 	Thread.sleep(2000);
	      	}
	@And("user clicks on see all car")
	public void user_clicks_on_see_all_car() throws InterruptedException {
		Thread.sleep(2000);
		WebElement search_seeallcars = driver.findElement(By.xpath(cr.valueOnTheKey("search_seeallcars")));
		Actions actions = new Actions(driver);
		actions.moveToElement(search_seeallcars).click().build().perform();
		Thread.sleep(2000);
		WebElement PLpHeadingsearch = driver.findElement(By.xpath(cr.valueOnTheKey("PLpHeadingsearch")));
	 	Assert.assertEquals(true, PLpHeadingsearch.isDisplayed());
		Thread.sleep(2000);
		WebElement searchpagePLP = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLP")));
		Actions actionss = new Actions(driver);
		actionss.moveToElement(searchpagePLP).click().build().perform();
		Thread.sleep(2000);
		WebElement searchpageAsseartion = driver.findElement(By.xpath(cr.valueOnTheKey("searchpageAsseartion")));
	 	Assert.assertEquals(true, searchpageAsseartion.isDisplayed());
		Thread.sleep(2000);
		}
	@And("user clicks on car finder")
	public void user_clicks_on_car_finder() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("document.getElementsByClassName('ModalOverlay__modalOverlayContainer')[0].scroll(0, 400)");
		 Thread.sleep(4000);
		WebElement Search_CarFinder = driver.findElement(By.xpath(cr.valueOnTheKey("Search_CarFinder")));
		Assert.assertEquals(true, Search_CarFinder.isDisplayed());
		prm.click(driver, cr.valueOnTheKey("Search_CarFinder"),"xpath");
		Thread.sleep(2000);
		WebElement searchCArfinderassert = driver.findElement(By.xpath(cr.valueOnTheKey("searchCArfinderassert")));
	 	Assert.assertEquals(true, searchCArfinderassert.isDisplayed());
		Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(4000); 
		 WebElement searchpagePLP = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLP")));
			Actions actions = new Actions(driver);
			actions.moveToElement(searchpagePLP).click().build().perform();
			 Thread.sleep(2000);
	 	}
	@And("user clicks on car available on hub")
	public void user_clicks_on_car_available_on_hub() throws InterruptedException {
		Thread.sleep(4000);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ModalOverlay__modalOverlayContainer')[0].scroll(0, 1000)");
		 Thread.sleep(4000);
		
		 WebElement SearchHubCTA = driver.findElement(By.xpath(cr.valueOnTheKey("SearchHubCTA")));
			Actions action = new Actions(driver);
			action.moveToElement(SearchHubCTA).click().build().perform();
		Thread.sleep(2000);
		
		WebElement Searchplphubfilter = driver.findElement(By.xpath(cr.valueOnTheKey("Searchplphubfilter")));
	 	Assert.assertEquals(true, Searchplphubfilter.isDisplayed());
		Thread.sleep(2000);
		WebElement searchpagePLP = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLP")));
		Actions actions = new Actions(driver);
		actions.moveToElement(searchpagePLP).click().build().perform();
		Thread.sleep(2000);
		Thread.sleep(2000);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("document.getElementsByClassName('ModalOverlay__modalOverlayContainer')[0].scroll(0, 1000)");
		 Thread.sleep(4000);
		Thread.sleep(4000);
		prm.click(driver, cr.valueOnTheKey("searchviewallcity"),"xpath");
		Thread.sleep(2000);
			WebElement PLpHeadingsearch = driver.findElement(By.xpath(cr.valueOnTheKey("PLpHeadingsearch")));
	 	Assert.assertEquals(true, PLpHeadingsearch.isDisplayed());
		Thread.sleep(2000);
		WebElement searchpagePLPs = driver.findElement(By.xpath(cr.valueOnTheKey("searchpagePLPs")));
		Actions actionz = new Actions(driver);
		actionz.moveToElement(searchpagePLPs).click().build().perform();
		Thread.sleep(2000);
		 	}
	@And("user search in search bar")
	public void user_search_in_search_bar() throws InterruptedException {
		Thread.sleep(2000);
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("search"), "xpath", (cr.valueOnTheKey("searchvalue")));
		Thread.sleep(6000);
		prm.click(driver, cr.valueOnTheKey("searchoption"),"xpath");
		Thread.sleep(2000);
		WebElement searchoptionassert = driver.findElement(By.xpath(cr.valueOnTheKey("searchoptionassert")));
 	    Assert.assertEquals(true, searchoptionassert.isDisplayed());
		
	 	}
	@And("user view recently viewed car")
	public void user_view_recently_viewed_car() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("caridsearch"),"xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("searchlogo"),"xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("homepage_searchpage"), "xpath");
		Thread.sleep(3000);
		WebElement searchoptionassert = driver.findElement(By.xpath(cr.valueOnTheKey("recentlyviewsearch")));
 	    Assert.assertEquals(true, searchoptionassert.isDisplayed());
 	   Thread.sleep(3000);
 	  WebElement searchshortlist = driver.findElement(By.xpath(cr.valueOnTheKey("searchshortlist")));
		Actions actions = new Actions(driver);
		actions.moveToElement(searchshortlist).click().build().perform();
		  Thread.sleep(3000);
		  JavascriptExecutor jss = (JavascriptExecutor) driver;
			jss.executeScript("document.getElementsByClassName('ModalOverlay__modalOverlayContainer')[0].scroll(0, 600)");
			 Thread.sleep(4000);
			 WebElement searchshortlist1 = driver.findElement(By.xpath(cr.valueOnTheKey("searchshortlist")));
				Assert.assertEquals(true, searchshortlist1.isDisplayed());	
	 	}
	/*@And("user shortlist the car")
	public void user_shortlist_the_car() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		 Thread.sleep(3000);
		 WebElement searchshortlist = driver.findElement(By.xpath(cr.valueOnTheKey("searchshortlist")));
			Assert.assertEquals(true, searchshortlist.isDisplayed());	

	}*/
	

}