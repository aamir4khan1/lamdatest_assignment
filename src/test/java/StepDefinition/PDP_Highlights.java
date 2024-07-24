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
import org.openqa.selenium.NoSuchElementException;

public class PDP_Highlights {
	
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();
	
	@And("user selects Card to verify Highlights")
	public void user_selects_Card_to_verify_highlights() throws InterruptedException {
		
		Thread.sleep(3000);
	
		prm.click(driver, cr.valueOnTheKey("plp_highlight_CarCard1"), "xpath");
		Thread.sleep(2000);		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(2000);		

		

	        try {
	            // Find the highlights section on the PDP
	            WebElement pdp_highlights = driver.findElement(By.xpath("pdp_highlights")); // Replace with the actual XPath
	            // Assert that the highlights section is displayed
	            Assert.assertTrue(pdp_highlights.isDisplayed());
	            
	            WebElement pdp_highlightedPoints = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_highlightedPoints")));
	            Assert.assertEquals(true,pdp_highlightedPoints.isDisplayed());
	        	Thread.sleep(2000);
	        	
	            System.out.println("Highlights are present for car card 1");
	       } catch (NoSuchElementException e) {
	            System.out.println("Highlights are not present for car card 1");
	        }

	        // Navigate back to the listing page
	        driver.navigate().back();

	        // Find the car cards again to avoid StaleElementReferenceException
	        prm.click(driver, cr.valueOnTheKey("plp_highlight_CarCard2"), "xpath");
			Thread.sleep(2000);
			
			js.executeScript("window.scroll(0,400)");
			Thread.sleep(2000);		


	        // Click on the second car card
	        try {
	            // Find the highlights section on the PDP
	            // Assert that the highlights section is displayed
	            WebElement pdp_highlights = driver.findElement(By.xpath("pdp_highlights")); // Replace with the actual XPath

	            Assert.assertTrue(pdp_highlights.isDisplayed());
	            WebElement pdp_highlightedPoints = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_highlightedPoints")));

	        	Assert.assertEquals(true,pdp_highlightedPoints.isDisplayed());
	        	Thread.sleep(2000);
	            System.out.println("Highlights are present for car card 2");
	        } catch (NoSuchElementException e) {
	            System.out.println("Highlights are not present for car card 2");
	        }

	        // Navigate back to the listing page
	        driver.navigate().back();

	        // Find the car cards again to avoid StaleElementReferenceException
	        prm.click(driver, cr.valueOnTheKey("plp_highlight_CarCard3"), "xpath");
			Thread.sleep(2000);
			
			js.executeScript("window.scroll(0,400)");
			
	        // Click on the third car card
	        try {
	            // Find the highlights section on the PDP
	            // Assert that the highlights section is displayed
            WebElement pdp_highlights = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_highlights")));

	            Assert.assertTrue(pdp_highlights.isDisplayed());
	            WebElement pdp_highlightedPoints = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_highlightedPoints")));

	            
	        	Assert.assertEquals(true,pdp_highlightedPoints.isDisplayed());
	        	Thread.sleep(2000);
	            System.out.println("Highlights are present for car card 3");
	        } catch (NoSuchElementException e) {
	            System.out.println("Highlights are not present for car card 3");
	        }

	}
}
