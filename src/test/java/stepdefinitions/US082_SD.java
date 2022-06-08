package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddNewPackagePage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.HashMap;

public class US082_SD {

    AddNewPackagePage page = new AddNewPackagePage();

    @And("user clicks on the packages link on the services page")
    public void userClicksOnThePackagesLinkOnTheServicesPage() {
        page.packagesSectionLink.click();
    }

    @And("user clicks on the {string} button")
    public void userClicksOnTheButton(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//button/*[contains(text(), '"+text+"')]"));
        BrowserUtilities.waitForClickablility(element,10);
        BrowserUtilities.clickWithJS(element);
    }

    @When("user types {string} to the name input on the add package page")
    public void userTypesToTheNameInputOnTheAddPackagePage(String title) {
        page.packageNameInput.sendKeys(title);
    }

    @When("user types {string} to the price input on the add package page")
    public void userTypesToThePriceInputOnTheAddPackagePage(String price) {
        page.priceInput.sendKeys(price);
    }

    @When("user clicks on the show price button on the add package page")
    public void userClicksOnTheShowPriceButtonOnTheAddPackagePage() {
        page.showPriceButton.click();
    }

    @When("user types {string} to the duration input on the add package page")
    public void userTypesToTheDurationInputOnTheAddPackagePage(String duration) {
        page.durationInput.sendKeys(duration);
    }

    @When("user clicks on the block extra time button on the add package page")
    public void userClicksOnTheBlockExtraTimeButtonOnTheAddPackagePage() {
        page.blockExtraTimeButton.click();
    }

    @When("user types {string} to the block time before input on the add package page")
    public void userTypesToTheBlockTimeBeforeInputOnTheAddPackagePage(String min) {
        page.blockBeforeInput.sendKeys(min);
    }

    @When("user types {string} to the block time after input on the add package page")
    public void userTypesToTheBlockTimeAfterInputOnTheAddPackagePage(String min) {
        page.blockAfterInput.sendKeys(min);
    }

    @When("user clicks on the payment required button on the add package page")
    public void userClicksOnThePaymentRequiredButtonOnTheAddPackagePage() {
        page.paymentRequiredButton.click();
    }

    @When("user clicks on the all documents checkbox on the add package page")
    public void userClicksOnTheAllDocumentsCheckboxOnTheAddPackagePage() {
        page.allDocumentsCheckBox.click();
    }

    @When("user types {string} to the total sessions input on the add package page")
    public void userTypesToTheTotalSessionsInputOnTheAddPackagePage(String total) {
        page.totalSessionsInput.sendKeys(total);
    }

    @When("user types {string} to the session interval input on the add package page")
    public void userTypesToTheSessionIntervalInputOnTheAddPackagePage(String sessionInterval) {
        page.sessionIntervalInput.sendKeys(sessionInterval);
    }

    @When("user clicks on the save button on the add package page")
    public void userClicksOnTheSaveButtonOnTheAddPackagePage() {
        page.saveButton.click();
    }

    @Then("user verifies the {string} package is visible on the available packages section")
    public void userVerifiesThePackageIsVisibleOnTheAvailablePackagesSection(String title) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//div[@class='ant-card-meta-title' and text() = '"+title+"']"));
        Assert.assertTrue(element.isDisplayed());
    }


    @When("user clicks on the bookable button on the add package page")
    public void userClicksOnTheBookableButtonOnTheAddPackagePage() {
        page.bookableButton.click();
    }

    @When("user types {string} to the description input on the add package page")
    public void userTypesToTheDescriptionInputOnTheAddPackagePage(String text) {
        page.descriptionInput.sendKeys(text);
    }

    @When("user clicks on the cancel button on the add package page")
    public void userClicksOnTheCancelButtonOnTheAddPackagePage() {
        page.cancelButton.click();
    }

    @Then("user verifies the {string} is not visible")
    public void userVerifiesTheIsNotVisible(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[text() = '"+text+"']"));
        BrowserUtilities.verifyElementNotDisplayed(element);
    }

    @When("user types data to the {string} on the add package page")
    public void userTypesToTheOnTheAddPackagePage(String input) {
        HashMap<String, String> map = new HashMap<>();

        String[] inputs = input.split(",");

        for(String s : inputs){
            String[] array = s.split("=");
            map.put(array[0], array[1]);
        }

        if( map.containsKey("name") ){
            page.packageNameInput.sendKeys(map.get("name") );
        }
        if( map.containsKey("price") ){
            page.priceInput.sendKeys(map.get("price") );
        }
        if( map.containsKey("duration") ){
            page.durationInput.sendKeys(map.get("duration") );
        }
        if( map.containsKey("totalsessions") ){
            page.totalSessionsInput.sendKeys(map.get("totalsessions") );
        }
        if( map.containsKey("sessioninterval") ){
            page.sessionIntervalInput.sendKeys(map.get("sessioninterval") );
        }
        if( map.containsKey("description") ){
            page.descriptionInput.sendKeys(map.get("description") );
        }
    }


    @Then("user verifies the {string} are visible on the add package page")
    public void userVerifiesTheAreVisibleOnTheAddPackagePage(String warnings) {
        String[] array = warnings.split(",");

        for( String s : array){
            WebElement element = Driver.getDriver().findElement(By.xpath("//*[text() = '"+s+"']"));
            Assert.assertTrue(element.isDisplayed());
        }

    }
}
