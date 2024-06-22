Feature: Verify shop by category functionality on plp
	
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
   
   @regression 
   Scenario: User should be able to use shop by category functionality on plp
   Then user land on plp
   And scroll down to shop by category section
   And validate shop by category section
   And click on category guide
   And click on first car card under assured category
   And click on shortlist icon under assured category
   And click on explore collection under assured category
   And click on view all under assured categoy
   Then click on budget category tab
   And click on first car card under budget category
   And click on shortlist icon under budget category
   And click on explore collection under budget category
   And click on view all under budget categoy
   Then click on max category tab
   And click on first car card under max category
   And click on shortlist icon under max category
   And click on explore collection under max category
   And click on view all under max categoy
   
   


 