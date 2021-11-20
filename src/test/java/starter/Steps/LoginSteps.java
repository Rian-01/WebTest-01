package starter.Steps;

import starter.Pages.LoginPages;

public class LoginSteps {

  LoginPages loginPages;
  public void openHomePage() {
      loginPages.open();
  }

  public void openLoginPage() {
//      loginPages.clickIconBooksStore();
      loginPages.clickButtonLogin();
  }


//  ################################################## INPUT USERNAME AND PASSWORD #####################################

    public void inputAccountFail() {
        loginPages.inputAccountInvalid();
    }

    public void inputUserPassBlank() {
        loginPages.inputUserNamePassBlank();
    }

    public void inputPassBlank() {
        loginPages.inputPassBlank();
    }

    public void inputPassFail() {
        loginPages.inputPassInvalid();
    }

    public void inputAccountValid() {
        loginPages.inputUserNamePassValid();
    }

    public void inputUserNameBlank() {
        loginPages.inputUserBlank();
    }

    public void inputUserFail() {
        loginPages.inputUserInvalid();
    }
//    #################################################################################################################


  public void ClickLogin() {
      loginPages.clickButtonLogin();
  }
}
