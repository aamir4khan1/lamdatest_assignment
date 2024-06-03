
package StepDefinition;

import java.util.Optional;

//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v123.network.Network;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BaseSteps {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	//DevTools devTools = StepDefinition.Hooks.devTools;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@Given("user land on spinny website")
	public void user_land_on_spinny_website() throws Exception {
//		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//
//        // Add event listener to capture network requests
//        devTools.addListener(Network.requestWillBeSent(), request -> {
//            System.out.println("Request URL: " + request.getRequest().getUrl());
//            System.out.println("Request Method: " + request.getRequest().getMethod());
//        });
//
//        // Add event listener to capture network responses
//        devTools.addListener(Network.responseReceived(), response -> {
//            System.out.println("Response URL: " + response.getResponse().getUrl());
//            System.out.println("Response Status: " + response.getResponse().getStatus());
//            System.out.println("Response Status Text: " + response.getResponse().getStatusText());
//        });
		driver.get(cr.valueOnTheKey(System.getProperty("URL")));
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
		// driver.findElement(AndroidHomepageScreen.homepage_detectMyLocation).click();
		// // Detect my location click//
		Thread.sleep(6000);

	}

}
