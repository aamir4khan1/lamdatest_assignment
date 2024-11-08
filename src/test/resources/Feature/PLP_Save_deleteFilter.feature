Feature: Verify save and delete of filter functionality on PLP
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
   
   @regression
    Scenario: Validate the saving and deletion of filters
    And user clicks on the browse car button
    And user clicks on the filter button
    And user apply some filters
    And user click on save button 
    And user clicks on mobile number field
    And user enters mobile number
    And user clicks on verify number button
    And user enters otp code
    And user validate the saved filters assertions
    And user delete filter and validate
    
    