Feature: Verify check eligibility functionality on PDP
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   #And user selects location

	@regression
   Scenario: User should be able to verify check eligibility section on pdp
   And user clicks on the browse car button
   Then user selects first car card
   And user scroll down to check eligibility section
   And click on check eligiblity button
   And user clicks on mobile number field
   And user enters mobile number
   And user clicks on verify number button
   And user enters otp code
   And validate apply finance page is visible
   