package starter.Steps;

import starter.Pages.RegisPages;

public class RegisSteps {

    RegisPages regisPages;
    public void openHomePages() {
        regisPages.open();
    }

    public void clickBookStoreIcon() {
        regisPages.clickBooksStores();
    }
    public void openLoginPages() {
        regisPages.clickIcLogin();
    }

    public void ClickNewUser() {
        regisPages.clickButtonNewUser();
    }

    public void InputRegisterAccount() {
        regisPages.InputAccountRegister();
    }

    public void ClickCaptcha() {
        regisPages.clickIconCaptcha();
    }

    public void ClickRegister() {
        regisPages.clickIconRegis();
    }

}
