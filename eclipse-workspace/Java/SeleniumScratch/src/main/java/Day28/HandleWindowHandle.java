package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowHandle {

	public static void main(String[] args) {
		
		
		    WebDriver driver =new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
			
			Set<String> windowid=driver.getWindowHandles();
			
			
		//	convert to list
//			
//			List<String> list= new ArrayList(windowid);
//			
//		String parentId=list.get(0);
//		String cgildId=list.get(1);
//		
//		driver.switchTo().window(parentId);
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(cgildId);
//		System.out.println(driver.getTitle());                                                                                                             
			
			
	  for(String id:windowid)
	  {
		  String title=driver.switchTo().window(id).getTitle();
		  System.out.println(driver.getCurrentUrl());
	  }
			
			
			
			

  

	}

}
