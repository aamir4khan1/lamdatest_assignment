package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v134.network.Network;
import io.github.bonigarcia.wdm.WebDriverManager;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import java.util.Optional;

public class BaseSteps {
    static ConfigReader cr = new ConfigReader();
    WebDriver driver;
    DevTools devTools;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();

    public BaseSteps() {
        this.driver = Hooks.driver;  // Ensure driver is fetched from Hooks
        if (this.driver == null) {
            throw new IllegalStateException("❌ WebDriver is null. Check Hooks.java for initialization issues.");
        }
    }

    @Given("user land on spinny website")
    public void user_land_on_spinny_website() {
        System.out.println("🔄 Navigating to Spinny website...");
        String url = System.getProperty("URL") != null ? cr.valueOnTheKey(System.getProperty("URL")) : cr.valueOnTheKey("URL");
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("✅ Navigated to: " + url);

        // Setup DevTools for capturing network logs
        devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        devTools.addListener(Network.requestWillBeSent(), request -> {
            System.out.println("📡 Request URL: " + request.getRequest().getUrl());
        });

        devTools.addListener(Network.responseReceived(), response -> {
            System.out.println("📩 Response Status: " + response.getResponse().getStatus());
        });

        Wait.implicitWait(2, driver);
    }

    @When("^Wait for the application page to load completely$")
    public void wait_for_the_page_to_load_completely() {
        System.out.println("⏳ Waiting for page to fully load...");
        Wait.implicitWait(2, driver);
    }

    @And("user selects location")
    public void select_location() {
        System.out.println("📍 Selecting location...");
        prm.click(driver, cr.valueOnTheKey("homepage_selectManually"), "xpath");
        Wait.implicitWait(2, driver);
        prm.click(driver, cr.valueOnTheKey("homepage_DelhiNCR"), "xpath");
        System.out.println("✅ Location selected.");
    }
}
