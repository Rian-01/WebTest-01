package starter.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginPass_Blank {
    @Steps
    LoginSteps loginSteps;

    @When("I enter my username correctly and Password Blank")
    public void I_enter_my_username_correctly_and_Password_Blank() {
        loginSteps.inputPassBlank();
    }

    @When("I click {string} button in web")
    public void i_click_button_web(String string) {
        loginSteps.ClickLogin();
    }

    @Then("Warning invalid pass or username")
    public void I_am_stay_in_the_page_Login() {
    }
}
