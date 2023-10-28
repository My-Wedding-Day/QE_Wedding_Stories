@AddPackage
Feature: Add a Package
  as a Wedding Organizer
  I want to add a Package Wedding into my Profile
  So I can promote my wedding package on the Website

#TestPositive
  Scenario: Successful Adding a Package into profile
    Given I need to login on the web first
    When I click the login account as organizer and go to Add Package Form
    And I input the data that needed to fulfill before
    Then I am successfully add a package wedding