Feature: Verify user is able search for iphone

 Background: User land on amazon website
    Given user land on amazon website
    When Wait for the application page to load completely
    And user selects location
   
     @regression 
     Scenario: User should be able to add iphone in cart and retrieve price
     Then user searches for iphone
     And user selects an iphone
     And user adds the iphone in cart
     And price is shown