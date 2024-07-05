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
public class PDP_Love_story {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	

    @And("scroll till Lovestory on PDP Page")
	   public void scroll_till_Lovestory_section() throws InterruptedException {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scroll(0,5700)");
				Thread.sleep(2000);
		 }
	
	@And("Assert the love story section")
	 public void Validate_lovestory_section() throws InterruptedException {
		
		    WebElement LoveStorySectionpdp = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_LoveStorySection")));
	    	Assert.assertEquals(true, LoveStorySectionpdp.isDisplayed());
			Thread.sleep(2000);
	 }
}