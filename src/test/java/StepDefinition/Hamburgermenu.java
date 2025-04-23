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

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class Hamburgermenu {
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
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));

		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		

		prm.click(driver, cr.valueOnTheKey("open_menu"), "xpath");
		
		Thread.sleep(3000);

		WebElement login_screen_screen = driver.findElement(By.xpath(cr.valueOnTheKey("login_screen_screen")));
		Assert.assertEquals(true, login_screen_screen.isDisplayed());
		
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("back_1"));
		prm.click(driver, cr.valueOnTheKey("back_1"), "xpath");
		
		
        
    }

    @And("user clicks on buy spinny assured")
    public void user_clicks_on_buy_spinny_assured() throws InterruptedException{
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));

    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("buy_spinny_car"));
		prm.clickByJavaScript(driver, cr.valueOnTheKey("buy_spinny_car"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("delhi_ncr_seo_link"));
		prm.click(driver, cr.valueOnTheKey("delhi_ncr_seo_link"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("plp_land"));
		WebElement plp_land = driver.findElement(By.xpath(cr.valueOnTheKey("plp_land")));
		Assert.assertEquals(true, plp_land.isDisplayed());
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
       
    }

    @And("user clicks on buy spinny max")
    public void user_clicks_on_buy_spinny_max() throws InterruptedException{
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("buy_max_car"));
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('sideMenu').scroll(0,300)");}
		prm.click(driver, cr.valueOnTheKey("buy_max_car"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("max_plp_land"));
		WebElement max_plp_land = driver.findElement(By.xpath(cr.valueOnTheKey("max_plp_land")));
		Assert.assertEquals(true, max_plp_land.isDisplayed());
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
       
    }
    
    	
	@And("user clicks on your shortlisted cars")
    public void user_clicks_on_your_shortlisted_cars()throws InterruptedException {
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));

		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		
		WebElement Shortlist_Menu = driver.findElement(By.xpath(cr.valueOnTheKey("shortlist_menu")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Shortlist_Menu);
		
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("shortlist_menu"));
		prm.click(driver, cr.valueOnTheKey("shortlist_menu"), "xpath");
		
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("shortlist_page"));
		WebElement shortlist_page = driver.findElement(By.xpath(cr.valueOnTheKey("shortlist_page")));
		Assert.assertEquals(true, shortlist_page.isDisplayed());
		
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
   	
    }

	@And("user clicks on sell your car")
    public void user_clicks_on_sell_your_car()throws InterruptedException {
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		
		WebElement Sell_Your_Car= driver.findElement(By.xpath(cr.valueOnTheKey("sell_your_car")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Sell_Your_Car );
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("sell_your_car"));
		prm.click(driver, cr.valueOnTheKey("sell_your_car"), "xpath");
		
		prm.click(driver, cr.valueOnTheKey("sell_link"), "xpath");
		
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("sell_page"));
		WebElement sell_page = driver.findElement(By.xpath(cr.valueOnTheKey("sell_page")));
		Assert.assertEquals(true, sell_page.isDisplayed());
		
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
		//WebElement Sell_Your_Car= driver.findElement(By.xpath(cr.valueOnTheKey("sell_your_car")));
		
	    
    }

	@And("user clicks on finance your car")
    public void user_clicks_on_finance_your_car()throws InterruptedException {
		
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		

		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sideMenu').scroll(0,350)");}
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("finance_your_car"));
		prm.clickByJavaScript(driver, cr.valueOnTheKey("finance_your_car"), "xpath");
		
		
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("check_your_eligibility"));
		prm.clickByJavaScript(driver, cr.valueOnTheKey("check_your_eligibility"), "xpath");
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("loan_page_1"));
		WebElement loan_page_1 = driver.findElement(By.xpath(cr.valueOnTheKey("loan_page_1")));
		Assert.assertEquals(true, loan_page_1.isDisplayed());
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	
    	{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sideMenu').scroll(0,350)");}
    
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("know_your_emi"));
	
		prm.click(driver, cr.valueOnTheKey("know_your_emi"), "xpath");
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("loan_page_2"));
		WebElement loan_page_2 = driver.findElement(By.xpath(cr.valueOnTheKey("loan_page_2")));
		Assert.assertEquals(true, loan_page_2.isDisplayed());
		driver.navigate().back();
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sideMenu').scroll(0,350)");}
    	
    	
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("spinny_finance_process"));
    	
		
		prm.clickByJavaScript(driver, cr.valueOnTheKey("spinny_finance_process"), "xpath");
		Thread.sleep(2000);
		WebElement loan_page_3 = driver.findElement(By.xpath(cr.valueOnTheKey("loan_page_3")));
		Assert.assertEquals(true, loan_page_3.isDisplayed());
		
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	
		
	    }

	@And("clicks on spinny care")
    public void clicks_on_spinny_care()throws InterruptedException {
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("spinny_care"));

		prm.click(driver, cr.valueOnTheKey("spinny_care"), "xpath");
		
    	Thread.sleep(2000);
		WebElement care_page = driver.findElement(By.xpath(cr.valueOnTheKey("care_page")));
		Assert.assertEquals(true, care_page.isDisplayed());
		
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
					    }

	@And("user clicks on how it works")
    public void user_clicks_on_how_it_works()throws InterruptedException {
    	
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sideMenu').scroll(0,400)");}
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("how_it_works"));
		prm.clickByJavaScript(driver, cr.valueOnTheKey("how_it_works"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("car_buying_process"));
		prm.click(driver, cr.valueOnTheKey("car_buying_process"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("car_buying_process_page"));
		WebElement car_buying_process_page = driver.findElement(By.xpath(cr.valueOnTheKey("car_buying_process_page")));
		Assert.assertEquals(true, car_buying_process_page.isDisplayed());
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
		
		JavascriptExecutor jq = (JavascriptExecutor) driver;
		jq.executeScript("document.getElementById('sideMenu').scroll(0,400)");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("car_selling_process"));
		prm.click(driver, cr.valueOnTheKey("car_selling_process"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("car_selling_process_page"));
		WebElement car_selling_process_page = driver.findElement(By.xpath(cr.valueOnTheKey("car_selling_process_page")));
		Assert.assertEquals(true, car_selling_process_page.isDisplayed());
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	
    	JavascriptExecutor jl = (JavascriptExecutor) driver;
		jl.executeScript("document.getElementById('sideMenu').scroll(0,400)");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("pricing"));
		prm.click(driver, cr.valueOnTheKey("pricing"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("pricing_page"));
		WebElement pricing_page = driver.findElement(By.xpath(cr.valueOnTheKey("pricing_page")));
		Assert.assertEquals(true, pricing_page.isDisplayed());
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	
		{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sideMenu').scroll(0,400)");}
		
		prm.clickByJavaScript(driver, cr.valueOnTheKey("how_it_works"), "xpath");
	}

    @And("user clicks on your account")
    public void user_clicks_on_your_account() throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sideMenu').scroll(0,500)");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("your_account"));
		prm.clickByJavaScript(driver, cr.valueOnTheKey("your_account"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("login_screen"));
		WebElement login_screen = driver.findElement(By.xpath(cr.valueOnTheKey("login_screen")));
		Assert.assertEquals(true, login_screen.isDisplayed());
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
    }
    @And("user clicks on car hub locations")
    public void user_clicks_on_car_hub_locations() throws InterruptedException{
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sideMenu').scroll(0,500)");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("car_hub_locations"));
		prm.clickByJavaScript(driver, cr.valueOnTheKey("car_hub_locations"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("car_hub_locations_page"));
		WebElement car_hub_locations_page = driver.findElement(By.xpath(cr.valueOnTheKey("car_hub_locations_page")));
		Assert.assertEquals(true, car_hub_locations_page.isDisplayed());
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
    }
    @And("user clicks on spinny assured")
    public void user_clicks_on_spinny_assured() throws InterruptedException{
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
		Assert.assertEquals(true, open_menu.isDisplayed());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sideMenu').scroll(0,500)");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("spinny_assured_1"));
		prm.clickByJavaScript(driver, cr.valueOnTheKey("spinny_assured_1"), "xpath");
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("spinny_assured_page_1"));
		WebElement spinny_assured_page_1 = driver.findElement(By.xpath(cr.valueOnTheKey("spinny_assured_page_1")));
		Assert.assertEquals(true, spinny_assured_page_1.isDisplayed());
		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
		prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
		
    }
    	@And("user clicks on spinny buyback")
        public void user_clicks_on_spinny_buyback() throws InterruptedException{
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
        	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
        	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
    		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
    		Assert.assertEquals(true, open_menu.isDisplayed());
    		
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("document.getElementById('sideMenu').scroll(0,400)");
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("spinny_buyback"));
    		prm.clickByJavaScript(driver, cr.valueOnTheKey("spinny_buyback"), "xpath");
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("spinny_buyback_page"));
    		WebElement spinny_buyback_page = driver.findElement(By.xpath(cr.valueOnTheKey("spinny_buyback_page")));
    		Assert.assertEquals(true, spinny_buyback_page.isDisplayed());
    		driver.navigate().back();
    		

    	}
    	@And("user clicks on spinny exchange")
        public void user_clicks_on_spinny_exchange() throws InterruptedException{
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
        	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
        	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
    		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
    		Assert.assertEquals(true, open_menu.isDisplayed());
    		
    		JavascriptExecutor jj = (JavascriptExecutor) driver;
    		jj.executeScript("document.getElementById('sideMenu').scroll(0,850)");
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("spinny_exchange"));
    		prm.clickByJavaScript(driver, cr.valueOnTheKey("spinny_exchange"), "xpath");
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("spinny_exchange_page"));
    		Thread.sleep(2000);
    		WebElement spinny_exchange_page = driver.findElement(By.xpath(cr.valueOnTheKey("spinny_exchange_page")));
    		Assert.assertEquals(true, spinny_exchange_page.isDisplayed());
    		driver.navigate().back();
    		
    	}
    	@And("user clicks on spinny partners")
        public void user_clicks_on_spinny_partners() throws InterruptedException{
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
        	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
        	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
    		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
    		Assert.assertEquals(true, open_menu.isDisplayed());
    		
    		JavascriptExecutor jq = (JavascriptExecutor) driver;
    		jq.executeScript("document.getElementById('sideMenu').scroll(0,850)");
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("spinny_partners"));
    		prm.clickByJavaScript(driver, cr.valueOnTheKey("spinny_partners"), "xpath");
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("spinny_partners_page"));
    		WebElement spinny_partners_page = driver.findElement(By.xpath(cr.valueOnTheKey("spinny_partners_page")));
    		Assert.assertEquals(true, spinny_partners_page.isDisplayed());
    		driver.navigate().back();
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
        	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    	}
    	@And("user clicks on About us")
        public void user_clicks_on_About_us() throws InterruptedException{
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
    		WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
    		Assert.assertEquals(true, open_menu.isDisplayed());
    		
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("document.getElementById('sideMenu').scroll(0,850)");
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("about_us"));
    		prm.clickByJavaScript(driver, cr.valueOnTheKey("about_us"), "xpath");
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("about_spinny"));
    		prm.clickByJavaScript(driver, cr.valueOnTheKey("about_spinny"), "xpath");
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("about_us_page"));
    		WebElement about_us_page = driver.findElement(By.xpath(cr.valueOnTheKey("about_us_page")));
    		Assert.assertEquals(true, about_us_page.isDisplayed());
    		driver.navigate().back();
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
    		prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
    		js.executeScript("document.getElementById('sideMenu').scroll(0,850)");
    		wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("our_policies"));
    		prm.clickByJavaScript(driver, cr.valueOnTheKey("our_policies"), "xpath");
    		WebElement our_policies_page = driver.findElement(By.xpath(cr.valueOnTheKey("our_policies_page")));
    		Assert.assertEquals(true, our_policies_page.isDisplayed());
    		driver.navigate().back();
    
    	}

@And("user clicks on customer reviews")
public void user_clicks_on_customer_reviews() throws InterruptedException{
	
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
	WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
	Assert.assertEquals(true, open_menu.isDisplayed());
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.getElementById('sideMenu').scroll(0,1200)");
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("customer_reviews"));
	prm.clickByJavaScript(driver, cr.valueOnTheKey("customer_reviews"), "xpath");
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("customer_reviews_page"));
	WebElement customer_reviews_page = driver.findElement(By.xpath(cr.valueOnTheKey("customer_reviews_page")));
	Assert.assertEquals(true, customer_reviews_page.isDisplayed());
	
	driver.navigate().back();
}

@And("user clicks on check echallan")
public void user_clicks_on_check_echallan() throws InterruptedException{
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
	WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
	Assert.assertEquals(true, open_menu.isDisplayed());
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.getElementById('sideMenu').scroll(0,1200)");
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("check_echallan"));
	prm.clickByJavaScript(driver, cr.valueOnTheKey("check_echallan"), "xpath");
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("check_echallan_page"));
	WebElement check_echallan_page = driver.findElement(By.xpath(cr.valueOnTheKey("check_echallan_page")));
	Assert.assertEquals(true, check_echallan_page.isDisplayed());
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
	prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");
}
@And("user clicks on check rto details")
public void user_clicks_on_check_rto_details() throws InterruptedException{
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("hamburger"));
	prm.click(driver, cr.valueOnTheKey("hamburger"), "xpath");
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("open_menu"));
	WebElement open_menu = driver.findElement(By.xpath(cr.valueOnTheKey("open_menu")));
	Assert.assertEquals(true, open_menu.isDisplayed());
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.getElementById('sideMenu').scroll(0,1000)");
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("check_rto_details"));
	prm.clickByJavaScript(driver, cr.valueOnTheKey("check_rto_details"), "xpath");
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("check_rto_details_page"));
	WebElement check_rto_details_page = driver.findElement(By.xpath(cr.valueOnTheKey("check_rto_details_page")));
	Assert.assertEquals(true, check_rto_details_page.isDisplayed());
	wait.presenceOfElementLocated(driver, "xpath", cr.valueOnTheKey("logo_click"));
	prm.click(driver, cr.valueOnTheKey("logo_click"), "xpath");



    }
}





