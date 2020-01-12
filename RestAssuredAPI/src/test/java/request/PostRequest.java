package request;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	@Test
	public void sendPostRequest() 
	{
		
		
		RequestSpecification req = RestAssured.given();
	    
		JSONObject jObj = new JSONObject();
		jObj.put("name","Anuj");
		jObj.put("id",2);
		
		req.body(JSONObject.toJSONString(jObj));
		 req.contentType(ContentType.JSON);
		 
		 Response resp = req.post("https://localhost:3000/profile");
		 String s= resp.asString();
			System.out.println(s);
			
			int statusCode = resp.statusCode();
			System.out.println(statusCode);
			
			String contentType = resp.contentType();
			
			System.out.println(contentType);
		 
		 
	
	
	}
	
	
}
