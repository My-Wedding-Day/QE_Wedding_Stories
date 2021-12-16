package starter.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class loginUserSteps {
    @Steps
    loginUser loginUser;
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
    }

    @When("I enter my email and password correctly")
    public void iEnterMyEmailAndPasswordCorrectly() {
        loginUser.setBodyReq();
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginUser.hitEndpointLogin();
    }

    @Then("I am redirected to the homepage and I redirected to homepage")
    public void iAmRedirectedToTheHomepageAndIRedirectedToHomepage() {
        loginUser.valdateEndpointLogin();
    }

    @When("I enter my email incorrectly and I enter my password correctly")
    public void iEnterMyEmailIncorrectlyAndIEnterMyPasswordCorrectly() {
        loginUser.setBodyReqInvalidEmail();
    }

    @And("I click Login button when email invalid")
    public void iClickLoginButtonWhenEmailInvalid() {
        loginUser.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message invalid email")
    public void iFailedToLoginAndIGotAlertMessageInvalidEmail() {
        loginUser.valdateEndpointLoginFailed();
    }

    @When("I enter my email correctly and I enter my password incorrectly")
    public void iEnterMyEmailCorrectlyAndIEnterMyPasswordIncorrectly() {
        loginUser.setBodyReqInvalidPass();
    }

    @And("I click Login button when password invalid")
    public void iClickLoginButtonWhenPasswordInvalid() {
        loginUser.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message invalid password")
    public void iFailedToLoginAndIGotAlertMessageInvalidPassword() {
        loginUser.valdateEndpointLoginFailed();
    }

    @When("I enter my email incorrectly and I enter my password incorrectly")
    public void iEnterMyEmailIncorrectlyAndIEnterMyPasswordIncorrectly() {
        loginUser.setBodyReqInvalidEmailPass();
    }

    @And("I click Login button when both email and password invalid")
    public void iClickLoginButtonWhenBothEmailAndPasswordInvalid() {
        loginUser.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message invalid email and password")
    public void iFailedToLoginAndIGotAlertMessageInvalidEmailAndPassword() {
        loginUser.valdateEndpointLoginFailed();
    }

    @When("I enter my email correctly and I blank the password field")
    public void iEnterMyEmailCorrectlyAndIBlankThePasswordField() {
        loginUser.setBodyReqBlankPass();
    }

    @And("I click Login button when password field is blank")
    public void iClickLoginButtonWhenPasswordFieldIsBlank() {
        loginUser.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message that password field needed to be filled")
    public void iFailedToLoginAndIGotAlertMessageThatPasswordFieldNeededToBeFilled() {
        loginUser.valdateEndpointLoginFailed();
    }

    @When("I enter my email incorrectly and I blank the password field")
    public void iEnterMyEmailIncorrectlyAndIBlankThePasswordField() {
        loginUser.setBodyReqBlankPassInvEmail();
    }

    @And("I click Login button when invalid email and blank password")
    public void iClickLoginButtonWhenInvalidEmailAndBlankPassword() {
        loginUser.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message that invalid email and password field is blank")
    public void iFailedToLoginAndIGotAlertMessageThatInvalidEmailAndPasswordFieldIsBlank() {
        loginUser.valdateEndpointLoginFailed();
    }

    @When("I blank the email field and I enter my password correctly")
    public void iBlankTheEmailFieldAndIEnterMyPasswordCorrectly() {
        loginUser.setBodyReqBlankEmail();
    }

    @And("I click Login button when email field field is blank")
    public void iClickLoginButtonWhenEmailFieldFieldIsBlank() {
        loginUser.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message that email field needed to be filled")
    public void iFailedToLoginAndIGotAlertMessageThatEmailFieldNeededToBeFilled() {
        loginUser.valdateEndpointLoginFailed();
    }

    @When("I blank the email field and I enter my password incorrectly")
    public void iBlankTheEmailFieldAndIEnterMyPasswordIncorrectly() {
        loginUser.setBodyReqBlankEmailInvPass();
    }

    @And("I click Login button when blank email and invalid password")
    public void iClickLoginButtonWhenBlankEmailAndInvalidPassword() {
        loginUser.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message that blank email and invalid password")
    public void iFailedToLoginAndIGotAlertMessageThatBlankEmailAndInvalidPassword() {
        loginUser.valdateEndpointLoginFailed();
    }

    @When("I blank the email field and I blank the password field")
    public void iBlankTheEmailFieldAndIBlankThePasswordField() {
        loginUser.setBodyReqBlankEmailPass();
    }

    @And("I click Login button when email and password field is blank")
    public void iClickLoginButtonWhenEmailAndPasswordFieldIsBlank() {
        loginUser.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message that email and password field is needed to be filled")
    public void iFailedToLoginAndIGotAlertMessageThatEmailAndPasswordFieldIsNeededToBeFilled() {
        loginUser.valdateEndpointLoginFailed();
    }
}
