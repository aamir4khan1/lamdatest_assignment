package StepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utility.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Hooks {
    public static WebDriver driver;
    static ConfigReader cr = new ConfigReader();

    @Before
    public void beforeScenario() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage"); 
        options.addArguments("--no-sandbox"); 
        options.addArguments("--disable-extensions"); 
        options.addArguments("--user-data-dir=" + System.getProperty("java.io.tmpdir") + "/chrome-profile-" + System.currentTimeMillis());

        if (Boolean.parseBoolean(System.getProperty("headless", "false"))) {
            options.addArguments("--headless=new");
        }

        // Check if mobile emulation is needed
        if (!cr.valueOnTheKey("Mode").equalsIgnoreCase("Desktop")) {
            Map<String, String> mobileEmulation = new HashMap<>();
            mobileEmulation.put("deviceName", cr.valueOnTheKey("DeviceName"));
            options.setExperimentalOption("mobileEmulation", mobileEmulation);
        }

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    

    public static LocalDateTime getCurrentDateAndTime() {
        return LocalDateTime.now();
    }
}
