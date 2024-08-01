package StepDefinition;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;

import java.util.List;

import org.junit.Assert;

public class Pheonix_Discovery {
	
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();
	private WebElement container;

  

	/*
	 * @Given("user lands on spinny website") public void userLandsOnSpinnyWebsite()
	 * { // Code to navigate to Spinny website
	 * driver.get("https://www.spinny.com/"); }
	 */
	
	@And("user view recently viewed assured pheonix card")
	 public void userviewrecentlyviewedassuredpheonixcard() throws InterruptedException{
		 WebElement Pdp_KnowbackCTA = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_KnowbackCTA")));
	        Actions actionsss = new Actions(driver);
	        actionsss.moveToElement(Pdp_KnowbackCTA).click().build().perform();
	        Thread.sleep(3000);
	        prm.click(driver, cr.valueOnTheKey("PLP_pheonix"), "xpath");
	        Thread.sleep(3000);
	        WebElement HomepagePheonixRecentlyAdded = driver.findElement(By.xpath(cr.valueOnTheKey("HomepagePheonixRecentlyAdded")));
	        Assert.assertEquals(true, HomepagePheonixRecentlyAdded.isDisplayed()); 
	        Thread.sleep(2000);
	        WebElement HomepagePHRecAdCard = driver.findElement(By.xpath(cr.valueOnTheKey("HomepagePHRecAdCard")));
	        Assert.assertEquals(true, HomepagePHRecAdCard.isDisplayed()); 
	        Thread.sleep(3000);
	        WebElement HomepageReAssured=  driver.findElement(By.xpath(cr.valueOnTheKey("HomepageReAssured")));
	        Assert.assertEquals(true,HomepageReAssured.isDisplayed()); 
	        }
	 @And("user apply Budget car filters")
	    public void userapplyBudgetcarfilters() throws InterruptedException {
	    	Thread.sleep(2000);
	    	prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
	    	Thread.sleep(2000);
	    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
	    	Thread.sleep(2000);
	    	prm.click(driver, cr.valueOnTheKey("car_category_2"), "xpath");
	    	Thread.sleep(2000);
	    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
	    	Thread.sleep(2000);
	 }
	 @And("user view recently viewed Budget pheonix card")
	 public void userviewrecentlyviewedBudgetpheonixcard() throws InterruptedException{
		
		 WebElement Pdp_KnowbackCTA = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_KnowbackCTA")));
	        Actions actionsss = new Actions(driver);
	        actionsss.moveToElement(Pdp_KnowbackCTA).click().build().perform();
	        Thread.sleep(3000);
	        prm.click(driver, cr.valueOnTheKey("PLP_pheonix"), "xpath");
	        Thread.sleep(3000);
	        WebElement HomepagePheonixRecentlyAdded = driver.findElement(By.xpath(cr.valueOnTheKey("HomepagePheonixRecentlyAdded")));
	        Assert.assertEquals(true, HomepagePheonixRecentlyAdded.isDisplayed()); 
	        Thread.sleep(2000);
	        WebElement HomepagePHRecAdCard = driver.findElement(By.xpath(cr.valueOnTheKey("HomepagePHRecAdCard")));
	        Assert.assertEquals(true, HomepagePHRecAdCard.isDisplayed()); 
	        Thread.sleep(3000);
	        WebElement HomepageReBudget = driver.findElement(By.xpath(cr.valueOnTheKey("HomepageReBudget")));
	        Assert.assertEquals(true, HomepageReBudget.isDisplayed()); 
	        Thread.sleep(3000);
	        }
	 @And("user apply Max car filters")
	    public void userapplyMaxcarfilters() throws InterruptedException {
	    	Thread.sleep(2000);
	    	prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
	    	Thread.sleep(2000);
	    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
	    	Thread.sleep(2000);
	    	prm.click(driver, cr.valueOnTheKey("car_category_3"), "xpath");
	    	Thread.sleep(2000);
	    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
	    	Thread.sleep(2000);
	 }
	@And("user view recently viewed Max pheonix card")
	 public void userviewrecentlyviewedMaxpheonixcard() throws InterruptedException{
		
		 WebElement Pdp_KnowbackCTA = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_KnowbackCTA")));
	        Actions actionsss = new Actions(driver);
	        actionsss.moveToElement(Pdp_KnowbackCTA).click().build().perform();
	        Thread.sleep(3000);
	        prm.click(driver, cr.valueOnTheKey("PLP_pheonix"), "xpath");
	        Thread.sleep(3000);
	        WebElement HomepagePheonixRecentlyAdded = driver.findElement(By.xpath(cr.valueOnTheKey("HomepagePheonixRecentlyAdded")));
	        Assert.assertEquals(true, HomepagePheonixRecentlyAdded.isDisplayed()); 
	        Thread.sleep(2000);
	        WebElement HomepagePHRecAdCard = driver.findElement(By.xpath(cr.valueOnTheKey("HomepagePHRecAdCard")));
	        Assert.assertEquals(true, HomepagePHRecAdCard.isDisplayed()); 
	        Thread.sleep(3000);
	        WebElement HomepageReMax = driver.findElement(By.xpath(cr.valueOnTheKey("HomepageReMax")));
	        Assert.assertEquals(true, HomepageReMax.isDisplayed()); 
	        Thread.sleep(3000);
	        }
	
	@And("user view recommended cars pheonix card")
	 public void userviewrecommendedcarspheonixcard() throws InterruptedException{
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,-700)");}
		Thread.sleep(4000);
		/*WebElement  container = driver.findElement(By.cssSelector(".UserActivitySlider__userActivitySlider"));
		 WebElement cardToMove = driver.findElement(By.cssSelector(".PhoenixRecentlyViewedCard__listingCardV3"));
		 Actions actions = new Actions(driver);
		 actions.clickAndHold(cardToMove).moveByOffset(200,0) 
         .release()
         .perform();
		 Thread.sleep(3000);
		 try {
	            Thread.sleep(2000); // Pause for 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('PhoenixRecentlyViewed__recentlyViewedCars')[0].getElementsByClassName('UserActivitySlider__userActivitySlider')[0].style.transform = 'translateX(-6000px)'");
		Thread.sleep(2000);
		//WebElement Homepagerecommded = driver.findElement(By.xpath(cr.valueOnTheKey("Homepagerecommded")));
	    //   Assert.assertEquals(true, Homepagerecommded.isDisplayed()); 
	       Thread.sleep(3000);
		
	        }
	@And("user verify pheonix filters")
	 public void uuserverifypheonixfilters() throws InterruptedException{
		Thread.sleep(3000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("HomepagePLPFilter3"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("PH_PlpFilters"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("smart_brandmodel"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("smart_brand2"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(3000);
        prm.click(driver, cr.valueOnTheKey("PLP_pheonix"), "xpath");
        Thread.sleep(3000);
        WebElement HomepagePHFilterApply = driver.findElement(By.xpath(cr.valueOnTheKey("PhPLPFilterApply")));
        Assert.assertEquals(true, HomepagePHFilterApply.isDisplayed()); 
        Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("PhPLPFilterApply"), "xpath");
        Thread.sleep(2000);
        
	        }
	
	
	@And("verify the saved filter")
	 public void verifythesavedfilter() throws InterruptedException{
		 Thread.sleep(2000);
	        WebElement PhPLPFilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("PhPLPFilterApplied")));
	        Assert.assertEquals(true, PhPLPFilterApplied.isDisplayed()); 
	        Thread.sleep(2000);
	        prm.click(driver, cr.valueOnTheKey("PLP_pheonix"), "xpath");
	        Thread.sleep(3000);
	        prm.click(driver, cr.valueOnTheKey("PhHomepageClick"), "xpath");
	       }
	@And("user verify on pheonix saved filter")
	 public void userverifyonpheonixsavedfilter() throws InterruptedException{
		 Thread.sleep(2000);
		 prm.click(driver, cr.valueOnTheKey("PLP_pheonix"), "xpath");
	        Thread.sleep(3000);
	        WebElement PhHomepageClick = driver.findElement(By.xpath(cr.valueOnTheKey("PhHomepageClick")));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(PhHomepageClick).click().build().perform();
	        Thread.sleep(3000);
	       /* JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementsByClassName('UserActivitySlider__userActivitySliderContainer')[0].style.transform = 'translateX(-6000px)'");
			 Thread.sleep(3000);
		        prm.click(driver, cr.valueOnTheKey("PhHomepageSaved"), "xpath");*/
	       }
	

    }