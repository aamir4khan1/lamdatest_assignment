Feature: Verify sort filter functionality on plp
	
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
    
   Scenario: User should be able to use popular filter functionality on plp
   Then user land on plp
   And scroll down till popular filter section
   And select all filters
   And select rto
   And select fuel type
   And select year
   Then clicked on view cars cta
   And land on plp with applied filters 

 