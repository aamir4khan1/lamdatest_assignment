Feature: Verify insights that drive us functionality on homepage  
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location
  
   @regression 
   Scenario: User should be able to see insights that drive us functionality
   And scroll down to insights that drive us	
   Then user is able to see insights that drive us section

 