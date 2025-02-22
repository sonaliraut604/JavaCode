package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pahination2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
			driver.get("https://datatables.net/examples/basic_init/alt_pagination.html5");
			driver.manage().window().maximize();
			
			 for(int i=1;i<=21;i++)
			 {
				 if(i>1)
				 {
					 WebElement table=driver.findElement(By.xpath("//nav[@aria-label='pagination']//*[text()="+i+"]"));
					 table.click();
				 }
				 
				 //no or roes
				 
				int row= driver.findElements(By.xpath("//table[@class='display dataTable']//tbody//tr")).size();
				
				for(int r=1;r<=row;r++)
				{
					
					String Name=driver.findElement(By.xpath("//table[@class='display dataTable']//tbody//tr[1]//td[1]")).getText();
					String salary=driver.findElement(By.xpath("//table[@class='display dataTable']//tbody//tr[1]//td[5]")).getText();
					
					System.out.println(Name+"\t"+salary);
					
				}
				
			 }
	}

}
