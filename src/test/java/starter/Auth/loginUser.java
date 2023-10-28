package starter.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class loginUser {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String token;

    @Step
    public void setBodyReq(){
        requestParams = new JSONObject();
        requestParams.put("email","inicobadulu@alta.id");
        requestParams.put("password","Password399");
    }

    @Step
    public void setBodyReqInvalidPass(){
        requestParams = new JSONObject();
        requestParams.put("email","inicobadulu@alta.id");
        requestParams.put("password","Password192");
    }
    @Step
    public void setBodyReqInvalidEmail(){
        requestParams = new JSONObject();
        requestParams.put("email","alta@gmail.co");
        requestParams.put("password","Password192");
    }
    @Step
    public void setBodyReqInvalidEmailPass(){
        requestParams = new JSONObject();
        requestParams.put("email","alta@gmail.co");
        requestParams.put("password","Password");
    }
    @Step
    public void setBodyReqBlankPass(){
        requestParams = new JSONObject();
        requestParams.put("email","alta@gmail.com");
        requestParams.put("password","");
    }
    @Step
    public void setBodyReqBlankPassInvEmail(){
        requestParams = new JSONObject();
        requestParams.put("email","alta@gmail.co");
        requestParams.put("password","");
    }
    @Step
    public void setBodyReqBlankEmail(){
        requestParams = new JSONObject();
        requestParams.put("email","");
        requestParams.put("password","Password192");
    }
    @Step
    public void setBodyReqBlankEmailInvPass(){
        requestParams = new JSONObject();
        requestParams.put("email","");
        requestParams.put("password","Password");
    }
    @Step
    public void setBodyReqBlankEmailPass(){
        requestParams = new JSONObject();
        requestParams.put("email","");
        requestParams.put("password","");
    }

    @Step
    public void hitEndpointLogin(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.LOGINUSER)
                .then()
                .statusCode(201);
    }

    @Step
    public void hitEndpointLoginFailed(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.LOGINUSER)
                .then()
                .statusCode(400);
    }

    @Step
    public void valdateEndpointLogin(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/loginuser.json"));

    }
    @Step
    public void valdateEndpointLoginFailed(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/loginuserfailed.json"));

    }
}
