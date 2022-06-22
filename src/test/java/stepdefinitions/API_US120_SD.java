package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ApiUtilities;
import utilities.DataTableUtilities;

import java.util.List;

import static io.restassured.RestAssured.given;

public class API_US120_SD {

    @Then("user verifies the api response has mandatory fields")
    public void userVerifiesTheApiResponseHasMandatoryFields(DataTable dataTable) {
        List<String> fields = DataTableUtilities.getListFromDataTable(dataTable);

        ApiUtilities.checkFieldsInObject(fields);
    }
}
