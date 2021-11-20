package starter.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginUser_Invalid {
    @Steps
    LoginSteps loginSteps;

    @When("I enter my username incorrectly and Password correctly")
    public void I_enter_my_username_correctly_and_Password_Blank() {
        loginSteps.inputUserFail();
    }

    @When("I click {string} button web")
    public void i_click_button_web(String string) {
        loginSteps.ClickLogin();
    }

    @Then("Noting Happens in Page")
    public void Nothing_Happens_in_page_Login() {
    }
}
