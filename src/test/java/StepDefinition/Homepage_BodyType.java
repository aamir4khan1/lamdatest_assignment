package StepDefinition;

import org.junit.Assert;
import org.junit.internal.management.ThreadMXBean;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

public class Homepage_BodyType {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll body type section")
	public void scroll_body_type_section() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		boolean bodyTypeTabs = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_bodyTypeTabs"))).isDisplayed();
		Assert.assertTrue(bodyTypeTabs);

		boolean bodyTypeCardList = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_bodyTypeCardList")))
				.isDisplayed();
		Assert.assertTrue(bodyTypeCardList);

	}

	@And("Click on View all hatchbacks")
	public void click_on_View_all_hatchbacks() throws InterruptedException {
		
		// Locating the element using XPath
		WebElement element = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_explorebodytypeViewAllHatchbacks")));

		// Executing JavaScript to scroll the element into view
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		
		
		prm.click(driver, cr.valueOnTheKey("homepage_explorebodytypeViewAllHatchbacks"), "xpath");
		Thread.sleep(5000);
		boolean Hatchbackfilter = driver.findElement(By.xpath(cr.valueOnTheKey("plp_hatchback_filter_applied")))
				.isDisplayed();
		Assert.assertTrue(Hatchbackfilter);
		Thread.sleep(2000);
		
		WebElement plp_h1TagHatchback = driver.findElement(By.xpath(cr.valueOnTheKey("plp_h1TagHatchback")));
	    Assert.assertEquals(true, plp_h1TagHatchback.isDisplayed());
	}

	@And("Go back to the home page")
	public void go_back_to_home_page() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Then("Click on Sedan and View All Sedan")
	public void Click_on_Sedan_and_View_All_Sedan() throws InterruptedException {

		// Locating the element using XPath
		WebElement element = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_explorebodytypeSedan")));

		// Executing JavaScript to scroll the element into view
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
		prm.click(driver, cr.valueOnTheKey("homepage_explorebodytypeSedan"), "xpath");
		Thread.sleep(3000);

		boolean explorebodytypeViewAllSedan = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_explorebodytypeViewAllSedan"))).isDisplayed();
		prm.click(driver, cr.valueOnTheKey("homepage_explorebodytypeViewAllSedan"), "xpath");
		Thread.sleep(5000);

		boolean Sedanfilter = driver.findElement(By.xpath(cr.valueOnTheKey("plp_sedan_filter_applied"))).isDisplayed();
		Assert.assertTrue(Sedanfilter);
		Thread.sleep(2000);
		
		
		WebElement plp_h1TagSedan = driver.findElement(By.xpath(cr.valueOnTheKey("plp_h1TagSedan")));
	    Assert.assertEquals(true, plp_h1TagSedan.isDisplayed());

	}

	@Then("Click on SUV and View All SUVs")
	public void Click_on_SUV_and_View_All_SUVs() throws InterruptedException {
				
		// Locating the element using XPath
//		WebElement element = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_explorebodytypeSUV")));
//
//		// Executing JavaScript to scroll the element into view
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//		
		WebElement element = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_explorebodytypeSUV")));
		boolean isDisplayedAndEnabled = element.isDisplayed() && element.isEnabled();
		if (isDisplayedAndEnabled) {
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -100);");
		    prm.click(driver, cr.valueOnTheKey("homepage_explorebodytypeSUV"), "xpath");
		} else {
		    System.out.println("Element is obscured by another element or not ready");
		}

				
		//prm.click(driver, cr.valueOnTheKey("homepage_explorebodytypeSUV"), "xpath");
		Thread.sleep(3000);

		boolean explorebodytypeViewAllSUVs = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_explorebodytypeViewAllSUVs"))).isDisplayed();
		prm.click(driver, cr.valueOnTheKey("homepage_explorebodytypeViewAllSUVs"), "xpath");
		Thread.sleep(5000);

		boolean SUVfilter = driver.findElement(By.xpath(cr.valueOnTheKey("plp_SUV_filter_applied"))).isDisplayed();
		Assert.assertTrue(SUVfilter);
		Thread.sleep(4000);
		
		
		WebElement plp_h1TagSUV = driver.findElement(By.xpath(cr.valueOnTheKey("plp_h1TagSUV")));
	    Assert.assertEquals(true, plp_h1TagSUV.isDisplayed());

	}

	@Then("Click on MUV and View All MUVs")
	public void Click_on_MUV_and_View_All_MUVs() throws InterruptedException {
		// Locating the element using XPath
		WebElement element = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_explorebodytypeMUV")));

		// Executing JavaScript to scroll the element into view
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -150);");
		
		 prm.click(driver, cr.valueOnTheKey("homepage_explorebodytypeSUV"), "xpath");
		 
		prm.click(driver, cr.valueOnTheKey("homepage_explorebodytypeMUV"), "xpath");
		Thread.sleep(3000);

		prm.click(driver, cr.valueOnTheKey("homepage_explorebodytypeViewAllMUVs"), "xpath");
		Thread.sleep(5000);

		boolean MUVfilter = driver.findElement(By.xpath(cr.valueOnTheKey("plp_MUV_filter_applied"))).isDisplayed();
		Assert.assertTrue(MUVfilter);
		Thread.sleep(2000);
		
		
		WebElement plp_h1TagMUV = driver.findElement(By.xpath(cr.valueOnTheKey("plp_h1TagMUV")));
	    Assert.assertEquals(true, plp_h1TagMUV.isDisplayed());
	}

}
