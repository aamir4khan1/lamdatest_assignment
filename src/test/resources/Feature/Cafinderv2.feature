Feature: Verify car finder functionality  

Background: User land on spinny website and selects location
Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
	
 Scenario: Car finder
    And clicks on the car finder banner on homepage
    #And user is navigated to find my car page
    And user selects price range
    And user selects fuel type preference
    And user selects transmission preference
    And user clicks on mobile number field
    And user enters mobile number
    And user enters otp code
    And validate carfinder plp
    #Then user is navigated to the PLP