package TestRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Features",
        glue = "StepDefinitions",
        //tags= "not @SanityTest" - ommitted SanityTest tags
        //tags= "@SanityTest or @SmokeTest" - To run both the tags
        //tags= "@SanityTest and @SmokeTest" - To run the scenarios which was tagged or both sanity and smoke
        //tags= "@RegTest"
        tags= "@SanityTest or @RegTest", // Runs Sanity and Reg test
        monochrome=true, //Not execute the scenarios. It will check that all the Steps mentioned in the feature file was present in the SD file or not.
        dryRun=true, //All details will be clearly shown in the console
        plugin= {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
