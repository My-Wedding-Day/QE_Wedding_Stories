@ListOrderUser
Feature: List Order User
  as a user of Wedding Stories
  I want to see List of my Order History
  So I can see that my booking is already confirm or not


  Scenario: Successful user get list order
    Given I'm at the login page user to see list order
    When I input valid email and valid password and the click login
    And I am redirected to Home Page and go to History Order
    Then I am redirected to the History Order Page