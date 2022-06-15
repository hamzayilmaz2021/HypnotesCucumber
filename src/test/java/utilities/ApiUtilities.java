package utilities;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiUtilities {

    public static Response response                  =  null; // durum, cookie, hız, json cevap...
    public static RequestSpecification specification =  new RequestSpecBuilder().
                                                            addCookie(new Cookie.Builder("PHPSESSID", ConfigurationReader.getProperty("phpsession")).build()).
                                                            setBaseUri("https://test.hypnotes.net/api").
                                                            setRelaxedHTTPSValidation().
                                                            build();
}
