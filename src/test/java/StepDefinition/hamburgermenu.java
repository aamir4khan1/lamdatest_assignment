package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class hamburgermenu {
	static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
	
	public void user_land_on_spinny_website() throws Exception {
		
	        driver.get(cr.valueOnTheKey("URL"));
			/*
			 * }
			 * 
			 * 
			 * 
			 * 
			 * @And("user clicks on the browse car button") public void
			 * userClicksOnBrowseCarButton() throws InterruptedException{
			 * Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scroll(0,800)"); prm.click(driver,
			 * cr.valueOnTheKey("homepage_browseCars"), "xpath"); Thread.sleep(2000);
			 */       
    }

    @And("user click on the on the hamburger menu")
    public void user_click_on_the_on_the_hamburger_menu() throws InterruptedException{
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
        
    }

    @And("user clicks on buy spinny assured")
    public void user_clicks_on_buy_spinny_assured() throws InterruptedException{
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("buy_spinny_car"), "xpath");
		Thread.sleep(2000);
		WebElement plp_land = driver.findElement(By.xpath(cr.valueOnTheKey("plp_land")));
		Assert.assertEquals(true, plp_land.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
       
    }

    @And("user clicks on buy spinny max")
    public void user_clicks_on_buy_spinny_max() throws InterruptedException{
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("buy_max_car"), "xpath");
		Thread.sleep(2000);
		WebElement max_plp_land = driver.findElement(By.xpath(cr.valueOnTheKey("max_plp_land")));
		Assert.assertEquals(true, max_plp_land.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
       
    }
    
    	
	@And("user clicks on your shortlisted cars")
    public void user_clicks_on_your_shortlisted_cars()throws InterruptedException {
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("shortlist_menu"), "xpath");
		Thread.sleep(2000);
		WebElement shortlist_page = driver.findElement(By.xpath(cr.valueOnTheKey("shortlist_page")));
		Assert.assertEquals(true, shortlist_page.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
   	
    }

	@And("user clicks on sell your car")
    public void user_clicks_on_sell_your_car()throws InterruptedException {
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("sell_your_car"), "xpath");
		Thread.sleep(2000);
		WebElement sell_page = driver.findElement(By.xpath(cr.valueOnTheKey("sell_page")));
		Assert.assertEquals(true, sell_page.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
	    
    }

	@And("user clicks on finance your car")
    public void user_clicks_on_finance_your_car()throws InterruptedException {
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("finance_your_car"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("check_your_eligibility"), "xpath");
		Thread.sleep(2000);
		WebElement loan_page_1 = driver.findElement(By.xpath(cr.valueOnTheKey("loan_page_1")));
		Assert.assertEquals(true, loan_page_1.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("know_your_emi"), "xpath");
		Thread.sleep(2000);
		WebElement loan_page_2 = driver.findElement(By.xpath(cr.valueOnTheKey("loan_page_2")));
		Assert.assertEquals(true, loan_page_2.isDisplayed());
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(750,0)");}
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("spinny_finance_process"), "xpath");
		Thread.sleep(2000);
		WebElement loan_page_3 = driver.findElement(By.xpath(cr.valueOnTheKey("loan_page_3")));
		Assert.assertEquals(true, loan_page_3.isDisplayed());
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(750,0)");}
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("finance_your_car"), "xpath");
		
	    }

	@And("clicks on spinny care")
    public void clicks_on_spinny_care()throws InterruptedException {
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("spinny_care"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("get_your_quote"), "xpath");
		Thread.sleep(2000);
		WebElement get_your_quote_page = driver.findElement(By.xpath(cr.valueOnTheKey("get_your_quote_page")));
		Assert.assertEquals(true, get_your_quote_page.isDisplayed());
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(750,0)");}
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("how_spinny_care_works"), "xpath");
		Thread.sleep(2000);
		WebElement how_spinny_care_works_page = driver.findElement(By.xpath(cr.valueOnTheKey("how_spinny_care_works_page")));
		Assert.assertEquals(true, how_spinny_care_works_page.isDisplayed());
		Thread.sleep(2000);
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(750,0)");}
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("spinny_care"), "xpath");
			    }

	@And("user clicks on how it works")
    public void user_clicks_on_how_it_works()throws InterruptedException {
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("how_it_works"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("car_buying_process"), "xpath");
		Thread.sleep(2000);
		WebElement car_buying_process_page = driver.findElement(By.xpath(cr.valueOnTheKey("car_buying_process_page")));
		Assert.assertEquals(true, car_buying_process_page.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("car_selling_process"), "xpath");
		Thread.sleep(2000);
		WebElement car_selling_process_page = driver.findElement(By.xpath(cr.valueOnTheKey("car_selling_process_page")));
		Assert.assertEquals(true, car_selling_process_page.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("pricing"), "xpath");
		Thread.sleep(2000);
		WebElement pricing_page = driver.findElement(By.xpath(cr.valueOnTheKey("pricing_page")));
		Assert.assertEquals(true, pricing_page.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("how_it_works"), "xpath");
	}

    @And("user clicks on your account")
    public void user_clicks_on_your_account() throws InterruptedException{
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("your_account"), "xpath");
		Thread.sleep(2000);
		WebElement login_screen = driver.findElement(By.xpath(cr.valueOnTheKey("login_screen")));
		Assert.assertEquals(true, login_screen.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
    }
    @And("user clicks on car hub locations")
    public void user_clicks_on_car_hub_locations() throws InterruptedException{
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("car_hub_locations"), "xpath");
		Thread.sleep(2000);
		WebElement car_hub_locations_page = driver.findElement(By.xpath(cr.valueOnTheKey("car_hub_locations_page")));
		Assert.assertEquals(true, car_hub_locations_page.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    }
    @And("user clicks on spinny assured")
    public void user_clicks_on_spinny_assured() throws InterruptedException{
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	Thread.sleep(2000);
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("spinny_assured_1"), "xpath");
		Thread.sleep(2000);
		WebElement spinny_assured_page_1 = driver.findElement(By.xpath(cr.valueOnTheKey("spinny_assured_page_1")));
		Assert.assertEquals(true, spinny_assured_page_1.isDisplayed());
		Thread.sleep(2000);
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
    }
    	@And("user clicks on spinny buyback")
        public void user_clicks_on_spinny_buyback() throws InterruptedException{
        	Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
        	Thread.sleep(2000);
    		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
    		Assert.assertEquals(true, open_menu.isDisplayed());
    		Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("spinny_buyback"), "xpath");
    		Thread.sleep(2000);
    		WebElement spinny_buyback_page = driver.findElement(By.xpath(cr.valueOnTheKey("spinny_buyback_page")));
    		Assert.assertEquals(true, spinny_buyback_page.isDisplayed());
    		Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
    		

    	}
    	@And("user clicks on spinny exchange")
        public void user_clicks_on_spinny_exchange() throws InterruptedException{
        	Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
        	Thread.sleep(2000);
    		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
    		Assert.assertEquals(true, open_menu.isDisplayed());
    		Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("spinny_exchange"), "xpath");
    		Thread.sleep(2000);
    		WebElement spinny_exchange_page = driver.findElement(By.xpath(cr.valueOnTheKey("spinny_exchange_page")));
    		Assert.assertEquals(true, spinny_exchange_page.isDisplayed());
    		Thread.sleep(2000);
    		{JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scroll(0,3200)");}
    		Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("sell_button"), "xpath");
    		Thread.sleep(2000);	
    		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
    		
    	}
    	@And("user clicks on spinny partners")
        public void user_clicks_on_spinny_partners() throws InterruptedException{
        	Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
        	Thread.sleep(2000);
    		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
    		Assert.assertEquals(true, open_menu.isDisplayed());
    		Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("spinny_partners"), "xpath");
    		Thread.sleep(2000);
    		WebElement spinny_partners_page = driver.findElement(By.xpath(cr.valueOnTheKey("spinny_partners_page")));
    		Assert.assertEquals(true, spinny_partners_page.isDisplayed());
    		Thread.sleep(2000);
    		{JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scroll(0,10000)");}
    		Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("footer"), "xpath");
    		Thread.sleep(2000);	
    		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
    		Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	}
    	@And("user clicks on About us")
        public void user_clicks_on_About_us() throws InterruptedException{
        	Thread.sleep(2000);
        	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
        	Thread.sleep(2000);
    		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
    		Assert.assertEquals(true, open_menu.isDisplayed());
    		Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("about_us"), "xpath");
    		Thread.sleep(2000);
    		WebElement about_us_page = driver.findElement(By.xpath(cr.valueOnTheKey("about_us_page")));
    		Assert.assertEquals(true, about_us_page.isDisplayed());
    		Thread.sleep(2000);
    		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
    
    	}

@And("user clicks on customer reviews")
public void user_clicks_on_customer_reviews() throws InterruptedException{
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
	Thread.sleep(2000);
	WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
	Assert.assertEquals(true, open_menu.isDisplayed());
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("customer_reviews"), "xpath");
	Thread.sleep(2000);
	WebElement customer_reviews_page = driver.findElement(By.xpath(cr.valueOnTheKey("customer_reviews_page")));
	Assert.assertEquals(true, customer_reviews_page.isDisplayed());
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
}

@And("user clicks on check echallan")
public void user_clicks_on_check_echallan() throws InterruptedException{
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
	Thread.sleep(2000);
	WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
	Assert.assertEquals(true, open_menu.isDisplayed());
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("check_echallan"), "xpath");
	Thread.sleep(2000);
	WebElement check_echallan_page = driver.findElement(By.xpath(cr.valueOnTheKey("check_echallan_page")));
	Assert.assertEquals(true, check_echallan_page.isDisplayed());
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
}
@And("user clicks on check rto details")
public void user_clicks_on_check_rto_details() throws InterruptedException{
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
	Thread.sleep(2000);
	WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
	Assert.assertEquals(true, open_menu.isDisplayed());
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("check_rto_details"), "xpath");
	Thread.sleep(2000);
	WebElement check_rto_details_page = driver.findElement(By.xpath(cr.valueOnTheKey("check_rto_details_page")));
	Assert.assertEquals(true, check_rto_details_page.isDisplayed());
	Thread.sleep(2000);
	prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");



    }
}





