package StepDefinition;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import org.junit.Assert;

public class PDP_emiCalculator {
	
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

  

	/*
	 * @Given("user lands on spinny website") public void userLandsOnSpinnyWebsite()
	 * { // Code to navigate to Spinny website
	 * driver.get("https://www.spinny.com/"); }
	 */
	
	@And("user view EMI Calculator")
	 public void user_view_EMI_Calculator() throws InterruptedException{
	
		 Thread.sleep(2000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scroll(0,150)");
	        Thread.sleep(2000);
	        prm.click(driver, cr.valueOnTheKey("PDP_EMICalculator"), "xpath");
	        Thread.sleep(2000);
	        prm.click(driver, cr.valueOnTheKey("PDP_EMI_cross"), "xpath");
	        Thread.sleep(2000);
	        WebElement Pdp_caroverviewReg = driver.findElement(By.xpath(cr.valueOnTheKey("PDP_emiassertioncross")));
	        Assert.assertEquals(true, Pdp_caroverviewReg.isDisplayed());
	        Thread.sleep(2000);
	        prm.click(driver, cr.valueOnTheKey("PDP_EMICalculators"), "xpath");
	        Thread.sleep(3000);
	        WebElement SLIDER1_XPATH = driver.findElement(By.xpath(cr.valueOnTheKey("SLIDER1_XPATH")));
	        Assert.assertEquals(true, SLIDER1_XPATH.isDisplayed());
	        Thread.sleep(2000);
	        moveSlider(driver, SLIDER1_XPATH , 50);
	        Thread.sleep(4000);
	        moveSlider(driver, SLIDER1_XPATH , 25);
	        Thread.sleep(4000);
	        WebElement SLIDER2_XPATH = driver.findElement(By.xpath(cr.valueOnTheKey("SLIDER2_XPATH")));
	        Assert.assertEquals(true, SLIDER2_XPATH.isDisplayed());
	        Thread.sleep(2000);
	        moveSlider(driver, SLIDER2_XPATH , 50);
	        Thread.sleep(4000);
	        moveSlider(driver, SLIDER2_XPATH , 25);
	        Thread.sleep(4000);
	        WebElement SLIDER3_XPATH = driver.findElement(By.xpath(cr.valueOnTheKey("SLIDER3_XPATH")));
	        Assert.assertEquals(true, SLIDER3_XPATH.isDisplayed());
	        Thread.sleep(2000);
	        moveSlider(driver, SLIDER3_XPATH , 50);
	        Thread.sleep(4000);
	        moveSlider(driver, SLIDER3_XPATH , 25);
	        Thread.sleep(4000);
	        prm.click(driver, cr.valueOnTheKey("PDP_EMI_checkElig"), "xpath");
	        Thread.sleep(3000);
	        WebElement checkeliglogin = driver.findElement(By.xpath(cr.valueOnTheKey("checkeliglogin")));
	        Assert.assertEquals(true, checkeliglogin.isDisplayed());  
}
	/*@And("user view Loan Eligibility page")
	 public void user_view_Loan_Eligibility_page() throws InterruptedException{
		Thread.sleep(3000);
        WebElement checkeliglogin = driver.findElement(By.xpath(cr.valueOnTheKey("loaneligpage")));
        Assert.assertEquals(true, checkeliglogin.isDisplayed()); 
        Thread.sleep(2000);
		
	}*/
	 public static void moveSlider(WebDriver driver, WebElement slider, int percentage) {
	        // Get slider width
	        int width = slider.getSize().getWidth();

	        // Calculate the offset
	        int xOffset = (int) ((width / 100.0) * percentage);

	        // Using Actions class to move the slider
	        Actions action = new Actions(driver);
	        action.dragAndDropBy(slider, xOffset, 0).build().perform();
	    }

    }