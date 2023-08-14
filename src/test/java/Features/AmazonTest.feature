#import src.test.java.StepDefinitions.AmazonTestSteps;
Feature: Amazon Login


  #Background runs before all the scenarios in that feature file
  Background:
    Given Sample given statement

  @SmokeTest @WebTest
  Scenario: Amazon login page load
    Given Open the chrome browser
    When Load the amazon url
    And Click the login option
    Then login page should be loaded