package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Bottom_Navigation {
    
    static ConfigReader cr = new ConfigReader();
    WebDriver driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();

    public Bottom_Navigation() {
        this.driver = Hooks.driver; // Fetch WebDriver instance from Hooks
        if (this.driver == null) {
            throw new IllegalStateException("❌ WebDriver is null. Check Hooks.java for initialization issues.");
        }
    }

    @Then("botnav is visible and home icon selected")
    public void botnav_is_visible_and_home_icon_selected() {
        System.out.println("🔄 Clicking Home icon in Bottom Navigation...");
        prm.click(driver, cr.valueOnTheKey("botnav_home"), "xpath");
        prm.takeSceenshot(driver);
        
        WebElement bottomNavigationBar = driver.findElement(By.xpath(cr.valueOnTheKey("botnav_bottomNavBar")));
        Assert.assertTrue(bottomNavigationBar.isDisplayed(), "❌ Bottom Navigation Bar is not visible");
        System.out.println("✅ Bottom Navigation Bar is visible.");
    }

    @And("user click on bottom navigation buy car icon")
    public void user_click_on_bottom_navigation_buy_car_icon() {
        System.out.println("🔄 Clicking Buy Car icon...");
        prm.click(driver, cr.valueOnTheKey("botnav_buyCar"), "xpath");
        prm.takeSceenshot(driver);

        WebElement quickfilters = driver.findElement(By.xpath(cr.valueOnTheKey("plp_quickfilters")));
        Assert.assertTrue(quickfilters.isDisplayed(), "❌ Quick filters are not visible");
        System.out.println("✅ Quick filters are visible.");
    }

    @And("user click on shortlists icon")
    public void user_click_on_shortlists_icon() {
        System.out.println("🔄 Clicking Shortlists icon...");
        prm.click(driver, cr.valueOnTheKey("homepage_SpinnyLogo"), "xpath");
        Wait.implicitWait(4, driver);

        prm.click(driver, cr.valueOnTheKey("botnav_shortlist"), "xpath");
        Wait.implicitWait(4, driver);
        prm.takeSceenshot(driver);

        WebElement loginModalText = driver.findElement(By.xpath(cr.valueOnTheKey("shortlists_loginModalText")));
        Assert.assertTrue(loginModalText.isDisplayed(), "❌ Login Modal is not visible");
        System.out.println("✅ Login Modal is visible.");

        prm.click(driver, cr.valueOnTheKey("shortlists_backIcon"), "xpath");
    }

    @And("user click on sell car icon")
    public void user_click_on_sell_car_icon() {
        System.out.println("🔄 Clicking Sell Car icon...");
        prm.click(driver, cr.valueOnTheKey("botnav_sellCar"), "xpath");
        Wait.implicitWait(4, driver);

        // Uncomment assertions if needed
        // WebElement SpinnySellBanner = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_spinnySellBanner")));
        // Assert.assertTrue(SpinnySellBanner.isDisplayed(), "Spinny Sell Banner is not visible");
        // System.out.println("✅ Spinny Sell Banner is visible.");

        // WebElement buyACar = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_buyACar")));
        // Assert.assertTrue(buyACar.isDisplayed(), "Buy A Car button is not visible");
        // System.out.println("✅ Buy A Car button is visible.");

        // WebElement needHelpCTA = driver.findElement(By.xpath(cr.valueOnTheKey("sellpage_needHelpButton")));
        // Assert.assertTrue(needHelpCTA.isDisplayed(), "Need Help CTA is not visible");
        // System.out.println("✅ Need Help CTA is visible.");
    }

    @And("user click on account icon")
    public void user_click_on_account_icon() {
        System.out.println("🔄 Clicking Account icon...");
        prm.click(driver, cr.valueOnTheKey("botnav_account"), "xpath");
        Wait.implicitWait(2, driver);
        prm.takeSceenshot(driver);

        WebElement AccountLoginModalContainer = driver.findElement(By.xpath(cr.valueOnTheKey("account_loginModalContainer")));
        Assert.assertTrue(AccountLoginModalContainer.isDisplayed(), "❌ Account Login Modal is not visible");
        System.out.println("✅ Account Login Modal is visible.");
    }
}
