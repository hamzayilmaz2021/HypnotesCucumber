package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import com.fasterxml.jackson.core.JsonProcessingException;
import pojo.CategoryColors;
import utilities.ApiUtilities;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class POJO_134 {

    @Given("user connects to the {string} api to change caegory color")
    public void userConnectsToTheApiToChangeCaegoryColor(String endPoint, DataTable dataTable) throws JsonProcessingException {
        Map<String, String> veriler = dataTable.asMaps().get(0);

        CategoryColors object = new CategoryColors();
        object.setIndividual(veriler.get("İndividual"));
        object.setPackages(veriler.get("Packages"));
        object.setCanceled(veriler.get("GroupSession"));
        object.setNoshow(veriler.get("ShowedUp"));
        object.setGroupSession(veriler.get("Reschedule"));
        object.setReschedule(veriler.get("Canceled"));
        object.setShowedUp(veriler.get("Noshow"));

        ApiUtilities.response = given().
                                contentType(ContentType.URLENC.withCharset("UTF-8")). // UTF-8 yardımıyla türkçe karakter tanımı ekledik
                                spec(ApiUtilities.specification).
                                formParams(object.getMap()).
                                post(endPoint);

        ApiUtilities.response.prettyPrint();

        /* =>> Pojo class body içerisinde OBJECT Mapper yardımıyla gönderiliyor
        ObjectMapper objectMapper = new ObjectMapper();
        String stringJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        ApiUtilities.response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")). // UTF-8 yardımıyla türkçe karakter tanımı ekledik
                spec(ApiUtilities.specification).
                body(stringJson).
                post(endPoint);
        */


    }


}
