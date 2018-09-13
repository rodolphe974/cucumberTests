Feature: Tests wikipedia
    This is a test for the wikipedia page

    Scenario: Test wikipedia in english
    Given I open wikipedia
    When I search "France"
    Then I should see "France" in the title