package StepDefinitions;


import Utils.TestContextSetup;
import io.cucumber.java.*;

import  Utils.TestContextSetup;

public class Hooks {

    TestContextSetup testContextSetup;

    public Hooks(){
        testContextSetup = new TestContextSetup();
    }
    @After("@WebTest")
    public void afterWebTest(){
        testContextSetup.driver.quit();
    }

    @Before("@SanityTest") // Runs before each sanity scenario
    public void beforeSaityTest(){
        System.out.println("Hook before Sanity");
    }
    @After("@SanityTest") //Runs after each sanity scenario
    public void afterSanityTest(){
        System.out.println("Hook after Sanity");
    }

    @Before("@RegTest") //Runs before each Regression scenario
    public void beforeRegTest(){
        System.out.println("Hook before reg");
    }

    @After("@RegTest") //Runs after each Regression scenario
    public void afterRegTest(){
        System.out.println("Hook after reg");
    }
}
