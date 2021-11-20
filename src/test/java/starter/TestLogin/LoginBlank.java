package starter.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginBlank {
    @Steps
    LoginSteps loginSteps;

    @When("I enter my username and Password Blank")
    public void i_enter_my_username_and_Password_Blank() {
        loginSteps.inputUserPassBlank();
    }

    @When("I click {string} button in page")
    public void i_click_button_page(String string) {
        loginSteps.ClickLogin();
    }

    @Then("I am stay in the page Login")
    public void I_am_stay_in_the_page_Login() {
    }
}
