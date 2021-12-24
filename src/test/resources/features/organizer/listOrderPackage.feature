@ListOrderWO
Feature: List Order WO
  as a Organizer of Wedding Stories
  I want to see List of Incoming Order from Users
  So I can see detail of request and do comparison of the date


  Scenario: Successful Organizer to get list incoming order
    Given I'm at the login page WO to see list Incoming order
    When I input valid email WO and valid password WO account and then click login
    And I am redirected to Home Page and go to Order List
    Then I am redirected to the Incoming Order List Page