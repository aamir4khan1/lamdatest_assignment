Feature: Verify FAQ functionality on homepage
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   #And user selects location

  @regression  
  Scenario: FAQs section must be visible
  And scroll till FAQs section
  And User able to see FAQs section
  And user clicks on visit help center
