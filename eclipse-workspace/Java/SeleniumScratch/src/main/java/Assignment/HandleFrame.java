package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
		
		WebElement img=driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']"));
		System.out.println(img.isDisplayed());
	}

}
