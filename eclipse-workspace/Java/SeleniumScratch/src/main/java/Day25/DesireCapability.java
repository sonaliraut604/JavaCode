package Day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesireCapability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DesiredCapabilities caps=new DesiredCapabilities();
		
		driver.manage().window().maximize();
				
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
	}

}
