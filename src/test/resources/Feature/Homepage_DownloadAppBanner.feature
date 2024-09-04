Feature: Verify download app banner functionality on homepage 
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location
 
   @regression
   Scenario: User should be able to use download spinny app banner functionality
   And scroll down to spinny app banner	
   #And click on google play button

 