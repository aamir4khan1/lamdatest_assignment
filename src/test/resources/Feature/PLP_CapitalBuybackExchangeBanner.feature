Feature: Verify capital, buyback and exchange banner functionality on plp
	
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
   
   @regression 
   Scenario: User should be able to use  capital, buyback and exchange banner functionality on plp
   Then user land on plp
   And scroll down to capital buyback exchange banner
   And click on capital banner
   And click on buyback banner
   And click on exchange banner

 