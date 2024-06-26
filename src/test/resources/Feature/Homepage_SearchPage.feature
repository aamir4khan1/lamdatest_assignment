Feature: Verify Search  page  functionality on homepage
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
 		
   @regression  
   Scenario: search page functionality
	 And user clicks on search bar on top
	 And user clicks on  popular search
   And user tries to change location
   And user clicks on see all car
   And user clicks on car finder
   And user clicks on car available on hub
   And user search in search bar
   And user view recently viewed car 
   #And user clicks on mobile number field
  # And user enters mobile number
   #And user clicks on verify number button
   #And user enters otp code
  # And user shortlist the car