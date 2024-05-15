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

public class Homepage_spinnyLovestory {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();
	
	
	  @And ("scroll till lovestory section")

	    public void scroll_till_lovestory_section() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,6800)");
			Thread.sleep(2000);
	    }

	    @And ("User able to see lovestory section")
	    public void User_able_to_see_lovestory_section() throws InterruptedException {
	    	WebElement LoveStorySection = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_LoveStorySection")));
	    	Assert.assertEquals(true, LoveStorySection.isDisplayed());
			Thread.sleep(2000);
	    }
	}

