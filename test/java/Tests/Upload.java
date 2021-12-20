package Tests;

import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Upload {
    create_file myfile;

    @Test
    public void Upload_file() throws IOException {
        JSONObject requestbody = new JSONObject();
        requestbody.put("path", "/WebApi/blank.txt");
        requestbody.put("mode", "add");
        requestbody.put("autorename", "true");
        requestbody.put("mute", "false");
        requestbody.put("strict_conflict", "false");
        myfile.create();
        given()
                .auth()
                .oauth2("3JQeMX25DG4AAAAAAAAAAWtiBNLTc7CbpRnBIeNXq6SBy7_Xgf5jUs_9YgJ3jq3e")
                .header("Content-Type","application/octet-stream")
                .header("Dropbox-API-Arg", requestbody)
                .body("blank.txt")
                .when()
                .post("https://content.dropboxapi.com/2/files/upload")
                .then()
                .assertThat()
                .statusCode(200);


    }
}