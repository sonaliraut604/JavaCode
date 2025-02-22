package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		//without using switching command how to handle alerts
		// without using switchTo
		
		 WebDriver driver =new ChromeDriver();
		 
		 WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait

			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			
           driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
			
			Thread.sleep(2000);
			
			Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());	
			
			myalert.accept();
			
			
			
			
			
			
		
	}

}
