Feature: Verify rto details page
Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location

		@regression
		Scenario: User should be able to verify rto details page
    And user selects rto details page
    And user enters rto_registration number
    And user clicks on mobile number field
    And user enters mobile number
    And user clicks on verify number button
    And user enters otp code
    And user lands on rto page
    
    
    