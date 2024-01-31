Feature: Auction Details Page
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
Scenario: Verify Auction Detail tab
     And User opens auction detail page
    And Wait for page to load
    Then Verify auction details
 @Smoke @Regression   
Scenario: Verify Auction Timeline tab
    And User opens auction timeline page
    And Wait for page to load
    Then Verify auction timeline details
@Smoke @Regression   
Scenario: Verify Auction Bids tab
    And User opens auction bids page
    And Wait for page to load
    Then Verify auction bids details
@Smoke @Regression
Scenario: Verify Car Entry at hub tab
    And User opens car entry at hub page
    And Wait for page to load
    And select hub name and enter entry details 
    Then Verify success message at page
 @Smoke @Regression
 Scenario: Verify Quality Manager Update tab
    And User opens quality manager update page
    And Wait for page to load
    And update status No QM is required
    And Verify success message and auction status at QM page
  #  And Complete payment of car from app
    
     @Smoke @Regression
 Scenario: Verify Delivery tab
    And User opens delivery page
    And Wait for page to load
    And Verify Car detail on delivery tab
    
    @Smoke @Regression
 Scenario: Verify Party Peshi tab
    And User opens party peshi page
    And Wait for page to load
    And Enter and then verify party peshi detail
    
     @Smoke @Regression
 Scenario: Verify Car Exit tab
    And User opens car exit page
    And Wait for page to load
    And Enter and then verify car exit detail

    
 @Smoke @Regression
 Scenario: Verify Inspection mismatch tab
    And User opens inspection mismatch  page
    And Wait for page to load
    And Approve the inspection mismatch
    And Wait for page to load
    And Provide discount to dealer
    And Verify the status when revise price rejected by dealer
    
 @Smoke @Regression
 Scenario: Verify Dealer Negotiation tab
    And User opens dealer negotiation  page
    And Wait for page to load
    And ReNegotiate with dealer and give discounts
    And Wait for page to load
    And Verify the status when revised price accepted by dealer
    
 
   @Smoke @Regression
 Scenario: Verify buyer docs and rcd refund
 And Verify the status when buyer doc uploaded by dealer
 And User opens buyer KYC page
    And Wait for page to load
    And Verify buyer docs
    And Verify RCD refund
      
 @Smoke @Regression
 Scenario: Verify Tickets tab
    And User opens tickets page
    And Wait for page to load

 @Smoke @Regression
 Scenario: Verify Delivery Checklist tab
    And User opens delivery Checklist page

   
    
