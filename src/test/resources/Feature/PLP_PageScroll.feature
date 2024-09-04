Feature: Verify page scroll functionality on plp
	
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   #And user selects location
   
   @regression 
   Scenario: User should be able to use page scroll functionality on plp
   Then user land on plp
   And scroll down to page two
   And scroll down to page three
   And scroll down to page four

 