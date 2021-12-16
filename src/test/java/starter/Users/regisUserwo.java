package starter.Users;

import net.thucydides.core.annotations.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class regisUserwo {

    @Steps
    regiswo regiswo;

    @Given("I am on the register wo page")
    public void iAmOnTheRegisterwoPage() {
    }

    @When("I enter my username wo email and password correctly")
    public void iEnterMyUsernamewoEmailAndPasswordCorrectly() {
        regiswo.setBodyReqwo();
    }

    @And("I click Register wo button")
    public void iClickRegisterwoButton() {
        regiswo.hitEndpointRegisterwo();
    }
    @Then("I am Successfully registered  wo my Account")
    public void iAmSuccessfullyRegisteredwoMyAccount() {
        regiswo.valdateEndpointRegisterwo();
    }









}
