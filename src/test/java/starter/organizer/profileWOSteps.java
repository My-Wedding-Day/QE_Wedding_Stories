package starter.organizer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class profileWOSteps {
    @Steps
    profileWO ProfilWO;

    @Given("I'm already logged in on the web wedding stories wo")
    public void i_m_already_logged_in_on_the_web_wedding_storieswo() {
        ProfilWO.setBodyReq();
    }

    @When("I click the round button in the right corner of the screen wo")
    public void i_click_the_round_button_in_the_right_corner_of_the_screenwo() {
        ProfilWO.hitEndpointLoginUser();

    }

    @When("I Click Profile wo")
    public void i_Click_Profilewo() {
        ProfilWO.hitEndpointprofileUser();
    }

    @Then("I am redirected to my profile wo")
    public void i_am_redirected_to_my_profilewo() {
        ProfilWO.validateJSONSchemaprofileUser();

    }
}
