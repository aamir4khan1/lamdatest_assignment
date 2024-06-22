Feature: Verify explore more functionality on homepage  
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
  
   @regression 
   Scenario: User should be able to use explore more functionality
   Then user scroll down to explore more section
   And click on check eligibility
   And click on get exchange price
   And click on explore buyback

 