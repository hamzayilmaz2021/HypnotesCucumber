package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddClientPage extends BasePage {
    @FindBy ( xpath = "//button[text()='Add']")
    public WebElement addButton;

    @FindBy ( xpath = "//button/span[text()='Yes']")
    public WebElement yesButton;

}
