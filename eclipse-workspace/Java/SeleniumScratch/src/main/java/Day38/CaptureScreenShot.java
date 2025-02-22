package Day38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  	

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//full page screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File SourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		File TargetFile=new File(System.getProperty("user.dir")+"\\ScreenShots\\page.png");
		
		SourceFile.renameTo(TargetFile);
		
		//capture the ss for specific sections
		
		WebElement featurepro= driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File SourceFile1=featurepro.getScreenshotAs(OutputType.FILE);
		
		File TargetFile1=new File(System.getProperty("user.dir")+"\\ScreenShots\\featurepro.png");
		
		SourceFile1.renameTo(TargetFile1);
		
		//ss for one element
		 WebElement oneimg=driver.findElement(By.xpath("//img[@alt='Picture for category Apparel']"));
		 
		 File fileSource=oneimg.getScreenshotAs(OutputType.FILE);
		 
		 File FileTarget=new File(System.getProperty("user.dir")+"\\ScreenShots\\oneimg.png");
		 
		 fileSource.renameTo(FileTarget);
		
	
	}

}
