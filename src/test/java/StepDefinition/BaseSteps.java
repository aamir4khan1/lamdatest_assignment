package StepDefinition;


import org.openqa.selenium.WebDriver;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v134.network.Network;

import io.github.bonigarcia.wdm.WebDriverManager;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BaseSteps {
    static ConfigReader cr = new ConfigReader();

    WebDriver driver = StepDefinition.Hooks.driver;

    
    DevTools devTools;

    Wait wait = new Wait();
    static preMethods prm = new preMethods();

    @Given("user land on spinny website")
    public void user_land_on_spinny_website() throws Exception {

        driver.get(cr.valueOnTheKey(("URL")));
        driver.manage().window().maximize();

        if (System.getProperty("URL") != null) {
            driver.get(cr.valueOnTheKey(System.getProperty("URL")));
        } else {
            driver.get(cr.valueOnTheKey("URL"));
        }

        // Use WebDriverManager to manage ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        // Initialize DevTools
        devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        // Capture Network Requests
        devTools.addListener(Network.requestWillBeSent(), request -> {
            System.out.println("Request URL: " + request.getRequest().getUrl());
            System.out.println("Request Method: " + request.getRequest().getMethod());
            System.out.println("Request Headers: " + request.getRequest().getHeaders().toString());
            System.out.println("Request Body: " + request.getRequest().getPostData().orElse("No Body"));
        });

        // Capture Network Responses
        devTools.addListener(Network.responseReceived(), response -> {
            System.out.println("Response URL: " + response.getResponse().getUrl());
            System.out.println("Response Status: " + response.getResponse().getStatus());
            System.out.println("Response Status Text: " + response.getResponse().getStatusText());
        });

        // Open the URL
        String url = System.getProperty("URL") != null ? cr.valueOnTheKey(System.getProperty("URL")) : cr.valueOnTheKey("URL");
        driver.get(url);
        driver.manage().window().maximize();

    }

    @When("^Wait for the application page to load completely$")
    public void wait_for_the_page_to_load_completely() {
        Wait.implicitWait(2, driver);
    }

    @And("user selects location")
    public void select_location() throws InterruptedException {
        prm.click(driver, cr.valueOnTheKey("homepage_selectManually"), "xpath");
        Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("homepage_DelhiNCR"), "xpath");
        Thread.sleep(2000);
    }
}
