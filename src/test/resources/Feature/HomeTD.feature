Feature: Verify scheduling of home test drive

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location

Scenario: User should be able to schedule home test drive
   
    
    And user clicks on the browse car button
    And user selects a car card
    #And user lands on the PDP
    And user clicks on the Free test drive button
     And user clicks on mobile number field
    And user enters mobile number
    And user enters otp code
    And user selects my location
    And user enters home address
   # And user selects date
    And user selects time
    And user clicks on the schedule myloc test drive button
    And user clicks on cancel button
    And user chooses reason for cancellation
    And user selects cancel CTA
   