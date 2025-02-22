package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	@Test
	void softAssertion()
	{
		System.out.println("testing.............");
		System.out.println("testing.............");
		
		SoftAssert as=new SoftAssert();
		as.assertEquals(1,2);
		
		System.out.println("testing.............");
		System.out.println("testing.............");
		
		as.assertAll(); //mandatory method
	}
    
//	@Test
//	void hardAssertion()
//	{
//		System.out.println("testing.............");
//		System.out.println("testing.............");
//		
//		Assert.assertEquals(1,2);
//		
//		System.out.println("testing.............");
//		System.out.println("testing.............");
//	}

}
