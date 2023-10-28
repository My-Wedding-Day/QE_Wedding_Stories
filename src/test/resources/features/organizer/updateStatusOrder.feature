@UpdateStatusOrder
Feature: Update Status Order
  As a Organizer of Wedding Stories
  I want to update status on my list order
  So that I can choose which request that i can accept or decline

  Scenario: Accept Status Order
    Given I am at the login WO Page and I enter my username and password
    And I click Login Button and I am redirected to my profile WO Page
    When I am at the profile WO then I am going to List Order Page and then click Accept Order
    Then I am successfully accept incoming order

  Scenario: Decline Status Order
    Given I am at the login WO Page and I enter my email and password
    And I click Login Button to Decline Order and I am redirected to my profile WO Page
    When I am at the profile WO then I am going to List Order Page and then click Decline Order
    Then I am successfully decline incoming order