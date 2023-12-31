package API_Part2;

import org.testng.annotations.Test;

import io.restassured.response.Response;
//import io.restassured.response.ResponseOptions;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class CookiesAndHeaders {
	
	
	@Test(priority=1)
	void testCookies(){
		
		given()
		
		.when()
		.get("https://www.google.com/")

		.then()
		.cookie("ACE","Ad49MVEEBt5jbsgQ7iMqzB08asF2YYzn_R16Vg74vt1XfNWggWM00qP-0Q")
		.log().all();
		
	}
	
	@Test(priority=2)
	void checkCookieResponse(){
		
		Response res=given()
				
			.when()
				.get("https:/www.google.com/");
		
		//get single cookie info
		String cookie_value=res.getCookie("AEC");
		System.out.println("Value of cookie is====>"+cookie_value);
		
	}

}
