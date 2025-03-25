package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utility.ConfigReader;

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
        ChromeOptions options = new ChromeOptions();

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
        // Capture screenshot for failed test cases
        if (scenario.isFailed()) {
            takeScreenshot(scenario, "FailedTest");
        } else {
            takeScreenshot(scenario, "PassedTest");
        }
        driver.quit();
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
