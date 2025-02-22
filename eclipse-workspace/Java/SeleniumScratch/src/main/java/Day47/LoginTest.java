package Day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//xml excuted test case class--test case internal calling page object class i that actions & methods--then it is interact with application under test
public class LoginTest {
  
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
//	void testlogin()
//	{
//		POMDemo pg=new POMDemo(driver);
//		pg.setuser("Admin");
//		pg.setpass("admin123");
//		pg.setlog();
//		
//			Assert.assertEquals(driver.getTitle(), "OrangeHRM");	
//		
//	}
	
	void testlogin()
	{
		UsingPageFactory pg=new UsingPageFactory(driver);
		pg.setuser("Admin");
		pg.setpass("admin123");
		pg.setlog();
		
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");	
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
