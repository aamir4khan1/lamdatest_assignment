Feature: Verify popular brands and how spinny works functionality on homepage
				
Background: Create an instance of android or ios driver before each scenario
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
  
    @regression
    Scenario: User should be able to use explore popular brands section
    Then user scroll to explore popular brands section
    And click on maruti suzuki
    Then redirect back to explore popular brands section
    And click on view all brands
    And click on view all cars
   
    @regression
    Scenario: User should be able to explore how spinny works section
    Then user scroll down to how spinny works section
    And click on watch how it works
    And click on learn more
    
 
   