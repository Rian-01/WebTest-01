package starter.TestRegis;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.RegisSteps;

public class RegisSuccess {
    @Steps
    RegisSteps regis;

    @Given("I am on the Login in this page")
    public void I_am_on_the_Login_in_page() {
        regis.openHomePages();
//        regis.clickBookStoreIcon();
        regis.openLoginPages();
    }


    @When("I click {string} in page Registration")
    public void i_click_button_now(String string) {
        regis.ClickNewUser();
    }

    @When("I enter First Name, Last Name, UserName, and Password")
    public void i_enter_my_username_and_Password_Blank() {
        regis.InputRegisterAccount();
    }

    @When("I click {string} robot")
    public void i_click_button_(String string) {
//        regis.ClickCaptcha();
    }

    @When("I click {string} in page Regis")
    public void i_click_button_page_register(String string) {
//        regis.ClickRegister();
    }
    @Then("I was make a New Account")
    public void I_was_make_a_New_Account() {
    }
}
