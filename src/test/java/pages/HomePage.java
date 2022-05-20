package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy ( xpath = "//button[text() = 'Services']" )
    public WebElement services;

    @FindBy ( xpath = "//button[text() = 'Features']")
    public WebElement features;

    @FindBy ( xpath = "//a[text() = 'Pricing']")
    public WebElement pricing;

    @FindBy ( xpath = "//a[text() = 'Contact us']")
    public WebElement contactUs;

    @FindBy ( xpath = "//a[text() = 'About us']")
    public WebElement aboutUs;

    @FindBy ( xpath = "//a[@gloss='how it works?']")
    public WebElement howItWorks;

    @FindBy ( xpath = "//a[text() = 'Login']")
    public WebElement login;

    @FindBy ( xpath = "//button[text() = 'Sign Up']")
    public WebElement signUp;

}
