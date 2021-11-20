package starter.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginUser_Blank {
    @Steps
    LoginSteps loginSteps;

    @When("I enter my username Blank")
    public void I_enter_my_username_Blank() {
        loginSteps.inputUserNameBlank();
    }

    @When("I click {string} button in web system")
    public void i_click_button_web(String string) {
        loginSteps.ClickLogin();
    }

    @Then("Nothing happens in page web")
    public void Waring_page_Login() {
    }
}
