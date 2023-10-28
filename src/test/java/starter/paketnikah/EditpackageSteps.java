package starter.paketnikah;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EditpackageSteps {
    @Steps
    Editpackage editpackage;

    @Given("I'm already logged in on the web wedding stories as edit wo")
    public void i_m_already_logged_in_on_the_web_wedding_stories_as_edit_wo() {
        editpackage.setBodyReqwo();
    }

    @When("I click the round button in the right corner of the screen as edit wo")
    public void i_click_the_round_button_in_the_right_corner_of_the_screen_as_edit_wo() {
        editpackage.hitEndpointLoginWO();
    }

    @When("I Click edit wo package")
    public void i_Click_edit_wo_package() {
        editpackage.hitEndpointEditPackage();
    }

    @Then("I am  successfully edit wo package")
    public void i_am_successfully_edit_wo_package() {
        editpackage.validateEndpointEditPackage();
    }
}
