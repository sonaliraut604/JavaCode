package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//JavascriptExecutor is interface which is impleted by remoteWebDriver and which is having executescript so we can execute javascript
//statements
// like sendkeys and click that type of method we can execute
	
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 WebElement box=driver.findElement(By.xpath("//input[@id='name']"));
		 WebElement radio=driver.findElement(By.xpath("//input[@id='female']"));
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].setAttribute('value','sonu')",box);
		 
		 js.executeScript("arguments[0].click()",radio);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
