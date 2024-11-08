Feature: Verify filter functionality  

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location

		@regression
		Scenario: User should be able to apply filters
    And user clicks on the browse car button
    And user clicks on the filter button
    #And user selects price filter
    And user selects brandmodel
    And user selects year
    And user slects kmsDriven
    And user selects fuel type
    And user selects Body type
    And user selects Transmission
    And user selects color
    And user selects features
    And user selects seats
    And user selects RTO
    And user selects owner
    And user selects car category
    And user selects spinny hubs
    And user selects Availability