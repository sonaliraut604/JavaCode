package Day44;

import org.testng.annotations.Test;

public class loginTests {
 //grouping all the tc we run in same files
	
//	loginBy--sanity  group of all the tc
//	signupBy-regression
//	passwordBY--sanity,regression
	
	//for grouping used include and for excluding used exclude tag
	
	@Test(priority=1 ,groups={"sanity"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
	
	@Test(priority=2, groups={"sanity"})
	void loginFacebook()
	{
		System.out.println("this is login by facebook");
	}
	
	@Test(priority=3 ,groups={"sanity"})
	void logintwitter()
	{
		System.out.println("this is login by twitter");
		
	}
}
