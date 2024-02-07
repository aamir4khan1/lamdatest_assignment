Feature: Verify car finder functionality  

Background: 
Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
	
 Scenario: 
    When clicks on the car finder banner on homepage
    #And user is navigated to find my car page
    And user selects price range
    And user selects lifestyle
    And user selects fuel type preference
    And user selects transmission preference
    #And taps on login button
    And user clicks on mobile number field
    And enters mobile number and otp code
    And validate carfinder plp
    #Then user is navigated to the PLP