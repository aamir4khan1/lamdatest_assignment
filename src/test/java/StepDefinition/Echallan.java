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
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class Echallan {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
	    }
	

	
	@And("user lands on echallan page")
	public void user_lands_on_echallan_page() throws InterruptedException {
		Thread.sleep(1000);
		WebElement echallan_page_1 = driver.findElement(By.xpath(cr.valueOnTheKey("echallan_page_1")));
		Assert.assertEquals(true, echallan_page_1.isDisplayed());
	}
	@And("user enters registration number")
	public void user_enters_registration_number() throws InterruptedException {
		Thread.sleep(2000);
		prm.sendTextToTextBox(driver, cr.valueOnTheKey("registration_number"),("xpath"),(cr.valueOnTheKey("Number_number")));
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("check_challan"), "xpath");
		Thread.sleep(2000);
		WebElement echallan_product_page = driver.findElement(By.xpath(cr.valueOnTheKey("echallan_product_page")));
		Assert.assertEquals(true, echallan_product_page.isDisplayed());
	
		
		
	
	}
	
}