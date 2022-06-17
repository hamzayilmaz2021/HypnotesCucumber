package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ApiUtilities;
import utilities.DataTableUtilities;

import java.util.Map;

public class API_US131_SD {
    @Then("user verifies the values of the fields")
    public void userVerifiesTheValuesOfTheFields(DataTable dataTable) {
        Map<String, String> fields = DataTableUtilities.getMapFromDataTable(dataTable);

        for(String key : fields.keySet()){
            Assert.assertTrue(ApiUtilities.response.jsonPath().get(key).toString().equals(fields.get(key)));
        }
    }
}
