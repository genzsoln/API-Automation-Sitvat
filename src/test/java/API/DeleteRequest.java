package API;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;

import org.testng.annotations.Test;

//copied from rest assured document (static) : it is mandatory for http request
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DeleteRequest {
       int id;
	
	
	@Test(priority=1)
	void createUser(){
		
		HashMap data=new HashMap();
		data.put("name","sitvat");
		data.put("job","Software Engineer");
		
		id=given()
		.contentType("application/json")
		.body(data)
		
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
		
		//.then()
		
	
}
      @Test(priority=2)
	
	void UpdateUser(){
		
		HashMap data=new HashMap();
		data.put("name","sitvat");
		data.put("job","Data Scientist");
		
		 given()
		.contentType("application/json")
		.body(data)
		
		.when()
			.put("https://reqres.in/api/users/"+id)
			//.jsonPath().getInt("id")
		
		.then()
			.statusCode(201)
			.log().all();
		
	}
	 
      @Test(priority=4)
      void deleteUser()
      {
    	  given()
    	  
    	  .when()
    	  	.delete("https:/reqres.in/api/users/"+id)
    	  	
    	  .then()
    	  	.statusCode(204)
    	  	.log().all();
      }
	
}
