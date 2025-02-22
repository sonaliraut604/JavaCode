package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
	
			
			//click on 3rd option in selector hub(click on recording)
			
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Thread.sleep(5000);
		box1.clear();
		box1.sendKeys("welcome");
		
		//double click
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		String text=box2.getAttribute("id");
		System.out.println(text);
		
	}

}
