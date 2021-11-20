package starter.TestLogOut;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LogOutSteps;

public class LogOutSuccess {
    @Steps
    LogOutSteps logOut;
    @When("I click {string} button in page Books Store")
    public void i_click_button_Books_Store(String string) {
        logOut.ClickLogOutButton();
    }

    @Then("I am back to Login page")
    public void i_am_back_to_Login_page() {
    }

}
