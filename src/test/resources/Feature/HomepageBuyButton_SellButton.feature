Feature: Verify Buy and Sell functionality  
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
   @Smoke 
  Scenario: User should be able to use sell button functionality
    Then user click on sell button
    And land on sell page
@Smoke
  Scenario: User should be able to use buy button functionality
    Then user click on buy button
    And land on product listing page
 