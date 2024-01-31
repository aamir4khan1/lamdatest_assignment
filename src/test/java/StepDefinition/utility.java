package StepDefinition;


import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;

import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class utility {
    static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();


    @And("^Wait for page to load$")
    public void tempwait() throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        Thread.sleep(7000);
        }
    @And("^Take Screenshot$")
    public void takeScreenshot()  {
        //WebDriverWait wait = new WebDriverWait(driver, 30);
    	prm.takeSceenshot(driver);
     
        }
    
}
