
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Login {

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("click on account tab")
	public void click_on_account_tab() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("botnav_account"), "xpath");
		Thread.sleep(5000);
	}

	@And("user clicks on mobile number field")
	public void user_clicks_on_mobile_number_field() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("login_mobileNumber"), "xpath");
		Thread.sleep(5000);
	}

	@And("user enters mobile number")
	public void user_enter_mobile_number() throws InterruptedException {
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_mobileNumber"),("xpath"),(cr.valueOnTheKey("MobileNumber")));
		Thread.sleep(4000);
		
	//	WebElement verifyYourNumberField = driver.findElement(By.xpath(cr.valueOnTheKey("verifyYourNumberField")));
	//	Actions actions = new Actions(driver);
	//	actions.moveToElement(verifyYourNumberField).click().build().perform();
	//	Thread.sleep(4000);
		
		//prm.click(driver, cr.valueOnTheKey("verify_your_number"), "xpath");
		prm.clickByJavaScript(driver, cr.valueOnTheKey("verify_your_number"), "xpath");
		Thread.sleep(4000);
	}

	@And("user enters otp code")
	public void user_enters_otp_code() throws InterruptedException {
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_otp"), ("xpath"), (cr.valueOnTheKey("otp")));
		Thread.sleep(6000);
		prm.takeSceenshot(driver);
	}

	@Then("logout button is visible")
	public void logout_button_is_visible() {
		WebElement Logout = driver.findElement(By.xpath(cr.valueOnTheKey("account_logout")));
		Assert.assertEquals(true, Logout.isDisplayed());
	}

}
