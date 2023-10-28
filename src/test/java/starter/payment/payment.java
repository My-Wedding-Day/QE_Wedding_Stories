package starter.payment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class payment {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    JSONObject inputWO;
    JSONObject inputAdmin;
    JSONObject updateOrder;
    String tokenuser;
    String tokenwo;
    String tokenadmin;
    Integer ID;

//    @Step
//    public void setBodyReq() {
////        requestParams = new JSONObject();
////        requestParams.put("email", "iniuser@gmail.com");
////        requestParams.put("password", "12345678");
//    }

    @Step
    public void hitEndpointLoginUserPayment() {
        requestParams = new JSONObject();
        requestParams.put("email", "hilmifuad7@gmail.com");
        requestParams.put("password","hilmifuadd");
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.LOGINUSER)
                .then()
                .statusCode(201);

        tokenuser = SerenityRest
                .then()
                .extract()
                .path("token");
    }
    @Step
    public void hitEndpointLoginWOPayment() {
        inputWO = new JSONObject();
        inputWO.put("email", "halaldulu@gmail.com");
        inputWO.put("password","halalindulu123");
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(inputWO.toString())
                .when()
                .post(endpoint.LOGINORGANIZER)
                .then()
                .statusCode(201);

        tokenwo = SerenityRest
                .then()
                .extract()
                .path("token");
    }
    @Step
    public void hitEndpointLoginAdminPayment() {
        inputAdmin = new JSONObject();
        inputAdmin.put("email", "admin@weddingstories.com");
        inputAdmin.put("password","admin123");
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(inputAdmin.toString())
                .when()
                .post(endpoint.LOGINUSER)
                .then()
                .statusCode(201);

        tokenadmin = SerenityRest
                .then()
                .extract()
                .path("token");
    }

    @Step
    public void hitEndpointBookingOrder() {
        SerenityRest
                .given()
                .header("Accept", "application/json")
                .header("Authorization", "Bearer "+tokenuser)
                .header("Content-Type","multipart/form-data")
                .multiPart("package_id","28")
                .multiPart("date","2021-12-31")
                .multiPart("additional","none")
                .multiPart("pax","1000")
                .when()
                .post(endpoint.ORDERPACKAGE)
                .then()
                .statusCode(201);
    }
    @Step
    public void hitEndpointGetReservationUser() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+tokenuser)
                .when()
                .get(endpoint.GETRESUSER)
                .then()
                .statusCode(200);
//        ID = SerenityRest
//                .then()
//                .extract()
//                .path("data[0].ID");
    }

    @Step
    public void hitEndpointAcceptOrderWO() {
        updateOrder = new JSONObject();
        updateOrder.put("status_order","accept");
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+tokenwo)
                .body(updateOrder.toString())
                .when()
                .put(endpoint.UPDSTATUSORDER+ID)
                .then()
                .statusCode(201);
    }
    @Step
    public void hitEndpointSendInvoice() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+tokenuser)
                .header("Content-Type","multipart/form-data")
                .multiPart("reservationid","41")
                .multiPart("invoice",new File("./src/test/resources/gambar/UPM.jpg"))
                .when()
                .post(endpoint.PAYMENT)
                .then()
                .statusCode(201);
    }
    @Step
    public void hitEndpointUpdatePayment() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+tokenadmin)
                .header("Content-Type","multipart/form-data")
                .multiPart("reservationid","41")
                .when()
                .put(endpoint.PAYMENT)
                .then()
                .statusCode(201);
    }

//    @Step
//    public void validateGetReservationUser() {
//        SerenityRest
//                .then()
//                .body(matchesJsonSchemaInClasspath("JSONSchema/getreservation.json"));
//    }
    @Step
    public void validateOrderPackage() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/payment.json"));
    }
}
