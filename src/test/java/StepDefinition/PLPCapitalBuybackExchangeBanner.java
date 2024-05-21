
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PLPCapitalBuybackExchangeBanner {

	public PLPCapitalBuybackExchangeBanner() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll down to capital buyback exchange banner")
	public void scroll_down_to_capital_buyback_exchange_banner() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,5700)");
	Thread.sleep(4000);
	js.executeScript("window.scroll(0,9500)");
	Thread.sleep(2000);
	WebElement capitalBannerPLP = driver.findElement(By.xpath(cr.valueOnTheKey("plp_capitalBanner")));
	Assert.assertEquals(true, capitalBannerPLP.isDisplayed());
	WebElement buybackBannerPLP = driver.findElement(By.xpath(cr.valueOnTheKey("plp_buybackBanner")));
	Assert.assertEquals(true, buybackBannerPLP.isDisplayed());
	WebElement bannerslider = driver.findElement(By.xpath(cr.valueOnTheKey("plp_bannerslider")));
	Actions action = new Actions(driver);
	action.dragAndDropBy(bannerslider, 200, 0);
	Thread.sleep(2000);
	WebElement exchangeBannerPLP = driver.findElement(By.xpath(cr.valueOnTheKey("plp_exchangeBanner")));
	Assert.assertEquals(true, exchangeBannerPLP.isDisplayed());
	}
	
	@And("click on capital banner")
	public void click_on_capital_banner() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_capitalBanner"), "xpath");
	Thread.sleep(2000);
	WebElement spinnyCapitalBannerContainer = driver.findElement(By.xpath(cr.valueOnTheKey("plp_capitalBannerContainer")));
	Assert.assertEquals(true, spinnyCapitalBannerContainer.isDisplayed());
	driver.navigate().back();
	Thread.sleep(2000);
	}

	@And("click on buyback banner")
	public void click_on_exchange_banner() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_buybackBanner"), "xpath");
	Thread.sleep(2000);
	WebElement buyBackBannerImage = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_buyBackBannerImage")));
	Assert.assertEquals(true, buyBackBannerImage.isDisplayed());
	driver.navigate().back();
	Thread.sleep(2000);
	}
	
	@And("click on exchange banner")
	public void click_on_buyback_banner() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_exchangeBanner"), "xpath");
	Thread.sleep(2000);
	WebElement spinnyCapitalBannerContainer = driver.findElement(By.xpath(cr.valueOnTheKey("plp_capitalBannerContainer")));
	Assert.assertEquals(true, spinnyCapitalBannerContainer.isDisplayed());
	}
	
}