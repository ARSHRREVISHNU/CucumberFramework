package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {

    public WebDriver driver;
    private TestContextSetup testContextSetup;

    public WebDriver driverInitialization(){
        testContextSetup = new TestContextSetup();
        testContextSetup.options = new ChromeOptions();
        testContextSetup.options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver.exe");
        testContextSetup.driver = new ChromeDriver(testContextSetup.options);
        testContextSetup.driver.get("https://demoqa.com/");
        testContextSetup.driver.manage().window().maximize();
        return testContextSetup.driver;
    }
}
