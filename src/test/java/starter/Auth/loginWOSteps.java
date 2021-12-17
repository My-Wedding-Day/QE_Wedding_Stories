package starter.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginWOSteps {
    @Steps
    loginWO loginWO;
    @Given("I am on the login page wo")
    public void iAmOnTheLoginPagewo() {
    }

    @When("I enter my email and password correctly wo")
    public void iEnterMyEmailAndPasswordCorrectlywo() {
        loginWO.setBodyReq();
    }

    @And("I click Login button wo")
    public void iClickLoginButtonwo() {
        loginWO.hitEndpointLogin();
    }

    @Then("I am redirected to the homepage and I redirected to homepage wo")
    public void iAmRedirectedToTheHomepageAndIRedirectedToHomepagewo() {
        loginWO.valdateEndpointLogin();
    }

    @When("I enter my email incorrectly and I enter my password correctly wo")
    public void iEnterMyEmailIncorrectlyAndIEnterMyPasswordCorrectlywo() {
        loginWO.setBodyReqInvalidEmail();
    }

    @And("I click Login button when email invalid wo")
    public void iClickLoginButtonWhenEmailInvalidwo() {
        loginWO.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message invalid email wo")
    public void iFailedToLoginAndIGotAlertMessageInvalidEmailwo() {
        loginWO.valdateEndpointLoginFailed();
    }

    @When("I enter my email correctly and I enter my password incorrectly wo")
    public void iEnterMyEmailCorrectlyAndIEnterMyPasswordIncorrectlywo() {
        loginWO.setBodyReqInvalidPass();
    }

    @And("I click Login button when password invalid wo")
    public void iClickLoginButtonWhenPasswordInvalidwo() {
        loginWO.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message invalid password wo")
    public void iFailedToLoginAndIGotAlertMessageInvalidPasswordwo() {
        loginWO.valdateEndpointLoginFailed();
    }

    @When("I enter my email incorrectly and I enter my password incorrectly wo")
    public void iEnterMyEmailIncorrectlyAndIEnterMyPasswordIncorrectlywo() {
        loginWO.setBodyReqInvalidEmailPass();
    }

    @And("I click Login button when both email and password invalid wo")
    public void iClickLoginButtonWhenBothEmailAndPasswordInvalidwo() {
        loginWO.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message invalid email and password wo")
    public void iFailedToLoginAndIGotAlertMessageInvalidEmailAndPasswordwo() {
        loginWO.valdateEndpointLoginFailed();
    }

    @When("I enter my email correctly and I blank the password field wo")
    public void iEnterMyEmailCorrectlyAndIBlankThePasswordFieldwo() {
        loginWO.setBodyReqBlankPass();
    }

    @And("I click Login button when password field is blank wo")
    public void iClickLoginButtonWhenPasswordFieldIsBlankwo() {
        loginWO.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message that password field needed to be filled wo")
    public void iFailedToLoginAndIGotAlertMessageThatPasswordFieldNeededToBeFilledwo() {
        loginWO.valdateEndpointLoginFailed();
    }

    @When("I enter my email incorrectly and I blank the password field wo")
    public void iEnterMyEmailIncorrectlyAndIBlankThePasswordFieldwo() {
        loginWO.setBodyReqBlankPassInvEmail();
    }

    @And("I click Login button when invalid email and blank password wo")
    public void iClickLoginButtonWhenInvalidEmailAndBlankPasswordwo() {
        loginWO.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message that invalid email and password field is blank wo")
    public void iFailedToLoginAndIGotAlertMessageThatInvalidEmailAndPasswordFieldIsBlankwo() {
        loginWO.valdateEndpointLoginFailed();
    }

    @When("I blank the email field and I enter my password correctly wo")
    public void iBlankTheEmailFieldAndIEnterMyPasswordCorrectlywo() {
        loginWO.setBodyReqBlankEmail();
    }

    @And("I click Login button when email field field is blank wo")
    public void iClickLoginButtonWhenEmailFieldFieldIsBlankwo() {
        loginWO.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message that email field needed to be filled wo")
    public void iFailedToLoginAndIGotAlertMessageThatEmailFieldNeededToBeFilledwo() {
        loginWO.valdateEndpointLoginFailed();
    }

    @When("I blank the email field and I enter my password incorrectly wo")
    public void iBlankTheEmailFieldAndIEnterMyPasswordIncorrectlywo() {
        loginWO.setBodyReqBlankEmailInvPass();
    }

    @And("I click Login button when blank email and invalid password wo")
    public void iClickLoginButtonWhenBlankEmailAndInvalidPasswordwo() {
        loginWO.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message that blank email and invalid password wo")
    public void iFailedToLoginAndIGotAlertMessageThatBlankEmailAndInvalidPasswordwo() {
        loginWO.valdateEndpointLoginFailed();
    }

    @When("I blank the email field and I blank the password field wo")
    public void iBlankTheEmailFieldAndIBlankThePasswordFieldwo() {
        loginWO.setBodyReqBlankEmailPass();
    }

    @And("I click Login button when email and password field is blank wo")
    public void iClickLoginButtonWhenEmailAndPasswordFieldIsBlankwo() {
        loginWO.hitEndpointLoginFailed();
    }

    @Then("I failed to login and I got alert message that email and password field is needed to be filled wo")
    public void iFailedToLoginAndIGotAlertMessageThatEmailAndPasswordFieldIsNeededToBeFilledwo() {
        loginWO.valdateEndpointLoginFailed();
    }
}
