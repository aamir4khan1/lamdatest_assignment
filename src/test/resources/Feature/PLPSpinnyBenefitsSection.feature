Feature: Verify spinny benefits section functionality on plp
	
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
    
   Scenario: User should be able to use spinny benefits section functionality on plp
   Then user land on plp
   And scroll down to spinny benefits section
   And validate spinny benefits section

 