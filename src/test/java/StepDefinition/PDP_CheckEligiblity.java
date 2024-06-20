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

public class PDP_CheckEligiblity {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();	
	
	
	@And("user scroll down to check eligibility section")
	public void user_scroll_down_to_check_eligiblity_section() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scroll(0,3400)");
	Thread.sleep(2000);
	}
	
	@And("click on check eligiblity button")
	public void click_on_check_eligibility_button() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("pdp_checkEligibilityButton"), "xpath");
	Thread.sleep(2000);
	}	

	@And("validate apply finance page is visible")
	public void validate_apply_finance_page_is_visible() throws InterruptedException {
	WebElement usedCarLoanMobileContainer = driver.findElement(By.xpath(cr.valueOnTheKey("usedCarLoanMobileContainer")));
	Assert.assertEquals(true, usedCarLoanMobileContainer.isDisplayed());
	
	}
	
}