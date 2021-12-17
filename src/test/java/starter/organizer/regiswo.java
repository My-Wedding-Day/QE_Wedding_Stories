package starter.organizer;

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
        requestParams.put("Woname","Percobaan12");
        requestParams.put("email","alta@percobaan.com");
        requestParams.put("PhoneNumber","089769533672");
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

    //scenario email already registed

    @Step
    public void setBodyReqwofailedregistedemail(){
        requestParams = new JSONObject();
        requestParams.put("Woname","percobaan5");
        requestParams.put("email","alta@g89mai3l.com");
        requestParams.put("PhoneNumber","08976053423");
        requestParams.put("password","Password192");
        requestParams.put("city","depok");
        requestParams.put("address","Jlrayaseturt06/05");


    }
    @Step
    public void hitEndpointRegisterwoemailalreadyregistred(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.REGWo)
                .then()
                .statusCode(400);

    }

    @Step
    public void valdateEndpointRegisterwoemailalreadyregitered(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/regiswo.json"));
    }


//Scenario complate data name registered

    @Step
    public void setBodyReqwofailedregistedname(){
        requestParams = new JSONObject();
        requestParams.put("Woname","testcioa3");
        requestParams.put("email","alta@g89mai3l.com");
        requestParams.put("PhoneNumber","08976053423");
        requestParams.put("password","Password192");
        requestParams.put("city","depok");
        requestParams.put("address","Jlrayaseturt06/05");


    }
    @Step
    public void hitEndpointRegisterwonamealreadyregistred(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.REGWo)
                .then()
                .statusCode(400);

    }

    @Step
    public void valdateEndpointRegisterwonamealreadyregitered(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/regiswo.json"));
    }


    //scenario no hp already
    @Step
    public void setBodyReqwofailedregistedhp(){
        requestParams = new JSONObject();
        requestParams.put("Woname","percobaan9");
        requestParams.put("email","alta@percobaan67.com");
        requestParams.put("PhoneNumber","089769533672");
        requestParams.put("password","Password192");
        requestParams.put("city","depok");
        requestParams.put("address","Jlrayaseturt06/05");


    }
    @Step
    public void hitEndpointRegisterwohpalreadyregistred(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.REGWo)
                .then()
                .statusCode(400);

    }

    @Step
    public void valdateEndpointRegisterwohpalreadyregitered(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/regiswo.json"));
    }

//username only space

    @Step
    public void setBodyReqwonameonlyspace(){
        requestParams = new JSONObject();
        requestParams.put("Woname"," ");
        requestParams.put("email","alta@g89mai3l.com");
        requestParams.put("PhoneNumber","08976053423");
        requestParams.put("password","Password192");
        requestParams.put("city","depok");
        requestParams.put("address","Jlrayaseturt06/05");


    }
    @Step
    public void hitEndpointRegisternameonlyspace(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.REGWo)
                .then()
                .statusCode(400);

    }

    @Step
    public void valdateEndpointnameonlyspace(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/regiswo.json"));
    }


//email only space

    @Step
    public void setBodyReqwoemailonlyspace(){
        requestParams = new JSONObject();
        requestParams.put("Woname","percobaan907 ");
        requestParams.put("email"," ");
        requestParams.put("PhoneNumber","08976053423");
        requestParams.put("password","Password192");
        requestParams.put("city","depok");
        requestParams.put("address","Jlrayaseturt06/05");


    }
    @Step
    public void hitEndpointRegisteremailonlyspace(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.REGWo)
                .then()
                .statusCode(400);

    }

    @Step
    public void valdateEndpointemailonlyspace(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/regiswo.json"));
    }


//phone number, field alphabet

    @Step
    public void setBodyReqwophonenumberfieldalphabet(){
        requestParams = new JSONObject();
        requestParams.put("Woname","percobaan89");
        requestParams.put("email","percobaan98@gmail.com");
        requestParams.put("PhoneNumber","inigakbolehsalah");
        requestParams.put("password","Password192");
        requestParams.put("city","depok");
        requestParams.put("address","Jlrayaseturt06/05");


    }
    @Step
    public void hitEndpointphonenumberfieldalphabet(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.REGWo)
                .then()
                .statusCode(400);

    }

    @Step
    public void valdateEndpointphonenumberfieldalphabet(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/regiswo.json"));
    }
}
