package starter.Users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class regiswo {

    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;

    @Step
    public void setBodyReqwo(){
        requestParams = new JSONObject();
        requestParams.put("Woname","testcoba3");
        requestParams.put("email","alta@gmai3l.com");
        requestParams.put("PhoneNumber","0897653423");
        requestParams.put("password","Password192");
        requestParams.put("city","depok");
        requestParams.put("address","Jlrayaseturt06/05");


    }
    @Step
    public void hitEndpointRegisterwo(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.REGWo)
                .then()
                .statusCode(201);

    }

    @Step
    public void valdateEndpointRegisterwo(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/regiswo.json"));
    }







}
