package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class PDP_benefitsandaddons {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
			
   
       
	
	        	}
	         
    @And("user chooses assured category filter")
    
    public void user_chooses_assured_category_filter()throws InterruptedException {
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_1"), "xpath");
		/*
		 * Thread.sleep(2000); WebElement applied_filter12 =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter13")));
		 * Assert.assertEquals(true, applied_filter12.isDisplayed());
		 */
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement category_type1 = driver.findElement(By.xpath(cr.valueOnTheKey("category_type1")));
		Assert.assertEquals(true, category_type1.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("car_car_cad"), "xpath");
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1500)");}
		Thread.sleep(2000);
		WebElement benefits_section = driver.findElement(By.xpath(cr.valueOnTheKey("benefits_section")));
		Assert.assertEquals(true, benefits_section.isDisplayed());
		Thread.sleep(2000);
		WebElement assured_tag = driver.findElement(By.xpath(cr.valueOnTheKey("assured_tag")));
		Assert.assertEquals(true, assured_tag.isDisplayed());
		Thread.sleep(2000);
		WebElement yearwarranty_1 = driver.findElement(By.xpath(cr.valueOnTheKey("yearwarranty_1")));
		Assert.assertEquals(true, yearwarranty_1.isDisplayed());
		Thread.sleep(2000);
		WebElement points_200 = driver.findElement(By.xpath(cr.valueOnTheKey("points_200")));
		Assert.assertEquals(true, points_200.isDisplayed());
		Thread.sleep(2000);
		WebElement day_5_money = driver.findElement(By.xpath(cr.valueOnTheKey("day_5_money")));
		Assert.assertEquals(true, day_5_money.isDisplayed());
		Thread.sleep(2000);
		WebElement buyback_gurantee = driver.findElement(By.xpath(cr.valueOnTheKey("buyback_gurantee")));
		Assert.assertEquals(true, buyback_gurantee.isDisplayed());
		Thread.sleep(2000);
		WebElement fixed_price = driver.findElement(By.xpath(cr.valueOnTheKey("fixed_price")));
		Assert.assertEquals(true, fixed_price.isDisplayed());
		Thread.sleep(2000);
		WebElement roadside_assistance = driver.findElement(By.xpath(cr.valueOnTheKey("roadside_assistance")));
		Assert.assertEquals(true, roadside_assistance.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("learnn_more"), "xpath");
		Thread.sleep(2000);
		WebElement page_spinny_assured = driver.findElement(By.xpath(cr.valueOnTheKey("page_spinny_assured")));
		Assert.assertEquals(true, page_spinny_assured.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("close_button"), "xpath");
		/*
		 * Thread.sleep(2000); WebElement extended_warranty =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("extended_warranty")));
		 * Assert.assertEquals(true, extended_warranty.isDisplayed());
		 * Thread.sleep(2000); prm.click(driver, cr.valueOnTheKey("extended_click"),
		 * "xpath"); Thread.sleep(2000); WebElement extended_page1 =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("extended_page1")));
		 * Assert.assertEquals(true, extended_page1.isDisplayed()); Thread.sleep(2000);
		 * WebElement extended_page2 =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("extended_page2")));
		 * Assert.assertEquals(true, extended_page2.isDisplayed()); Thread.sleep(2000);
		 * prm.click(driver, cr.valueOnTheKey("info_icon"), "xpath");
		 * Thread.sleep(2000); WebElement overlay =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("overlay")));
		 * Assert.assertEquals(true, overlay.isDisplayed()); Thread.sleep(2000);
		 * prm.click(driver, cr.valueOnTheKey("month_24"), "xpath"); Thread.sleep(2000);
		 * prm.click(driver, cr.valueOnTheKey("month_36"), "xpath"); Thread.sleep(2000);
		 * WebElement month_36_confirm =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("month_36_confirm")));
		 * Assert.assertEquals(true, month_36_confirm.isDisplayed());
		 * Thread.sleep(2000); WebElement benefits_buyback =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("benefits_buyback")));
		 * Assert.assertEquals(true, benefits_buyback.isDisplayed());
		 * Thread.sleep(2000);
		 */
		/* prm.click(driver, cr.valueOnTheKey("x_button"), "xpath"); */
		driver.navigate().back();
		prm.click(driver, cr.valueOnTheKey("filter_assured"), "xpath");
    }
    
    @And("user chooses budget category filter")
    
    public void user_chooses_budget_category_filter()throws InterruptedException {
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_2"), "xpath");
    	Thread.sleep(2000);
		/*
		 * WebElement applied_filter12 =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter13")));
		 * Assert.assertEquals(true, applied_filter12.isDisplayed());
		 * Thread.sleep(2000);
		 */
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement category_type2 = driver.findElement(By.xpath(cr.valueOnTheKey("category_type2")));
		Assert.assertEquals(true, category_type2.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("car_car_cad"), "xpath");
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1500)");}
		Thread.sleep(2000);
		WebElement benefits_section = driver.findElement(By.xpath(cr.valueOnTheKey("benefits_section")));
		Assert.assertEquals(true, benefits_section.isDisplayed());
		Thread.sleep(2000);
		WebElement assured_tag = driver.findElement(By.xpath(cr.valueOnTheKey("budget_tag")));
		Assert.assertEquals(true, assured_tag.isDisplayed());
		Thread.sleep(2000);
		WebElement yearwarranty_1 = driver.findElement(By.xpath(cr.valueOnTheKey("yearwarranty_1")));
		Assert.assertEquals(true, yearwarranty_1.isDisplayed());
		Thread.sleep(2000);
		WebElement points_200 = driver.findElement(By.xpath(cr.valueOnTheKey("points_200")));
		Assert.assertEquals(true, points_200.isDisplayed());
		Thread.sleep(2000);
		WebElement day_5_money = driver.findElement(By.xpath(cr.valueOnTheKey("day_5_money")));
		Assert.assertEquals(true, day_5_money.isDisplayed());
		Thread.sleep(2000);
		WebElement buyback_gurantee = driver.findElement(By.xpath(cr.valueOnTheKey("buyback_gurantee")));
		Assert.assertEquals(true, buyback_gurantee.isDisplayed());
		Thread.sleep(2000);
		WebElement fixed_price = driver.findElement(By.xpath(cr.valueOnTheKey("fixed_price")));
		Assert.assertEquals(true, fixed_price.isDisplayed());
		Thread.sleep(2000);
		WebElement roadside_assistance = driver.findElement(By.xpath(cr.valueOnTheKey("roadside_assistance")));
		Assert.assertEquals(true, roadside_assistance.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("learnn_more"), "xpath");
		Thread.sleep(2000);
		WebElement page_spinny_assured = driver.findElement(By.xpath(cr.valueOnTheKey("budget_page_confirm")));
		Assert.assertEquals(true, page_spinny_assured.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("close_button"), "xpath");
		/*
		 * Thread.sleep(2000); WebElement extended_warranty =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("extended_warranty")));
		 * Assert.assertEquals(true, extended_warranty.isDisplayed());
		 * Thread.sleep(2000); prm.click(driver, cr.valueOnTheKey("extended_click"),
		 * "xpath"); Thread.sleep(2000); WebElement extended_page1 =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("extended_page1")));
		 * Assert.assertEquals(true, extended_page1.isDisplayed()); Thread.sleep(2000);
		 * WebElement extended_page2 =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("extended_page2")));
		 * Assert.assertEquals(true, extended_page2.isDisplayed()); Thread.sleep(2000);
		 * prm.click(driver, cr.valueOnTheKey("info_icon"), "xpath");
		 * Thread.sleep(2000); WebElement overlay =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("overlay")));
		 * Assert.assertEquals(true, overlay.isDisplayed()); Thread.sleep(2000);
		 * prm.click(driver, cr.valueOnTheKey("month_24"), "xpath"); Thread.sleep(2000);
		 * prm.click(driver, cr.valueOnTheKey("month_36"), "xpath"); Thread.sleep(2000);
		 * WebElement month_36_confirm =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("month_36_confirm")));
		 * Assert.assertEquals(true, month_36_confirm.isDisplayed());
		 * Thread.sleep(2000); WebElement benefits_buyback =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("benefits_buyback")));
		 * Assert.assertEquals(true, benefits_buyback.isDisplayed());
		 * Thread.sleep(2000); prm.click(driver, cr.valueOnTheKey("x_button"), "xpath");*/
		   driver.navigate().back(); 
		   prm.click(driver,cr.valueOnTheKey("budget_filter_2"), "xpath");
		 
}
    
    @And("user chooses max category filter")
    
    public void user_chooses_max_category_filter()throws InterruptedException {
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_3"), "xpath");
    	Thread.sleep(2000);
		/*
		 * WebElement applied_filter12 =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("applied_filter13")));
		 * Assert.assertEquals(true, applied_filter12.isDisplayed());
		 * Thread.sleep(2000);
		 */
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    	WebElement category_type2 = driver.findElement(By.xpath(cr.valueOnTheKey("category_type3")));
		Assert.assertEquals(true, category_type2.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("car_car_cad"), "xpath");
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1500)");}
		Thread.sleep(2000);
		WebElement benefits_section = driver.findElement(By.xpath(cr.valueOnTheKey("benefits_section")));
		Assert.assertEquals(true, benefits_section.isDisplayed());
		Thread.sleep(2000);
		WebElement assured_tag = driver.findElement(By.xpath(cr.valueOnTheKey("max_tag")));
		Assert.assertEquals(true, assured_tag.isDisplayed());
		Thread.sleep(2000);
		WebElement yearwarranty_1 = driver.findElement(By.xpath(cr.valueOnTheKey("max_year")));
		Assert.assertEquals(true, yearwarranty_1.isDisplayed());
		Thread.sleep(2000);
		WebElement points_200 = driver.findElement(By.xpath(cr.valueOnTheKey("max_inspection")));
		Assert.assertEquals(true, points_200.isDisplayed());
		Thread.sleep(2000);
		WebElement day_5_money = driver.findElement(By.xpath(cr.valueOnTheKey("day_5_money")));
		Assert.assertEquals(true, day_5_money.isDisplayed());
		Thread.sleep(2000);
		/*
		 * WebElement buyback_gurantee =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("buyback_gurantee")));
		 * Assert.assertEquals(true, buyback_gurantee.isDisplayed());
		 * Thread.sleep(2000);
		 */
		WebElement fixed_price = driver.findElement(By.xpath(cr.valueOnTheKey("fixed_price")));
		Assert.assertEquals(true, fixed_price.isDisplayed());
		Thread.sleep(2000);
		WebElement roadside_assistance = driver.findElement(By.xpath(cr.valueOnTheKey("roadside_assistance")));
		Assert.assertEquals(true, roadside_assistance.isDisplayed());
		Thread.sleep(2000);
		/*
		 * prm.click(driver, cr.valueOnTheKey("learnn_more"), "xpath");
		 * Thread.sleep(2000);
		 */
		/*
		 * WebElement page_spinny_assured =
		 * driver.findElement(By.xpath(cr.valueOnTheKey("budget_page_confirm")));
		 * Assert.assertEquals(true, page_spinny_assured.isDisplayed());
		 * Thread.sleep(2000);
		 */
		/* prm.click(driver, cr.valueOnTheKey("close_button"), "xpath"); */
		/*
		 * driver.navigate().back();
		 * prm.click(driver,cr.valueOnTheKey("budget_filter_2"), "xpath");
		 */
		
    	
    	
   	
    

    }
}





