package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AddClientPage;
import pages.DashboardPage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.Log4j;

public class US052_SD {

    AddClientPage page = new AddClientPage();
    String currentUrl = "";

    @When("user types {string} to the {string} input on add client page")
    public void userTypesToTheInputOnAddClientPage(String dataString, String inputString) {
        String[] data       = dataString.split(",");            // Hamza, Yılmaz  => ["Hamza", "Yılmaz"];
        String[] inputNames = inputString.split(",");           // name,surname  => ["name", "surname"];

        Log4j.info(dataString + " verileri yardımıyla kullanıcı kaydı oluşturulmaya çalışılıyor.");
        // for döngüsü yardımıyla inputları bul, inputun içerisine gerekli datayı yine arrayden alarak ekle

        for(int i = 0; i < inputNames.length; i++){
            WebElement element = Driver.getDriver().findElement(By.name(inputNames[i]));
            Assert.assertTrue(element.isEnabled());
            BrowserUtilities.scrollToElement(element);

            if(inputNames[i].equals("country") || inputNames[i].equals("state") || inputNames[i].equals("city")){
                element.sendKeys(  data[i] );
                BrowserUtilities.waitFor(1);
                WebElement l1 = Driver.getDriver().findElement(By.xpath("//div[@class='ant-select-item-option-content' and text() = '"+data[i]+"']"));
                BrowserUtilities.scrollToElement(l1);
                BrowserUtilities.clickWithJS(l1);
            }else{
                element.sendKeys(  data[i] );
            }

        }

        Log4j.info(dataString + " verileri yardımıyla kullanıcı kaydı oluşturuldu.");

        // dosya eklerken :  System.getProperty("user.dir") + src/test/resources/images/resim.jpg
    }
//div[@class='ant-select-item-option-content' and contains(text(),'Mountain Standard Time (Mexico)')]

    @And("user clicks on the add button on the add client page")
    public void userClicksOnTheAddButtonOnTheAddClientPage() {

        BrowserUtilities.waitFor(1);
        BrowserUtilities.scrollToElement(page.addButton);
        BrowserUtilities.clickWithJS(page.addButton);
    }

    @And("user clicks on the yes button on the add client page")
    public void userClicksOnTheYesButtonOnTheAddClientPage() {
        BrowserUtilities.clickWithJS(page.yesButton);
    }

    @And("user gets the id of add client from the current url")
    public void userGetsTheIdOfAddClientFromTheCurrentUrl() {
        BrowserUtilities.waitFor(5);
        currentUrl = Driver.getDriver().getCurrentUrl();
    }

    @Then("user verifies the client is added to the clients list")
    public void userVerifiesTheClientIsAddedToTheClientsList() {


        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJS(Driver.getDriver().findElement(By.xpath("//button[@aria-label='Close']")));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        BrowserUtilities.waitFor(5);

        String[] url = currentUrl.split(".net");
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[@href='"+url[1]+"']"));
        BrowserUtilities.verifyElementDisplayed(element);
    }

    @And("user deletes the added client from the clients list")
    public void userDeletesTheAddedClientFromTheClientsList() {
        BrowserUtilities.waitFor(2);
        String[] url = currentUrl.split(".net");
        WebElement element = Driver.getDriver().findElement(By.xpath("(//a[@href='"+url[1]+"'])[2]/../../button"));
        BrowserUtilities.scrollToElement(element);
        BrowserUtilities.clickWithJS(element);

        WebElement yesButton = Driver.getDriver().findElement(By.xpath("//button/span[text()='Yes']"));
        BrowserUtilities.clickWithJS(yesButton);

    }

    @And("user logs out of the system")
    public void userLogsOutOfTheSystem() {
        DashboardPage dashboardPage = new DashboardPage();
        BrowserUtilities.clickWithJS(dashboardPage.logoutButton);

    }



    @And("user waits for {string} seconds")
    public void userWaitsForSeconds(String s) {
        BrowserUtilities.waitFor(Integer.parseInt(s));
    }
}

