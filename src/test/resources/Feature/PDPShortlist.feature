Feature: Verify shortlist functionality on plp  
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location
   
   @regression
   Scenario: User should be able to see shortlist functionality
  And user clicks on the browse car button
    And user selects a car card
   And click on shortlist icon on PDP
   And user clicks on mobile number field
   And user clicks on mobile number field
    And user enters mobile number
    And user clicks on verify number button
    And user enters otp code
    And car gets shortlisted on PDP
   And user can see shortlisted car on shortlist page
   Then user unshortlist the car on PDP
  
   

 