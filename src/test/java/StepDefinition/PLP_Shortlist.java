
package StepDefinition;

import javax.xml.xpath.XPath;

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

public class PLP_Shortlist {

	public PLP_Shortlist() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("click on shortlist icon on car card")
	public void click_on_shortlist_icon_on_card() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shortlistIcon"), "xpath");
		Thread.sleep(2000);
	}

	@And("car gets shortlisted")
	public void car_gets_shortlisted() throws InterruptedException {
		WebElement shortlistedCardCardIcon = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shorlistedIcon")));
		Assert.assertEquals(true, shortlistedCardCardIcon.isDisplayed());		
		Thread.sleep(2000);
	}
	
	
	@Then("user click on header shortlist icon")
	public void user_click_on_header_shortlist_icon() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_headerShortlist"), "xpath");
		Thread.sleep(2000);
	}

	
	@And("user can see shortlisted car on shortlist section")
	public void user_can_see_shortlisted_car_on_shortlist_section() throws InterruptedException {
		WebElement h3HeaderText = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shortlistedSectionH3HeaderText")));
		Assert.assertEquals(true, h3HeaderText.isDisplayed());
		
		WebElement shortlistSectionShortlistedCarCard = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shortlistSectionShortlistedCarCard")));
		Assert.assertEquals(true, shortlistSectionShortlistedCarCard.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Then("user unshortlist the car")
	public void user_unshortlist_the_car() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shorlistedIcon"), "xpath");
		Thread.sleep(2000);
	}
}