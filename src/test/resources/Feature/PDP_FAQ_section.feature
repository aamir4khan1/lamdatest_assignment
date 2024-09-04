Feature: Verify the FAQs on PDP section   

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location
    
    Scenario: Validate the love story section on pdp
    And user clicks on the browse car button
    And user selects a car card
    And scroll till FAQ on PDP Page
    And User able to see FAQs section