package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsandpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver =new ChromeDriver();

			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			//normal,confirmation,promting alert
			
			//alerts window are not webElements
			
			//with ok button
			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
			
			Thread.sleep(2000);
			
			Alert myalert=driver.switchTo().alert();
			System.out.println(myalert.getText());
			myalert.accept();
			
			//with confirmation=ok and cancel
			
			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
			Thread.sleep(3000);
			Alert confirm=driver.switchTo().alert();
			
			System.out.println(confirm.getText());
//			confirm.dismiss();
			confirm.accept();
			
			//promt alert
			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		    Thread.sleep(3000);
			
			Alert mypromt=driver.switchTo().alert();
			
			mypromt.sendKeys("welcome");
			
			mypromt.accept();
			
			//without using switching command how to handle alerts
			
			
			
	}

}
