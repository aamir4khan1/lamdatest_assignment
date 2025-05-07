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

public class Hooks {
    public static WebDriver driver;
    static ConfigReader cr = new ConfigReader();

    // Getter to access driver in other classes
    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void beforeScenario() {
        // Always launch in desktop mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (driver != null) {
            try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

                String dirPath = System.getProperty("user.dir") + "/Screenshot/";
                File screenshotDir = new File(dirPath);
                if (!screenshotDir.exists()) {
                    screenshotDir.mkdir();
                }

                String status = scenario.isFailed() ? "Failed" : "Passed";
                String scenarioName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_");
                String fileName = dirPath + scenarioName + "_" + status + "_" + System.currentTimeMillis() + ".png";

                FileUtils.copyFile(screenshotFile, new File(fileName));
                scenario.attach(screenshotBytes, "image/png", status + " Screenshot");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                driver.quit();
            }
        }
    }
}
