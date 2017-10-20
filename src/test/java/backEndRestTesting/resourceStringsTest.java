package backEndRestTesting;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static org.hamcrest.core.IsNull.notNullValue;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;


public class resourceStringsTest {

    private static final String RESOURCE_STRINGS_URL = "https://d35y5ttrez32tr.cloudfront.net/eu/v1/ResourceStrings?LanguageCode=en&region=DE&Platform=web";

    @Test
    public void testResourceStrings_OPTIONS_EndPoint() {

        Response response =
                given()
                        .header("Accept", "application/json;charset=UTF-8")
                        .when()
                        .options(RESOURCE_STRINGS_URL)
                        .then()
                        .statusCode(200)
                        .contentType(ContentType.JSON)
                        .header("Access-Control-Allow-Methods", "GET,OPTIONS")
                        .extract()
                        .response();

        System.out.println(response.prettyPrint());
        System.out.println(response.getHeaders());

    }

    @Test
    public void testResourceStritestResourceStrings_OPTIONS_EndPointngs_GET_EndPoint() {

        String response =
                given()
                        .header("Accept", "application/json;charset=UTF-8")
                        .when()
                        .get(RESOURCE_STRINGS_URL)
                        .then()
                        .contentType(ContentType.JSON)
                        .statusCode(200)
                        .body("Links", notNullValue())
                        .extract()
                        .response()
                        .prettyPrint();

        System.out.println(" RESOURCE STRINGS GET: " + response);
    }
}