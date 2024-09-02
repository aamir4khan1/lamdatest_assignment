package StepDefinition;

import org.junit.Assert;
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

public class Homepage_FAQ {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();	  
	
	@And("scroll till FAQs section")
	public void scroll_till_FAQs_section() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,7900)");
		Thread.sleep(2000);
		
	}
    @And("User able to see FAQs section")
    
    public void User_able_to_see_FAQs_section() throws InterruptedException {
    	WebElement FAQsSection = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_FAQsSection")));
    	Assert.assertEquals(true, FAQsSection.isDisplayed());
		Thread.sleep(2000);
    }


	@And("user clicks on visit help center")
	public void user_clicks_on_visit_help_center() throws InterruptedException {
		driver.findElement(By.xpath(cr.valueOnTheKey("homepage_visitHelpCenterButton")));
		
		prm.click(driver, cr.valueOnTheKey("homepage_visitHelpCenterButton"), "xpath");
		Thread.sleep(2000);
		WebElement signIn = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_visitHelpCenterButtonSignIn")));
    	Assert.assertEquals(true, signIn.isDisplayed());
    	WebElement searchBox = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_visitHelpCenterButtonSearchBox")));
    	Assert.assertEquals(true, searchBox.isDisplayed());
		Thread.sleep(2000);
	}
		
}		
		
		
    
    
    