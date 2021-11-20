package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends PageObject {

    @FindBy(xpath ="//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
    WebElement iconBooksStore;
    public void clickIconBooksStore() {
//        waitForCondition().until(ExpectedCondition.elementToBeClickable(iconBooksStore));
        iconBooksStore.click();
    }

    @FindBy(id = "login")
    WebElement buttonLogin;
    public void clickButtonLogin() {
        buttonLogin.click();
    }

    @FindBy(id = "userName")
    WebElement inputUserName;

    @FindBy(id = "password")
    WebElement inputPass;

    @FindBy(id ="login")
    WebElement ButtonLogin;

    public void inputAccountInvalid() {
        inputUserName.sendKeys("admin2");
        inputPass.sendKeys("Demoakun@02");
    }

    public void inputUserNamePassBlank() {
        inputUserName.sendKeys("");
        inputPass.sendKeys("");
    }

    public void inputPassBlank() {
        inputUserName.sendKeys("admin1");
        inputPass.sendKeys("");
    }

    public void inputPassInvalid() {
        inputUserName.sendKeys("admin1");
        inputPass.sendKeys("Demoakun@02");
    }

    public void inputUserNamePassValid() {
        inputUserName.sendKeys("admin1");
        inputPass.sendKeys("Demoakun@01");
    }

    public void inputUserBlank() {
        inputUserName.sendKeys("");
        inputPass.sendKeys("Demoakun@01");
    }

    public void inputUserInvalid() {
        inputUserName.sendKeys("admin2");
        inputPass.sendKeys("Demoakun@01");
    }




    public void clickLogin() {
        ButtonLogin.click();
    }
}
