Feature: verify the filters remain intact while changing city

Background:
	  Given user land on spinny website
    When Wait for the application page to load completely
    And user selects location
    
    @regression
    Scenario: filter should remain intact while changing city
    And user clicks on the browse car button
    And user clicks on the filter button
    And user apply some filter
    And Change the city to bangalore and validate
    And Change the city to hyderabad and validate   
    And Change the city to mumbai and validate   
    And Change the city to pune and validate
    And Change the city to delhi and validate
    And Change the city to gurgaon and validate  
    And Change the city to noida and validate
    And Change the city to ahemdabad and validate
    And Change the city to chennai and validate
    And Change the city to kolkata and validate
    And Change the city to lucknow and validate
    And Change the city to jaipur and validate
    And Change the city to chandigarh and validate
    And Change the city to coimbatore and validate
    
     
    
    
