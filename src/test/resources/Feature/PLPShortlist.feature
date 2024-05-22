Feature: Verify shortlist functionality on plp  
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
    @regression
   Scenario: User should be able to see shortlist functionality
   Then user land on plp
   And click on shortlist icon on car card
   And user clicks on mobile number field
   And user enters mobile number
   And user enters otp code
   And car gets shortlisted
   Then user click on header shortlist icon 
   And user can see shortlisted car on shortlist section
   Then user unshortlist the car
   
  
   

 