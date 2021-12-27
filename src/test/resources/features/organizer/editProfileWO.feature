@EditProfileWO
Feature: Edit Profile WO
  as a Organizer of Wedding Stories
  I want to edit my profile WO
  So I can change my information if that needed

  @PositiveCase
  Scenario: Successfully Edit Profile WO Form
    Given I'm at the login page WO to edit profile
    When I input valid email and valid password on WO Account and then click login to edit profile
    And I am redirected to Home Page and go to profile page to edit form WO
    Then I am successfully edit my information WO

  Scenario: Successfully Edit Photo Profile WO
    Given I'm at the login page WO to edit profile
    When I input valid email and valid password on WO Account and then click login to edit profile
    And I am redirected to Home Page and go to profile page and change profile picture
    Then I am successfully change my profile picture

  Scenario: Successfully Edit Document WO
    Given I'm at the login page WO to edit profile
    When I input valid email and valid password on WO Account and then click login to edit profile
    And I am redirected to Home Page and go to profile page and change my document profile
    Then I am successfully change my document profile
