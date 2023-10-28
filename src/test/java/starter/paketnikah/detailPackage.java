package starter.paketnikah;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class detailPackage {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    Integer paket = 8;

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
    }

    @Step
    public void hitEndpointDetailPackage() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .when()
                .get(endpoint.DETAILPACKAGE+paket)
                .then()
                .statusCode(200);

    }

    @Step
    public void validateDetailPackage() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/detailpackage.json"));
    }
}
