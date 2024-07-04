package api_Package;
import static io.restassured.RestAssured.*;  
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import files.Payload;
public class Basic_Api {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("keys", "qaclick123").header("Content-Type","application/json").body(Payload.addPlace()).when()
				   .post("maps/api/place/add/json").then().assertThat().statusCode(200)
		            .body("scope", equalTo("APP")).header("Content-Length", "<calculated when request is sent>").extract().response().asString();
      		System.out.println(response);
      		JsonPath js=new JsonPath(response);
      		String placeId = js.getString("place_id");
      		System.out.println(placeId);
	}

}
