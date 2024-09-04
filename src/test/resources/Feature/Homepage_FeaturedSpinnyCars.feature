Feature: Verify featured spinny cars functionality on homepage  
	
 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location
  
    @regression 
    Scenario: User should be able to use featured spinny cars functionality
		Then scroll down to featured spinny cars section
    And clicked on car card under best buy for you tab
 #  And click on shortlist icon under best buy for you tab
    And click on view all spinny cars under best buy for you tab
    Then click on newly added tab
    And clicks on car card under newly added tab
#   And click on shortlist icon under newly added tab
    And click view all cars under newly added tab
