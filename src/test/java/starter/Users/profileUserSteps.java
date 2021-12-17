package starter.Users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class profileUserSteps {
    @Steps
    profileUser Profileuser;

    @Given("I'm already logged in on the web wedding stories")
    public void i_m_already_logged_in_on_the_web_wedding_stories() {
        Profileuser.setBodyReq();
    }

    @When("I click the round button in the right corner of the screen")
    public void i_click_the_round_button_in_the_right_corner_of_the_screen() {
        Profileuser.hitEndpointLoginUser();

    }

    @When("I Click Profile")
    public void i_Click_Profile() {
        Profileuser.hitEndpointprofileUser();
    }

    @Then("I am redirected to my profile")
    public void i_am_redirected_to_my_profile() {
        Profileuser.validateJSONSchemaprofileUser();

    }
}
