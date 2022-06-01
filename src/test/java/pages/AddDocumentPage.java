package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddDocumentPage extends BasePage {

    @FindBy ( xpath = "//div[@class='ant-steps-item-title' and text() = 'Upload']")
    public WebElement uploadTitle;

    @FindBy ( xpath = "//div[@class='ant-steps-item-title' and text() = 'Add Annotations']")
    public WebElement addAnnotationsTitle;

    @FindBy ( xpath = "//div[@class='ant-steps-item-title' and text() = 'Self Annotations']")
    public WebElement selfAnnotationsTitle;

    @FindBy ( xpath = "//div[@class='ant-steps-item-title' and text() = 'Preview']")
    public WebElement previewTitle;

    @FindBy ( xpath = "//input[@type='file' and @accept='.pdf']")
    public WebElement selectFileInput;

    @FindBy ( xpath = "//input[@type='text' and @class='ant-input']")
    public WebElement selectedFileNameInput;

    @FindBy ( xpath = "//span[@class='ant-typography']" )
    public WebElement selectedFileName;

    @FindBy ( className = "ant-select-selector")
    public WebElement selectAnnotationDropdown;

    @FindBy ( className = "ant-select-item-option-content")
    public List<WebElement> selectAnnotationList;

    @FindBy ( className = "ant-checkbox-input")
    public WebElement optionalFieldInput;

    @FindBy ( css = ".DocumentContainer .document")
    public WebElement pdfFile;

    @FindBy ( id = "webviewer-1")
    public WebElement iframeForPdf;

    @FindBy ( xpath = "//video[@src='/video/guide.mp4']")
    public WebElement videoGuide;

    @FindBy ( xpath = "(//button[text() = 'Annotate'])[1]")
    public WebElement annotateButton;

    @FindBy ( xpath = "(//button[text() = 'Insert'])[1]")
    public WebElement insertButton;

    @FindBy ( xpath = "(//button[text() = 'Add New Signature'])[1]")
    public WebElement addNewSignatureButton;

    @FindBy ( xpath = "(//button[text() = 'Draw'])[1]" )
    public WebElement drawOption;

    @FindBy ( xpath = "(//button[text() = 'Type'])[1]" )
    public WebElement typeOption;

    @FindBy ( xpath = "(//button[text() = 'Upload'])[1]" )
    public WebElement uploadOption;

    @FindBy ( className = "text-signature-input")
    public WebElement typeOptionInput;

    @FindBy ( id = "upload")
    public WebElement uploadSignatureInput;

    @FindBy ( className = "signature-create")
    public WebElement createButton;


}
