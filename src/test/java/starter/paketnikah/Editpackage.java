package starter.paketnikah;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class Editpackage {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String token;
    Integer edit = 58;

    @Step
    public void setBodyReqwo() {
        requestParams = new JSONObject();
        requestParams.put("email","altaqewo20@gmail.com");
        requestParams.put("password","altaqewo20");
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
    public void hitEndpointEditPackage() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .header("Content-Type","multipart/form-data")
                .formParam("PackageName","coba update api lagi")
                .formParam("price","1389000")
                .formParam("pax","108")
                .formParam("packageDesc","update ini menggunakan api automation tes")
                .multiPart("urlphoto",new File("./src/test/resources/gambar/UPM.jpg"))
                .when()
                .put(endpoint.Editpackage+edit)
                .then()
                .statusCode(201);
    }

    @Step
    public void validateEndpointEditPackage() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/Editpackage.json"));
    }

}
