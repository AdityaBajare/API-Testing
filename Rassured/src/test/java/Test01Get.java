import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Test01Get {
	
	@Test(description = "This is for get request")
	
	public void getreq() {
		
	Response response =	get("https://reqres.in/api/users?page=2");
	
	
	System.out.println(	"This is body  "+response.getBody());
	
	
	
	System.out.println("This is string  "+response.asString());

	int code=response.getStatusCode();
	org.testng.Assert.assertEquals(code, 201);

	
	System.out.println("This is code  "+response.getStatusCode());
		
	}

	@Test
	void test2() {
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
		}
	
}
