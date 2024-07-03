
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

public class PLP_DownloadAppBanner {

	public PLP_DownloadAppBanner() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("user clicks on quick filter button")
	public void user_clicks_on_quick_filter_button() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_Filters"), "xpath");
	Thread.sleep(2000);
	}
	
	@And("user selects availability tab")
	public void user_selects_availablity_tab() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_filterAvailability"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("select upcoming filter")
	public void select_upcoming_filter() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_filterAvailabilityUpcoming"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("click on apply button")
	public void click_on_apply_button() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("scroll down to download app banner")
	public void scroll_down_to_download_app_banner() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(2000);
	}
	
	@And("validate download app banner")
	public void validate_download_app_banner() throws InterruptedException {
		WebElement downloadSpinnyAppBanner = driver.findElement(By.xpath(cr.valueOnTheKey("plp_downloadAppBanner")));
		Assert.assertEquals(true, downloadSpinnyAppBanner.isDisplayed());
	}
}