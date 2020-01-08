package Practice.Base;


import com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.response.Response;


import java.util.Map;

import static com.jayway.restassured.RestAssured.given;


public class BaseRequest {

    public static Response post(String url, Map<String, String> header, Object payloadBody){
        return given().headers(header).body(payloadBody).when().post(url).then().extract().response();
    }
    public static Response post1(String url, Map<String, String> header, Object payloadBody){
        return given().headers(header).body(payloadBody)
                .when().post(url)
                .then().extract().response();
    }
}
