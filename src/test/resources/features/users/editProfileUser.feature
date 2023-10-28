@EditProfileUser
Feature: Edit Profile User
  as a user of Wedding Stories
  I want to edit my profile user
  So I can change the name or email or password if that needed

  @PositiveCase
  Scenario: Successfully Edit Username Profile
    Given I'm at the login page user to edit profile
    When I input valid email and valid password and then click login to edit profile
    And I am redirected to Home Page and go to profile page and input new username
    Then I am successfully change my username

  Scenario: Successfully Edit Email Profile
    Given I'm at the login page user to edit profile
    When I input valid email and valid password and then click login to edit profile
    And I am redirected to Home Page and go to profile page and input new email
    Then I am successfully change my email

  Scenario: Successfully Edit Password Profile
    Given I'm at the login page user to edit profile
    When I input new valid email and valid password and then click login to edit profile
    And I am redirected to Home Page and go to profile page and input new password
    Then I am successfully change my password

  @NegativeCase
  Scenario: Edit Username Failed
    Given I'm at the login page user to edit profile
    When I input new valid email and new valid password and then click login to edit profile
    And I am redirected to Home Page and go to profile page input blank username
    Then I am failed to change my username