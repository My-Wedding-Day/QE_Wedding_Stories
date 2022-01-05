package starter.payment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class paymentSteps {
    @Steps
    payment payment;

    @Given("User  already logged in as a user that want to book a package of wedding")
    public void user_already_logged_in_as_a_user_that_want_to_book_a_package_of_wedding() {
        payment.hitEndpointLoginUserPayment();
    }

    @Given("User choose the package of the wedding and arrange the date and amount of pax that i want")
    public void user_choose_the_package_of_the_wedding_and_arrange_the_date_and_amount_of_pax_that_i_want() {
        payment.hitEndpointBookingOrder();
    }

    @Given("User see the detail of the booking")
    public void user_see_the_detail_of_the_booking() {
        payment.hitEndpointLoginWOPayment();
    }

    @When("User Waiting for booking Organizer doing login")
    public void user_Waiting_for_booking_Organizer_doing_login() {
        payment.hitEndpointGetReservationUser();
    }

    @When("Organizer See Incoming Order and then doing confirmation of booking which is possible to confirm or not")
    public void organizer_See_Incoming_Order_and_then_doing_confirmation_of_booking_which_is_possible_to_confirm_or_not() {
        payment.hitEndpointAcceptOrderWO();
    }

    @When("While received the confirmation order user doing some payment and sending the invoice of the payment")
    public void while_received_the_confirmation_order_user_doing_some_payment_and_sending_the_invoice_of_the_payment() {
        payment.hitEndpointSendInvoice();
    }

    @Then("Admin Will receive the invoice and then decide the order is valid or not")
    public void admin_Will_receive_the_invoice_and_then_decide_the_order_is_valid_or_not() {
        payment.hitEndpointLoginAdminPayment();
        payment.hitEndpointUpdatePayment();
        payment.validateOrderPackage();
    }
}
