package starter.Users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class editUserProfile {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    JSONObject updateName;
    JSONObject updateEmail;
    JSONObject updatePassword;
    String token;

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("email", "hilmifuadd081234@gmail.com");
        requestParams.put("password", "hilmifuadd");
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
    public void setUpdateName(){
        updateName = new JSONObject();
        updateName.put("name","Muhammad Hilmi Fuad");
        updateName.put("email","hilmifuadd081234@gmail.com");
        updateName.put("password","hilmifuadd");
    }

    @Step
    public void hitEndpointEditUsername() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .body(updateName.toString())
                .when()
                .put(endpoint.EDITPROFILE)
                .then()
                .statusCode(201);
    }
    @Step
    public void setUpdateEmail(){
        updateEmail = new JSONObject();
        updateEmail.put("name","Muhammad Hilmi Fuad");
        updateEmail.put("email","hilmifuadd081@gmail.com");
        updateEmail.put("password","hilmifuadd");
    }

    @Step
    public void hitEndpointEditEmail() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .body(updateEmail.toString())
                .when()
                .put(endpoint.EDITPROFILE)
                .then()
                .statusCode(201);
    }
    @Step
    public void hitEndpointLoginUpdateEmail() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(updateEmail.toString())
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
    public void setUpdatePass(){
        updatePassword = new JSONObject();
        updatePassword.put("name","Muhammad Hilmi Fuad");
        updatePassword.put("email","hilmifuadd081@gmail.com");
        updatePassword.put("password","hilmifuadd123");
    }

    @Step
    public void hitEndpointEditPass() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .body(updatePassword.toString())
                .when()
                .put(endpoint.EDITPROFILE)
                .then()
                .statusCode(201);
    }
    @Step
    public void hitEndpointLoginUpdatePass() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(updatePassword.toString())
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
    public void setUpdateFailed(){
        requestParams = new JSONObject();
        requestParams.put("name","");
        requestParams.put("email","hilmifuadd081@gmail.com");
        requestParams.put("password","hilmifuadd123");
    }

    @Step
    public void hitEndpointEditFailed() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .body(requestParams.toString())
                .when()
                .put(endpoint.EDITPROFILE)
                .then()
                .statusCode(400);
    }

    @Step
    public void validateEditProfileUser() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/editProfileUser.json"));
    }
}
