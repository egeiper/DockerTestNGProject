package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "[id=\"user-name\"]")
    public WebElement username;

    @FindBy(css = "[id=\"password\"]")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

}
