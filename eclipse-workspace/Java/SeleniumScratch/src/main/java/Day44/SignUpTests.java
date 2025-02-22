package Day44;

import org.testng.annotations.Test;

public class SignUpTests {

	@Test(priority=1 ,groups={"regression"})
	void signupByEmail()
	{
		System.out.println("this is signup by email");
	}
	
	@Test(priority=2 ,groups={"regression"})
	void signupFacebook()
	{
		System.out.println("this is signup by facebook");
	}
	
	@Test(priority=3 ,groups={"regression"})
	void signuplogintwitter()
	{
		System.out.println("this is signup by twitter");
		
	}
}
