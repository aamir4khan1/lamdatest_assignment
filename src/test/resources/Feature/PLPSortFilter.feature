Feature: Verify sort filter functionality on plp
	
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
    
   Scenario: User should be able to use sort filter functionality on plp
   Then user land on plp
   And select sort filter
   And click on price low to high
   And click on price high to low
   And click on km driven low to high
   And click on year new to old
   And click on newest first

 