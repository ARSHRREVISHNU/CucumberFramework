#import src.test.java.StepDefinitions.AmazonTestSteps;
Feature: API Checks

  @SmokeTest
  Scenario: GET API response check
    Given Get call without params

  @SanityTest
  Scenario Outline: GET API response check with multiple values
    Given Get call "<endpoint>"

    Examples:
          | endpoint |
          | /api/users |

  @RegTest
  Scenario: DataTable pipeline Example
    Given Read data from data table
    | Shrrevishnu | shrrevishnu@gmail.com | Male | 25 |

  @SanityTest @RegTest @SmokeTest
  Scenario Outline: Parameterization Example
    Given Username "<username>" and password "<password>" print
    Examples:
    | username | password |
    | user1    | pass1    |
    | user2    | pass2    |
    | user3    | pass3    |
    | user4    | pass4    |
    | user5    | pass5    |
    | user6    | pass6    |

  Scenario:  Sample scenario
    Given Username "user1" and password "pass1" print