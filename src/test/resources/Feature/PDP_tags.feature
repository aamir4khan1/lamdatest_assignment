Feature: Verify category tags on PDP

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location

		@regression
		Scenario: User should be able to view tags on category PDP
    And user clicks on the browse car button
    And user verifies assured category tag
    And user verifies budget category tag
    And user verifies max category tag
    
    
    