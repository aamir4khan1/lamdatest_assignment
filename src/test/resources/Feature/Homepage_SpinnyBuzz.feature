Feature: Verify spinny buzz functionality on homepage  
	
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   #And user selects location
   
   @regression 
   Scenario: User should be able to see spinny buzz functionality
   Then scroll down spinny buzz section
   And user able to see spinny buzz

 