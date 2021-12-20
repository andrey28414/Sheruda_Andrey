package Tests;

import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Delete {
    create_file myfile;

    @Test
    public void get_meta_data() throws IOException {
        JSONObject requestBody = new JSONObject();
        requestBody.put("path", "/WebApi/blank.txt");
        myfile.create();
        given()
                .auth()
                .oauth2("3JQeMX25DG4AAAAAAAAAAWtiBNLTc7CbpRnBIeNXq6SBy7_Xgf5jUs_9YgJ3jq3e")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("https://api.dropboxapi.com/2/files/get_metadata")
                .then()
                .assertThat()
                .statusCode(200);
    }
}