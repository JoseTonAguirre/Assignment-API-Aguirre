import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class API_Aguirre {

    @Test
    public void post() {
        JSONObject test = new JSONObject();

        test.put("name", "Jose");
        test.put("job", "Online Seller");

        System.out.println(test.toJSONString());

        given().
                body(test.toJSONString()).
        when().
                post ("https://reqres.in/api/users").
        then().
            statusCode(201);
    }

    @Test
    public void patch() {
        JSONObject test = new JSONObject();

        test.put("name", "Jihyo");
        test.put("job", "Online Seller");

        System.out.println(test.toJSONString());

        given().
                body(test.toJSONString()).
        when().
                patch ("https://reqres.in/api/users/2").
        then().
            statusCode(200);
    }

    @Test
    public void get() {

        when().
                get ("https://reqres.in/api/users/2").
        then().
            statusCode(200).log().all();
    }

    @Test
    public void testing4delete() {

        when().
                delete ("https://reqres.in/api/users/2").
        then().
            statusCode(204).log().all();
    }

}