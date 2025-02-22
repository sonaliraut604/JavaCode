package Day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Methods {

	//@BeforeMethod  @Test  @AfterMethod --it is used for multiple running tc at the one time
	//@Test
	
	//BeforeMethod @ Test @AfterMethod
	//BeforeClass  @AfterClass
    //BeforeTest   @AfterTest
	//BeforeSuite  @AfterSuite
	
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
	
	@Test(priority=1)
	void search()
	{
		System.out.println("this is normal search...");
	}
	
	@Test(priority=2)
	void advancessearch()
	{
		System.out.println("this advanced search...");
	}
	
	
	}
	

