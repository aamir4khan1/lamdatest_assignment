Feature: Verify user is able to view explore more car section PDP

 Background: User land on spinny website and selects location
    Given user land on spinny website
    When Wait for the application page to load completely
    #And user selects location
   
     @regression 
     Scenario: User should be able use view explore more car section PDP
     Then user click on view all cars
     And user selects a car_card
     And user views explore more section
     And user selects first filter
     And user selects second filter
     And user selects third filter
     And user selects fourth filter
     And user selects fifth filter
     
     

 