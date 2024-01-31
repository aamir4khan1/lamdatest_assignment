// Others required wait can be added here
package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Wait {
    static WebDriverWait wait = null;

    public static void implicitWait(int i, WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
    }

    public void presenceOfElementLocated(WebDriver driver, String locatorType, String element) {
        //wait = new WebDriverWait(driver, 30);
        switch (locatorType) {
            case "xpath":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
                break;
            case "id":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element)));
                break;
            case "name":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.name(element)));
                break;
            case "className":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.className(element)));
                break;
            case "tagName":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(element)));
                break;
            case "linkText":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(element)));
                break;
            case "css":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(element)));
                break;
        }
    }

    public void elementToBeClickable(WebDriver driver, String locatorType, String element) {
      //  WebDriverWait wait = new WebDriverWait(driver, 30);
        switch (locatorType) {
            case "xpath":
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
                break;
            case "id":
                wait.until(ExpectedConditions.elementToBeClickable(By.id(element)));
                break;
            case "name":
                wait.until(ExpectedConditions.elementToBeClickable(By.name(element)));
                break;
            case "className":
                wait.until(ExpectedConditions.elementToBeClickable(By.className(element)));
                break;
            case "tagName":
                wait.until(ExpectedConditions.elementToBeClickable(By.tagName(element)));
                break;
            case "linkText":
                wait.until(ExpectedConditions.elementToBeClickable(By.linkText(element)));
                break;
            case "css":
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(element)));
                break;
        }
    }

    public void elementToBeSelected(WebDriver driver, String locatorType, String element) {
       // WebDriverWait wait = new WebDriverWait(driver, 30);
        switch (locatorType) {
            case "xpath":
                wait.until(ExpectedConditions.elementToBeSelected(By.xpath(element)));
                break;
            case "id":
                wait.until(ExpectedConditions.elementToBeSelected(By.id(element)));
                break;
            case "name":
                wait.until(ExpectedConditions.elementToBeSelected(By.name(element)));
                break;
            case "className":
                wait.until(ExpectedConditions.elementToBeSelected(By.className(element)));
                break;
            case "tagName":
                wait.until(ExpectedConditions.elementToBeSelected(By.tagName(element)));
                break;
            case "linkText":
                wait.until(ExpectedConditions.elementToBeSelected(By.linkText(element)));
                break;
            case "css":
                wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector(element)));
                break;
        }
    }  
       
}
