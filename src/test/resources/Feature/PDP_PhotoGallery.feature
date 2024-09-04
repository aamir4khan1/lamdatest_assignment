Feature: Verify photo gallery functionality on PDP
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   #And user selects location

	 @regression
   Scenario: User should be able to use photo gallery functionality
   And user click on buy button
   And user select a car card
   And click on car image
   And click on interior tab
   And click on gallery tab
   Then click on different tabs under gallery section
   And click on three sixty degree button
   