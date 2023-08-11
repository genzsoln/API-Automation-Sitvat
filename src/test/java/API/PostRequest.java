package API;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import java.util.HashMap;

//copied from rest assured document (static) : it is mandatory for http request
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PostRequest {              //for creating the user

	
	@Test
	void post(){
		
		HashMap data=new HashMap();
		data.put("name","sitvat");
		data.put("job","Software Engineer");
		
		
	given()
		.contentType("application/json")
		.body(data)
	
	.when()
		.post("https://reqres.in/api/users")
		
	
	.then()
		.statusCode(201)
		.log().all();
	
	}	
}
