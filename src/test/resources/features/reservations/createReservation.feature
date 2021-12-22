@CreateReservation
Feature: Create Reservation
  As a user of Wedding Stories
  I want to book a date of wedding schedule
  So that I can reserve the date and package of the wedding

  Scenario: Create Reservation Successfully
    Given I am already logged in as a user that want to book a date of wedding
    When I choose the package of the wedding and arrange the date and amount of pax that i want to reserve
    And I click Order button
    Then I am successfully reserved the date of the wedding and waiting for the approval from the organizer