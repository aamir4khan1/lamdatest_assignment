Feature: Verify Exchange Banner on pdp

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
    @regression
    Scenario: Validate the Exchange Banner on pdp
    And user clicks on the browse car button
    And user select car
    And user scroll down and validate
