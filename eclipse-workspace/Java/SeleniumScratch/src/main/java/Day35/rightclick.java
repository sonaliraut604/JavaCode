package Day35;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 driver.manage().window().maximize();
		 
		 WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 
		 Actions act =new Actions(driver);
		 
		 act.contextClick(button).perform();
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		 
		Alert txt=driver.switchTo().alert();
		System.out.println(txt.getText());
		txt.accept();
		 
		  
		 
		
		
	}

}
