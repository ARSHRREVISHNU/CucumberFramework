package StepDefinitions.DemoQA;

import PageObjects.DemoQAHomePage;
import Utils.TestContextSetup;
import Utils.WebDriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageTest {

    public DemoQAHomePage demoQAHomePage;
    public WebDriverManager webDriverManager;
    WebDriver driver;
    public LoginPageTest(){
        System.out.println("Login page test");
        demoQAHomePage = new DemoQAHomePage();
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.driverInitialization();
    }

    @Given("Validate the demo qa website was loaded or not")
    public void validate_the_demo_qa_website_was_loaded_or_not(){
        demoQAHomePage.demoQAHomePageLoadCheck(driver);

     }
}
