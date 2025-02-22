package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver =new ChromeDriver();
//		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			//select all the checkboxes
			
			List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
			
			/*for(int i=0;i<checkbox.size();i++)
			{
				checkbox.get(i).click();
			}*/
			
			//use for each loop
			
//			for(WebElement check:checkbox)
//			{
//				check.click();
//			}
			
			//select last 3 checkboxes  total 7-3 selected checkboxes=4 start from this
			
//			for(int i=4;i<checkbox.size();i++)
//			{
//				checkbox.get(i).click();
//			}
			
			//select first 3 checkboxes
			
//			for(int i=0;i<4;i++)
//			{
//				checkbox.get(i).click();	
//				
//			}
			
			//unselect the checkboxes if they are selected
			
			for(int i=0;i<4;i++)
				{
					checkbox.get(i).click();	
					
				}
			
			Thread.sleep(5000);
			
			for(int i=0;i<checkbox.size();i++)
				{
				  if(checkbox.get(i).isSelected())
				  {
					checkbox.get(i).click();
				  }
				}
			
			
			
			
			
			
			
			
	}

}
