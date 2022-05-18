package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TherapistRegisterPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US029_SD {
    TherapistRegisterPage page = new TherapistRegisterPage();
    @When("user types {string} to the fullname input")
    public void userTypesToTheFullnameInput(String arg0) {
        page.nameInput.sendKeys(arg0);
    }

    @When("user types {string} to the email input")
    public void userTypesToTheEmailInput(String arg0) {
        page.emailInput.sendKeys(arg0); //
    }

    @When("user types {string} to the password input")
    public void userTypesToThePasswordInput(String arg0) {
        page.passwordInput.sendKeys(arg0);
    }


    @Then("user verifies length of valid list is {string}")
    public void userVerifiesLengthOfValidListIs(String arg0) {
        Assert.assertEquals(page.validList.size(), Integer.parseInt(arg0));
    }

    @Then("user verifies the signup button is not clickable")
    public void userVerifiesTheSignupButtonIsNotClickable() {
        BrowserUtilities.verifyElementNotClickable( page.singnUpButton );
    }

    @Then("user verifies the signup button is clickable")
    public void userVerifiesTheSignupButtonIsClickable() {
        BrowserUtilities.verifyElementClickable( page.singnUpButton );
    }
}
