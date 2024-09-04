Feature: Verify view all cars functionality on homepage

 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location
   
     @regression 
     Scenario: User should be able use view all cars functionality
     Then user click on view all cars
#    And user select city selector on plp
#    And user select bangalore city
#    And user click on spinny logo
#    Then user click on city selector on homepage
#    And user select ahmedabad city
#    And user click on view all cars again
 