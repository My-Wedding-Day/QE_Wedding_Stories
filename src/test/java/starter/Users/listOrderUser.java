package starter.Users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class listOrderUser {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String token;

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("email", "iniuser@gmail.com");
        requestParams.put("password", "12345678");
    }

    @Step
    public void hitEndpointLoginUser() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.LOGINUSER)
                .then()
                .statusCode(201);

        token = SerenityRest
                .then()
                .extract()
                .path("token");
    }

    @Step
    public void hitEndpointListOrderUser() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .when()
                .get(endpoint.LISTORDERUSER)
                .then()
                .statusCode(200);

    }

    @Step
    public void validateListOrderUser() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/listOrderUser.json"));
    }
}
