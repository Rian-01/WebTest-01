package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPages extends PageObject {
    @FindBy(id = "submit")
    WebElement clickIconLogOut;
    public void clickButtonLogOut() {
        clickIconLogOut.click();
    }
}
