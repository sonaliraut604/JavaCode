package Day43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {

	
	@Test(priority=2)
	void xyz()
	{
	System.out.println("i am in the c2 class");
	}
	
	@AfterTest
	void After()
	{
		System.out.println("i am in the After method");
	}
}
