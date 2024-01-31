package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class preMethods {

    public void click(WebDriver driver, String elementName, String LocatorType) {
        switch (LocatorType) {
            case ("xpath"):
                driver.findElement(By.xpath(elementName)).click();
                break;
            case ("tagName"):
                driver.findElement(By.tagName(elementName)).click();
                break;
            case ("partialLinkText"):
                driver.findElement(By.partialLinkText(elementName)).click();
                break;
            case ("name"):
                driver.findElement(By.name(elementName)).click();
                break;
            case ("linkText"):
                driver.findElement(By.linkText(elementName)).click();
                break;
            case ("id"):
                driver.findElement(By.id(elementName)).click();
                break;
            case ("cssSelector"):
                driver.findElement(By.cssSelector(elementName)).click();
                break;
            case ("className"):
                driver.findElement(By.className(elementName)).click();
                break;
            default:
                System.out.println("Entered Locator Type is not the valid locator type - " + LocatorType);
        }
    }


    public void dropDownSelectByVisibleText(WebDriver driver, String elementName, String LocatorType, String TextToSelect) {
        switch (LocatorType) {
            case ("xpath"):
                WebElement webElement1 = driver.findElement(By.xpath(elementName));
                Select dropdown1 = new Select(webElement1);
                dropdown1.selectByVisibleText(TextToSelect);
                break;
            case ("tagName"):
                WebElement webElement2 = driver.findElement(By.tagName(elementName));
                Select dropdown2 = new Select(webElement2);
                dropdown2.selectByVisibleText(TextToSelect);
                break;
            case ("partialLinkText"):
                WebElement webElement3 = driver.findElement(By.partialLinkText(elementName));
                Select dropdown3 = new Select(webElement3);
                dropdown3.selectByVisibleText(TextToSelect);
                break;
            case ("name"):
                WebElement webElement4 = driver.findElement(By.name(elementName));
                Select dropdown4 = new Select(webElement4);
                dropdown4.selectByVisibleText(TextToSelect);
                break;
            case ("linkText"):
                WebElement webElement5 = driver.findElement(By.linkText(elementName));
                Select dropdown5 = new Select(webElement5);
                dropdown5.selectByVisibleText(TextToSelect);
                break;
            case ("id"):
                WebElement webElement6 = driver.findElement(By.id(elementName));
                Select dropdown6 = new Select(webElement6);
                dropdown6.selectByVisibleText(TextToSelect);
                break;
            case ("cssSelector"):
                WebElement webElement7 = driver.findElement(By.cssSelector(elementName));
                Select dropdown7 = new Select(webElement7);
                dropdown7.selectByVisibleText(TextToSelect);
                break;
            case ("className"):
                WebElement webElement8 = driver.findElement(By.className(elementName));
                Select dropdown8 = new Select(webElement8);
                dropdown8.selectByVisibleText(TextToSelect);
                break;
            default:
                System.out.println("Entered Locator Type is not the valid locator type - " + LocatorType);
        }
    }

    public void dropDownSelectByValue(WebDriver driver, String elementName, String LocatorType, String ValueToSelect) {
        switch (LocatorType) {
            case ("xpath"):
                WebElement webElement1 = driver.findElement(By.xpath(elementName));
                Select dropdown1 = new Select(webElement1);
                dropdown1.selectByValue(ValueToSelect);
                break;
            case ("tagName"):
                WebElement webElement2 = driver.findElement(By.tagName(elementName));
                Select dropdown2 = new Select(webElement2);
                dropdown2.selectByValue(ValueToSelect);
                break;
            case ("partialLinkText"):
                WebElement webElement3 = driver.findElement(By.partialLinkText(elementName));
                Select dropdown3 = new Select(webElement3);
                dropdown3.selectByValue(ValueToSelect);
                break;
            case ("name"):
                WebElement webElement4 = driver.findElement(By.name(elementName));
                Select dropdown4 = new Select(webElement4);
                dropdown4.selectByValue(ValueToSelect);
                break;
            case ("linkText"):
                WebElement webElement5 = driver.findElement(By.linkText(elementName));
                Select dropdown5 = new Select(webElement5);
                dropdown5.selectByValue(ValueToSelect);
                break;
            case ("id"):
                WebElement webElement6 = driver.findElement(By.id(elementName));
                Select dropdown6 = new Select(webElement6);
                dropdown6.selectByValue(ValueToSelect);
                break;
            case ("cssSelector"):
                WebElement webElement7 = driver.findElement(By.cssSelector(elementName));
                Select dropdown7 = new Select(webElement7);
                dropdown7.selectByValue(ValueToSelect);
                break;
            case ("className"):
                WebElement webElement8 = driver.findElement(By.className(elementName));
                Select dropdown8 = new Select(webElement8);
                dropdown8.selectByValue(ValueToSelect);
                break;
            default:
                System.out.println("Entered Locator Type is not the valid locator type - " + LocatorType);
        }
    }

    public void dropDownSelectByIndex(WebDriver driver, String elementName, String LocatorType, int IndexNumberToSelect) {
        switch (LocatorType) {
            case ("xpath"):
                WebElement webElement1 = driver.findElement(By.xpath(elementName));
                Select dropdown1 = new Select(webElement1);
                dropdown1.selectByIndex(IndexNumberToSelect);
                break;
            case ("tagName"):
                WebElement webElement2 = driver.findElement(By.tagName(elementName));
                Select dropdown2 = new Select(webElement2);
                dropdown2.selectByIndex(IndexNumberToSelect);
                break;
            case ("partialLinkText"):
                WebElement webElement3 = driver.findElement(By.partialLinkText(elementName));
                Select dropdown3 = new Select(webElement3);
                dropdown3.selectByIndex(IndexNumberToSelect);
                break;
            case ("name"):
                WebElement webElement4 = driver.findElement(By.name(elementName));
                Select dropdown4 = new Select(webElement4);
                dropdown4.selectByIndex(IndexNumberToSelect);
                break;
            case ("linkText"):
                WebElement webElement5 = driver.findElement(By.linkText(elementName));
                Select dropdown5 = new Select(webElement5);
                dropdown5.selectByIndex(IndexNumberToSelect);
                break;
            case ("id"):
                WebElement webElement6 = driver.findElement(By.id(elementName));
                Select dropdown6 = new Select(webElement6);
                dropdown6.selectByIndex(IndexNumberToSelect);
                break;
            case ("cssSelector"):
                WebElement webElement7 = driver.findElement(By.cssSelector(elementName));
                Select dropdown7 = new Select(webElement7);
                dropdown7.selectByIndex(IndexNumberToSelect);
                break;
            case ("className"):
                WebElement webElement8 = driver.findElement(By.className(elementName));
                Select dropdown8 = new Select(webElement8);
                dropdown8.selectByIndex(IndexNumberToSelect);
                break;
            default:
                System.out.println("Entered Locator Type is not the valid locator type - " + LocatorType);
        }
    }

    public void clickOnRadioButton(WebDriver driver, String elementName, String LocatorType) {
        switch (LocatorType) {
            case ("xpath"):
                driver.findElement(By.xpath(elementName)).click();
                break;
            case ("tagName"):
                driver.findElement(By.tagName(elementName)).click();
                break;
            case ("partialLinkText"):
                driver.findElement(By.partialLinkText(elementName)).click();
                break;
            case ("name"):
                driver.findElement(By.name(elementName)).click();
                break;
            case ("linkText"):
                driver.findElement(By.linkText(elementName)).click();
                break;
            case ("id"):
                driver.findElement(By.id(elementName)).click();
                break;
            case ("cssSelector"):
                driver.findElement(By.cssSelector(elementName)).click();
                break;
            case ("className"):
                driver.findElement(By.className(elementName)).click();
                break;
            default:
                System.out.println("Entered Locator Type is not the valid locator type - " + LocatorType);
        }
    }

    public void clickByJavaScript(WebDriver driver, String elementName, String LocatorType) {
        switch (LocatorType) {
            case ("xpath"):
                WebElement element1 = driver.findElement(By.xpath(elementName));
                JavascriptExecutor js1 = (JavascriptExecutor) driver;
                js1.executeScript("arguments[0].click();", element1);
                break;
            case ("tagName"):
                WebElement element2 = driver.findElement(By.tagName(elementName));
                JavascriptExecutor js2 = (JavascriptExecutor) driver;
                js2.executeScript("arguments[0].click();", element2);
                break;
            case ("partialLinkText"):
                WebElement element3 = driver.findElement(By.partialLinkText(elementName));
                JavascriptExecutor js3 = (JavascriptExecutor) driver;
                js3.executeScript("arguments[0].click();", element3);
                break;
            case ("name"):
                WebElement element4 = driver.findElement(By.name(elementName));
                JavascriptExecutor js4 = (JavascriptExecutor) driver;
                js4.executeScript("arguments[0].click();", element4);
                break;
            case ("linkText"):
                WebElement element5 = driver.findElement(By.linkText(elementName));
                JavascriptExecutor js5 = (JavascriptExecutor) driver;
                js5.executeScript("arguments[0].click();", element5);
                break;
            case ("id"):
                WebElement element6 = driver.findElement(By.id(elementName));
                JavascriptExecutor js6 = (JavascriptExecutor) driver;
                js6.executeScript("arguments[0].click();", element6);
                break;
            case ("cssSelector"):
                WebElement element7 = driver.findElement(By.cssSelector(elementName));
                JavascriptExecutor js7 = (JavascriptExecutor) driver;
                js7.executeScript("arguments[0].click();", element7);
                break;
            case ("className"):
                WebElement element8 = driver.findElement(By.className(elementName));
                JavascriptExecutor js8 = (JavascriptExecutor) driver;
                js8.executeScript("arguments[0].click();", element8);
                break;
            default:
                System.out.println("Entered Locator Type is not the valid locator type - " + LocatorType);
        }
    }

    public void selectCheckBox(WebDriver driver, String elementName, String LocatorType) {
        switch (LocatorType) {
            case ("xpath"):
                driver.findElement(By.xpath(elementName)).click();
                break;
            case ("tagName"):
                driver.findElement(By.tagName(elementName)).click();
                break;
            case ("partialLinkText"):
                driver.findElement(By.partialLinkText(elementName)).click();
                break;
            case ("name"):
                driver.findElement(By.name(elementName)).click();
                break;
            case ("linkText"):
                driver.findElement(By.linkText(elementName)).click();
                break;
            case ("id"):
                driver.findElement(By.id(elementName)).click();
                break;
            case ("cssSelector"):
                driver.findElement(By.cssSelector(elementName)).click();
                break;
            case ("className"):
                driver.findElement(By.className(elementName)).click();
                break;
            default:
                System.out.println("Entered Locator Type is not the valid locator type - " + LocatorType);
        }
    }

    public String getText(WebDriver driver, String elementName, String LocatorType) {
        String value = null;
        switch (LocatorType) {
            case ("xpath"):
                value = driver.findElement(By.xpath(elementName)).getText();
                break;
            case ("tagName"):
                value = driver.findElement(By.tagName(elementName)).getText();
                break;
            case ("partialLinkText"):
                value = driver.findElement(By.partialLinkText(elementName)).getText();
                break;
            case ("name"):
                value = driver.findElement(By.name(elementName)).getText();
                break;
            case ("linkText"):
                value = driver.findElement(By.linkText(elementName)).getText();
                break;
            case ("id"):
                value = driver.findElement(By.id(elementName)).getText();
                break;
            case ("cssSelector"):
                value = driver.findElement(By.cssSelector(elementName)).getText();
                break;
            case ("className"):
                value = driver.findElement(By.className(elementName)).getText();
                break;
            default:
                System.out.println("Entered Locator Type is not the valid locator type - " + LocatorType);
        }
        return value;
    }

    public void acceptAlert(WebDriver driver) {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(WebDriver driver) {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertMessage(WebDriver driver) {
        return driver.switchTo().alert().getText();
    }

    public void sendTextMessageToAlert(String textToSend, WebDriver driver) {
        driver.switchTo().alert().sendKeys(textToSend);
    }

    public void sendTextToTextBox(WebDriver driver, String elementName, String LocatorType, String text) {
        switch (LocatorType) {
            case ("xpath"):
                driver.findElement(By.xpath(elementName)).sendKeys(text);
                break;
            case ("tagName"):
                driver.findElement(By.tagName(elementName)).sendKeys(text);
                break;
            case ("partialLinkText"):
                driver.findElement(By.partialLinkText(elementName)).sendKeys(text);
                break;
            case ("name"):
                driver.findElement(By.name(elementName)).sendKeys(text);
                break;
            case ("linkText"):
                driver.findElement(By.linkText(elementName)).sendKeys(text);
                break;
            case ("id"):
                driver.findElement(By.id(elementName)).sendKeys(text);
                break;
            case ("cssSelector"):
                driver.findElement(By.cssSelector(elementName)).sendKeys(text);
                break;
            case ("className"):
                driver.findElement(By.className(elementName)).sendKeys(text);
                break;
            default:
                System.out.println("Entered Locator Type is not the valid locator type - " + LocatorType);
        }
    }
        public void takeSceenshot(WebDriver driver) {
        	File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    


