@ProfileUser
Feature: Profile User
  as a user
  I want to get my profile
  So I can see my profile

#TestPositive
  Scenario: Successful user view profile
    Given I'm already logged in on the web wedding stories
    When I click the round button in the right corner of the screen
    And I Click Profile
    Then I am redirected to my profile
