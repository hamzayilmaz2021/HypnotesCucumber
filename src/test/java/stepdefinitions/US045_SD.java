package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US045_SD {


    @Then("user verifies the {string} link is clickable")
    public void userVerifiesTheLinkIsClickable(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[text() = '"+text+"']"));
        BrowserUtilities.verifyElementClickable(element);
    }
}
