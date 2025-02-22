package Day26and27;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		//get method-we can acess these method throught webdriver instance
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle()-return title of the page
		String name=driver.getTitle();
		System.out.println(name);
		
		//getcurrenturl- returns the URL of the page
		
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource-returns the source code of the page
		String page= driver.getPageSource();
		System.out.println(page);
		
		//getWindowHandle() - return id of the single browser window
		
		String window=driver.getWindowHandle();
		System.out.println(window);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowid=driver.getWindowHandles();
		System.out.println(windowid);
		
//		driver.quit();  //close the all the browser window
		
		
		
		
		
		
		
		
		
	}

}
