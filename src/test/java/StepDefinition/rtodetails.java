package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class rtodetails {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
	    }
	
	@And("user selects rto details page")
	public void user_selects_rto_details_page() throws InterruptedException{
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
		Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sideMenu').scroll(0,1000)");
		Thread.sleep(5000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("check_rto_details"), "xpath");
		
		

	}
	@And("user enters rto_registration number")
	public void user_enters_rto_registration_number() throws InterruptedException {
		Thread.sleep(2000);
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("registration_number"),("xpath"),(cr.valueOnTheKey("Number_number")));
		Thread.sleep(2000);
		prm.clickByJavaScript(driver, cr.valueOnTheKey("check_rto_number"), "xpath");
		Thread.sleep(2000);

	}
	@And("user lands on rto page")
	public void user_lands_on_rto_page() throws InterruptedException {
		//WebElement rto_page = driver.findElement(By.xpath(cr.valueOnTheKey("rto_page")));
		//Assert.assertEquals(true, rto_page.isDisplayed());
	
		
		
	
	}
	
}