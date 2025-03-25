package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.core.api.Scenario;
//import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v134.network.Network;

import Utility.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Hooks {
	static WebDriver driver;
	//static DevTools devTools;
	static ConfigReader cr = new ConfigReader();

	@Before
	public WebDriver beforeScenario() {
		if (cr.valueOnTheKey("Env").equals("PROD")) {
			// WebDriverManager.chromedriver().setup();
			//WebDriverManager.chromedriver().clearDriverCache().setup();
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			return driver;
		} else if (cr.valueOnTheKey("Mode").equals("Desktop")) {
			// WebDriverManager.chromedriver ().clearDriverCache ().setup ();
			// WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}



		else {
		//	WebDriverManager.chromedriver().clearDriverCache().setup();
			// WebDriverManager.chromedriver().setup();
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
			//devTools = ((HasDevTools) driver).getDevTools();
	       // devTools.createSession();
//	        
			return driver;
		}
	}

	@After
	public void afterScenario(Scenario scenario) {
		// Capture ScreenShot for the failed test cases.
		if (scenario.isFailed()) {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			try {
				FileUtils.copyFile(file, new File(
						System.getProperty("user.dir") + "/Screenshot/" + System.currentTimeMillis() + ".png"));
				scenario.embed(screenshot, "image/png");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Capture ScreenShot for non-failed test cases.
		if (!scenario.isFailed()) {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			try {
				FileUtils.copyFile(file, new File(
						System.getProperty("user.dir") + "/Screenshot/" + System.currentTimeMillis() + ".png"));
				scenario.embed(screenshot, "image/png");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		driver.close();
	}

	public static LocalDateTime getCurrentDateAndTime() {
		LocalDateTime now = LocalDateTime.now();
		return now;
	}
}