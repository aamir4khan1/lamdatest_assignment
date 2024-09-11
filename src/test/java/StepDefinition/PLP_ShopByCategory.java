
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

public class PLP_ShopByCategory {

	public PLP_ShopByCategory() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll down to shop by category section")
	public void scroll_down_to_shop_by_category_section() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scroll(0,1200)");
		js.executeScript("window.scroll(0,3000)");

		Thread.sleep(2000);
	}

	@And("validate shop by category section")
	public void validate_shop_by_category_section() throws InterruptedException {

		WebElement plp_shopByCategorycityselector = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shopByCategorycityselector")));
		Actions actions = new Actions(driver);
		actions.moveToElement(plp_shopByCategorycityselector).click().build().perform();
		Thread.sleep(2000);
		WebElement plp_shopByCategorycityselected = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shopByCategorycityselected")));
		Actions actionss = new Actions(driver);
		actionss.moveToElement(plp_shopByCategorycityselected).click().build().perform();
		Thread.sleep(2000);
		WebElement shopByCategoryContainer = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shopByCategoryContainer")));
		Assert.assertEquals(true, shopByCategoryContainer.isDisplayed());
		Thread.sleep(2000);
	}

	@And("click on category guide")
	public void click_on_category_guide() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryCategoryGuide"), "xpath");
		Thread.sleep(2000);
		WebElement shopByCategoryCategoryGuideBottomSheet = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shopByCategoryContainer")));
		Assert.assertEquals(true, shopByCategoryCategoryGuideBottomSheet.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	@And("click on first car card under assured category")
	public void click_on_first_car_card_under_assured_category() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryAssuredFirstCarCard"), "xpath");
		Thread.sleep(2000);
		WebElement knowMore = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_knowMore")));
		Assert.assertEquals(true, knowMore.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	@And("click on shortlist icon under assured category")
	public void click_on_shortlist_icon_under_assured_category() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryAssuredShortlistIcon"), "xpath");
		Thread.sleep(2000);
		WebElement shortlistSectionLoginHeaderText = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shortlistSectionLoginHeader")));
		Assert.assertEquals(true, shortlistSectionLoginHeaderText.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	@And("click on explore collection under assured category")
	public void click_on_explore_collection_under_assured_category() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryAssuredExploreCollection"), "xpath");
		Thread.sleep(2000);
		WebElement assuredFilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("plp_spinnyAssuredFilterAppliedChip")));
		Assert.assertEquals(true, assuredFilterApplied.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scroll(0,1200)");
		js.executeScript("window.scroll(0,3000)");
		Thread.sleep(2000);
	}

	@And("click on view all under assured categoy")
	public void click_on_view_all_under_assured_category() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryAssuredViewAllCars"), "xpath");
		Thread.sleep(2000);
		WebElement assuredFilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("plp_spinnyAssuredFilterAppliedChip")));
		Assert.assertEquals(true, assuredFilterApplied.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scroll(0,1200)");
		js.executeScript("window.scroll(0,3000)");
		Thread.sleep(2000);
	}

	@Then("click on budget category tab")
	public void click_on_budget_category_tab() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryBudgetTab"), "xpath");
		Thread.sleep(2000);
	}

	@And("click on first car card under budget category")
	public void click_on_first_car_card_under_budget_category() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryBudgetFirstCarCard"), "xpath");
		Thread.sleep(2000);
		WebElement knowMore = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_knowMore")));
		Assert.assertEquals(true, knowMore.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryBudgetTab"), "xpath");
		Thread.sleep(2000);
	}

	@And("click on shortlist icon under budget category")
	public void click_on_shortlist_icon_under_budget_category() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryBudgetShortlistIcon"), "xpath");
		Thread.sleep(2000);
		WebElement shortlistSectionLoginHeaderText = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shortlistSectionLoginHeader")));
		Assert.assertEquals(true, shortlistSectionLoginHeaderText.isDisplayed());
		driver.navigate().back();
		Thread.sleep(4000);
	}

	@And("click on explore collection under budget category")
	public void click_on_explore_collection_under_budget_category() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryBudgetExploreCollection"), "xpath");
		Thread.sleep(2000);
		WebElement budgetFilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("plp_budgetFilterAppliedChip")));
		Assert.assertEquals(true, budgetFilterApplied.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scroll(0,1200)");
		js.executeScript("window.scroll(0,3000)");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryBudgetTab"), "xpath");
		Thread.sleep(2000);
	}

	@And("click on view all under budget categoy")
	public void click_on_view_all_under_budget_category() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryBudgetViewAllCars"), "xpath");
		Thread.sleep(2000);
		WebElement budgetFilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("plp_budgetFilterAppliedChip")));
		Assert.assertEquals(true, budgetFilterApplied.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scroll(0,1200)");
		js.executeScript("window.scroll(0,3000)");
		Thread.sleep(2000);
	}

	@Then("click on max category tab")
	public void click_on_max_category_tab() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryMaxTab"), "xpath");
		Thread.sleep(2000);
	}

	@And("click on first car card under max category")
	public void click_on_first_car_card_under_max_category() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryMaxFirstCarCard"), "xpath");
		Thread.sleep(2000);
		WebElement knowMore = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_knowMore")));
		Assert.assertEquals(true, knowMore.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryMaxTab"), "xpath");
		Thread.sleep(2000);
	}

	@And("click on shortlist icon under max category")
	public void click_on_shortlist_icon_under_max_category() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryMaxShortlistIcon"), "xpath");
		Thread.sleep(2000);
		WebElement shortlistSectionLoginHeaderText = driver.findElement(By.xpath(cr.valueOnTheKey("plp_shortlistSectionLoginHeader")));
		Assert.assertEquals(true, shortlistSectionLoginHeaderText.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
	}

	@And("click on explore collection under max category")
	public void click_on_explore_collection_under_max_category() throws InterruptedException {
		
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryMaxExploreCollection"), "xpath");
		Thread.sleep(2000);
		WebElement maxFilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("plp_maxFilterAppliedChip")));
		Assert.assertEquals(true, maxFilterApplied.isDisplayed());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scroll(0,1200)");
		js.executeScript("window.scroll(0,4000)");
		Thread.sleep(2000);
		
	}

	@And("click on view all under max categoy")
	public void click_on_view_all_under_max_category() throws InterruptedException {
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryMaxTab"), "xpath");
		Thread.sleep(2000);
		//prm.click(driver, cr.valueOnTheKey("plp_shopByCategoryMaxViewAllCars"), "xpath");
		//Thread.sleep(2000);
		//WebElement maxFilterApplied = driver.findElement(By.xpath(cr.valueOnTheKey("plp_maxFilterAppliedChip")));
		//Assert.assertEquals(true, maxFilterApplied.isDisplayed());
		//Thread.sleep(2000);
	}

}