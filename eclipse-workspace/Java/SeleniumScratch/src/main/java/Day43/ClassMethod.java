package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassMethod {
	
 
 /* login--- @BeforeClass
  * search-- @Test
  * adv search-- @Test
    logout--- @AfterClass
  */
	
	
        @BeforeClass
		void login()
		{
			System.out.println("this is login...");
		}
		
		@AfterClass
		 void logout()
		{
			System.out.println("this is logout...");
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
