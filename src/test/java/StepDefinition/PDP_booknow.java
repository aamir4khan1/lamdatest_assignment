package StepDefinition;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import org.junit.Assert;

public class PDP_booknow {
	
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

  

	/*
	 * @Given("user lands on spinny website") public void userLandsOnSpinnyWebsite()
	 * { // Code to navigate to Spinny website
	 * driver.get("https://www.spinny.com/"); }
	 */

    @And("user clicks on the Book now button")
    public void userclicksontheBooknowbutton() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("PDP_Booknow"), "xpath");
		Thread.sleep(2000);
       
    }
    @And ("user clicks on Proceed CTA")
    public void userclicksonProceedCTA() throws InterruptedException{
    			Thread.sleep(3000);
		// Define the XPaths for the CTA elements
        String xpathCTA1 = cr.valueOnTheKey("Booknow_Skip1");
        String xpathCTA2 = cr.valueOnTheKey("Booknow_Skip2");

        // Check for the first CTA element and click if found
        WebElement ctaElement = null;
        try {
            ctaElement = driver.findElement(By.xpath(xpathCTA1));
            if (ctaElement.isDisplayed()) {
                prm.click(driver, cr.valueOnTheKey("Booknow_Skip1"), "xpath");
            }
        } catch (Exception e1) {
            try {
                // Check for the second CTA element and click if found
                ctaElement = driver.findElement(By.xpath(xpathCTA2));
                if (ctaElement.isDisplayed()) {
                    prm.click(driver, cr.valueOnTheKey("Booknow_Skip2"), "xpath");
                }
            } catch (Exception e2) {
                System.out.println("No CTA buttons found on the page.");
                return; // Exit the method as no CTA button was found
            }
        }
        Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("Booknow_proceed"), "xpath");
		  Thread.sleep(6000);
		  driver.navigate().refresh();
		  Thread.sleep(3000);
		  WebElement Booknow_onhold = driver.findElement(By.xpath(cr.valueOnTheKey("Booknow_onhold")));
	        Assert.assertEquals(true, Booknow_onhold.isDisplayed());  
	        Thread.sleep(3000);
    }
    @And("user verify on hold")
    public void userverifyonhold() throws InterruptedException{
    	Thread.sleep(3000);
    	prm.click(driver, cr.valueOnTheKey("cart_productCard"), "xpath");
		  WebElement Booknow_onhold = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_holdcta")));
	        Assert.assertEquals(true, Booknow_onhold.isDisplayed());  
	        Thread.sleep(3000);
	        
    	
    }
    
}