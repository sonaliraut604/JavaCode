package Day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SvgElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));

       
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    
	   WebElement login= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Login']")));
	   login.click();
	  
	   //real xptah using text
//	   driver.findElement(By.xpath("//span[normalize-space()='Time']")).click();
	  
	   //for svg you have to add name=svg it is compulsary
	   //identify SVG element
	   driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[5]")).click();
	   
	    
	}

}
