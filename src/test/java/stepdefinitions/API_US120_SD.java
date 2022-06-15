package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ApiUtilities;
import java.util.List;

public class API_US120_SD {
    @Then("user verifies the api response has mandatory fields")
    public void userVerifiesTheApiResponseHasMandatoryFields(DataTable dataTable) {
        List<String> zorunluAlanlar = dataTable.asList(); // success

        for (String field : zorunluAlanlar) {
            Assert.assertTrue(ApiUtilities.response.jsonPath().get(field) != null);
        }

    }
}
