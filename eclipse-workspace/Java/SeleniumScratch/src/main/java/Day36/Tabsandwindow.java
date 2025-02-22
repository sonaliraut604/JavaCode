package Day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabsandwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.nopcommerce.com/");
		 //driver.get("https://testautomationpractice.blogspot.com/");
		// driver.manage().window().maximize();
		 
		//driver.switchTo().newWindow(WindowType.TAB);//open a new tab
		 
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 
		driver.get("https://testautomationpractice.blogspot.com/");

	}

}
