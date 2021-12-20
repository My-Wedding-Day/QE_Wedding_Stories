package starter.Users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class regisUser {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;

    @Step
    public void setBodyReq(){
        requestParams = new JSONObject();
        requestParams.put("name","inicobadulu");
        requestParams.put("email","inicobadulu@alta.id");
        requestParams.put("password","Password399");
    }
    @Step
    public void setBodyReqEmailExisted(){
        requestParams = new JSONObject();
        requestParams.put("name","test23");
        requestParams.put("email","alta@alterra.id");
        requestParams.put("password","Password192");
    }
    @Step
    public void setBodyReqUNExisted(){
        requestParams = new JSONObject();
        requestParams.put("name","test");
        requestParams.put("email","alta56@alterra.id");
        requestParams.put("password","Password192");
    }
    @Step
    public void setBodyReqUNBlank(){
        requestParams = new JSONObject();
        requestParams.put("name","");
        requestParams.put("email","alta91@alterra.id");
        requestParams.put("password","Password192");
    }
    @Step
    public void setBodyReqEmailBlank(){
        requestParams = new JSONObject();
        requestParams.put("name","test123");
        requestParams.put("email","");
        requestParams.put("password","Password192");
    }
    @Step
    public void setBodyReqPWBlank(){
        requestParams = new JSONObject();
        requestParams.put("name","test456");
        requestParams.put("email","alta456@alterra.id");
        requestParams.put("password","");
    }


    @Step
    public void hitEndpointRegister(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.REGUSER)
                .then()
                .statusCode(201);

    }
    @Step
    public void hitEndpointRegisterFailed(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.REGUSER)
                .then()
                .statusCode(400);

    }
    @Step
    public void valdateEndpointRegister(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/regisuser.json"));
    }

}
