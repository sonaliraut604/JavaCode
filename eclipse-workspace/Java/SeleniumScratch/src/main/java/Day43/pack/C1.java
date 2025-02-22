package Day43.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	@Test(priority=1)
	void abc()
	{
	System.out.println("i am in the c1 class");
	}
	
	@BeforeTest
	void before()
	{
		System.out.println("i am in the before method");
	}

}
