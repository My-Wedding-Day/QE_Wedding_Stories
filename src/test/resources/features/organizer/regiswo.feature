@RegisterWo
Feature: RegisterWo
  As a Wedding Stories
  I want to Register Account as A User
  So that I can login on Website Wedding Stories

  Scenario: Register wo Success
    Given I am on the register wo page
    When I enter my username wo email and password correctly
    And I click Register wo button
    Then I am Successfully registered  wo my Account

  Scenario: Register wo failed because email already registed
    Given I am on the register wo page with failed already registed
    When I enter my username wo email and password correctly failed page email already registed
    And I click Register wo button failed email already registed
    Then I am Successfully registered  wo my Account email already registed


  Scenario: Register wo failed because name already registed
    Given I am on the register wo page with failed already name
    When I enter my username wo email and password correctly failed page email already name
    And I click Register wo button failed email already name
    Then I am Successfully registered  wo my Account email already name

  Scenario: Register wo failed because name already registed
    Given I am on the register wo page with failed already hp
    When I enter my username wo email and password correctly failed page email already hp
    And I click Register wo button failed email already hp
    Then I am Successfully registered  wo my Account email already hp

  Scenario: Register wo failed because name only space
    Given I am on the register wo only space name
    When I enter my username only space
    And I click Register wo button case only space name
    Then I am failed registered because only space

  Scenario: Register wo failed because email only space
    Given I am on the register wo email only space
    When I enter my email only space
    And I click Register wo button case only space email
    Then I am failed registered because only space email

  Scenario: Register wo failed because phone number field alphabet
    Given I am on the register wo with case phone number alphabet
    When I enter my phone number alphabet
    And I click Register wo button with alphabet phone number case
    Then I am failed registered because phone number alphabet