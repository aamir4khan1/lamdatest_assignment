
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PLPShopByCategory {

	public PLPShopByCategory() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll down to shop by category section")
	public void scroll_down_to_shop_by_category_section() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_floatingSortFilter"), "xpath");
	Thread.sleep(2000);
	
	}
	
	
}