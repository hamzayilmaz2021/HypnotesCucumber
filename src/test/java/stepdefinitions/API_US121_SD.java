package stepdefinitions;


// POJO => CLASS içerisinde göndermek istediğiniz verilere ait değişkenler ve o değişkenlere ait get ve set methodları oluşturuyorsunuz.
// ObjectMapper yardımıyla User classından bir string oluşturup, onu body bölümünde gönderecektik.

// 2. Yöntem
/*      JSONObject object = new JSONObject();
        {
            username : "hamza",
            password : "1234"
        }
        object.put("promoCode","DENEME");
        object.put("startedAt","Thu, 23 Jun 2022 11:28:59 GMT");

        ApiUtilities.response = given().
                contentType(ContentType.JSON).
                spec(ApiUtilities.specification).
                body(object.toString()).
                post(endPoint);
*/

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.internal.com.google.protobuf.Api;
import org.junit.Assert;
import utilities.ApiUtilities;
import utilities.DataTableUtilities;

import java.util.List;
import java.util.Map;


public class API_US121_SD {

    @Given("user connects to the {string} api")
    public void userConnectsToTheApi(String endPoint, DataTable dataTable) {
        Map<String, String> data = DataTableUtilities.getMapFromDataTable(dataTable);

        ApiUtilities.addFormParams(data);
        ApiUtilities.connectWithPostMethod(endPoint);

        //ApiUtilities.connectWithPostMethodFormParams(endPoint, data);
    }

    @Then("user verifies the status code of the response is {string}")
    public void userVerifiesTheStatusCodeOfTheResponseIs(String statusCode) {
        int currentStatusCode = ApiUtilities.response.statusCode();

        ApiUtilities.verifyStatusCode(currentStatusCode);
    }

    @Then("user verifies the api response has mandatory fields in array")
    public void userVerifiesTheApiResponseHasMandatoryFieldsInArray(DataTable dataTable) {

        List<String> fields = dataTable.asList(); // id, code, startsAt... [Object, Object, Object]

        ApiUtilities.checkFieldsInArray(fields);

    }
}
