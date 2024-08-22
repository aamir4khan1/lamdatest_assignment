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

import java.time.Duration;

public class Login {

    static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();

    @Then("click on account tab")
    public void click_on_account_tab() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement accountTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("botnav_account"))));
        
        int tries = 0;
        while (tries < 2) {
            try {
                accountTab.click();
                break;
            } catch (Exception e) {
                tries++;
                if (tries >= 2) throw e;
            }
        }
    }

    @And("user clicks on mobile number field")
    public void user_clicks_on_mobile_number_field() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement mobileNumberField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("login_mobileNumber"))));

        int tries = 0;
        while (tries < 2) {
            try {
                mobileNumberField.click();
                break;
            } catch (Exception e) {
                tries++;
                if (tries >= 2) throw e;
            }
        }
        prm.takeSceenshot(driver);
    }

    @And("user enters mobile number")
    public void user_enter_mobile_number() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement mobileNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cr.valueOnTheKey("login_mobileNumber"))));

        int tries = 0;
        while (tries < 2) {
            try {
                prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_mobileNumber"), "xpath", cr.valueOnTheKey("MobileNumber"));
                break;
            } catch (Exception e) {
                tries++;
                if (tries >= 2) throw e;
            }
        }
    }

    @And("user clicks on verify number button")
    public void click_verify_mobile_number() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement verifyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("verify_your_number"))));

        int tries = 0;
        while (tries < 2) {
            try {
                verifyButton.click();
                break;
            } catch (Exception e) {
                tries++;
                if (tries >= 2) throw e;
            }
        }
    }

    @And("user enters otp code")
    public void user_enters_otp_code() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cr.valueOnTheKey("login_otp"))));

        int tries = 0;
        while (tries < 2) {
            try {
                prm.sendTextToTextBox(driver, cr.valueOnTheKey("login_otp"), "xpath", cr.valueOnTheKey("otp"));
                break;
            } catch (Exception e) {
                tries++;
                if (tries >= 2) throw e;
            }
        }
        prm.takeSceenshot(driver);
    }

    @Then("logout button is visible")
    public void logout_button_is_visible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cr.valueOnTheKey("account_logout"))));

        Assert.assertTrue(logoutButton.isDisplayed(), "Logout button should be visible");
    }
}
