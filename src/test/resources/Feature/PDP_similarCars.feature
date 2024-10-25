Feature: Verify user is able to view similar car section PDP

 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location
   
     @regression 
     Scenario: User should be able use view similar car section PDP
     And user click on buy button
     And user select a car card
     And user views similar car section
     

 