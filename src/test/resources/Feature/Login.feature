Feature: Verify login 

 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
   
    
    @change
  	Scenario: User selects login
    Then click on account tab
    And user clicks on mobile number field
    And user enters mobile number
    And user clicks on verify number button
    And user enters otp code
    Then logout button is visible
 