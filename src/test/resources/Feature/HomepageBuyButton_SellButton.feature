Feature: Verify Buy button and Sell button functionality on homepage 
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
	@regression
  Scenario: User should be able to use sell button functionality
    Then user click on sell button
    And land on sell page
	@regression
  Scenario: User should be able to use buy button functionality
    Then user click on buy button
    And land on product listing page
 