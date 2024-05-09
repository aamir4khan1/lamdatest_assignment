
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

public class PLPPopularFilters {

	public PLPPopularFilters() {

	}

	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("scroll down till popular filter section")
	public void scroll_down_till_popular_filter_section() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3000)");
		Thread.sleep(2000);
		WebElement popularFilterSection = driver.findElement(By.xpath(cr.valueOnTheKey("plp_popularFilterSection")));
		Assert.assertEquals(true, popularFilterSection.isDisplayed());
	}

	@And("select all filters")
	public void select_all_filters() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_popularFilterSectionAllFilters"), "xpath");
		Thread.sleep(2000);
		WebElement filtersSection = driver.findElement(By.xpath(cr.valueOnTheKey("plp_filtersSection")));
		Assert.assertEquals(true, filtersSection.isDisplayed());
		prm.click(driver, cr.valueOnTheKey("plp_filtersSectionBack"), "xpath");
		Thread.sleep(2000);
	}

	@And("select rto")
	public void select_rto() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_popularFiltersSectionRTODL"), "xpath");
		Thread.sleep(2000);
	}

	@And("select fuel type")
	public void select_fuel_type() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_popularfiltersSectionFuelTypePetrol"), "xpath");
		Thread.sleep(2000);
	}

	@And("select year")
	public void select_year() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("plp_popularfiltersSection2018AndAbove"), "xpath");
		Thread.sleep(2000);
	}

	@Then("clicked on view cars cta")
	public void clicked_on_view_cars_cta() throws InterruptedException {

		prm.click(driver, cr.valueOnTheKey("plp_popularfiltersSectionViewAllCarsButton"), "xpath");
		Thread.sleep(2000);
	}

	@And("land on plp with applied filters")
	public void land_on_plp_with_applied_filters() throws InterruptedException {
		Thread.sleep(2000);
		WebElement cityTypeDLAppliedFloatingFilter = driver.findElement(By.xpath(cr.valueOnTheKey("plp_popularfiltersSectionViewAllCarsButtonFloatingSaveFiltersDL")));
		Assert.assertEquals(true, cityTypeDLAppliedFloatingFilter.isDisplayed());
		WebElement fuelTypePetrolAppliedFloatingFilter = driver.findElement(By.xpath(cr.valueOnTheKey("plp_PetrolTypeAppliedFloatingFilter")));
		Assert.assertEquals(true, fuelTypePetrolAppliedFloatingFilter.isDisplayed());
		WebElement year2020AppliedFloatingFilter = driver.findElement(By.xpath(cr.valueOnTheKey("plp_2018TypeAppliedFloatingFilter")));
		Assert.assertEquals(true, year2020AppliedFloatingFilter.isDisplayed());
	}

}