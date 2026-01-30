package api;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import utils.BaseAPI;

public class AuthAPI extends BaseAPI {

    public Response generateToken(String username, String password) {

        String payload = "{\n" +
                "  \"username\": \"" + username + "\",\n" +
                "  \"password\": \"" + password + "\"\n" +
                "}";

        Response response =
                given()
                        .baseUri(BASE_URL)
                        .header("Content-Type", "application/json")
                        .body(payload)
                .when()
                        .post("/auth")
                .then()
                        .extract().response();

        return response;
    }
}
