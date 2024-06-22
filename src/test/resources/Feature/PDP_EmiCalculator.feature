Feature: Verify EMI Caculator on PDP
   
 Background: User land on spinny website and selects location
 
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location

		@regression
   Scenario: User should be able to view EMI calculator
   
   And user clicks on the browse car button
   And user selects a car card
   And user view EMI Calculator
   And user clicks on mobile number field
  And user enters mobile number
     And user clicks on verify number button
  And user enters otp code
  And user view Loan Eligibility page
   