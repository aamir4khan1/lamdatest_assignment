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
public class multiplehubtd {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
	}
			/*
			 * }
			 * 
			 * 
			 * 
			 * 
			 * @And("user clicks on the browse car button") public void
			 * userClicksOnBrowseCarButton() throws InterruptedException{
			 * Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scroll(0,800)"); prm.click(driver,
			 * cr.valueOnTheKey("homepage_browseCars"), "xpath"); Thread.sleep(2000);
			 */       
    

    @And("clicks on add button")
    public void clicks_on_add_button() throws InterruptedException{
    	Thread.sleep(2000);
		WebElement add_heading = driver.findElement(By.xpath(cr.valueOnTheKey("add_heading")));
		Assert.assertEquals(true, add_heading.isDisplayed());
    	{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,750)");}
		prm.click(driver, cr.valueOnTheKey("add"), "xpath");
		Thread.sleep(3000);
		WebElement added_car = driver.findElement(By.xpath(cr.valueOnTheKey("added_car")));
		Assert.assertEquals(true, added_car.isDisplayed());
   
    }
}





