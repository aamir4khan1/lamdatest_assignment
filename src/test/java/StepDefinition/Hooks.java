package StepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.core.api.Scenario;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utility.ConfigReader;
import Utility.ConfigReader.*;
import cucumber.api.java.After;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Hooks {
    static WebDriver driver;
    static ConfigReader cr = new ConfigReader();

    @Before
    public WebDriver beforeScenario() {

        WebDriverManager.chromedriver().setup(); // Ensure the correct ChromeDriver version

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage"); // Prevents Chrome crashes in Docker
        options.addArguments("--no-sandbox"); // Avoids sandboxing issues
        options.addArguments("--disable-extensions"); // Ensures stability

        // Use a unique user-data directory to avoid session conflicts
        options.addArguments("--user-data-dir=" + System.getProperty("java.io.tmpdir") + "/chrome-profile-" + System.currentTimeMillis());

        // Support headless mode if required
        if (Boolean.parseBoolean(System.getProperty("headless", "false"))) {
            options.addArguments("--headless=new");
        }

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        

        // Use WebDriverManager to setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        if (cr.valueOnTheKey("Env").equals("PROD")) {
            options.addArguments("--start-maximized"); // Maximize for PROD
            driver = new ChromeDriver(options);
        } else if (cr.valueOnTheKey("Mode").equals("Desktop")) {
            options.addArguments("--start-maximized"); // Maximize for Desktop mode
            driver = new ChromeDriver(options);
        } else {
            // Mobile Emulation Setup
            Map<String, String> mobileEmulation = new HashMap<>();
            mobileEmulation.put("deviceName", cr.valueOnTheKey("DeviceName"));
            options.setExperimentalOption("mobileEmulation", mobileEmulation);

            // Additional options for better performance
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-gpu");
            options.addArguments("--no-sandbox");

            driver = new ChromeDriver(options);
        }

        return driver;
    }

    @After
    public void afterScenario(Scenario scenario) {

        // Capture Screenshot for Failed Test Cases
        if (scenario.isFailed() || !scenario.isFailed()) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            try {
                FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/Screenshot/" + System.currentTimeMillis() + ".png"));
                scenario.embed(screenshot, "image/png");
            } catch (IOException e) {
                e.printStackTrace();
            }

        // Capture screenshot for failed test cases
        if (scenario.isFailed()) {
            takeScreenshot(scenario, "FailedTest");
        } else {
            takeScreenshot(scenario, "PassedTest");

        }
        driver.quit();}
    }


    private void takeScreenshot(Scenario scenario, String testStatus) {
        try {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/Screenshot/" + testStatus + "_" + System.currentTimeMillis() + ".png"));
            scenario.embed(screenshot, "image/png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static LocalDateTime getCurrentDateAndTime() {
        return LocalDateTime.now();
    }
}
