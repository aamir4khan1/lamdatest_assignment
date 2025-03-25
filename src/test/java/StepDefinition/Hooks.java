package StepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Utility.ConfigReader;
import cucumber.api.Scenario;

import java.util.HashMap;
import java.util.Map;

public class Hooks {
    public static WebDriver driver;
    static ConfigReader cr = new ConfigReader();

    @Before
    public void beforeScenario() {
        if (driver == null) {  // Ensuring driver is initialized only once
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-dev-shm-usage", "--no-sandbox", "--disable-extensions");

            if (Boolean.parseBoolean(System.getProperty("headless", "false"))) {
                options.addArguments("--headless=new");
            }

            if (cr.valueOnTheKey("Env").equals("PROD") || cr.valueOnTheKey("Mode").equals("Desktop")) {
                options.addArguments("--start-maximized");
            } else {
                Map<String, String> mobileEmulation = new HashMap<>();
                mobileEmulation.put("deviceName", cr.valueOnTheKey("DeviceName"));
                options.setExperimentalOption("mobileEmulation", mobileEmulation);
            }

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            System.out.println("✅ WebDriver initialized successfully.");
        }
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (driver != null) {
            driver.quit();
            System.out.println("✅ WebDriver closed successfully.");
            driver = null;  // Reset driver for the next scenario
        }
    }
}
