package Day26and27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver =new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
				
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtuser=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtuser.sendKeys("Admin");
		
		WebElement txtlogin=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		txtlogin.sendKeys("admin123");
		
		WebElement txtclick=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		txtclick.click();
		
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"); //button[@type='submit']
	}

}
