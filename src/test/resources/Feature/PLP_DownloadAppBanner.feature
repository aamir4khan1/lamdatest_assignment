Feature: Verify download app banner functionality on plp 
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location
 
   @regression
   Scenario: User should be able to use download spinny app banner functionality on plp
   And user clicks on the browse car button
   And user clicks on quick filter button
   And user selects availability tab
   And select upcoming filter
   And click on apply button
   And scroll down to download app banner
   And validate download app banner

 