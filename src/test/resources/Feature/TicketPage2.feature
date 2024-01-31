Feature: Auction CRM Ticket Page
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
Scenario: Verify Inspection mismatch ticket
     And User opens Tickets page1
   And Wait for page to load
   And selects active ticket from dropdown1
    And verify ticket by clicking on ticket link1
    Then Approve IM
    
@Smoke @Regression
Scenario: Verify price modify request ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects price modify active ticket from dropdown1
 Then verify price modify ticket by clicking on ticket link1
 
 @Smoke @Regression
Scenario: Verify Inspection mismatch by qm ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects IM by qm active ticket from dropdown1
 Then verify IM by qm ticket by clicking on ticket link1
 
  @Smoke @Regression
Scenario: Verify party peshi request ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects party peshi request active ticket from dropdown1
 Then verify party peshi request ticket by clicking on ticket link1
 
   @Smoke @Regression
Scenario: Verify wallet balance withdrawl ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects wallet balance withdrawl active ticket from dropdown1
 Then verify wallet balance withdrawl ticket by clicking on ticket link1
 
    @Smoke @Regression
Scenario: Verify add pricing request ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects add pricing request active ticket from dropdown1
 And verify add pricing request ticket by clicking on ticket link1
 Then Enter pricing details
 
     @Smoke @Regression
Scenario: Verify rcd refund ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects rcd refund active ticket from dropdown1
 Then verify rcd refund ticket by clicking on ticket link1
 
      @Smoke @Regression
Scenario: Verify schedule auction request ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects schedule auction request active ticket from dropdown1
 Then verify schedule auction request ticket by clicking on ticket link1
 
      @Smoke @Regression
Scenario: Verify verify buyer rto ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects verify buyer rto active ticket from dropdown1
 And verify verify buyer rto ticket by clicking on ticket link1
 Then verify buyer rto
        @Smoke @Regression
Scenario: Verify assign KAM ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects assign KAM active ticket from dropdown1
 And verify assign KAM ticket by clicking on ticket link1
 Then Assign KAM
 
          @Smoke @Regression
Scenario: Verify Quality Check Needed ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects Quality Check Needed active ticket from dropdown1
 Then verify Quality Check Needed ticket by clicking on ticket link1
 
           @Smoke @Regression
Scenario: Verify Delivery planned at hub ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects Delivery planned at hub active ticket from dropdown1
 Then verify Delivery planned at hub ticket by clicking on ticket link1
 
            @Smoke @Regression
Scenario: Verify Mark Delivery ticket
     And User opens Tickets page1
   And Wait for page to load
 And selects Mark Delivery active ticket from dropdown1
 Then verify Mark Delivery ticket by clicking on ticket link1
 
            @Smoke @Regression
Scenario: Verify Make Delivery ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects Make Delivery active ticket from dropdown1
 Then verify Make Delivery ticket by clicking on ticket link1
 
   @Smoke @Regression
Scenario: Verify Make Payment ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects Make Payment active ticket from dropdown1
 Then verify Make Payment ticket by clicking on ticket link1
 
     @Smoke @Regression
Scenario: Verify Delivery Checklist ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects Delivery Checklist active ticket from dropdown1
 Then verify Delivery Checklist ticket by clicking on ticket link1
 
  # @Smoke @Regression
#Scenario: Verify Request Auction Document ticket
 #    And User opens Tickets page1
 #   And Wait for page to load
# And selects Request Auction Document active ticket from dropdown1
# Then verify Request Auction Document ticket by clicking on ticket link
 
     @Smoke @Regression
Scenario: Verify Dealer Support ticket
    And User opens Tickets page1
    And Wait for page to load
 And selects Dealer Support active ticket from dropdown1
 And verify Dealer Support ticket by clicking on ticket link1
 Then Chat with dealer and resolve ticket
 
     @Smoke @Regression
Scenario: Verify Dealer Negotiation KAM ticket
     And User opens Tickets page1
  And Wait for page to load
 And selects Dealer Negotiation KAM active ticket from dropdown1
 And verify Dealer Negotiation KAM ticket by clicking on ticket link1
 #Then Resolve Dealer Negotiation KAM
 
       @Smoke @Regression
Scenario: Verify Approve cash deposit at hub ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects Approve cash deposit at hub active ticket from dropdown1
 And verify Approve cash deposit at hub ticket by clicking on ticket link1
 Then Approve cash deposit request
 
        @Smoke @Regression
Scenario: Verify Enter Delivery Date ticket
     And User opens Tickets page1
    And Wait for page to load
 And selects Enter Delivery Date active ticket from dropdown1
 Then verify Enter Delivery Date ticket by clicking on ticket link1
 
   @Smoke @Regression
 Scenario: Verify verify_dealer_bank_account ticket
     And User opens Tickets page1
   And Wait for page to load
   And selects verify_dealer_bank_account active ticket from dropdown1
    And verify verify_dealer_bank_account ticket by clicking on ticket link1
    Then verify bank account