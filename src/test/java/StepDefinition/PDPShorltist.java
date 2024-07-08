
package StepDefinition;

import javax.xml.xpath.XPath;

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

public class PDPShorltist {

	public PDPShorltist() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("click on shortlist icon on PDP")
	public void click_on_shortlist_icon_on_PDP() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement pdp_shortlistIcon = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_shortlistIcon")));
        Actions actions = new Actions(driver);
        actions.moveToElement(pdp_shortlistIcon).click().build().perform();
        Thread.sleep(3000);
	}

	@And("car gets shortlisted on PDP")
	public void cargetsshortlistedonPDP() throws InterruptedException {
		Thread.sleep(3000);
		WebElement pdp_shortlistIcon = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_shortlistIcon")));
		Assert.assertEquals(true, pdp_shortlistIcon.isDisplayed());		
		Thread.sleep(2000);
		
	}
	@And("user can see shortlisted car on shortlist page")
	public void user_can_see_shortlisted_car_on_shortlist_section() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Pdp_KnowbackCTA = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_KnowbackCTA")));
        Actions actions = new Actions(driver);
        actions.moveToElement(Pdp_KnowbackCTA).click().build().perform();
        Thread.sleep(3000);

		WebElement PLPShortlisticonpage = driver.findElement(By.xpath(cr.valueOnTheKey("PLPShortlisticonpage")));
        Actions actionss = new Actions(driver);
        actionss.moveToElement(PLPShortlisticonpage).click().build().perform();
        Thread.sleep(3000);
        
		WebElement h3HeaderText = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shortlistedSectionH3HeaderText")));
		Assert.assertEquals(true, h3HeaderText.isDisplayed());
		
		WebElement shortlistSectionShortlistedCarCard = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shortlistSectionShortlistedCarCard")));
		Assert.assertEquals(true, shortlistSectionShortlistedCarCard.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("plp_shortlistSectionShortlistedCarCard"), "xpath");
		Thread.sleep(2000);
		
	}
	
	@Then("user unshortlist the car on PDP")
	public void user_unshortlist_the_car_on_PDP() throws InterruptedException {
		Thread.sleep(2000);
		WebElement pdp_shortlistIcon = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_shortlistIcon")));
        Actions actions = new Actions(driver);
        actions.moveToElement(pdp_shortlistIcon).click().build().perform();
        Thread.sleep(3000);
	}
}