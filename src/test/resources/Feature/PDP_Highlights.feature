Feature: Verify PDP highlights functionality  

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
    
    @regression
    Scenario: user should be able to view highlights on PDP
    And user clicks on the browse car button
    And user selects Card to verify Highlights
    
     