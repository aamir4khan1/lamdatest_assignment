
package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PLP_SpinnyBenefitsSection {

	public PLP_SpinnyBenefitsSection() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll down to spinny benefits section")
	public void scroll_down_to_spinny_benefits_section() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,10000)");
		Thread.sleep(2000);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scroll(45000,0)");
		Thread.sleep(2000);
	}
	
	@And("validate spinny benefits section")
	public void validate_spinny_benefits_section() throws InterruptedException {
		WebElement spinnyBenefitsSectionContainer = driver.findElement(By.xpath(cr.valueOnTheKey("plp_spinnyBenefitsSectionBanner")));
		Assert.assertEquals(true, spinnyBenefitsSectionContainer.isDisplayed());
		Thread.sleep(2000);
	}
}