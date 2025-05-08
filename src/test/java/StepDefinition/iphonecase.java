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
import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class iphonecase {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
	    }
	
	@And("user searches for iphone")
	public void user_searches_for_iphone() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("search_icon"));
		prm.clickByJavaScript(driver, cr.valueOnTheKey("search_icon"), "xpath");
		
		

		
		

	}
	@And("user selects an iphone")
	public void user_selects_an_iphone() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']"));

		for (WebElement link : links) {
		    link.click(); 
		    break;        
		}


		
		

	}
	@And("user adds the iphone in cart")
	public void user_adds_the_iphone_in_cart() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("add_cart_button"), "xpath");
		Thread.sleep(2000);
		WebElement added_item = driver.findElement(By.xpath(cr.valueOnTheKey("added_item")));
		Assert.assertEquals(true, added_item.isDisplayed());
	}
	@And("price is shown")
	public void price_is_shown() throws InterruptedException {
		Thread.sleep(2000);
		WebElement priceElement = driver.findElement(By.xpath("//span[@class='a-offscreen']"));
		String price = priceElement.getText();
		System.out.println("Item price: " + price);

		
		
	
	}
	
}