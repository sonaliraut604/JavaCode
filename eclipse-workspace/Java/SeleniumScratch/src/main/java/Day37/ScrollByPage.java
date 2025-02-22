package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		 //scroll down page by pixel no
		 
//		 js.executeScript("window.scrollBy(1,1500)","");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
	 
		//til the element is visiblee
//		 WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Visitors']"));
//		 
//		 js.executeScript("arguments[0].scrollIntoView();",ele);
//		 
//		 System.out.println(js.executeScript("return window.pageYOffset;"));
		 
		 //scroll page till end of the page
		 
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 System.out.println(js.executeScript("return window.pageYOffset;"));
		 
		 //scroll page till start of the page
		 
		 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		 System.out.println(js.executeScript("return window.pageYOffset;"));
		 
		 
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 System.out.println(js.executeScript("return window.pageYOffset"));
		 
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 System.out.println(js.executeScript("return window.pageYOffset"));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
