package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/webhp?authuser=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("automation");
		
		List<WebElement>txt=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(txt.size());
		
		//txt form 
		
		//select all the value from the loop
		
		for(int i=0;i<txt.size();i++)
		{
			System.out.println(txt.get(i).getText());
			
			if(txt.get(i).equals("Selenium"))
			{
				txt.get(i).click();
				break;
			}
		}
	}

}
