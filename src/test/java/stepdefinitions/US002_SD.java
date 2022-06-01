package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US002_SD {

    HomePage page = new HomePage();

    @Given("user goes to the {string}")
    public void userGoesToThe(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment") + url);

        try{
            WebElement acceptButton = Driver.getDriver().findElement(By.xpath("//*[@onClick='acceptCookie()']"));
            acceptButton.click();

            WebElement closeToolbar = Driver.getDriver().findElement(By.cssSelector(".hide-button"));
            closeToolbar.click();
        }catch (Exception e){
            System.out.println(e);
        }
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
