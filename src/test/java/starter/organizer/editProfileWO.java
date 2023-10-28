package starter.organizer;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class editProfileWO {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    JSONObject fillForm;
    String token;

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("email", "nikahyuk@gmail.com");
        requestParams.put("password", "nikahyuk123");
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
    public void hitEndpointEditFormWO() {
        fillForm =  new JSONObject();
        fillForm.put("WoName","Nikay Yuk");
        fillForm.put("email","nikahyuk@gmail.com");
        fillForm.put("password","nikahyuk123");
        fillForm.put("PhoneNumber","898787677");
        fillForm.put("weburl","www.nikahyuk.com");
        fillForm.put("about","Partner Nikahmu sampai sah");
        fillForm.put("city","depok");
        fillForm.put("address","Jl. Raya Sawangan, Kec. Sawangan, Kota Depok, Jawa Barat 16519");
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .body(fillForm.toString())
                .when()
                .put(endpoint.EDITPROFILEWO)
                .then()
                .statusCode(201);
    }
    @Step
    public void hitEndpointEditPhotoWO(){
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .header("Content-Type","multipart/form-data")
                .multiPart("logo",new File("./src/test/resources/gambar/nikahyuk.jpeg"))
                .when()
                .put(endpoint.EDITWOPHOTO)
                .then()
                .statusCode(201);
    }
    @Step
    public void hitEndpointEditDocWO(){
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .header("Content-Type","multipart/form-data")
                .multiPart("file",new File("./src/test/resources/dokumen/Contoh.pdf"))
                .when()
                .put(endpoint.EDITWODOC)
                .then()
                .statusCode(201);
    }

    @Step
    public void validateEditProfileWO() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/editProfileWO.json"));
    }
}
