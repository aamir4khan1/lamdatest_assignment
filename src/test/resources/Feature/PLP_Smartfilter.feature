Feature: Verify Smart filter functionality  

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location

		@regression
		Scenario: User should be able to see smart filer on PLP
    And user clicks on the browse car button
    And user clicks on the filter button
    And user selects brandmodels
    And user should able to see Smart filter