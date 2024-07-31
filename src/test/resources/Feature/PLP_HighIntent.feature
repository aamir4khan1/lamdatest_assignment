Feature: Verify high intent functionality on PDP
   
 Background: User land on spinny website and selects location
   Given user land on spinny website
   When Wait for the application page to load completely
   And user selects location

   @regression
   Scenario: User should be able to view high intent section on plp
   And user clicks on the browse car button
   Then user selects first car card
   And click on shortlist icon on PDP
   And user clicks on mobile number field
   And user enters mobile number
   And user clicks on verify number button
   And user enters otp code
   And user click on back button on pdp
   And user refresh the page
   And validate your top choice tag  
   And validate high intent test drive CTA
   And user click on spinny logo
   And user click on botnav account
   And click on logout
   And click on yes button
   
   And user clicks on the browse car button
   Then user selects first car card
   And user click on the Free test drive button
   And user clicks on mobile number field
   And user enters mobile number
   And user clicks on verify number button
   And user enters otp code
   And user click on back button on td scheduler page
   And user click on back button on pdp
   And user refresh the page
   And validate your top choice tag  
   And validate high intent test drive CTA
   And user click on spinny logo
   And user click on botnav account
   And click on logout
   And click on yes button
   
   And user clicks on the browse car button
   Then user selects first car card
   And click on calculate your emi
   And click on check eligibility on pdp
   And user clicks on mobile number field
   And user enters mobile number
   And user clicks on verify number button
   And user enters otp code
   And navigate back to pdp
   And user click on back button on pdp
   And user refresh the page
   And validate your top choice tag  
   And validate high intent test drive CTA
   And user click on spinny logo
   And user click on botnav account
   And click on logout
   And click on yes button
   
   And user clicks on the browse car button
   Then user selects first car card
   And scroll down to inspection report section
   Then click on view full report
   And user clicks on mobile number field
   And user enters mobile number
   And user clicks on verify number button
   And user enters otp code
   And click on inspection report back
   And user click on back button on pdp
   And user refresh the page
   And validate your top choice tag  
   And validate high intent test drive CTA
   And user click on spinny logo
   And user click on botnav account
   And click on logout
   And click on yes button
   
   And user clicks on the browse car button
   Then user selects first car card
   And user clicks on the Book now button
   And user clicks on mobile number field
   And user enters mobile number
   And user clicks on verify number button
   And user enters otp code
   And user click on back from book now
   And user click on back button on pdp
   And user refresh the page
   And validate your top choice tag  
   And validate high intent test drive CTA
   
   
