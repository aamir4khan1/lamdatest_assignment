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
public class PDP_ExchangeBanner {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
    
    
    @And ("user select car")
    public void user_select_car() throws InterruptedException {
    	Thread.sleep(4000);
    	prm.click(driver, cr.valueOnTheKey("plp_cardPick"), "xpath");
		Thread.sleep(2000);
	
    }

    @And("user scroll down and validate")
    public void scroll_down_and_validate() throws InterruptedException {
    	Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		
		try {
     WebElement pdp_ExchangeBanner = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_ExchangeBanner")));
    if (pdp_ExchangeBanner!=null) {
    	Assert.assertEquals(true, pdp_ExchangeBanner.isDisplayed());
		Thread.sleep(2000);
		
		prm.click(driver, cr.valueOnTheKey("pdp_BuyWithExchange"), "xpath");
		Thread.sleep(2000);
	
		WebElement pdp_ExchangePopup = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_ExchangePopup")));
    	Assert.assertEquals(true, pdp_ExchangePopup.isDisplayed());
		Thread.sleep(2000);
		
		
		WebElement pdp_ExchangePopupButton = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_ExchangePopupButton")));
    	Assert.assertEquals(true, pdp_ExchangePopupButton.isDisplayed());
		Thread.sleep(2000);

		prm.click(driver, cr.valueOnTheKey("pdp_ExchangePopupButton"), "xpath");
		Thread.sleep(2000);
		
		WebElement pdp_ExchangeCarRegNum = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_ExchangeCarRegNum")));
    	Assert.assertEquals(true, pdp_ExchangeCarRegNum.isDisplayed());
		Thread.sleep(2000);
    }
		}
		catch(Exception e) {
			System.out.println("exchange not found");
		}
 }
}