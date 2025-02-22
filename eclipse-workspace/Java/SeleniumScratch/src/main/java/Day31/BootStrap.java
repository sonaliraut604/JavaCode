package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/books/demo.php?ex=63.0_2#");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Web Elements']")).click();
		
		driver.findElement(By.xpath("//a[@href='/tag/buttons/']")).click();
		
		List<WebElement>options=driver.findElements(By.xpath("//li[contains(@class,'custom menu-item')]//a"));
		
		System.out.println(options.size());
		
		//print options from dropdown
		
		for(WebElement number:options)
		{	
			System.out.println(number.getText());
		}
		
	}

}
