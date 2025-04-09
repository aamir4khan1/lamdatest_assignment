package StepDefinition;

import org.apache.commons.io.FileUtils;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utility.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Hooks {
    public static WebDriver driver;
    static ConfigReader cr = new ConfigReader();

    // Getter to access driver in other classes
    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void beforeScenario() {  // Changed return type to void
        String env = cr.valueOnTheKey("Env");
        String mode = cr.valueOnTheKey("Mode");

        if ("PROD".equalsIgnoreCase(env)) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        } else if ("Desktop".equalsIgnoreCase(mode)) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else {
            Map<String, String> mobileEmulation = new HashMap<>();
            mobileEmulation.put("deviceName", cr.valueOnTheKey("DeviceName"));

            ChromeOptions chromeOptions = new ChromeOptions();
            //chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--disable-dev-shm-usage");
            chromeOptions.addArguments("--ignore-certificate-errors");
            chromeOptions.addArguments("--disable-extensions");
            chromeOptions.addArguments("--disable-gpu");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

            driver = new ChromeDriver(chromeOptions);
        }
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (driver != null) {
            try {
                // Capture screenshot
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

                // Prepare folder and filename
                String dirPath = System.getProperty("user.dir") + "/Screenshot/";
                File screenshotDir = new File(dirPath);
                if (!screenshotDir.exists()) {
                    screenshotDir.mkdir();
                }

                String status = scenario.isFailed() ? "Failed" : "Passed";
                String scenarioName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_");
                String fileName = dirPath + scenarioName + "_" + status + "_" + System.currentTimeMillis() + ".png";

                // Save screenshot to file system
                FileUtils.copyFile(screenshotFile, new File(fileName));

                // Attach screenshot to report
                scenario.attach(screenshotBytes, "image/png", status + " Screenshot");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                driver.quit(); // Ensures clean shutdown
            }
        }
    }
}