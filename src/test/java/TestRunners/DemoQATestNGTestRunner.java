package TestRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/Features/DemoQA",
        glue = "StepDefinitions/DemoQA",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
)
public class DemoQATestNGTestRunner extends AbstractTestNGCucumberTests{




}
