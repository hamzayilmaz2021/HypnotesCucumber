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
import utilities.Log4j;

public class US002_SD {

    HomePage page = new HomePage();

    @Given("user goes to the {string} with {string}")
    public void userGoesToThe(String url, String type) {

        if(type.equals("login")){
            Driver.getDriver().get(ConfigurationReader.getProperty("environment") + url);
            Driver.getDriver().manage().addCookie(new Cookie("PHPSESSID", "f6bd8kjma31q9s4vgh5gi8vhfe"));
        }

        Driver.getDriver().get(ConfigurationReader.getProperty("environment") + url);
        Log4j.info("Kullanici " + ConfigurationReader.getProperty("environment") + url + " adresine gitti.");

    }

    @Then("user verifies the titles are visible")
    public void userVerifiesTheTitlesAreVisible() {
        Assert.assertTrue(page.services.isDisplayed());
        Log4j.info("Kullanici page.services elementinin görünür olduğunu doğruladı.");
        Assert.assertTrue(page.aboutUs.isDisplayed());
        Log4j.info("Kullanici page.aboutUs elementinin görünür olduğunu doğruladı.");
        Assert.assertTrue(page.contactUs.isDisplayed());
        Log4j.info("Kullanici page.contactUs elementinin görünür olduğunu doğruladı.");
        Assert.assertTrue(page.pricing.isDisplayed());
        Log4j.info("Kullanici page.pricing elementinin görünür olduğunu doğruladı.");
        Assert.assertTrue(page.howItWorks.isDisplayed());
        Log4j.info("Kullanici page.howItWorks elementinin görünür olduğunu doğruladı.");
        Assert.assertTrue(page.login.isDisplayed());
        Log4j.info("Kullanici page.login elementinin görünür olduğunu doğruladı.");
        Assert.assertTrue(page.signUp.isDisplayed());
        Log4j.info("Kullanici page.signUp elementinin görünür olduğunu doğruladı.");
    }

    @Then("user verifies the titles are clickable")
    public void userVerifiesTheTitlesAreClickable() {
        Assert.assertTrue(page.services.isEnabled());
        Log4j.info("Kullanici page.services elementinin tıklanabilir olduğunu doğruladı.");
        Assert.assertTrue(page.aboutUs.isEnabled());
        Log4j.info("Kullanici page.aboutUs elementinin tıklanabilir olduğunu doğruladı.");
        Assert.assertTrue(page.contactUs.isEnabled());
        Log4j.info("Kullanici page.contactUs elementinin tıklanabilir olduğunu doğruladı.");
        Assert.assertTrue(page.pricing.isEnabled());
        Log4j.info("Kullanici page.pricing elementinin tıklanabilir olduğunu doğruladı.");
        Assert.assertTrue(page.howItWorks.isEnabled());
        Log4j.info("Kullanici page.howItWorks elementinin tıklanabilir olduğunu doğruladı.");
        Assert.assertTrue(page.login.isEnabled());
        Log4j.info("Kullanici page.login elementinin tıklanabilir olduğunu doğruladı.");
        Assert.assertTrue(page.signUp.isEnabled());
        Log4j.info("Kullanici page.signUp elementinin tıklanabilir olduğunu doğruladı.");
    }

}
