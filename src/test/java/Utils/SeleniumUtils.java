package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import  Utils.TestContextSetup;

public class SeleniumUtils {

    //private FluentWait fluentWait;
    private TestContextSetup testContextSetup;


    public SeleniumUtils(){

        testContextSetup = new TestContextSetup();
      //  fluentWait = new FluentWait(testContextSetup.driver);


    }


    public String getText(By element){

//        fluentWait.pollingEvery(Duration.ofSeconds(1));
//        fluentWait.withTimeout(Duration.ofSeconds(5));
//        fluentWait.ignoring(NoSuchElementException.class);
//        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return testContextSetup.driver.findElement(element).getText();
    }

    public void sendElement(By element, String value){
//        fluentWait.pollingEvery(Duration.ofSeconds(1));
//        fluentWait.withTimeout(Duration.ofSeconds(5));
//        fluentWait.ignoring(NoSuchElementException.class);
//        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    testContextSetup.driver.findElement(element).sendKeys(value);
    }

    public void clickElement(By element){
//        fluentWait.pollingEvery(Duration.ofSeconds(1));
//        fluentWait.withTimeout(Duration.ofSeconds(5));
//        fluentWait.ignoring(NoSuchElementException.class);
//        fluentWait.until(ExpectedConditions.elementToBeClickable(element));
        testContextSetup.driver.findElement(element).click();
    }


    public void moveToElement(By element){
       // actions.moveToElement(testContextSetup.driver.findElement(element)).build();
    }

    public boolean elementPresentOrNot(WebDriver driver, By element){
//        fluentWait.pollingEvery(Duration.ofSeconds(1));
//        fluentWait.withTimeout(Duration.ofSeconds(5));
//        fluentWait.ignoring(NoSuchElementException.class);
//        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(element));
        if(driver.findElement(element).isDisplayed()) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
