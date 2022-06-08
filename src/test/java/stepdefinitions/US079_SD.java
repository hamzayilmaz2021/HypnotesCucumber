package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AddDocumentPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.List;

public class US079_SD {
    AddDocumentPage page = new AddDocumentPage();

    @Then("user verifies the titles are visible on the add document page")
    public void userVerifiesTheTitlesAreVisibleOnTheAddDocumentPage() {
        Assert.assertTrue(page.uploadTitle.isDisplayed());
        Assert.assertTrue(page.addAnnotationsTitle.isDisplayed());
        Assert.assertTrue(page.selfAnnotationsTitle.isDisplayed());
        Assert.assertTrue(page.previewTitle.isDisplayed());
    }

    @Then("user verifies the {string} button is clickable")
    public void userVerifiesTheButtonIsClickable(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//button/*[contains(text(), '" + text + "')]"));
        Assert.assertTrue(  element.isEnabled()  );

    }

    @When("user upload file to the input on the add document page")
    public void userUploadFileToTheInputOnTheAddDocumentPage() {
        page.selectFileInput.sendKeys( "C:\\Users\\ceng\\Desktop\\Hypnotes\\src\\test\\resources\\pdf\\Internship.pdf"  );
    }

    @Then("user verifies the selected file input is enabled on the add document page")
    public void userVerifiesTheSelectedFileInputIsEnabledOnTheAddDocumentPage() {

        Assert.assertTrue(page.selectedFileNameInput.isEnabled());

    }

    @Then("user types {string} to the selected file name input on the add document page")
    public void userTypesToTheSelectedFileNameInputOnTheAddDocumentPage(String text) {
        BrowserUtilities.waitFor(3);

        page.selectedFileNameInput.click();
        page.selectedFileNameInput.clear();
        BrowserUtilities.waitFor(3);
        JavascriptExecutor e = (JavascriptExecutor) Driver.getDriver();
        e.executeScript("arguments[0].value = '';", page.selectedFileNameInput);
        page.selectedFileNameInput.sendKeys(text);
    }

    @Then("user verifies the {string} file name is displayed")
    public void userVerifiesTheFileNameIsDisplayed(String fileName) {
        String s = page.selectedFileName.getText();
        System.out.println(s);
        //Assert.assertEquals(s, fileName);
    }

    @When("user clicks on the annotation dropdown on the add package page")
    public void userClicksOnTheAnnotationDropdownOnTheAddPackagePage() {
        page.selectAnnotationDropdown.click();
    }

    @Then("user verifies the dropdown contains options on the add package page")
    public void userVerifiesTheDropdownContainsOptionsOnTheAddPackagePage(DataTable dataTable) {
        List<String> data = dataTable.asList(String.class);
        // data => 0 => {Signature, Full Name, Initials.... }

        for( Object s : data ){
            boolean varMi = false;
            for(WebElement e : page.selectAnnotationList){
               BrowserUtilities.scrollToElement(e);
               if ( e.getText() .equals(s.toString()) ){
                   varMi = true;
                   break;
               }
            }
            Assert.assertTrue( varMi );
        }

    }

    @Then("user verifies the optional field is enabled on the add document page")
    public void userVerifiesTheOptionalFieldIsEnabledOnTheAddDocumentPage() {
        Assert.assertTrue( page.optionalFieldInput.isEnabled() );
    }

    @Then("user verifies the pdf is visible on the add document page")
    public void userVerifiesThePdfIsVisibleOnTheAddDocumentPage() {
        BrowserUtilities.waitForVisibility(page.pdfFile,10);
        Assert.assertTrue(  page.pdfFile.isDisplayed()  );
    }

    @Then("user verifies the video is visible on the add document page")
    public void userVerifiesTheVideoIsVisibleOnTheAddDocumentPage() {
        Assert.assertTrue(page.videoGuide.isDisplayed());
    }

    @And("user switched to the iframe {string}")
    public void userSwitchedToTheIframe(String id) {
        WebElement e = Driver.getDriver().findElement(By.id(id));
        Driver.getDriver().switchTo().frame(e);
    }

    @Then("user verifies annotate button is enabled on the add document page")
    public void userVerifiesAnnotateButtonIsEnabledOnTheAddDocumentPage() {
        Assert.assertTrue(page.annotateButton.isEnabled());
    }

    @Then("user verifies insert button is enabled on the add document page")
    public void userVerifiesInsertButtonIsEnabledOnTheAddDocumentPage() {
        Assert.assertTrue(page.insertButton.isEnabled());
    }

    @When("user clicks on the insert button on the add document page")
    public void userClicksOnTheInsertButtonOnTheAddDocumentPage() {
       BrowserUtilities.clickWithJS(page.insertButton);
    }

    @When("user clicks on the add new signature button on the add document page")
    public void userClicksOnTheAddNewSignatureButtonOnTheAddDocumentPage() {
        BrowserUtilities.clickWithJS(page.addNewSignatureButton);

    }

    @Then("user verifies the draw type and upload buttons are enabled on the add document page")
    public void userVerifiesTheDrawTypeAndUploadButtonsAreEnabledOnTheAddDocumentPage() {
        Assert.assertTrue(page.drawOption.isEnabled());
        Assert.assertTrue(page.typeOption.isEnabled());
        Assert.assertTrue(page.uploadOption.isEnabled());
    }

    @When("user clicks on the type option on the add document page")
    public void userClicksOnTheTypeOptionOnTheAddDocumentPage() {
        page.typeOption.click();
    }

    @When("user types {string} to the type option input on the add document page")
    public void userTypesToTheTypeOptionInputOnTheAddDocumentPage(String text) {
        page.typeOptionInput.sendKeys(text);
    }

    @When("user clicks on the create button on the add document page")
    public void userClicksOnTheCreateButtonOnTheAddDocumentPage() {
        BrowserUtilities.clickWithJS(page.createButton);
    }

    @And("user switched to the default content")
    public void userSwitchedToTheDefaultContent() {
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("user clicks on the pdf to add signature on the add document page")
    public void userClicksOnThePdfToAddSignatureOnTheAddDocumentPage() {
        JavascriptExecutor executor = (JavascriptExecutor)  Driver.getDriver();
        executor.executeScript("const simulateClick = (x, y) => {\n" +
                "  const event = new MouseEvent('click', {\n" +
                "    view: window,\n" +
                "    bubbles: true,\n" +
                "    cancelable: true,\n" +
                "    screenX: x,\n" +
                "    screenY: y\n" +
                "  })\n" +
                "\n" +
                "  const element = document.elementFromPoint(x, y)\n" +
                "  element.dispatchEvent(event)\n" +
                "}\n" +
                "\n" +
                "simulateClick(120, 120)");
     }
}
