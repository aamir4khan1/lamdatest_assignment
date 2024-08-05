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

public class PLP_HighIntent {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();	
	
	
	
	@And("user click on back button on pdp")
	public void user_click_on_back_button_on_pdp() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("Pdp_KnowbackCTA"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("user click on back button on td scheduler page")
	public void user_click_on_back_button_on_td_scheduler_page() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("shortlists_backIcon"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("user refresh the page")
	public void user_refresh_the_page() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@And("validate your top choice tag")
	public void validate_your_top_choice_tag() throws InterruptedException {
		WebElement yourTopChoiceTag = driver.findElement(By.xpath(cr.valueOnTheKey("PLP_yourTopChoiceTag")));
		Assert.assertEquals(true, yourTopChoiceTag.isDisplayed());

	}
	
	@And("validate high intent test drive CTA")
	public void validate_high_intent_test_drive_CTA() throws InterruptedException {
		WebElement highIntentTestDriveCTA = driver.findElement(By.xpath(cr.valueOnTheKey("PLP_highIntentTestDriveCTA")));
		Assert.assertEquals(true, highIntentTestDriveCTA.isDisplayed());
		Thread.sleep(2000);
	}
	
	@And("user click on botnav account")
	public void user_click_on_botnav_account() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("Accounts_loggedInAccount"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("click on logout")
	public void click_on_logout() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("account_logout"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("click on yes button")
	public void click_on_yes_button() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("logout_yes"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("click on calculate your emi")
	public void click_on_calculate_your_emi() throws InterruptedException {
	   	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,300)");
		prm.click(driver, cr.valueOnTheKey("PDP_EMICalculator"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("click on check eligibility on pdp")
	public void click_on_check_eligibility_on_pdp() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("PDP_EMI_checkElig"), "xpath");
		Thread.sleep(2000);
	}
	
	
	@And("navigate back to pdp")
	public void navigate_back_to_pdp() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("shortlists_backIcon"), "xpath");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	@And("click on inspection report back")
	public void click_on_inspection_report_back() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("pdp_inspectionReportModalBack"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("user click on back from book now")
	public void user_click_on_back_from_book_now() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("backarrow"), "xpath");
		Thread.sleep(2000);
	}
	
	}
	
	
	
	