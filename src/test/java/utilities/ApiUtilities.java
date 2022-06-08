package utilities;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiUtilities {

    public static Response response                  =  null; // durum, cookie, hız, json cevap...
    public static RequestSpecification specification =  new RequestSpecBuilder().
                                                            addCookie(new Cookie.Builder("PHPSESSID", "vuc0mmf8rhcr5tglu5tkr86lr8").build()).
                                                            setBaseUri("https://test.hypnotes.net/api").
                                                            setRelaxedHTTPSValidation().
                                                            build();

    //bana /promoCode/getCoupons sayfasını getir
    //////// Hazır Methodlar
    // PHPSESSID=vuc0mmf8rhcr5tglu5tkr86lr8
}
