package StepDefinitions;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonTest {
    public TestContextSetup testContextSetup;
    public AmazonTest(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }
    @Given("Open the chrome browser")
    public void openBrowser(){
//        System.out.println("Print the logs");
        testContextSetup.options = new ChromeOptions();
        testContextSetup.options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver.exe");
        testContextSetup.driver = new ChromeDriver(testContextSetup.options);
        //driver.get("");
    }

    @When("Load the amazon url")
    public void pageLaunch(){
        testContextSetup.driver.get("https://www.amazon.in/");
    }

    @When("Click the login option")
    public void loginClick(){
        testContextSetup.driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
    }

    @Then("login page should be loaded")
    public void pageLoadCheck(){

    }

}
