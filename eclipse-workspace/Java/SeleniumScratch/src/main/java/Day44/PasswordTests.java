package Day44;

import org.testng.annotations.Test;

public class PasswordTests {

	@Test(priority=1 ,groups={"sanity","regression","functional"})
	void passwordByEmail()
	{
		System.out.println("this is password by email");
	}
	
	@Test(priority=2 ,groups={"sanity","regression","functional"})
	void passwordFacebook()
	{
		System.out.println("this is password by facebook");
	}
	
}
