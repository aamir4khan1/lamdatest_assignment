Feature: Verify Lovestory section on PDP  

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
    
    Scenario: Validate the love story section on pdp
    And user clicks on the browse car button
    And user selects a car card
    And scroll till Lovestory on PDP Page
    And Assert the love story section