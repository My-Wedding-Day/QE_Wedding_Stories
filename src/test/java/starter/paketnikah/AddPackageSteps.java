package starter.paketnikah;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddPackageSteps {
    @Steps
    AddPackage addPackage;

    @Given("I need to login on the web first")
    public void i_need_to_login_on_the_web_first() {
        addPackage.setBodyReq();
    }

    @When("I click the login account as organizer and go to Add Package Form")
    public void i_click_the_login_account_as_organizer_and_go_to_Add_Package_Form() {
        addPackage.hitEndpointLoginWO();
    }

    @When("I input the data that needed to fulfill before")
    public void i_input_the_data_that_needed_to_fulfill_before() {
        addPackage.hitEndpointAddPackage();
    }

    @Then("I am successfully add a package wedding")
    public void i_am_successfully_add_a_package_wedding() {
        addPackage.validateEndpointAddPackage();
    }
}
