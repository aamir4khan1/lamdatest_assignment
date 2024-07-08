Feature: Verify Know more Feature  on PDP
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location

	 @regression
   Scenario: User should be able to view know More
   And user clicks on the browse car button
   And user apply assured car filter
   And user selects a car card
   And user Clicks on Know more CTA of Assured
   And user apply Budget car filter
   And user selects a car card
   And user Clicks on Know more CTA of budget
   And user apply Max car filter
   And user selects a car card
   And user Clicks on Know more CTA of Max