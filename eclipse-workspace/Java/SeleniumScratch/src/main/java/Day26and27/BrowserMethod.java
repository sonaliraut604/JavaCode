package Day26and27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);
		
		driver.quit();// close all the brower windows
		//driver.close() // close the single browser window 
		
		
	}
	
	

}
