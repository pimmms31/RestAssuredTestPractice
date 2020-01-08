package maven.users.test;

import Practice.Base.BaseRequest;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class UserTest {

    @Test
    public void createUser(){
        String base_url="https://reqres.in/";
        Map<String, String> headers= new HashMap<>();
        headers.put("Content-Type","application/json");

        String payload= "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        Response response= BaseRequest.post(base_url+"api/users",headers,payload);
        System.out.println(response.statusCode());
        response.body().prettyPrint();
    }
}
