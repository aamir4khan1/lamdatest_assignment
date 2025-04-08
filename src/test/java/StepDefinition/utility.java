package StepDefinition;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;

import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;

public class utility {
    static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver; // Access public static driver directly
    Wait wait = new Wait();
    static preMethods prm = new preMethods();

    @And("^Wait for page to load$")
    public void tempwait() throws InterruptedException {
        Thread.sleep(7000);
    }

   /* @And("^Take Screenshot$")
    public void takeScreenshot() {
        prm.takeSceenshot(driver);*/
    }

