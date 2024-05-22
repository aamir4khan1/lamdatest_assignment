Feature: Verify body type functionality on homepage
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location
@regression
Scenario: Love story section must be visible
 And scroll till lovestory section
 And User able to see lovestory section