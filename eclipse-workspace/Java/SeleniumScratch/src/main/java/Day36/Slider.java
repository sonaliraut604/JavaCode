package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		WebDriver driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.tutorialspoint.com/selenium/practice/slider.php");
		 driver.manage().window().maximize();
		 
		WebElement slider= driver.findElement(By.xpath("//input[@id='ageInputId']"));
        System.out.println("location of slider"+slider.getLocation());  //582,204
		
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider,600,204).perform();
		
	}

}
