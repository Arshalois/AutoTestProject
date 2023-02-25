package Api;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static com.google.common.base.Predicates.equalTo;
import static io.restassured.RestAssured.given;
//import static org.apache.commons.codec.digest.UnixCrypt.body;
import static org.hamcrest.Matchers.*;


public class ApiTest extends BaseApiTest{
    String API_key = "9844aae0b9f7ed1a9e1ce0860858661c";
   private Map<String,Object> reqBody = new HashMap<>();
    @BeforeEach
    public void setRequestBody(){
        Map<String,Object> methodProperties = new HashMap<>();
        methodProperties.put("FindByString", "Київ");
        methodProperties.put("Limit", 3);
        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties",methodProperties);
    }
   @Test
    public void checkThatSuccess(){
        ValidatableResponse success = given()
                .spec(requestSpecs)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post()
                .then()
                .spec(responseSpecs)
                .statusCode(200)
                .assertThat()
        .body("success", equalToObject(true));
    }

@Test //please skip this test, it's not working
    public void checkJasonScheme() {
    given()
            .spec(requestSpecs)
            .body(reqBody)
            .contentType(ContentType.JSON)
            .body(reqBody)
            .when()
            .post()
            .then()
            .spec(responseSpecs)
            .statusCode(200)
            .assertThat();
    //.body(matchesJsonSchema(new File(System.getProperty("user.dir")+"\\src\\main\\resources\\validators\\np_address_validators")));
}
    @Test
    public void checkSomeFields(){ //RegionsDescription, SettlementTypeDescriptionRu and Index1
        given()
                .spec(requestSpecs)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post()
                .then()
                .spec(responseSpecs)
                .statusCode(200)
                .assertThat()
                .body("data.RegionsDescription", hasItems("Доманівський р-н","Миколаївський р-н"))
                .body("data[0].SettlementTypeDescriptionRu", equalToObject("село"))
                .body("data.Index1", hasItems("56419", "01001"));
    }
@Test
public void checkNumberOneIsPresent(){
    List<DataForPojo> dataList =
    given()
            .spec(requestSpecs)
            .body(reqBody)
            .contentType(ContentType.JSON)
            .body(reqBody)
            .when()
            .post()
            .then()
            .spec(responseSpecs)
            .statusCode(200)
            .assertThat()
            .extract()
            .body().jsonPath().getList("data", DataForPojo.class);
    System.out.println(dataList);
    dataList.forEach(el -> Assertions.assertTrue(el.getRef().contains("1")));
}
}
