Feature: Verify hub location functionality on plp
	
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   #And user selects location
   
   @regression 
   Scenario: User should be able to use hub location functionality on plp
   Then user land on plp
   And scroll down to hub location functionality
   And validate hub location modal
   And click on view cars under hub location modal
   And user land on plp with hub filter applied 

 