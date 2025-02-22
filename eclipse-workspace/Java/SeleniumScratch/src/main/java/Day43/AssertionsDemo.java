package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	//Hard Assertions
	//soft Assertions
	
		//Assertions-validation point
    @Test
	void testtitle()
	{
		String exp_tiltle="Opencart";
		String act_tiltle="OpenDemo";
		
		if(exp_tiltle.equals(act_tiltle))
		{
			System.out.println("passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Fail");
			Assert.assertTrue(false);
		}
		
//		Assert.assertEquals(exp_tiltle, act_tiltle);
	}
		

	}


