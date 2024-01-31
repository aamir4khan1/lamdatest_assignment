
package StepDefinition;

import org.openqa.selenium.By;
//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;

public class Login {
	
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("click on account tab")
	public void click_on_account_tab() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("botnav_account"), "xpath");
		Thread.sleep(2000);
	}

	@And("user clicks on mobile number field")
	public void user_clicks_on_mobile_number_field() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("login_mobileNumber"), "xpath");
		Thread.sleep(2000);
	}

	@And("enters mobile number and otp code")
	public void enters_mobile_number_and_otp_code() {
		try {
			prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_mobileNumber"),("xpath"),(cr.valueOnTheKey("MobileNumber")));
			Thread.sleep(2000);
			prm.click(driver, cr.valueOnTheKey("login_proceed"), "xpath");
			Thread.sleep(2000);
			prm.click(driver, cr.valueOnTheKey("login_otp"), "xpath");
			prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_otp"),("xpath"),(cr.valueOnTheKey("otp")));
			Thread.sleep(4000);
			WebElement Logout = driver.findElement(By.xpath(cr.valueOnTheKey("account_logout")));
			Assert.assertEquals(true, Logout.isDisplayed());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
