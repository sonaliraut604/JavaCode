package Day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	
	@Test
	void aaa()
	{
		System.out.println("this is .......................");
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
}
