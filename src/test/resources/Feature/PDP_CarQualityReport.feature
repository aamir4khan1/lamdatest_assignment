Feature: Verify Car Quality report functionality on pdp
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
  
  @regression 
   Scenario: User should be able to use Car quality report functionality
   And user click on buy button
   And user select a car card
   And scroll down to inspection report section
   Then click on view full report
   And user clicks on mobile number field
   And user enters mobile number
   And user clicks on verify number button
   And user enters otp code
   And click on different tabs under car condition section
   And click on different tabs under fixes done section
   And click on different tabs under customised section
   And click on different tabs under tyre life remaining section
   And scroll to full checklist section
   And Validate download inspection report button
   And Validate book now and free test drive cta
   And click on view full checklist
   
 #  And click on download inspection report icon
 #  And click on view full checklist
   #And click on get report on pdp
		