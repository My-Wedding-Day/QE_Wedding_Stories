package starter.organizer;

import net.thucydides.core.annotations.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class regiswoSteps {
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

    //scenario case email already registed

    @Given("I am on the register wo page with failed already registed")
    public void iAmOnTheRegisterwoPagewithfailedalreadyregisted() {
    }

    @When("I enter my username wo email and password correctly failed page email already registed")
    public void iEnterMyUsernamewoEmailAndPasswordCorrectlyfailedpagealreadyregisted() {
        regiswo.setBodyReqwofailedregistedemail();
    }

    @And("I click Register wo button failed email already registed")
    public void iClickRegisterwoButtonfailedemailalreadyregisted() {
        regiswo.hitEndpointRegisterwoemailalreadyregistred();
    }

    @Then("I am Successfully registered  wo my Account email already registed")
    public void iAmSuccessfullyRegisteredwoMyAccountemailalreadyregisted() {
        regiswo.valdateEndpointRegisterwoemailalreadyregitered();
    }

//Scenario complate data name registered

    @Given("I am on the register wo page with failed already name")
    public void iAmOnTheRegisterwoPagewithfailedalreadyregistedname() {
    }

    @When("I enter my username wo email and password correctly failed page email already name")
    public void iEnterMyUsernamewoEmailAndPasswordCorrectlyfailedpagealreadyregistedname() {
        regiswo.setBodyReqwofailedregistedname();
    }

    @And("I click Register wo button failed email already name")
    public void iClickRegisterwoButtonfailedemailalreadyregistedname() {
        regiswo.hitEndpointRegisterwonamealreadyregistred();
    }

    @Then("I am Successfully registered  wo my Account email already name")
    public void iAmSuccessfullyRegisteredwoMyAccountemailalreadyregistedname() {
        regiswo.valdateEndpointRegisterwonamealreadyregitered();
    }
//scenario with no hp already registed

    @Given("I am on the register wo page with failed already hp")
    public void iAmOnTheRegisterwoPagewithfailedalreadyregistedhp() {
    }

    @When("I enter my username wo email and password correctly failed page email already hp")
    public void iEnterMyUsernamewoEmailAndPasswordCorrectlyfailedpagealreadyregistedhp() {
        regiswo.setBodyReqwofailedregistedhp();
    }

    @And("I click Register wo button failed email already hp")
    public void iClickRegisterwoButtonfailedemailalreadyregistedhp() {
        regiswo.hitEndpointRegisterwohpalreadyregistred();
    }

    @Then("I am Successfully registered  wo my Account email already hp")
    public void iAmSuccessfullyRegisteredwoMyAccountemailalreadyregistedhp() {
        regiswo.valdateEndpointRegisterwohpalreadyregitered();
    }

//name only space

    @Given("I am on the register wo only space name")
    public void iAmOnTheRegisteronlyspace() {
    }

    @When("I enter my username only space")
    public void iEnterMyUsernamewoonlyspace() {
        regiswo.setBodyReqwonameonlyspace();
    }

    @And("I click Register wo button case only space name")
    public void iClickRegisterwoButtononlyspace() {
        regiswo.setBodyReqwonameonlyspace();
    }

    @Then("I am failed registered because only space")
    public void iAmFailedbecausenameonlyspace() {
        regiswo.valdateEndpointnameonlyspace();
    }



//email only space

    @Given("I am on the register wo email only space")
    public void iAmOnTheRegisteremailonlyspace() {
    }

    @When("I enter my email only space")
    public void iEnterMyemailwoonlyspace() {
        regiswo.setBodyReqwoemailonlyspace();
    }

    @And("I click Register wo button case only space email")
    public void iClickRegisterwoButtonemailonlyspace() {
        regiswo.setBodyReqwoemailonlyspace();
    }

    @Then("I am failed registered because only space email")
    public void iAmFailedbecaemailonlyspace() {
        regiswo.valdateEndpointemailonlyspace();
    }


// phone number field alphabet

    @Given("I am on the register wo with case phone number alphabet")
    public void iAmOnTheRegisterandfieldphonenumberalphabet() {
    }

    @When("I enter my phone number alphabet")
    public void iEnterMyphonenumberalphabet() {
        regiswo.setBodyReqwoemailonlyspace();
    }

    @And("I click Register wo button with alphabet phone number case")
    public void iClickRegisterwoButtonphonenumberalphabetcase() {
        regiswo.setBodyReqwoemailonlyspace();
    }

    @Then("I am failed registered because phone number alphabet")
    public void iAmFailedbecausephonenumberfieldalphabet() {
        regiswo.valdateEndpointemailonlyspace();
    }

}
