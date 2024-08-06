package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.junit.Assert;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;

public class PDP_HubTestDrive {
    static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
    
    public void user_land_on_spinny_website() throws Exception {
        driver.get(cr.valueOnTheKey("URL"));
    }

    @And("user select a car card")
    public void userSelectACarCard() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement plp_quickfilters = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cr.valueOnTheKey("plp_quickfilters"))));
        Assert.assertTrue(plp_quickfilters.isDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,750)");

        WebElement hubTDCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("HubTDcard"))));
        prm.click(driver, cr.valueOnTheKey("HubTDcard"), "xpath");
    }

    @And("user click on the Free test drive button")
    public void userClickOnFreeTestDriveButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement freeHubTD = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("FreeHubTD"))));
        prm.click(driver, cr.valueOnTheKey("FreeHubTD"), "xpath");
    }

    @And("user selects date")
    public void user_Selects_date() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementsByClassName('ScheduleTestDrive__container')[0].scroll(0, 600)");

        WebElement hubTDdate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("HubTDdate"))));
        prm.click(driver, cr.valueOnTheKey("HubTDdate"), "xpath");
    }

    @And("user chooses time")
    public void userchoosesTime() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementsByClassName('ScheduleTestDrive__container')[0].scroll(0, 600)");

        WebElement hubTDtimeselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cr.valueOnTheKey("HubTDtimeselect"))));
        Assert.assertTrue(hubTDtimeselect.isDisplayed());

        WebElement hub_testdrive_time = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("Hub_testdrive_time"))));
        prm.click(driver, cr.valueOnTheKey("Hub_testdrive_time"), "xpath");
    }

    @And("user clicks on Schedule hub test drive")
    public void user_clicks_on_Schedule_hub_test_drive() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement hub_testdrive_schedule = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("Hub_testdrive_schedule"))));
        prm.click(driver, cr.valueOnTheKey("Hub_testdrive_schedule"), "xpath");

        WebElement home_TDC_page = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cr.valueOnTheKey("Hub_TDC_page"))));
        Assert.assertTrue(home_TDC_page.isDisplayed());
    }

    @And("user clicks on cancel button")
    public void user_clicks_on_cancel_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(50,0)");
        js.executeScript("window.scroll(0,200)");

        WebElement cancel_button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("cancel_button"))));
        prm.click(driver, cr.valueOnTheKey("cancel_button"), "xpath");

        WebElement cancel_reason_screen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cr.valueOnTheKey("cancel_reason_screen"))));
        Assert.assertTrue(cancel_reason_screen.isDisplayed());
    }

    @And("user chooses reason for cancellation")
    public void user_chooses_reason_for_cancellation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement reason_select = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("reason_select"))));
        prm.click(driver, cr.valueOnTheKey("reason_select"), "xpath");
    }

    @And("user selects cancel CTA")
    public void user_selects_cancel_CTA() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cancel_CTA = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cr.valueOnTheKey("cancel_CTA"))));
        prm.click(driver, cr.valueOnTheKey("cancel_CTA"), "xpath");

        WebElement cancel_screen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cr.valueOnTheKey("cancel_screen"))));
        Assert.assertTrue(cancel_screen.isDisplayed());
    }
}
