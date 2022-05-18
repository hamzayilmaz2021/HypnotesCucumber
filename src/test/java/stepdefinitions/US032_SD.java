package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US032_SD {

    @Then("user verifies the {string} is visible")
    public void userVerifiesTheIsVisible(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[text() = '"+text+"']"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Then("user verifies {string} is clickable")
    public void userVerifiesIsClickable(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[text() = '"+text+"']"));
        Assert.assertTrue(element.isEnabled());
    }

    @When("user clicks on the {string} link")
    public void userClicksOnTheLink(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'"+text+"')]"));
        element.click();
    }

    @Then("user verifies the url is {string}")
    public void userVerifiesTheUrlIs(String url) {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl,url);

    }

}
