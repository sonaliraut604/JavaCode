package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHindlesSce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("selenium143")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
		
		driver.manage().window().maximize();
		
		Set<String> windowid=driver.getWindowHandles();
		
		List<String> name=new ArrayList(windowid);
		
	      String parent=name.get(0);
	      String child=name.get(1);
	      
	      driver.switchTo().window(child);
	      System.out.println(driver.getTitle());
		
		
//		for(String id:windowid)
//        {
//			driver.switchTo().window(id);
//			
//				boolean text=driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed();
//				
//			
//				
//			}	
	
	}
}
