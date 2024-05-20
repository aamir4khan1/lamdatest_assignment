Feature: Verify body type functionality on homepage
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
   
     Scenario: Filter applied when user clicks on View all body type under Explore by body type section
   
	 And scroll body type section
   And Click on View all hatchbacks
   And Go back to the home page
   Then Click on Sedan and View All Sedan
   And Go back to the home page
   Then Click on SUV and View All SUVs
   And Go back to the home page
   Then Click on MUV and View All MUVs
   And Go back to the home page
   
