Feature: Verify spinny max banner functionality on homepage  
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
   
   @regression 
   Scenario: User should be able to explore spinny max banner functionality
   Then scroll down to spinny max banner	
   And click on car card
   And click on explore button
#   And click on shortlist icon
   And click on view more luxury cars
  
 