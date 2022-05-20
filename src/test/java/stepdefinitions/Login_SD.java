package stepdefinitions;

import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login_SD {

    LoginPage page = new LoginPage();

    @When("user types {string} to the email input on the login page")
    public void userTypesToTheEmailInputOnTheLoginPage(String email) {
        page.emailInput.sendKeys(email);
    }

    @When("user types {string} to the password input on the login page")
    public void userTypesToThePasswordInputOnTheLoginPage(String pass) {
        page.passwordInput.sendKeys(pass);
    }

    @When("user clicks on the login button on the login page")
    public void userClicksOnTheLoginButtonOnTheLoginPage() {
        page.loginButton.click();
    }

}
