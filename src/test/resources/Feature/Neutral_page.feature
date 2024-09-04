Feature: Verify user is able to verify neutral page

 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location
   
     @regression 
     Scenario: User should be able to verify neutral page
     Then user lands on neutral page
     And user selects sell car button
     And user verify car finder section
     And user verify sell add section
     And user verify insignts that drive us section
     And user verify love story section
     
     
     

 