package api_Package;

import static io.restassured.RestAssured.given; 
import static org.hamcrest.Matchers.equalTo;
import files.resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Basic3Demo {

    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException{

        FileInputStream fis = new FileInputStream("C:\\Users\\boma.dagogo\\Desktop\\BOMA DAGOGO\\eclipse-workspace\\DemoProject\\src\\files\\env.properties");
        prop.load(fis);
        //prop.get("HOST");
    }

    @Test
    public void addandDeletePlace() {

        String b = "{\r\n" +
                "    \"location\":{\r\n" +
                "        \"lat\" : -38.383494,\r\n" +
                "        \"lng\" : 33.427362\r\n" +
                "    },\r\n" +
                "    \"accuracy\":50,\r\n" +
                "    \"name\":\"Frontline house\",\r\n" +
                "    \"phone_number\":\"(+91) 983 893 3937\",\r\n" +
                "    \"address\" : \"29, side layout, cohen 09\",\r\n" +
                "    \"types\": [\"shoe park\",\"shop\"],\r\n" +
                "    \"website\" : \"http://google.com\",\r\n" +
                "    \"language\" : \"French-IN\"\r\n" +
                "}";

        RestAssured.baseURI = prop.getProperty("HOST");
        Response res = given().
                queryParam("key", " qaclick123").
                body(b).
                when().
                post(resources.placePostData()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status", equalTo("OK")).
                extract().response();

        //Task 2: Grab the place_id from the response

        String responseString = res.asString();
        System.out.println(responseString);

        JsonPath js = new JsonPath(responseString);
        js.get("place_id");

        String place_id = js.get("place_id");
        System.out.println(place_id);

        //Task 3: Place this place_id in the Delete request
        given().
                queryParam("key", prop.getProperty("KEY")).
                body("{" +
                        "\"place_id\":\"" + place_id + "\"" +
                        "}").
                when().
                post("/maps/api/place/delete/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status", equalTo("OK"));

    }

}
