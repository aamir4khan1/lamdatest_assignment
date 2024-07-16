Feature: Verify benefits and addons section on PDP

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location

		@regression
		Scenario: User should be able to view benefits and addons section on PDP
    And user clicks on the browse car button
    And user chooses assured category filter
    And user chooses budget category filter
    And user chooses max category filter
    
    
    