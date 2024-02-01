Feature: Verify login 

 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
    
  Scenario: User selects login
    And click on account tab
    And user clicks on mobile number field
    And enters mobile number and otp code
    Then logout button is visible
 