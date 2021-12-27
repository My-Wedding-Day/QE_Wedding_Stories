package starter.Users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class editUserProfileSteps {
    @Steps
    editUserProfile editUserProfile;
    @Given("I'm at the login page user to edit profile")
    public void i_m_at_the_login_page_user_to_edit_profile() {
    }

    @When("I input valid email and valid password and then click login to edit profile")
    public void i_input_valid_email_and_valid_password_and_then_click_login_to_edit_profile() {
        editUserProfile.setBodyReq();
        editUserProfile.hitEndpointLoginUser();
    }

    @When("I am redirected to Home Page and go to profile page and input new username")
    public void i_am_redirected_to_Home_Page_and_go_to_profile_page_and_input_new_username() {
        editUserProfile.setUpdateName();
        editUserProfile.hitEndpointEditUsername();
    }

    @Then("I am successfully change my username")
    public void i_am_successfully_change_my_username() {
        editUserProfile.validateEditProfileUser();
    }

    @When("I am redirected to Home Page and go to profile page and input new email")
    public void i_am_redirected_to_Home_Page_and_go_to_profile_page_and_input_new_email() {
        editUserProfile.setUpdateEmail();
        editUserProfile.hitEndpointEditEmail();
    }

    @Then("I am successfully change my email")
    public void i_am_successfully_change_my_email() {
        editUserProfile.validateEditProfileUser();
    }

    @When("I am redirected to Home Page and go to profile page and input new password")
    public void i_am_redirected_to_Home_Page_and_go_to_profile_page_and_input_new_password() {
        editUserProfile.setUpdatePass();
        editUserProfile.hitEndpointEditPass();
    }

    @Then("I am successfully change my password")
    public void i_am_successfully_change_my_password() {
        editUserProfile.validateEditProfileUser();
    }

    @When("I am redirected to Home Page and go to profile page input blank username")
    public void i_am_redirected_to_Home_Page_and_go_to_profile_page_input_blank_username() {
        editUserProfile.setUpdateFailed();
        editUserProfile.hitEndpointEditFailed();
    }

    @Then("I am failed to change my username")
    public void i_am_failed_to_change_my_username() {
        editUserProfile.validateEditProfileUser();
    }

    @When("I input new valid email and valid password and then click login to edit profile")
    public void iInputNewValidEmailAndValidPasswordAndThenClickLoginToEditProfile() {
        editUserProfile.hitEndpointLoginUpdateEmail();
    }

    @When("I input new valid email and new valid password and then click login to edit profile")
    public void iInputNewValidEmailAndNewValidPasswordAndThenClickLoginToEditProfile() {
        editUserProfile.hitEndpointLoginUpdatePass();
    }
}
