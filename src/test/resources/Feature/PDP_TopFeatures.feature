Feature: Verify top features functionality on PDP
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   #And user selects location

   @regression
   Scenario: User should be able to view top features section on pdp
   And user clicks on the browse car button
   Then user selects first car card
   And user scroll down to top features section
   And user click on view all features
   And user validate different sections under top features