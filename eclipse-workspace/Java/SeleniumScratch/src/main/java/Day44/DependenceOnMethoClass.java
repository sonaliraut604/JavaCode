package Day44;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DependenceOnMethoClass {
	
	// if the first condition pass then others will run and skipped the conditions
	//if first condition is pass then others will pass
	//dependsOnMethod={"Method name1,"Metgod name=2}
	
	@Test(priority=1)
	void openapp()
	{
	    Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
	    Assert.assertTrue(true);
	}
	
    @Test(priority=3,dependsOnMethods= {"openapp"})
	void search()
	{
	    Assert.assertTrue(false);
	}
	
    @Test(priority=4,dependsOnMethods= {"login","search"})
	void advancesearch()
	{
	    Assert.assertTrue(true);
	}
	
    @Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
	    Assert.assertTrue(true);
	}

}
