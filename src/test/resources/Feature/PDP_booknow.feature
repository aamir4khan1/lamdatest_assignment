Feature: Verify book now CTA on pdp

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location

		@regression
		Scenario: User should be able to book car on pdp
    And user clicks on the browse car button
    And user selects a car card
   #And user lands on the PDP
    And user clicks on the Book now button
    And user clicks on mobile number field
    And user enters mobile number
    And user clicks on verify number button
    And user enters otp code
    And user clicks on Proceed CTA
    And user verify on hold