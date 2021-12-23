package starter.paketnikah;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class listOrderPackageSteps {
    @Steps
    listOrderPackage listOrderPackage;
    @Given("I'm at the login page WO to see list Incoming order")
    public void i_m_at_the_login_page_WO_to_see_list_Incoming_order() {
        listOrderPackage.setBodyReq();
    }

    @When("I input valid email WO and valid password WO account and then click login")
    public void i_input_valid_email_WO_and_valid_password_WO_account_and_then_click_login() {
        listOrderPackage.hitEndpointLoginWO();
    }

    @When("I am redirected to Home Page and go to Order List")
    public void i_am_redirected_to_Home_Page_and_go_to_Order_List() {
        listOrderPackage.hitEndpointListOrderWO();
    }

    @Then("I am redirected to the Incoming Order List Page")
    public void i_am_redirected_to_the_Incoming_Order_List_Page() {
        listOrderPackage.validateListOrderWO();
    }
}
