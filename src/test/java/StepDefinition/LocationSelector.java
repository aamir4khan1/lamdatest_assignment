package StepDefinition;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//package StepDefinition;
//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;

import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.java.en.And;
//import testselement.screens.android.AndroidHomepageScreen;

public class LocationSelector {
	static ConfigReader cr = new ConfigReader();
	WebDriver driver = StepDefinition.Hooks.driver;
	Wait wait = new Wait();
	static preMethods prm = new preMethods();

	@And("user selects Delhi NCR on Home page")
	public void user_selects_Delhi_NCR_on_Home_page() throws InterruptedException {

		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_DelhiNCR"), "xpath");
		Thread.sleep(2000);

	}
	
	
	@And("validate the city Delhi NCR on PLP")
	public void validate_the_city_Delhi_NCR_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorDelhiNCR = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorDelhiNCR")));
	    Assert.assertEquals(true, plp_citySelectorDelhiNCR.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinDelhiNCR = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinDelhiNCR")));
	            Assert.assertEquals(true, plp_usedCarsinDelhiNCR.isDisplayed());
	        } 
	        
	        else 
	        
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinDelhiNCR = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinDelhiNCR")));
	            Assert.assertEquals(true, plp_usedCarinDelhiNCR.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}

	
	
	
	/*@And("validate the city Delhi NCR on PLP")
	public void validate_the_city_Delhi_NCR_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorDelhiNCR = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorDelhiNCR")));
	    Assert.assertEquals(true, plp_citySelectorDelhiNCR.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	    	
		    WebElement plp_citySelectorAhmedabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorAhmedabad")));

	        WebElement headingElement = driver.findElement(By.xpath("//h1[@class='HeadingContent__heading HeadingContent__addPadding']"));
	        
	        // Check if the text contains "Used cars"
	        if 
	        
	        (headingElement.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinDelhiNCRElement = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinDelhiNCR")));
	            Assert.assertEquals(true, plp_usedCarsinDelhiNCRElement.isDisplayed());
	        } 
	        
	        else 
	        
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinDelhiNCRElement = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinDelhiNCR")));
	            Assert.assertEquals(true, plp_usedCarinDelhiNCRElement.isDisplayed());
	        }
	        
	    } 
	    
	    catch (NoSuchElementException e) 
	    
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	} */

	
	
	

	/*@And("validate the city Delhi NCR on PLP")
	public void validate_the_city_Delhi_NCR_on_PLP() throws InterruptedException {

		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement PLP_citySelectorDelhiNCR = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorDelhiNCR")));
		Assert.assertEquals(true, PLP_citySelectorDelhiNCR.isDisplayed());

		WebElement plp_usedCarInDelhiNCR = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInDelhiNCR")));
		Assert.assertEquals(true, plp_usedCarInDelhiNCR.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Bangalore")
	public void user_selects_Bangalore() throws InterruptedException {

		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Bangalore"), "xpath");
		Thread.sleep(2000);
	}
	
	
	
	@And("validate the city Bangalore on PLP")
	public void validate_the_city_Bangalore_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorBangalore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorBangalore")));
	    Assert.assertEquals(true, plp_citySelectorBangalore.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsInBangalore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinBangalore")));
	            Assert.assertEquals(true, plp_usedCarsInBangalore.isDisplayed());
	        } 
	        
	        else 
	        
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinBangalore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinBangalore")));
	            Assert.assertEquals(true, plp_usedCarinBangalore.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}

	

/*	@And("validate the city Bangalore on PLP")
	public void validate_the_city_Bangalore_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorBangalore = driver
				.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorBangalore")));
		Assert.assertEquals(true, plp_citySelectorBangalore.isDisplayed());

		WebElement plp_usedCarInBangalore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInBangalore")));
		Assert.assertEquals(true, plp_usedCarInBangalore.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Hyderabad")
	public void user_selects_Hyderabad() throws InterruptedException {

		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Hyderabad"), "xpath");
		Thread.sleep(2000);

	}
	
	
	@And("validate the city Hyderabad on PLP")
	public void validate_the_city_Hyderabad_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorHyderabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorHyderabad")));
	    Assert.assertEquals(true, plp_citySelectorHyderabad.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinHyderabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinHyderabad")));
	            Assert.assertEquals(true, plp_usedCarsinHyderabad.isDisplayed());
	        } 
	        
	        else 
	        
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinHyderabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinHyderabad")));
	            Assert.assertEquals(true, plp_usedCarinHyderabad.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}


	/*@And("validate the city Hyderabad on PLP")
	public void validate_the_city_Hyderabad_on_PLP() throws InterruptedException {

		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorHyderabad = driver
				.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorHyderabad")));
		Assert.assertEquals(true, plp_citySelectorHyderabad.isDisplayed());

		WebElement plp_usedCarInHyderabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInHyderabad")));
		Assert.assertEquals(true, plp_usedCarInHyderabad.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);
	}*/

//------------------------------------------------------------------------------------------

	@And("user selects Mumbai")
	public void user_selects_Mumbai() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Mumbai"), "xpath");
		Thread.sleep(2000);
	}
	
	
	@And("validate the city Mumbai on PLP")
	public void validate_the_city_Mumbai_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorMumbai = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorMumbai")));
	    Assert.assertEquals(true, plp_citySelectorMumbai.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinMumbai = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinMumbai")));
	            Assert.assertEquals(true, plp_usedCarsinMumbai.isDisplayed());
	        } 
	        
	        else 
	        
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinMumbai = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinMumbai")));
	            Assert.assertEquals(true, plp_usedCarinMumbai.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}


/*	@And("validate the city Mumbai on PLP")
	public void validate_the_city_Mumbai_on_PLP() throws InterruptedException {

		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorMumbai = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorMumbai")));
		Assert.assertEquals(true, plp_citySelectorMumbai.isDisplayed());

		WebElement plp_usedCarInMumbai = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInMumbai")));
		Assert.assertEquals(true, plp_usedCarInMumbai.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Pune")
	public void user_selects_Pune() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Pune"), "xpath");
		Thread.sleep(2000);
	}
	
	
	@And("validate the city Pune on PLP")
	public void validate_the_city_Pune_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorPune = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorPune")));
	    Assert.assertEquals(true, plp_citySelectorPune.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinPune = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinPune")));
	            Assert.assertEquals(true, plp_usedCarsinPune.isDisplayed());
	        } 
	        
	        else 
	        
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinPune = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinPune")));
	            Assert.assertEquals(true, plp_usedCarinPune.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}


	/*@And("validate the city Pune on PLP")
	public void validate_the_city_Pune_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorPune = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorPune")));
		Assert.assertEquals(true, plp_citySelectorPune.isDisplayed());

		WebElement plp_usedCarInPune = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInPune")));
		Assert.assertEquals(true, plp_usedCarInPune.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Delhi on Home page")
	public void user_selects_Delhi_on_Home_page() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Delhi"), "xpath");
		Thread.sleep(2000);

	}
	
	@And("validate the city Delhi on PLP")
	public void validate_the_city_Delhi_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorDelhi = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorDelhi")));
	    Assert.assertEquals(true, plp_citySelectorDelhi.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinDelhi = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinDelhi")));
	            Assert.assertEquals(true, plp_usedCarsinDelhi.isDisplayed());
	        } 
	        
	        else 
	        
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinDelhi = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinDelhi")));
	            Assert.assertEquals(true, plp_usedCarinDelhi.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}


	/*@And("validate the city Delhi on PLP")
	public void validate_the_city_Delhi_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorDelhi = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorDelhi")));
		Assert.assertEquals(true, plp_citySelectorDelhi.isDisplayed());

		WebElement plp_usedCarInDelhi = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInDelhi")));
		Assert.assertEquals(true, plp_usedCarInDelhi.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Gurgaon")
	public void user_selects_Gurgaon() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Gurgaon"), "xpath");
		Thread.sleep(2000);

	}
	

	@And("validate the city Gurgaon on PLP")
	public void validate_the_city_Gurgaon_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorGurgaon = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorGurgaon")));
	    Assert.assertEquals(true, plp_citySelectorGurgaon.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinGurgaon = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinGurgaon")));
	            Assert.assertEquals(true, plp_usedCarsinGurgaon.isDisplayed());
	        } 
	        
	        else 
	        
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinGurgaon = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinGurgaon")));
	            Assert.assertEquals(true, plp_usedCarinGurgaon.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}
	
	

/*	@And("validate the city Gurgaon on PLP")
	public void validate_the_city_Gurgaon_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorGurgaon = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorGurgaon")));
		Assert.assertEquals(true, plp_citySelectorGurgaon.isDisplayed());

		WebElement plp_usedCarInGurgaon = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInGurgaon")));
		Assert.assertEquals(true, plp_usedCarInGurgaon.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Noida")
	public void user_selects_Noida() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Noida"), "xpath");
		Thread.sleep(2000);

	}
	
	
	
	
	@And("validate the city Noida on PLP")
	public void validate_the_city_Noida_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorNoida = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorNoida")));
	    Assert.assertEquals(true, plp_citySelectorNoida.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinNoida = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinNoida")));
	            Assert.assertEquals(true, plp_usedCarsinNoida.isDisplayed());
	        } 
	        
	        else 
	        
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinNoida = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinNoida")));
	            Assert.assertEquals(true, plp_usedCarinNoida.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}
	

	/*@And("validate the city Noida on PLP")
	public void validate_the_city_Noida_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorNoida = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorNoida")));
		Assert.assertEquals(true, plp_citySelectorNoida.isDisplayed());

		WebElement plp_usedCarInNoida = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInNoida")));
		Assert.assertEquals(true, plp_usedCarInNoida.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Ahmedabad")
	public void user_selects_Ahmedabad() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Ahmedabad"), "xpath");
		Thread.sleep(2000);

	}
	
	
	@And("validate the city Ahmedabad on PLP")
	public void validate_the_city_Ahmedabad_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorAhmedabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorAhmedabad")));
	    Assert.assertEquals(true, plp_citySelectorAhmedabad.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinAhmedabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinAhmedabad")));
	            Assert.assertEquals(true, plp_usedCarsinAhmedabad.isDisplayed());
	        } 
	        else 
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinAhmedabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinAhmedabad")));
	            Assert.assertEquals(true, plp_usedCarinAhmedabad.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}

	
	
	
	
	/*@And("validate the city Ahmedabad on PLP")
	public void validate_the_city_Ahmedabad_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorAhmedabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorAhmedabad")));
	    Assert.assertEquals(true, plp_citySelectorAhmedabad.isDisplayed());

	    try {
	        // Check if the element for multiple cars exists
	        WebElement plp_usedCarsElement = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCars")));
	        Assert.assertEquals(true, plp_usedCarsElement.isDisplayed());
	    }
	    
	    catch (NoSuchElementException e) 
	    
	    {
	        // If the element for multiple cars is not found, assert the presence of "Used car" text
	        WebElement plp_usedCarElement = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCar")));
	        Assert.assertEquals(true, plp_usedCarElement.isDisplayed());
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}*/

	/*@And("validate the city Ahmedabad on PLP")
	public void validate_the_city_Ahmedabad_on_PLP() throws InterruptedException {
	prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");

	Thread.sleep(2000);

	WebElement plp_citySelectorAhmedabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorAhmedabad")));
	Assert.assertEquals(true, plp_citySelectorAhmedabad.isDisplayed());


	// Check if the element for multiple cars exists
	List<WebElement> multipleCarsElements = driver.findElements(By.xpath(cr.valueOnTheKey("plp_usedCarInAhmedabad")));

	if (multipleCarsElements.size() >= 0) {
	    // Assert the presence of "Used cars" text
	    WebElement plp_usedCarsElement = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCars")));
	    Assert.assertEquals(true, plp_usedCarsElement.isDisplayed());
	} 

	else
	{
	    // Assert the presence of "Used car" text
	    WebElement plp_usedCarElement = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCar")));
	    Assert.assertEquals(true, plp_usedCarElement.isDisplayed());
	}



	driver.navigate().back();
	Thread.sleep(1000); 
}*/


	/*@And("validate the city Ahmedabad on PLP")
	public void validate_the_city_Ahmedabad_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorAhmedabad = driver
				.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorAhmedabad")));
		Assert.assertEquals(true, plp_citySelectorAhmedabad.isDisplayed());

		WebElement plp_usedCarInAhmedabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInAhmedabad")));
		Assert.assertEquals(true, plp_usedCarInAhmedabad.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Chennai")
	public void user_selects_Chennai() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Chennai"), "xpath");
		Thread.sleep(2000);

	}

	@And("validate the city Chennai on PLP")
	public void validate_the_city_Chennai_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorChennai = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorChennai")));
	    Assert.assertEquals(true, plp_citySelectorChennai.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinChennai = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinChennai")));
	            Assert.assertEquals(true, plp_usedCarsinChennai.isDisplayed());
	        } 
	        else 
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinChennai = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinChennai")));
	            Assert.assertEquals(true, plp_usedCarinChennai.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}

	
	
	
	
	
	
	
/*	@And("validate the city Chennai on PLP")
	public void validate_the_city_Chennai_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorChennai = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorChennai")));
		Assert.assertEquals(true, plp_citySelectorChennai.isDisplayed());

		WebElement plp_usedCarInChennai = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInChennai")));
		Assert.assertEquals(true, plp_usedCarInChennai.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Kolkata")
	public void user_selects_Kolkata() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Kolkata"), "xpath");
		Thread.sleep(2000);

	}

	@And("validate the city Kolkata on PLP")
	public void validate_the_city_Kolkata_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorKolkata = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorKolkata")));
	    Assert.assertEquals(true, plp_citySelectorKolkata.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinKolkata = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinKolkata")));
	            Assert.assertEquals(true, plp_usedCarsinKolkata.isDisplayed());
	        } 
	        else 
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinKolkata = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinKolkata")));
	            Assert.assertEquals(true, plp_usedCarinKolkata.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}

	
	

	
	/*@And("validate the city Kolkata on PLP")
	public void validate_the_city_Kolkata_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorKolkata = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorKolkata")));
		Assert.assertEquals(true, plp_citySelectorKolkata.isDisplayed());

		WebElement plp_usedCarInKolkata = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInKolkata")));
		Assert.assertEquals(true, plp_usedCarInKolkata.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);
	}*/

	@And("user selects Lucknow")
	public void user_selects_Lucknow() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		prm.click(driver, cr.valueOnTheKey("homepage_Lucknow"), "xpath");
		Thread.sleep(2000);

	}
	
	
	@And("validate the city Lucknow on PLP")
	public void validate_the_city_Lucknow_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorLucknow = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorLucknow")));
	    Assert.assertEquals(true, plp_citySelectorLucknow.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinLucknow = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinLucknow")));
	            Assert.assertEquals(true, plp_usedCarsinLucknow.isDisplayed());
	        } 
	        else 
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinLucknow = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinLucknow")));
	            Assert.assertEquals(true, plp_usedCarinLucknow.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}

	
	


	/*@And("validate the city Lucknow on PLP")
	public void validate_the_city_Lucknow_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorLucknow = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorLucknow")));
		Assert.assertEquals(true, plp_citySelectorLucknow.isDisplayed());

		WebElement plp_usedCarInLucknow = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInLucknow")));
		Assert.assertEquals(true, plp_usedCarInLucknow.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Jaipur")
	public void user_selects_Jaipur() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");

		prm.click(driver, cr.valueOnTheKey("homepage_Jaipur"), "xpath");
		Thread.sleep(2000);

	}
	
	@And("validate the city Jaipur on PLP")
	public void validate_the_city_Jaipur_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorJaipur = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorJaipur")));
	    Assert.assertEquals(true, plp_citySelectorJaipur.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinJaipur = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinJaipur")));
	            Assert.assertEquals(true, plp_usedCarsinJaipur.isDisplayed());
	        } 
	        else 
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinJaipur = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinJaipur")));
	            Assert.assertEquals(true, plp_usedCarinJaipur.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}
	

/*	@And("validate the city Jaipur on PLP")
	public void validate_the_city_Jaipur_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorJaipur = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorJaipur")));
		Assert.assertEquals(true, plp_citySelectorJaipur.isDisplayed());

		WebElement plp_usedCarInJaipur = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInJaipur")));
		Assert.assertEquals(true, plp_usedCarInJaipur.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);
	}*/

	@And("user selects Chandigarh")
	public void user_selects_Chandigarh() throws InterruptedException {

		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(2000);

		prm.click(driver, cr.valueOnTheKey("homepage_Chandigarh"), "xpath");
		Thread.sleep(2000);

	}
	
	@And("validate the city Chandigarh on PLP")
	public void validate_the_city_Chandigarh_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorChandigarh = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorChandigarh")));
	    Assert.assertEquals(true, plp_citySelectorChandigarh.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinChandigarh = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinChandigarh")));
	            Assert.assertEquals(true, plp_usedCarsinChandigarh.isDisplayed());
	        } 
	        else 
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinChandigarh = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinChandigarh")));
	            Assert.assertEquals(true, plp_usedCarinChandigarh.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}
	
	

	/*@And("validate the city Chandigarh on PLP")
	public void validate_the_city_Chandigarh_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorChandigarh = driver
				.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorChandigarh")));
		Assert.assertEquals(true, plp_citySelectorChandigarh.isDisplayed());

		WebElement plp_usedCarInChandigarh = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInChandigarh")));
		Assert.assertEquals(true, plp_usedCarInChandigarh.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/
	
	
	@And("user selects Coimbatore")
	public void user_selects_Coimbatore() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,900)");

		prm.click(driver, cr.valueOnTheKey("homepage_Coimbatore"), "xpath");
		Thread.sleep(2000);
	}
	
	@And("validate the city Coimbatore on PLP")
	public void validate_the_city_Coimbatore_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorCoimbatore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorCoimbatore")));
	    Assert.assertEquals(true, plp_citySelectorCoimbatore.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinCoimbatore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinCoimbatore")));
	            Assert.assertEquals(true, plp_usedCarsinCoimbatore.isDisplayed());
	        } 
	        else 
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinCoimbatore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinCoimbatore")));
	            Assert.assertEquals(true, plp_usedCarinCoimbatore.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}
	

	
	/*

	@And("validate the city Coimbatore on PLP")
	public void validate_the_city_Coimbatore_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorCoimbatore = driver
				.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorCoimbatore")));
		Assert.assertEquals(true, plp_citySelectorCoimbatore.isDisplayed());

		WebElement plp_usedCarInCoimbatore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInCoimbatore")));
		Assert.assertEquals(true, plp_usedCarInCoimbatore.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Ghaziabad")
	public void user_selects_Ghaziabad() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,900)");

		prm.click(driver, cr.valueOnTheKey("homepage_Ghaziabad"), "xpath");
		Thread.sleep(2000);

	}
	
	@And("validate the city Ghaziabad on PLP")
	public void validate_the_city_Ghaziabad_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorGhaziabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorGhaziabad")));
	    Assert.assertEquals(true, plp_citySelectorGhaziabad.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinGhaziabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinGhaziabad")));
	            Assert.assertEquals(true, plp_usedCarsinGhaziabad.isDisplayed());
	        } 
	        else 
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinGhaziabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinGhaziabad")));
	            Assert.assertEquals(true, plp_usedCarinGhaziabad.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}
	


	

/*	@And("validate the city Ghaziabad on PLP")
	public void validate_the_city_Ghaziabad_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorGhaziabad = driver
				.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorGhaziabad")));
		Assert.assertEquals(true, plp_citySelectorGhaziabad.isDisplayed());

		WebElement plp_usedCarInGhaziabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInGhaziabad")));
		Assert.assertEquals(true, plp_usedCarInGhaziabad.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/

	@And("user selects Indore")
	public void user_selects_Indore() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,900)");

		prm.click(driver, cr.valueOnTheKey("homepage_Indore"), "xpath");
		Thread.sleep(2000);

	}
	
	@And("validate the city Indore on PLP")
	public void validate_the_city_Indore_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorIndore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorIndore")));
	    Assert.assertEquals(true, plp_citySelectorIndore.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinIndore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinIndore")));
	            Assert.assertEquals(true, plp_usedCarsinIndore.isDisplayed());
	        } 
	        else 
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinIndore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinIndore")));
	            Assert.assertEquals(true, plp_usedCarinIndore.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}
	


	/*
	@And("validate the city Indore on PLP")
	public void validate_the_city_Indore_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		WebElement plp_citySelectorIndore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorIndore")));
		Assert.assertEquals(true, plp_citySelectorIndore.isDisplayed());

		WebElement plp_usedCarInIndore = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInIndore")));
		Assert.assertEquals(true, plp_usedCarInIndore.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/


   @And ("user selects Kochi")
   	public void user_selects_Kochi() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		prm.click(driver, cr.valueOnTheKey("homepage_Kochi"), "xpath");
		Thread.sleep(2000);
	}
   
   
   @And("validate the city Kochi on PLP")
	public void validate_the_city_Kochi_on_PLP() throws InterruptedException {
	    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
	    Thread.sleep(2000);

	    WebElement plp_citySelectorKochi = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorKochi")));
	    Assert.assertEquals(true, plp_citySelectorKochi.isDisplayed());

	    try {
	        // Find the element with the class "HeadingContent__heading"
	        WebElement plp_H1tag = driver.findElement(By.xpath(cr.valueOnTheKey("plp_H1tag")));
	        
	        // Check if the text contains "Used cars"
	        if (plp_H1tag.getText().contains("Used cars"))
	        {
	            // Assert the presence of "Used cars" text
	            WebElement plp_usedCarsinKochi = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarsinKochi")));
	            Assert.assertEquals(true, plp_usedCarsinKochi.isDisplayed());
	        } 
	        else 
	        {
	            // Assert the presence of "Used car" text
	            WebElement plp_usedCarinKochi = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarinKochi")));
	            Assert.assertEquals(true, plp_usedCarinKochi.isDisplayed());
	        }
	    } 
	    
	    catch (NoSuchElementException e) 
	    {
	        // Handle the case if the heading element is not found
	        e.printStackTrace();
	        Assert.fail("Heading element not found");
	    }

	    driver.navigate().back();
	    Thread.sleep(1000);
	}


}

/*@And("validate the city Kochi on PLP")
	public void validate_the_city_Kochi_on_PLP() throws InterruptedException {
		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
		Thread.sleep(2000);
		
		WebElement plp_citySelectorKochi = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorKochi")));
		Assert.assertEquals(true, plp_citySelectorKochi.isDisplayed());

		WebElement plp_usedCarInKochi = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInKochi")));
		Assert.assertEquals(true, plp_usedCarInKochi.isDisplayed());

		driver.navigate().back();
		Thread.sleep(1000);

	}*/




	/*@And("validate the city kochi on PLP")
	public void validate_the_city_kochi_on_PLP() throws InterruptedException {
    prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
    
    Thread.sleep(2000);

    WebElement plp_citySelectorAhmedabad = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorKochi")));
    Assert.assertEquals(true, plp_citySelectorAhmedabad.isDisplayed());
    
    
    // Check if the element for multiple cars exists
    List<WebElement> multipleCarsElements = driver.findElements(By.xpath(cr.valueOnTheKey("plp_usedCarInKochi")));
    
    if (multipleCarsElements.size() >= 0) {
        // Assert the presence of "Used cars" text
        WebElement plp_usedCarsElement = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCars")));
        Assert.assertEquals(true, plp_usedCarsElement.isDisplayed());
    } 
    
    else
    {
        // Assert the presence of "Used car" text
        WebElement plp_usedCarElement = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCar")));
        Assert.assertEquals(true, plp_usedCarElement.isDisplayed());
    }

  

    driver.navigate().back();
    Thread.sleep(1000);
}
	}


//	@And("user selects Surat")
//	public void user_selects_Surat() throws InterruptedException {
//		prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
//		Thread.sleep(1000);
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scroll(0,1000)");
//		prm.click(driver, cr.valueOnTheKey("homepage_Surat"), "xpath");
//		Thread.sleep(2000);
//
//	}
//
//	@And("validate the city Surat on PLP")
//	public void validate_the_city_Surat_on_PLP() throws InterruptedException {
//		prm.click(driver, cr.valueOnTheKey("homepage_buyButton"), "xpath");
//		Thread.sleep(2000);
//		WebElement plp_citySelectorSurat = driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelectorSurat")));
//		Assert.assertEquals(true, plp_citySelectorSurat.isDisplayed());
//
//		WebElement plp_usedCarInSurat = driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarInSurat")));
//		Assert.assertEquals(true, plp_usedCarInSurat.isDisplayed());
//
//		driver.navigate().back();
//		Thread.sleep(1000);
//
//	}
//}

	/*@And("user selects {city} on Home page")public void*

	user_selects_city_on_Home_page(String city) throws InterruptedException {
 * prm.click(driver, cr.valueOnTheKey("homepage_citySelector"), "xpath");
 * prm.click(driver, cr.valueOnTheKey("homepage_" + city), "xpath");
 * Thread.sleep(2000); }**

	@And("validate the city on PLP") public void validate_the_city_on_PLP(String
 * city) throws InterruptedException { prm.click(driver,
 * cr.valueOnTheKey("homepage_buyButton"), "xpath"); Thread.sleep(2000);
 * WebElement plp_citySelector =
 * driver.findElement(By.xpath(cr.valueOnTheKey("plp_citySelector" + city)));
 * Assert.assertEquals(true, plp_citySelector.isDisplayed());
 * 
 * WebElement plp_usedCar =
 * driver.findElement(By.xpath(cr.valueOnTheKey("plp_usedCarIn" + city)));
 * Assert.assertEquals(true, plp_usedCar.isDisplayed());
 * 
 * driver.navigate().back(); Thread.sleep(1000);
 * 
 * driver.navigate().back(); Thread.sleep(1000); }**

	@And("user performs actions for multiple cities") public void
 * user_performs_actions_for_multiple_cities() throws InterruptedException {
 * String[] cities = { "Bangalore", "Hyderabad", "DelhiNCR", add more cities as
 * needed... };
 * 
 * for (String city : cities) { user_selects_city_on_Home_page(city);
 * validate_the_city_on_PLP(city); }
 */
