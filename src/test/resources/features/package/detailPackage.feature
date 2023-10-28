@DetailPackage
Feature: Detail Package
  as a user
  I want to see the detail of the package
  So I can booked the wedding package

#TestPositive
  Scenario: Successful user get detail package
    Given I'm at the login page user
    And I input valid username and valid password and the click login
    When I am redirected to Home Page and I choose  the package that i want see the detail
    Then I am redirected to the detail package page