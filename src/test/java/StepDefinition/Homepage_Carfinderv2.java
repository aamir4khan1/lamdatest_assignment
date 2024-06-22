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
public class Homepage_Carfinderv2 {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
	    }
	

	
	@And("clicks on the car finder banner on homepage")
	public void clicks_on_the_car_finder_banner_on_homepage() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1200)");
		Thread.sleep(4000);
		WebElement Carfinder_banner = driver.findElement(By.xpath(cr.valueOnTheKey("Carfinder_banner")));
		Assert.assertEquals(true, Carfinder_banner.isDisplayed());
		prm.click(driver, cr.valueOnTheKey("Carfinder_banner"),"xpath");
		Thread.sleep(2000);
		WebElement question_screen = driver.findElement(By.xpath(cr.valueOnTheKey("question_screen"))); 
		Assert.assertEquals(true, question_screen.isDisplayed());
		
	}
		

@And("user selects price range")
	public void user_selects_price_range() throws InterruptedException {
		Thread.sleep(2000);
		WebElement spend = driver.findElement(By.xpath(cr.valueOnTheKey("spend"))); 
		Assert.assertEquals(true, spend.isDisplayed());
		Thread.sleep(2000);
		WebElement Carfinder_pricerange = driver.findElement(By.xpath(cr.valueOnTheKey("Carfinder_pricerange")));
		Actions actions = new Actions(driver);
		actions.moveToElement(Carfinder_pricerange).click().build().perform();
		
		
		
		
	}
	@And("user selects fuel type preference")
	public void user_selects_fuel_type_preference() throws InterruptedException {
		Thread.sleep(2000);
		WebElement optional = driver.findElement(By.xpath(cr.valueOnTheKey("optional")));
		Assert.assertEquals(true, optional.isDisplayed());
		Thread.sleep(2000);
		WebElement Carfinder_fueltype = driver.findElement(By.xpath(cr.valueOnTheKey("Carfinder_fueltype")));
		Actions actions = new Actions(driver);
		actions.moveToElement(Carfinder_fueltype).click().build().perform();
		
		
	}
	@And("user selects transmission preference")
	public void user_selects_transmission_preference() throws InterruptedException {
		Thread.sleep(2000);
		WebElement optional = driver.findElement(By.xpath(cr.valueOnTheKey("transmission")));
		Assert.assertEquals(true, optional.isDisplayed());
		Thread.sleep(2000);
		WebElement Carfinder_transmissiontype = driver.findElement(By.xpath(cr.valueOnTheKey("Carfinder_transmissiontype")));
		Actions actions = new Actions(driver);
		actions.moveToElement(Carfinder_transmissiontype).click().build().perform();
		Thread.sleep(3000);
		
	}
		
		@And("validate carfinder plp")
		public void validate_carfinder_plp() throws InterruptedException {
		Thread.sleep(2000);
		WebElement carfinder_plp = driver.findElement(By.xpath(cr.valueOnTheKey("carfinder_plp")));
		Assert.assertEquals(true, carfinder_plp.isDisplayed());
		
	}
	
}