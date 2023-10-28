@Payment
Feature: Payment
  As a user of Wedding Stories
  I want to book a date of wedding schedule and sending confirmed payment to organizer
  So that I can reserved wedding schedule and also doing payment

  Scenario: Create Order Successfully confirmed
    Given User  already logged in as a user that want to book a package of wedding
    And User choose the package of the wedding and arrange the date and amount of pax that i want
    And User see the detail of the booking
    When User Waiting for booking Organizer doing login
    And Organizer See Incoming Order and then doing confirmation of booking which is possible to confirm or not
    And While received the confirmation order user doing some payment and sending the invoice of the payment
    Then Admin Will receive the invoice and then decide the order is valid or not