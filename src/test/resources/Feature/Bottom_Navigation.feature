Feature: Verify bottom navigation functionality on homepage 
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
	@regression
  Scenario: User should be able to use bottom navigation functionality
   Then botnav is visible and home icon selected
   And user click on bottom navigation buy car icon
   And user click on shortlists icon	
   And user click on sell car icon
   And user click on account icon

 