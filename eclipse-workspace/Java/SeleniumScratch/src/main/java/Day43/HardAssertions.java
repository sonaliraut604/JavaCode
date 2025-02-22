package Day43;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

//hardassertion= it is write in the last of the class so it would be more better

public class HardAssertions {

	@Test
	void test()
	{
//		Assert.assertEquals("xyz", "xyz");
//		Assert.assertEquals("xyz", "123");
 
		
	//Assert.assertNotEquals("XYZ", "avg"); //passed
		
	//	Assert.assertTrue(true);  //true
	//	Assert.assertTrue(false);  //false
		
//		Assert.assertTrue(1==2); //fail
//		Assert.assertTrue(1==1); //pass
		
		Assert.fail();
		
	}
}
