package Day34;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			
//	  exp month=jan;
//	  
//	  exp month< current moth       past
//	  exp month > current month     future
			
	}

}
