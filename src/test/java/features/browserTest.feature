Feature: Gradle-Cucumber integration

  Scenario: Chrome Test
    Given I open Firefox
    Then I close the browser
    
  Scenario: Firefox Test
  	Given I open Chrome
    Then I close the browser