@ProfileWO
Feature: Profile WO
  as a WO
  I want to get my profile
  So I can see my profile

#TestPositive
  Scenario: Successful user view profile
    Given I'm already logged in on the web wedding stories wo
    When I click the round button in the right corner of the screen wo
    And I Click Profile wo
    Then I am redirected to my profile wo