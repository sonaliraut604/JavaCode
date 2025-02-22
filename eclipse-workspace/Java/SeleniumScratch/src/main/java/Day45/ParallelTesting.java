package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class ParallelTesting {

	WebDriver driver;

//for grouipng we wiil always used xml files	
//and create multiple test entry for running parellel execution
//threas count =2 to 5 maximum if we make more than that it is reduces script reduncy
//parallel execution beacuse it reduces script run timming 
	
	
    @BeforeClass
//    @Parameters({"Browser"})
	void setup( String br) throws InterruptedException
	{
    	
//    	switch(br)
//    	{
//    	case "chrome": driver=new ChromeDriver();break;
//    	case "edge": driver=new EdgeDriver();break;
//    	case "firefox": driver=new FirefoxDriver();break;
//    	default: System.out.println("invalid");
//    	}
    	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testlogo()
	{
		
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	@Test(priority=2)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=3)
	void testUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=4)
	void teardown()
	{
		driver.quit();
	}
}
