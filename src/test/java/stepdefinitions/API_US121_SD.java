package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_US121_SD {

    @Given("user connects to the {string} api")
    public void userConnectsToTheApi(String endPoint, DataTable dataTable) {

        Map<String, String> zorunluAlanlar = dataTable.asMaps().get(0);
        ApiUtilities.response = given().
                spec(ApiUtilities.specification).
                formParams(zorunluAlanlar).
                post(endPoint);


        // 2. Yöntem
/*      JSONObject object = new JSONObject();
        object.put("promoCode","DENEME");
        object.put("startedAt","Thu, 23 Jun 2022 11:28:59 GMT");

        ApiUtilities.response = given().
                contentType(ContentType.JSON).
                spec(ApiUtilities.specification).
                body(object.toString()).
                post(endPoint);
*/
        ApiUtilities.response.prettyPrint();
    }

    @Then("user verifies the status code of the response is {string}")
    public void userVerifiesTheStatusCodeOfTheResponseIs(String statusCode) {
        int currentStatusCode = ApiUtilities.response.statusCode();

        Assert.assertEquals(Integer.parseInt(statusCode) ,currentStatusCode);

    }

    @Then("user verifies the api response has mandatory fields in array")
    public void userVerifiesTheApiResponseHasMandatoryFieldsInArray(DataTable dataTable) {

        List<String> zorunluAlanlar = dataTable.asList(); // id, code, startsAt... [Object, Object, Object]

        List<LinkedHashMap> list = ApiUtilities.response.jsonPath().get("$");

        for(LinkedHashMap o : list){

            for(String field : zorunluAlanlar){
                Assert.assertTrue( o.get(field) != null );
            }
        }

    }
}
