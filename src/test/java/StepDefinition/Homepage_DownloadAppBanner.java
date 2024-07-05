
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

public class Homepage_DownloadAppBanner {

	public Homepage_DownloadAppBanner() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll down to spinny app banner")
	public void scroll_down_to_spinnt_app_banner() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,7700)");
		Thread.sleep(1000);

		WebElement downloadSpinnyAppBanner = driver
				.findElement(By.xpath(cr.valueOnTheKey("homepage_downloadSpinnyAppBanner")));
		Assert.assertEquals(true, downloadSpinnyAppBanner.isDisplayed());

		WebElement downloadSpinnyAppBannerButton = driver
				.findElement(By.xpath(cr.valueOnTheKey("homepage_downloadSpinnyAppBannerDownloadAppButton")));
		Assert.assertEquals(true, downloadSpinnyAppBannerButton.isDisplayed());
		prm.takeSceenshot(driver);
	}

	/*
	 * @And("click on google play button") public void click_on_google_play_button()
	 * throws InterruptedException { prm.click(driver,
	 * cr.valueOnTheKey("homepage_googlePlayButton"), "xpath");
	 * 
	 * }
	 */

}
