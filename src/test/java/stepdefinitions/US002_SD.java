package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US002_SD {

    HomePage page = new HomePage();

    @Given("user goes to the {string}")
    public void userGoesToThe(String url) {
        Driver.getDriver().get(url);
    }

    @Then("user verifies the titles are visible")
    public void userVerifiesTheTitlesAreVisible() {
        Assert.assertTrue(  page.services.isDisplayed()  );
        Assert.assertTrue(  page.aboutUs.isDisplayed()  );
        Assert.assertTrue(  page.contactUs.isDisplayed()  );
        Assert.assertTrue(  page.pricing.isDisplayed()  );
        Assert.assertTrue(  page.howItWorks.isDisplayed()  );
        Assert.assertTrue(  page.login.isDisplayed()  );
        Assert.assertTrue(  page.signUp.isDisplayed()  );
    }

    @Then("user verifies the titles are clickable")
    public void userVerifiesTheTitlesAreClickable() {
        Assert.assertTrue(  page.services.isEnabled()  );
        Assert.assertTrue(  page.aboutUs.isEnabled()  );
        Assert.assertTrue(  page.contactUs.isEnabled()  );
        Assert.assertTrue(  page.pricing.isEnabled()  );
        Assert.assertTrue(  page.howItWorks.isEnabled()  );
        Assert.assertTrue(  page.login.isEnabled()  );
        Assert.assertTrue(  page.signUp.isEnabled()  );
    }

}
