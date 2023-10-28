package starter.paketnikah;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class AddPackage {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String token;

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("email","halaldulu@gmail.com");
        requestParams.put("password","halalindulu123");
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
    public void hitEndpointAddPackage() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .header("Content-Type","multipart/form-data")
                .formParam("PackageName","Yakali Ga Halal")
                .formParam("price","130000000")
                .formParam("pax","1000")
                .formParam("packagedesc","Kita akan memberikan layanan yang terbaik")
                .multiPart("urlphoto",new File("./src/test/resources/gambar/nikahyuk.jpeg"))
                .when()
                .post(endpoint.ADDPACKAGE)
                .then()
                .statusCode(201);
    }

    @Step
    public void validateEndpointAddPackage() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/AddPackage.json"));
    }
}
