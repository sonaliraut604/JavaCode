package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		 
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent(); //go back to page
		

//		driver.switchTo().frame(0);
//		
//		driver.findElement(By.xpath(""));
//		
//		driver.switchTo().defaultContent();
//		
		
	  
	
		
	}

}
