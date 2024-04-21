Feature: Verify Buy Sell Toggle and Hub Location 

 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
    @Smoke
   Scenario: User should be able to use buy sell toggle functionality
   Then user click on buy toggle
   And user click on learn more button
   And click on browse car
   Then click on sell toggle
   And click on get price

   
   Scenario: User should be able to use hub location functionality
   Then user scroll down to hub location
   And click on view cars
   And click view all cars in delhi ncr