package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.LinkedHashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class API_US121_SD {

    @Given("user connects to the {string} api")
    public void userConnectsToTheApi(String endPoint) {
        ApiUtilities.response = given().
                contentType(ContentType.JSON).
                spec(ApiUtilities.specification).
                post(endPoint);

        ApiUtilities.response.prettyPrint();
    }

    @Then("user verifies the status code of the response is {string}")
    public void userVerifiesTheStatusCodeOfTheResponseIs(String statusCode) {
        int currentStatusCode = ApiUtilities.response.statusCode();

        Assert.assertEquals(Integer.parseInt(statusCode) ,currentStatusCode);

    }

    @Then("user verifies the api response has mendatory fields")
    public void userVerifiesTheApiResponseHasMendatoryFields(DataTable dataTable) {

        List<String> zorunluAlanlar = dataTable.asList(); // id, code, startsAt...

        List<LinkedHashMap> list = ApiUtilities.response.jsonPath().get("$");

        for(LinkedHashMap o : list){

            for(String field : zorunluAlanlar){
                Assert.assertTrue( o.get(field) != null );
            }
        }

    }
}
