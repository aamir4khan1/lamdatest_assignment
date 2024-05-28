Feature: Verify Notify me functionality on homepage
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
   
   @regression
    Scenario: Validate the notify me functionality on PLP page after applying some filters
    
    And user click on buy button
   	And user select some filters from PLP
   	And Application of filter
   	And user scroll down to view notify me widget
   	And Enter a number and click on notify me
   	And Validate the arrival of view all cars widget
   @regression
   Scenario: Validate the notify me functionality on PLP page for booked car
   
   And user click on buy button
   And user selects filter of Booked car
   And Application of filter
   And user click on car card

  
   
   Scenario: Validate the notify me functionality on PLP page for upcoming car
   
   And user click on buy button
   And user selects filter of upcoming car
   And Application of filter
   And user click on car card
   
   