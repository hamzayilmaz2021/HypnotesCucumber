package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US002_SD {

    HomePage page = new HomePage();

    @Given("user goes to the {string} with {string}")
    public void userGoesToThe(String url, String type) {

        if(type.equals("login")){
            Driver.getDriver().get(ConfigurationReader.getProperty("environment") + url);
            Driver.getDriver().manage().addCookie(new Cookie("PHPSESSID", "f6bd8kjma31q9s4vgh5gi8vhfe"));
        }

        Driver.getDriver().get(ConfigurationReader.getProperty("environment") + url);

    }

    @Then("user verifies the titles are visible")
    public void userVerifiesTheTitlesAreVisible() {
        Assert.assertTrue(page.services.isDisplayed());
        Assert.assertTrue(page.aboutUs.isDisplayed());
        Assert.assertTrue(page.contactUs.isDisplayed());
        Assert.assertTrue(page.pricing.isDisplayed());
        Assert.assertTrue(page.howItWorks.isDisplayed());
        Assert.assertTrue(page.login.isDisplayed());
        Assert.assertTrue(page.signUp.isDisplayed());
    }

    @Then("user verifies the titles are clickable")
    public void userVerifiesTheTitlesAreClickable() {
        Assert.assertTrue(page.services.isEnabled());
        Assert.assertTrue(page.aboutUs.isEnabled());
        Assert.assertTrue(page.contactUs.isEnabled());
        Assert.assertTrue(page.pricing.isEnabled());
        Assert.assertTrue(page.howItWorks.isEnabled());
        Assert.assertTrue(page.login.isEnabled());
        Assert.assertTrue(page.signUp.isEnabled());
    }

}
