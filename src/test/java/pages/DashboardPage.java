package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy (xpath = "//span[text()='Scheduling']")
    public WebElement schedulingLink;

    @FindBy (xpath = "//span[text() = 'Logout']")
    public WebElement logoutButton;


}
