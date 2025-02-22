package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@Test(priority=1)
	void abc()
	{
	System.out.println("i am in the c1 class");
	}
	
	@BeforeTest
	void before()
	{
		System.out.println("i am in the before test");
	}

	@Test(priority=2)
	void xyz()
	{
	System.out.println("i am in the c2 class");
	}
	
	@AfterTest
	void After()
	{
		System.out.println("i am in the After test");
		
	}
	
	@Test(priority=3)
	void aaa()
	{
		System.out.println("this is $$$$$$");
	}
    
	@AfterSuite
	void bbb()
	{
		System.out.println("this is +++++++++++++++++++++++++");
	}
	
	@BeforeSuite
	void ccc()
	{
		System.out.println("this is ===========================");
	}
	

	@AfterClass
	 void logout()
	{
		System.out.println("this is logout...");
	}
	
	 @BeforeClass
		void login()
		{
			System.out.println("this is login...");
		}
		@BeforeMethod
		void loginBefore()
		{
			System.out.println("this is beforeMethod");
		}
		
		@AfterMethod
		 void logoutAfter()
		{
			System.out.println("this is AfterMethod");
		}
}

