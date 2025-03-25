package StepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.core.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.*;
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
        }
        driver.quit();
    }

    public static LocalDateTime getCurrentDateAndTime() {
        return LocalDateTime.now();
    }
}
