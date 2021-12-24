package starter.organizer;

import io.restassured.mapper.ObjectMapperType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class updateStatusOrder {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;JSONObject inputUpdateAccept;JSONObject inputUpdateDecline;
    String token;
    Integer idAccept = 58;
    Integer idDecline = 60;

    @Step
    public void setBodyReq(){
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
    public void setUpdateAccept(){
        inputUpdateAccept = new JSONObject();
        inputUpdateAccept.put("status_order","accept");
    }

    @Step
    public void hitEndpointAcceptOrderWO() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .body(inputUpdateAccept.toString())
                .when()
                .put(endpoint.UPDSTATUSORDER+idAccept)
                .then()
                .statusCode(201);
    }
    @Step
    public void setUpdateDecline(){
        inputUpdateDecline = new JSONObject();
        inputUpdateDecline.put("status_order","decline");
    }

    @Step
    public void hitEndpointDeclineOrderWO() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .body(inputUpdateDecline.toString())
                .when()
                .put(endpoint.UPDSTATUSORDER+idDecline)
                .then()
                .statusCode(201);
    }

    @Step
    public void validateUpdateOrderWO() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/updateStatusOrder.json"));
    }
}
