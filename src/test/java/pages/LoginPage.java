package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy ( name = "email" )
    public WebElement emailInput;

    @FindBy ( name = "password" )
    public WebElement passwordInput;

    @FindBy ( xpath = "//button[@type='submit']" )
    public WebElement loginButton;
}
