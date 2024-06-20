Feature: Verify car specifications functionality on PDP
   
 Background: User land on spinny website and selects location
 
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location

   Scenario: User should be able to view car specification section on pdp
   
   And user clicks on the browse car button
   Then user selects first car card
   And user scroll down to car specifications section
   And click on view all specifications button
   And validate different sections under car specifications
   