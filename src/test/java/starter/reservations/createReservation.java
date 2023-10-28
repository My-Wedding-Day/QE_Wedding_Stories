package starter.reservations;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class createReservation {
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
    public void hitEndpointCreateOrder() {
        SerenityRest
                .given()
                .header("Accept", "application/json")
                .header("Authorization", "Bearer "+token)
                .header("Content-Type","multipart/form-data")
                .multiPart("package_id","56")
                .multiPart("date","2021-12-28")
                .multiPart("additional","none")
                .multiPart("pax","200")
                .when()
                .post(endpoint.ORDERPACKAGE)
                .then()
                .statusCode(201);
    }

    @Step
    public void validateOrderPackage() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/createreservation.json"));
    }
}
