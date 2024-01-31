Feature: Schedule Auction Page
Background: Login into the CRM 
Given User open CRM URL
    When Wait for the CRM page to load completely
    And User enter username
    And User enter password
    And User click on login button
    And Wait for page to load
    Given User select superadmin role
    And Wait for page to load
    
@Smoke @Regression
Scenario: Verify Schedule auction functionality in luxury car
     And User opens lead detail page in luxury car
    And Wait for page to load
    And User generate auction report in luxury car
    And User schedule the auction and verify the same in luxury car
    @Smoke @Regression
Scenario: Verify Schedule auction functionality for OCB cars in luxury car
     And User opens lead detail page for OCB in luxury car
    And Wait for page to load
    And User generate auction report in luxury car
    And User schedule the auction for ocb car and verify the same in luxury car
    