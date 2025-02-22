package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginationdyna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			
			for(int i=1;i<=4;i++)
			{
				if(i>1)
			{
				WebElement table=driver.findElement(By.xpath("//ul[@id='pagination']//*[text()="+i+"]"));
				table.click();
				
			}
				
				//no of rows and extract tha data
				
				int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
				
				for(int r=1;r<=rows;r++)
				{
					String row=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[2]")).getText();
					String price =driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[3]")).getText();
					driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[4]//*[@type='checkbox']")).click();
			
					 
					System.out.println(row+"\t"+price);
				}
			
				
			}
	}

}
