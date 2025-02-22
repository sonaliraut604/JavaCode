package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Opennewwindowbykeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.nopcommerce.com/");
		 driver.manage().window().maximize();
		 
		 WebElement link=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		 
		 Actions act=new Actions(driver);
		 
		 act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
		 
		//switching to resigster page
		 
		Set<String>gettxt= driver.getWindowHandles();
		
		//convert set to list
		
		List<String>ids=new ArrayList(gettxt);
		
		//you can also used 
		
		//List<String>id=new ArrayList(driver.getWindowHandles());	
			
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("gghhhhn");
		
		for(String id:gettxt)
		{
			String title=driver.switchTo().window(id).getTitle();
			System.out.println(title);
			System.out.println(driver.getCurrentUrl());
		}
		
		 
	}

}
