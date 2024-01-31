package StepDefinition;


import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;

import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CRMLogin {
    static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();

    @Given("^User open CRM URL$")
    public void user_land_to_crm_website() {
        driver.get(cr.valueOnTheKey("CRMURL"));
    }

    @When("^Wait for the CRM page to load completely$")
    public void wait_for_the_page_to_load_completely() {
        Wait.implicitWait(2, driver);
    }

    @And("^User enter username$")
    public void enter_username() {
        wait.presenceOfElementLocated(driver, "id", cr.valueOnTheKey("CRM_username"));
        prm.sendTextToTextBox(driver,cr.valueOnTheKey("CRM_username"),"id",cr.valueOnTheKey("CRMUsername_cred"));
    }
    @And("^User enter password$")
    public void enter_password() {
        wait.presenceOfElementLocated(driver, "id", cr.valueOnTheKey("CRM_password"));
        prm.sendTextToTextBox(driver,cr.valueOnTheKey("CRM_password"),"id",cr.valueOnTheKey("CRMPassword_cred"));
    }
    @And("^User click on login button$")
    public void Click_btn() {
        wait.presenceOfElementLocated(driver, "id", cr.valueOnTheKey("CRM_Signin_button"));
        prm.click(driver, cr.valueOnTheKey("CRM_Signin_button"),"id");
}
   
}

