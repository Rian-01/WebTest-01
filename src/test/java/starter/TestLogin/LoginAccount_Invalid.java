package starter.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginAccount_Invalid {
    @Steps
    LoginSteps loginSteps;

    @When("I enter my username and Password incorrectly")
    public void i_enter_my_username_and_Password_Invalid() {
        loginSteps.inputAccountFail();
    }

    @When("I click {string} in page")
    public void i_click_button_in_page(String string) {
        loginSteps.ClickLogin();
    }

    @Then("Warning system invalid pass or username")
    public void Warning_system() {
    }
}
