package Day45;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

//Dataprovider= it is data driven testing
//using xml file== we are doing parallel testing
	
	  WebDriver driver;
	  @BeforeClass
	  void setup()
	  {
		  
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
	  }
	  
	  @Test(dataProvider="dp")
	  void testlogin(String email,String password) throws InterruptedException
	  {
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  Thread.sleep(5000);
		  
		  boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		  if(status==true)
		  {
			  driver.findElement(By.xpath("//a[text()='Logout']/parent::div")).click();
			  Assert.assertTrue(true);
		  }
		  else
		  {
			  Assert.fail();
		  }
	  }
	  
	  @AfterClass 
	  void testDown()
	  {
		  driver.quit();
  }
	  
//it is alwyas return the two dimensional array it is ued to return multiple data 
//for dataprovider always a write a name
	  
	@DataProvider(name="dp",indices= {0,2,3})
	
	Object[][] loginData()
	{
		
		Object data[][]= {
				{"xyz@gmail.com","test123"},
				{"nmo@gmail.com","test111"},
				{"asd@gmail.com","test222"},
				{"abc@gmail.com","12345"},
				{"lop@gmail.com","testkkk"},
							
		};
		
		return data;
	}
	
	
	
	
	
	
	
	
	
}
