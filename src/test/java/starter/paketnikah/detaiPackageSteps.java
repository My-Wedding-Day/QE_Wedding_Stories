package starter.paketnikah;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class detaiPackageSteps {
    @Steps
    detailPackage detailPackage;
    @Given("I'm at the login page user")
    public void iMAtTheLoginPageUser() {
        detailPackage.setBodyReq();
    }

    @And("I input valid username and valid password and the click login")
    public void iInputValidUsernameAndValidPasswordAndTheClickLogin() {
        detailPackage.hitEndpointLoginUser();
    }

    @When("I am redirected to Home Page and I choose  the package that i want see the detail")
    public void iAmRedirectedToHomePageAndIChooseThePackageThatIWantSeeTheDetail() {
        detailPackage.hitEndpointDetailPackage();
    }

    @Then("I am redirected to the detail package page")
    public void iAmRedirectedToTheDetailPackagePage() {
        detailPackage.validateDetailPackage();
    }
}
