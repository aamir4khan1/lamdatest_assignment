Feature: Verify car overview  functionality on PDP
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   #And user selects location

    @regression
    Scenario: User should be able to view car overview section On PDP
    And user clicks on the browse car button
    And user selects a car card
    And user view Car Overview Section
   