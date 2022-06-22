package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import utilities.ApiUtilities;
import utilities.BrowserUtilities;
import utilities.DataTableUtilities;

import java.util.List;


public class API_US156 {

    @Given("user connects to the {string} api to get data")
    public void userConnectsToTheApiToGetData(String endPoint, DataTable dataTable) {
        List<String> data = DataTableUtilities.getListFromDataTable(dataTable);
        // [  locationInfos[0].id  ]

        ApiUtilities.connectWithPostMethod(endPoint);

        String id = ApiUtilities.response.jsonPath().get(data.get(0)).toString();
        BrowserUtilities.writeDataToIdsFile("id", id);
        System.out.println( id ) ;

    }
}
