
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

public class PLP_CapitalBuybackExchangeBanner {

	public PLP_CapitalBuybackExchangeBanner() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll down to capital buyback exchange banner")
	public void scroll_down_to_capital_buyback_exchange_banner() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,5700)");
	Thread.sleep(2000);
	js.executeScript("window.scroll(0,9700)");
	Thread.sleep(2000);
	WebElement capitalBannerPLP = driver.findElement(By.xpath(cr.valueOnTheKey("plp_capitalBanner")));
	Assert.assertEquals(true, capitalBannerPLP.isDisplayed());
	WebElement buybackBannerPLP = driver.findElement(By.xpath(cr.valueOnTheKey("plp_buybackBanner")));
	Assert.assertEquals(true, buybackBannerPLP.isDisplayed());
	Thread.sleep(2000);

//	WebElement scrollableElement = driver.findElement(By.xpath(cr.valueOnTheKey("plp_bannerSlider")));
//	String script = "arguments[0].scrollLeft = 300;";
//	js.executeScript(script, scrollableElement);
//	Thread.sleep(4000);

	
//	js = (JavascriptExecutor) driver; 
	//js.executeScript("window.scrollBy(-200,0)"); driver.close();
//	WebElement draggable = driver.findElement(By.xpath(cr.valueOnTheKey("plp_capitalBanner")));
//	js.executeScript("document.querySelector(\"[class='styles__slider styles__noInfiniteView CapitalBuyBackSlider__sliderParent styles__sliderTransition']\").scrollLeft=400");
//	Thread.sleep(2000);

 /*   WebElement draggable = driver.findElement(By.xpath(cr.valueOnTheKey("plp_capitalBanner")));
    Rectangle start = draggable.getRect();
    Rectangle finish = driver.findElement(By.id("droppable")).getRect();
    new Actions(driver).dragAndDropBy(draggable, finish.getX() - start.getX(), finish.getY() - start.getY()).perform();*/

	/*	Actions action = new Actions(driver);
	 WebElement draggable = driver.findElement(By.xpath(cr.valueOnTheKey("plp_capitalBanner")));
     WebElement droppable = driver.findElement(By.xpath(cr.valueOnTheKey("plp_buybackBanner")));
     action.dragAndDrop(draggable, droppable).perform();*/
	
/*	WebElement bannerslider = driver.findElement(By.xpath(cr.valueOnTheKey("plp_capitalBanner")));
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	action.dragAndDropBy(bannerslider, -200, 0).build().perform();	
	Thread.sleep(4000); */
	
//	WebElement exchangeBannerPLP = driver.findElement(By.xpath(cr.valueOnTheKey("plp_exchangeBanner")));
//	Assert.assertEquals(true, exchangeBannerPLP.isDisplayed());
	}
	
	@And("click on capital banner")
	public void click_on_capital_banner() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_capitalBanner"), "xpath");
	Thread.sleep(2000);
	WebElement spinnyCapitalBannerContainer = driver.findElement(By.xpath(cr.valueOnTheKey("plp_capitalBannerContainer")));
	Assert.assertEquals(true, spinnyCapitalBannerContainer.isDisplayed());
	WebElement usedCarLoanLandingSection = driver.findElement(By.xpath(cr.valueOnTheKey("applyFinance_usedCarLoanLandingSection")));
	Assert.assertEquals(true, usedCarLoanLandingSection.isDisplayed());
	driver.navigate().back();
	Thread.sleep(2000);
	}

	@And("click on buyback banner")
	public void click_on_exchange_banner() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("plp_buybackBanner"), "xpath");
	Thread.sleep(2000);
	WebElement buyBackBannerImage = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_buyBackBannerImage")));
	Assert.assertEquals(true, buyBackBannerImage.isDisplayed());
	WebElement buyBackContainer = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_buyBackContainer")));
	Assert.assertEquals(true, buyBackContainer.isDisplayed());
	driver.navigate().back();
	Thread.sleep(2000);
	}
	
	@And("click on exchange banner")
	public void click_on_buyback_banner() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementsByClassName('CapitalBuyBackSlider__sliderParent')[0].style.transform = 'translateX(-250%)'");
	Thread.sleep(5000);
	js.executeScript("document.getElementsByClassName('CapitalBuyBackSlider__sliderParent')[0].style.transform = 'translateX(-220%)'");
	Thread.sleep(5000);
	prm.click(driver, cr.valueOnTheKey("plp_exchangeBanner"), "xpath");
	Thread.sleep(2000);
	WebElement spinnyCapitalBannerContainer = driver.findElement(By.xpath(cr.valueOnTheKey("plp_capitalBannerContainer")));
	Assert.assertEquals(true, spinnyCapitalBannerContainer.isDisplayed());
	WebElement sellPageCardHeading = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_sellFormCardHeading")));
	Assert.assertEquals(true, sellPageCardHeading.isDisplayed());
	WebElement sellToggleGetPriceSellFormOverlay = driver.findElement(By.xpath(cr.valueOnTheKey("homepage_sellToggleGetPriceSellFormOverlay")));
	Assert.assertEquals(true, sellToggleGetPriceSellFormOverlay.isDisplayed());
	}
	
}