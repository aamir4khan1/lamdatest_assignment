package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.Optional;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BaseSteps {
    static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver; // Access public static driver directly
    Wait wait = new Wait();
    static preMethods prm = new preMethods();

    @Given("user land on amazon website")
    public void user_land_on_spinny_website() throws Exception {
        driver.get(cr.valueOnTheKey(("URL")));
        driver.manage().window().maximize();
        Thread.sleep(3000);
        File src = driver.findElement(By.xpath("//div[@class='a-row a-text-center']")).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/screenshot/captcha.png";
        FileHandler.copy(src, new File(path));

        ITesseract image = new Tesseract();
        try {
            String imageText = image.doOCR(new File(path));
            System.out.println("Extracted Text: " + imageText);
        } catch (TesseractException e) {
            e.printStackTrace();
        }


        if (System.getProperty("URL") != null) {
            driver.get(cr.valueOnTheKey(System.getProperty("URL")));
        } else {
            driver.get(cr.valueOnTheKey("URL"));
        }
    }

    @When("^Wait for the application page to load completely$")
    public void wait_for_the_page_to_load_completely() {
        Wait.implicitWait(2, driver);
    }

    @And("user selects location")
    public void select_location() throws InterruptedException, IOException {
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("location"));
        prm.click(driver, cr.valueOnTheKey("location"), "xpath");
        wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("postal_code"));
        prm.click(driver, cr.valueOnTheKey("postal_code"), "xpath");
        Thread.sleep(2000);
        prm.sendTextToTextBox(driver, cr.valueOnTheKey("postal_code"), "xpath", "zipnumber");
        wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("apply"));
        prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
        wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("done"));
        prm.click(driver, cr.valueOnTheKey("done"), "xpath");
        
        
       
    }
}
