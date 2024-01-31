Feature: Verify Buy and Sell functionality  
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
    
   Scenario: User should be able to use download spinny app banner functionality
   Then scroll down to spinny app banner	
   And click on google play button

 