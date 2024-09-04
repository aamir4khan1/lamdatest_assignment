Feature: Verify location selector functionality on homepage
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   #And user selects location
	
	 @regression		
   Scenario: User should be able to select the city and the PLP must get updated
  #And user selects {city} on Home page
  #And validate the city on PLP
  #And user performs actions for multiple cities
    And user selects Delhi NCR on Home page
    And validate the city Delhi NCR on PLP
    And validate the seo inner content	
    And validate the car card with delhi city 
    And user selects Bangalore
    And validate the city Bangalore on PLP 
    And validate the seo inner content
    And validate the car card with bangalore city
    And user selects Hyderabad
    And validate the city Hyderabad on PLP 
    And validate the seo inner content
    And user selects Mumbai
    And validate the city Mumbai on PLP
    And validate the seo inner content
    And validate the car card with mumbai city
    #And user selects Pune
    #And validate the city Pune on PLP
    #And validate the seo inner content
    #And user selects Delhi on Home page
    #And validate the city Delhi on PLP
    #And validate the seo inner content
    #And user selects Gurgaon
    #And validate the city Gurgaon on PLP
    #And validate the seo inner content
    #And user selects Noida
    #And validate the city Noida on PLP
    #And validate the seo inner content
    #And user selects Ahmedabad
    #And validate the city Ahmedabad on PLP
    #And validate the seo inner content
    #And user selects Chennai
    #And validate the city Chennai on PLP
    #And validate the seo inner content
    #And user selects Kolkata
    #And validate the city Kolkata on PLP
    #And validate the seo inner content
    #And user selects Lucknow
    #And validate the city Lucknow on PLP
    #And validate the seo inner content
    #And user selects Jaipur
    #And validate the city Jaipur on PLP 
    #And validate the seo inner content
    #And user selects Chandigarh
    #And validate the city Chandigarh on PLP
    #And validate the seo inner content
    #And user selects Coimbatore
    #And validate the city Coimbatore on PLP
    #And validate the seo inner content
    #And user selects Ghaziabad
    #And validate the city Ghaziabad on PLP
    #And validate the seo inner content
    #And user selects Indore
    #And validate the city Indore on PLP
    #And validate the seo inner content
    #And user selects Kochi
    #And validate the city Kochi on PLP
    #And validate the seo inner content