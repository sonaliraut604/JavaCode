package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class KayBoardActions {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://text-compare.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//*[@id='inputText1']")).sendKeys("welcome to the selenium class");
		 Actions act=new Actions(driver);
		
		 //ctrl+A
		 act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		 
		 //ctrl+c
		 act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		 
		 //tab -shift to 2 box																	
		 act.keyDown(Keys.TAB).keyUp(Keys.TAB);
		 
		 //ctrl+v
		 act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		 
	}

}