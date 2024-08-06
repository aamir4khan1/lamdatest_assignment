package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.time.Duration;

public class Login {

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Then("click on account tab")
	public void click_on_account_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement accountTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("botnav_account"))));
		prm.click(driver, cr.valueOnTheKey("botnav_account"), "xpath");
	}

	@And("user clicks on mobile number field")
	public void user_clicks_on_mobile_number_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement mobileNumberField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("login_mobileNumber"))));
		prm.click(driver, cr.valueOnTheKey("login_mobileNumber"), "xpath");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cr.valueOnTheKey("login_mobileNumber"))));
		prm.takeSceenshot(driver);
	}

	@And("user enters mobile number")
	public void user_enter_mobile_number() {
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_mobileNumber"), "xpath", cr.valueOnTheKey("MobileNumber"));
	}

	@And("user clicks on verify number button")
	public void click_verify_mobile_number() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement verifyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("verify_your_number"))));
		prm.click(driver, cr.valueOnTheKey("verify_your_number"), "xpath");
		wait.until(ExpectedConditions.invisibilityOf(verifyButton));
	}

	@And("user enters otp code")
	public void user_enters_otp_code() {
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_otp"), "xpath", cr.valueOnTheKey("otp"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(cr.valueOnTheKey("login_otp"))));
		prm.takeSceenshot(driver);
	}

	@Then("logout button is visible")
	public void logout_button_is_visible() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cr.valueOnTheKey("account_logout"))));
		Assert.assertTrue(logoutButton.isDisplayed());
	}
}
