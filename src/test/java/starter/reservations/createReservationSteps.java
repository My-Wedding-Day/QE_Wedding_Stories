package starter.reservations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class createReservationSteps {
    @Steps
    createReservation createReservation;
    @Given("I am already logged in as a user that want to book a date of wedding")
    public void i_am_already_logged_in_as_a_user_that_want_to_book_a_date_of_wedding() {
        createReservation.setBodyReq();
    }

    @When("I choose the package of the wedding and arrange the date and amount of pax that i want to reserve")
    public void i_choose_the_package_of_the_wedding_and_arrange_the_date_and_amount_of_pax_that_i_want_to_reserve() {
        createReservation.hitEndpointLoginUser();
    }

    @When("I click Order button")
    public void i_click_Order_button() {
        createReservation.hitEndpointCreateOrder();
    }

    @Then("I am successfully reserved the date of the wedding and waiting for the approval from the organizer")
    public void i_am_successfully_reserved_the_date_of_the_wedding_and_waiting_for_the_approval_from_the_organizer() {
        createReservation.validateOrderPackage();
    }
}
