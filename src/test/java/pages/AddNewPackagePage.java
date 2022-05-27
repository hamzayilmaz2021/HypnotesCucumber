package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewPackagePage extends BasePage{

    @FindBy ( xpath = "//div//span[text() = 'Packages']")
    public WebElement packagesSectionLink;

    @FindBy ( xpath = "(//*[@id='title'])[2]")
    public WebElement packageNameInput;

    @FindBy ( xpath = "(//*[@id='price'])[2]")
    public WebElement priceInput;

    @FindBy ( xpath = "(//*[@id='showPrice'])[2]")
    public WebElement showPriceButton;

    @FindBy ( xpath = "(//*[@id='duration'])[2]")
    public WebElement durationInput;

    @FindBy ( xpath = "//*[text() = 'Block Extra Time']/../../div[2]//button")
    public WebElement blockExtraTimeButton;

    @FindBy ( xpath = "(//*[@id='blockBefore'])[2]")
    public WebElement blockBeforeInput;

    @FindBy ( xpath = "(//*[@id='blockAfter'])[2]")
    public WebElement blockAfterInput;

    @FindBy ( xpath = "(//*[@id='paymentRequired'])[2]")
    public WebElement paymentRequiredButton;

    @FindBy ( xpath = "(//*[@id='bookable'])[2]")
    public WebElement bookableButton;

    @FindBy ( xpath = "(//*[text() = 'All Documents']/../span/input)[2]")
    public WebElement allDocumentsCheckBox;

    @FindBy ( id = "totalSessions")
    public WebElement totalSessionsInput;

    @FindBy ( id = "sessionInterval")
    public WebElement sessionIntervalInput;

    @FindBy ( xpath = "(//*[@id='description'])[2]")
    public WebElement descriptionInput;

    @FindBy ( xpath = "(//button/*[text() = 'Save'])[2]" )
    public WebElement saveButton;

    @FindBy ( xpath = "(//button/*[text() = 'Cancel'])[2]" )
    public WebElement cancelButton;
}
