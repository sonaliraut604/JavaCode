package Day42;

import org.testng.annotations.Test;

public class FirstClass {
	
	@Test(priority=2)
	void login()
	{
		System.out.println("login is sucessful............");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout is sucessful............");
	}
 
	@Test(priority=1)
	void openpage()
	{
		System.out.println("open page............");
	}

}
