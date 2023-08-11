package API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

//copied from rest assured document (static) : it is mandatory for http request
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


/*
given()

when()

then()

*/



// https://reqres.in/api/users?page=2

public class GETRequest {
	 
	
	
	@Test
	void getRequest() {
		
		given()
			
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.statusCode(200)                    //for validation
			.body("page",equalTo(2))            //for validation
			.log().all();                       //to display all data i.e in Json format

}

	
}

