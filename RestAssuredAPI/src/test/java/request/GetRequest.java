package request;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	
	@Test
	public void sendGetRequest() {
		
		//Response resp = RestAssured.get("https://localhost:3000/profile");
		Response resp = RestAssured.get("https://jsonplaceholder.typicode.com/posts?userId=7");
		String s= resp.asString();
		System.out.println(s);
		
		int statusCode = resp.statusCode();
		System.out.println(statusCode);
		
		String contentType = resp.contentType();
		
		System.out.println(contentType);
		
		
	}

}
