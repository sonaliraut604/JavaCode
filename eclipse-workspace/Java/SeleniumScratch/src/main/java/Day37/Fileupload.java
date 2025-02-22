package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver =new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("Downloads\\new.txt");
		 
		
		 
	}

}
