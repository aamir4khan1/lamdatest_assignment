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
Scenario: Verify Schedule auction functionality 
     And User opens lead detail page
    And Wait for page to load
    And User generate auction report
    And User schedule the auction and verify the same
    @Smoke @Regression
Scenario: Verify Schedule auction functionality for OCB cars
     And User opens lead detail page for OCB
    And Wait for page to load
    And User generate auction report
    And User schedule the auction for ocb car and verify the same
    @Smoke @Regression
Scenario: Verify Schedule auction functionality for past time
     And User opens lead detail page
    And Wait for page to load
    And User generate auction report
    And User schedule the auction for past time and verify the same