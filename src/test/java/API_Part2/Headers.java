package API_Part2;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class Headers {
	
	@Test(priority=1)
	void headers() {
		
		given()
			
	
		.when()
		.get("https:/www.google.com/")
		
		.then()
			.header("Content-Type","text/html; charset=ISO-8859-1");
		
	}

	

}
