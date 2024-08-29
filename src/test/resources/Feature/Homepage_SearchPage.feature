Feature: Verify Search  page  functionality on homepage
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
 		
   @regression  
   Scenario: search page functionality
   And user clicks on search bar on top
	 And user clicks on  popular search
   And verify searchpage assertions
   And Verify single filters 
   And verify two filters
   And user verify more than two Filters combination