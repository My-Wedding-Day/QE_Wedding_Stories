package starter.organizer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class editProfileWOSteps {
    @Steps
    editProfileWO editProfileWO;
    @Given("I'm at the login page WO to edit profile")
    public void i_m_at_the_login_page_WO_to_edit_profile() {
    }

    @When("I input valid email and valid password on WO Account and then click login to edit profile")
    public void i_input_valid_email_and_valid_password_on_WO_Account_and_then_click_login_to_edit_profile() {
        editProfileWO.setBodyReq();
        editProfileWO.hitEndpointLoginWO();
    }

    @When("I am redirected to Home Page and go to profile page to edit form WO")
    public void i_am_redirected_to_Home_Page_and_go_to_profile_page_to_edit_form_WO() {
        editProfileWO.hitEndpointEditFormWO();
    }

    @Then("I am successfully edit my information WO")
    public void i_am_successfully_edit_my_information_WO() {
        editProfileWO.validateEditProfileWO();
    }

    @When("I am redirected to Home Page and go to profile page and change profile picture")
    public void i_am_redirected_to_Home_Page_and_go_to_profile_page_and_change_profile_picture() {
        editProfileWO.hitEndpointEditPhotoWO();
    }

    @Then("I am successfully change my profile picture")
    public void i_am_successfully_change_my_profile_picture() {
        editProfileWO.validateEditProfileWO();
    }

    @When("I am redirected to Home Page and go to profile page and change my document profile")
    public void i_am_redirected_to_Home_Page_and_go_to_profile_page_and_change_my_document_profile() {
        editProfileWO.hitEndpointEditDocWO();
    }

    @Then("I am successfully change my document profile")
    public void i_am_successfully_change_my_document_profile() {
        editProfileWO.validateEditProfileWO();
    }
}
