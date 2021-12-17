package starter.organizer;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class profileWO {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String token;

    @Step
    public void setBodyReq() { //Valid Email And Password
        requestParams = new JSONObject();
        requestParams.put("email", "altaqewo20@gmail.com");
        requestParams.put("password", "altaqewo20");
    }

    @Step
    public void hitEndpointLoginUser() {
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
    public void hitEndpointprofileUser() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .when()
                .get(endpoint.GETUSER)
                .then()
                .statusCode(200);

    }

    @Step
    public void validateJSONSchemaprofileUser() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/ProfileUser.json"));
    }
}
