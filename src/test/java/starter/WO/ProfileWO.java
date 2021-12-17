package starter.WO;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ProfileWO {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String token;

    @Step
    public void setBodyReq() { //Valid Email And Password
        requestParams = new JSONObject();
        requestParams.put("email", "iniwo@gmail.com");
        requestParams.put("password", "12345678");
    }

    @Step
    public void hitEndpointLoginWO() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.LOGINORGANIZER)
                .then()
                .statusCode(201);

        token = SerenityRest
                .then()
                .extract()
                .path("token");

    }

    @Step
    public void hitEndpointprofileWO() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .when()
                .get(endpoint.GETWO)
                .then()
                .statusCode(200);

    }

    @Step
    public void validateJSONSchemaprofileWO() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/profilewo.json"));
    }

}