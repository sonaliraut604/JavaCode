package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select dropoption=new Select(drop);
		
		dropoption.selectByVisibleText("Germany");
		dropoption.selectByValue("france");
		dropoption.selectByIndex(5);
		
		List<WebElement> options=dropoption.getOptions();
		System.out.println(options.size());
		
		
		//getoptions=returns all the options from the dropdown as webelement
		
		for(WebElement print:options)
		{
			System.out.println(print.getText());
		}
				
	}

}
