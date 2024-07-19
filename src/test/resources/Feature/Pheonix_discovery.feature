Feature: Verify Pheonix functionality

 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
    
    @sanity 
  	Scenario: User should able to see pheonix functionality
    And user clicks on the browse car button
    And user apply assured car filter
    And user selects a car card
    And user view recently viewed assured pheonix card
     And user view recommended cars pheonix card
     And user clicks on the browse car button
     And user apply Budget car filters
    And user selects a car card
    And user view recently viewed Budget pheonix card
     And user clicks on the browse car button
    And user selects a car card
    And user view recently viewed Max pheonix card
    And user clicks on the browse car button
    And user verify pheonix filters 
    
 