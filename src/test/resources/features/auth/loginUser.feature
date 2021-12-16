@LoginUser
Feature: Login
  As a Wedding Stories
  I want to see my Homepage
  So that I can see the package and book the package of wedding

  Scenario: Login Success with valid email valid password
    Given I am on the login page
    When I enter my email and password correctly
    And I click Login button
    Then I am redirected to the homepage and I redirected to homepage

  Scenario: Login Failed with invalid email and valid password
    Given I am on the login page
    When I enter my email incorrectly and I enter my password correctly
    And I click Login button when email invalid
    Then I failed to login and I got alert message invalid email

  Scenario: Login Failed with valid email and invalid password
    Given I am on the login page
    When I enter my email correctly and I enter my password incorrectly
    And I click Login button when password invalid
    Then I failed to login and I got alert message invalid password

  Scenario: Login Failed with invalid email and invalid password
    Given I am on the login page
    When I enter my email incorrectly and I enter my password incorrectly
    And I click Login button when both email and password invalid
    Then I failed to login and I got alert message invalid email and password

  Scenario: Login Failed with valid email and blank password
    Given I am on the login page
    When I enter my email correctly and I blank the password field
    And I click Login button when password field is blank
    Then I failed to login and I got alert message that password field needed to be filled

  Scenario: Login Failed with invalid email and blank password
    Given I am on the login page
    When I enter my email incorrectly and I blank the password field
    And I click Login button when invalid email and blank password
    Then I failed to login and I got alert message that invalid email and password field is blank

  Scenario: Login Failed with blank email and valid password
    Given I am on the login page
    When I blank the email field and I enter my password correctly
    And I click Login button when email field field is blank
    Then I failed to login and I got alert message that email field needed to be filled

  Scenario: Login Failed with blank email and invalid password
    Given I am on the login page
    When I blank the email field and I enter my password incorrectly
    And I click Login button when blank email and invalid password
    Then I failed to login and I got alert message that blank email and invalid password

  Scenario: Login Failed with blank email and blank password
    Given I am on the login page
    When I blank the email field and I blank the password field
    And I click Login button when email and password field is blank
    Then I failed to login and I got alert message that email and password field is needed to be filled