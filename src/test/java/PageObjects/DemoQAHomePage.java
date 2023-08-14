package PageObjects;

import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAHomePage extends SeleniumUtils {


    By alertFramesAndWindowButton = By.xpath("//div[@id='app']/div/div/div[2]/div/div[3]");
    By elementButton = By.xpath("//div[@id='app']/div/div/div[2]/div/div[1]");
    By formsButton = By.xpath("//div[@id='app']/div/div/div[2]/div/div[2]");
    By widgetsButton = By.xpath("//div[@id='app']/div/div/div[2]/div/div[4]");
    By interactionsButton = By.xpath("//div[@id='app']/div/div/div[2]/div/div[5]");
    By bookStoreButton = By.xpath("//div[@id='app']/div/div/div[2]/div/div[6]");


    public void clickingAlertsButton()
    {
        clickElement(alertFramesAndWindowButton);

    }
    public void clickElementsButton(){
        clickElement(elementButton);
    }
    public void clickFormsButton(){
        clickElement(formsButton);
    }
    public void clickWidgetButton(){
        clickElement(widgetsButton);
    }

    public void clickInteracionButton(){
        clickElement(interactionsButton);
    }

    public void clickBookStoreButton(){
        clickElement(bookStoreButton);
    }

    public void demoQAHomePageLoadCheck(WebDriver driver){
        elementPresentOrNot(driver, elementButton);
    }

}

