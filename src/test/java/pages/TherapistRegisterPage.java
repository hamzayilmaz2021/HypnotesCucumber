package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TherapistRegisterPage extends BasePage{

    @FindBy ( id = "fullname-input")
    public WebElement nameInput;

    @FindBy ( id = "registration_form_email" )
    public WebElement emailInput;

    @FindBy ( id = "pass-input" )
    public WebElement passwordInput;

    @FindBy ( id = "length")
    public WebElement ruleLength;

    @FindBy ( id = "letter")
    public WebElement ruleLetter;

    @FindBy ( id = "capital" )
    public WebElement ruleCapital;

    @FindBy ( id = "number")
    public WebElement ruleNumber;

    @FindBy ( id = "special")
    public WebElement ruleSpecial;

    @FindBy ( id= "register-submit")
    public WebElement singnUpButton;

    @FindBy ( className = "valid")
    public List<WebElement> validList;

}
