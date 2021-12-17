package starter.WO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class profilewoSteps {

    @Steps
    ProfileWO profilewo;

    @Given("I am already logged in on the web wedding stories")
    public void i_am_already_logged_in_on_the_web_wedding_stories() {
        profilewo.setBodyReq();
    }

    @When("I am click the round button in the right corner of the screen")
    public void i_am_click_the_round_button_in_the_right_corner_of_the_screen() {
        profilewo.hitEndpointLoginWO();
    }

    @When("I am click profile")
    public void i_am_click_profile() {
        profilewo.hitEndpointprofileWO();
    }

    @Then("I am redirected to my profile Wedding Organizer")
    public void i_am_redirected_to_my_profile_Wedding_Organizer() {
        profilewo.validateJSONSchemaprofileWO();
    }
}
