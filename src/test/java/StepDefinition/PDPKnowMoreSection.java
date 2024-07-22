package StepDefinition;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utility.ConfigReader;
import Utility.Wait;
import Utility.preMethods;
import org.junit.Assert;
import java.util.NoSuchElementException;

public class PDPKnowMoreSection {
    
    static ConfigReader cr = new ConfigReader();
    WebDriver driver = StepDefinition.Hooks.driver;
    Wait wait = new Wait();
    static preMethods prm = new preMethods();
    
    @And("user apply assured car filter")
    public void userapplyassuredcarfilter() throws InterruptedException {
    	prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_1"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);
    }

    @And("user Clicks on Know more CTA of Assured")
    public void userClicksonKnowmoreCTAofAssured() throws InterruptedException {
        Thread.sleep(2000);
        WebElement PDP_KnowMoreCTA = driver.findElement(By.xpath(cr.valueOnTheKey("PDP_KnowMoreCTA")));
        Actions actions = new Actions(driver);
        actions.moveToElement(PDP_KnowMoreCTA).click().build().perform();
        Thread.sleep(2000);
        WebElement PDP_KnowMoreAssuredLogo = driver.findElement(By.xpath(cr.valueOnTheKey("PDP_KnowMoreAssuredLogo")));
        Assert.assertEquals(true, PDP_KnowMoreAssuredLogo.isDisplayed());
        Thread.sleep(3000);
        prm.click(driver, cr.valueOnTheKey("PDP_knowMoreassureWatchFilm"), "xpath");
        Thread.sleep(3000);
        prm.click(driver, cr.valueOnTheKey("WatchVideoClose"), "xpath");
        Thread.sleep(3000);
        WebElement PDP_KnowMoreSubText = driver.findElement(By.xpath(cr.valueOnTheKey("PDP_KnowMoreSubText")));
        Assert.assertEquals(true, PDP_KnowMoreSubText.isDisplayed());
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,100)");
        WebElement PDP_knowMoreImg1 = driver.findElement(By.xpath(cr.valueOnTheKey("PDP_knowMoreImg1")));
        Assert.assertEquals(true, PDP_knowMoreImg1.isDisplayed());
        Thread.sleep(2000);
        WebElement PDP_KnowMoreAssHead1 = driver.findElement(By.xpath(cr.valueOnTheKey("PDP_KnowMoreAssHead1")));
        Assert.assertEquals(true, PDP_KnowMoreAssHead1.isDisplayed());
        Thread.sleep(3000);
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("window.scroll(0,100)");
        Thread.sleep(3000);
        WebElement Pdp_KnowMoreImg2 = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_KnowMoreImg2")));
        Assert.assertEquals(true, Pdp_KnowMoreImg2.isDisplayed());
        Thread.sleep(2000);
        WebElement PDP_KnowMoreSubText2 = driver.findElement(By.xpath(cr.valueOnTheKey("PDP_KnowMoreSubText2")));
        Assert.assertEquals(true, PDP_KnowMoreSubText2.isDisplayed());
        Thread.sleep(3000);
        JavascriptExecutor jsss = (JavascriptExecutor) driver;
        jsss.executeScript("window.scroll(0,150)");
        WebElement PDP_KnowMoreImg3 = driver.findElement(By.xpath(cr.valueOnTheKey("PDP_KnowMoreImg3")));
        Assert.assertEquals(true, PDP_KnowMoreImg3.isDisplayed());
        Thread.sleep(2000);
        WebElement Pdp_knowMoreSubtext4 = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMoreSubtext4")));
        Assert.assertEquals(true, Pdp_knowMoreSubtext4.isDisplayed());
        Thread.sleep(3000);
        JavascriptExecutor jssss = (JavascriptExecutor) driver;
        jssss.executeScript("window.scroll(0,150)");
        Thread.sleep(3000);
        WebElement Pdp_knowMoreImg4 = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMoreImg4")));
        Assert.assertEquals(true, Pdp_knowMoreImg4.isDisplayed());
        Thread.sleep(2000);
        WebElement Pdp_KnowMoreSubtext5 = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_KnowMoreSubtext5")));
        Assert.assertEquals(true, Pdp_KnowMoreSubtext5.isDisplayed());
        Thread.sleep(3000);
        WebElement pdp_knowMoreimg5 = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_knowMoreimg5")));
        Assert.assertEquals(true, pdp_knowMoreimg5.isDisplayed());
        Thread.sleep(2000);
        JavascriptExecutor jsssss = (JavascriptExecutor) driver;
        jsssss.executeScript("window.scroll(0,150)");
        Thread.sleep(3000);
        WebElement pdp_knowMoreimg6 = driver.findElement(By.xpath(cr.valueOnTheKey("pdp_knowMoreimg6")));
        Assert.assertEquals(true, pdp_knowMoreimg6.isDisplayed());
        Thread.sleep(3000);
        WebElement Pdp_lastassuredtable = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_lastassuredtable")));
        Assert.assertEquals(true, Pdp_lastassuredtable.isDisplayed());
        Thread.sleep(3000);
        prm.click(driver, cr.valueOnTheKey("pdp_KnowMoreCross"), "xpath");
    	Thread.sleep(2000);
        
        WebElement Pdp_KnowbackCTA = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_KnowbackCTA")));
        Actions actionsss = new Actions(driver);
        actionsss.moveToElement(Pdp_KnowbackCTA).click().build().perform();
        Thread.sleep(3000);
       }
    
    @And("user apply Budget car filter")
    public void userapplyBudgetcarfilter() throws InterruptedException {
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("PDp_knowMoreclear"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_2"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);	
    }
    @And("user Clicks on Know more CTA of budget")
    public void userClicksonKnowmoreCTAofbudget() throws InterruptedException {
    	Thread.sleep(2000);
        WebElement PDP_KnowMoreCTA = driver.findElement(By.xpath(cr.valueOnTheKey("PDP_KnowMoreCTA")));
        Actions actions = new Actions(driver);
        actions.moveToElement(PDP_KnowMoreCTA).click().build().perform();
        Thread.sleep(2000);
        WebElement Pdp_knowMore_budget= driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMore_budget")));
        Assert.assertEquals(true, Pdp_knowMore_budget.isDisplayed());
        Thread.sleep(2000);
        WebElement Pdp_knowMoreBudgeimg1= driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMoreBudgeimg1")));
        Assert.assertEquals(true, Pdp_knowMoreBudgeimg1.isDisplayed());
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,100)");
        Thread.sleep(2000);
        WebElement PDP_knowMoreBudgethead1= driver.findElement(By.xpath(cr.valueOnTheKey("PDP_knowMoreBudgethead1")));
        Assert.assertEquals(true, PDP_knowMoreBudgethead1.isDisplayed());
        Thread.sleep(2000);
        WebElement Pdp_knowMorebudgetImg2= driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMorebudgetImg2")));
        Assert.assertEquals(true, Pdp_knowMorebudgetImg2.isDisplayed());
        Thread.sleep(2000);
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("window.scroll(0,100)");
        Thread.sleep(2000);
        WebElement Pdp_knowMorebudgethead2= driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMorebudgethead2")));
        Assert.assertEquals(true, Pdp_knowMorebudgethead2.isDisplayed());
        Thread.sleep(2000);
        WebElement Pdp_knowMorebudgetImg3= driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMorebudgetImg3")));
        Assert.assertEquals(true, Pdp_knowMorebudgetImg3.isDisplayed());
        Thread.sleep(2000);
        JavascriptExecutor jsss = (JavascriptExecutor) driver;
        jsss.executeScript("window.scroll(0,100)");
        Thread.sleep(2000);
        WebElement Pdp_knowMorebudgethead3= driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMorebudgethead3")));
        Assert.assertEquals(true, Pdp_knowMorebudgethead3.isDisplayed());
        Thread.sleep(2000);
        WebElement Pdp_knowMorebudgetImg4= driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMorebudgetImg4")));
        Assert.assertEquals(true, Pdp_knowMorebudgetImg4.isDisplayed());
        Thread.sleep(2000);
        JavascriptExecutor jssss = (JavascriptExecutor) driver;
        jssss.executeScript("window.scroll(0,100)");
        Thread.sleep(2000);
        WebElement Pdp_knowMorebudgetImg5= driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMorebudgetImg5")));
        Assert.assertEquals(true, Pdp_knowMorebudgetImg5.isDisplayed());
        Thread.sleep(2000);
        WebElement Pdp_knowMorebudgethead5= driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMorebudgethead5")));
        Assert.assertEquals(true, Pdp_knowMorebudgethead5.isDisplayed());
        Thread.sleep(2000);
        JavascriptExecutor jsssss = (JavascriptExecutor) driver;
        jsssss.executeScript("window.scroll(0,50)");
        Thread.sleep(2000);
        WebElement Pdp_knowMorebudgettable= driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_knowMorebudgettable")));
        Assert.assertEquals(true, Pdp_knowMorebudgettable.isDisplayed()); 
        Thread.sleep(2000);
        prm.click(driver, cr.valueOnTheKey("Pdp_knownmorebudgetclose"), "xpath");
    	Thread.sleep(2000);
    	WebElement Pdp_KnowbackCTA = driver.findElement(By.xpath(cr.valueOnTheKey("Pdp_KnowbackCTA")));
        Actions actionsss = new Actions(driver);
        actionsss.moveToElement(Pdp_KnowbackCTA).click().build().perform();
        Thread.sleep(3000);
    }
    @And("user apply Max car filter")
    public void userapplyMaxcarfilter() throws InterruptedException {
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("PDp_knowMoreclears"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("filter"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("car_category_3"), "xpath");
    	Thread.sleep(2000);
    	prm.click(driver, cr.valueOnTheKey("apply"), "xpath");
    	Thread.sleep(2000);	
    }
    @And("user Clicks on Know more CTA of Max")
    public void userClicksonKnowmoreCTAofMax() throws InterruptedException {
    	Thread.sleep(2000);
        WebElement PDP_KnowMoreCTA = driver.findElement(By.xpath(cr.valueOnTheKey("PDP_KnowMoreCTA")));
        Actions actions = new Actions(driver);
        actions.moveToElement(PDP_KnowMoreCTA).click().build().perform();
        Thread.sleep(3000);
    	prm.click(driver, cr.valueOnTheKey("pdp_KnowMoreMax"), "xpath");
    	Thread.sleep(2000);
    		
    }}