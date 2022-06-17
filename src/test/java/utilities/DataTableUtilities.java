package utilities;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class DataTableUtilities {

    // DataTable'dan List<String> elde etme
    public static List<String> getListFromDataTable (DataTable dataTable){
        List<String> fields = dataTable.asList();
        return fields;
    }

    // DataTable'dan Map<String,String> elde etme
    public static Map<String,String> getMapFromDataTable (DataTable dataTable){
        Map<String, String> map = dataTable.asMaps().get(0);
        return map;
    }

}
