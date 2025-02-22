package Assignment;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Automation");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		List<WebElement> value=driver.findElements(By.tagName("a"));
		
	     int sizeele=value.size();
	     
	     for(int i=1;i<sizeele;i++)
	     {
	    	 System.out.println(value.get(i).getText());
	     }
	     
	     
//	    Set<String> gettxt= driver.getWindowHandles();
//	    
//	    
//	    for(String windowtxt:gettxt)
//	    {
//	    	String txt=driver.switchTo().window(windowtxt).getTitle();
//	    	System.out.println(txt);
//	    	
//	    }
	     
	   
	     
	    
	   
	}

}
