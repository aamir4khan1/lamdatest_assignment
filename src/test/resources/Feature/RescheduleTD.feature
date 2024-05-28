Feature: Verify Reschedule hub test drive functionality  

Background:
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
@regression
Scenario: User should be able to re-schedule hub test drive
   
    
    And user clicks on the browse car button
    And user select a car card
    #And user lands on the PDP
    And user click on the Free test drive button
     And user clicks on mobile number field
    And user enters mobile number
    And user enters otp code
    And user selects date
    And user chooses time
    And user clicks on Schedule hub test drive
    And user clicks on reschedule button
    And user click date
    And user click time
    And user click saveedit button
    And user clicks on cancel button
    And user chooses reason for cancellation
    And user selects cancel CTA
    
    