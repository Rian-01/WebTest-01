package starter.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginPass_Invalid {
    @Steps
    LoginSteps loginSteps;

    @When("I enter my username correctly and Password Invalid")
    public void I_enter_my_Pass_Invalid() {
        loginSteps.inputPassFail();
    }

    @When("I click {string} button in page system")
    public void i_click_button_page_system(String string) {
        loginSteps.ClickLogin();
    }

    @Then("Nothing happens in page Login")
    public void I_am_stay_in_the_page_Login() {
    }
}
