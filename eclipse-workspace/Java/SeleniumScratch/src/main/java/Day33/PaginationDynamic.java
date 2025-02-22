package Day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PaginationDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		   WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		    driver.get("https://www.ecomdeveloper.com/demo/admin/index.php");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("username")).sendKeys("demoadmin");
			driver.findElement(By.name("password")).sendKeys("demopass");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			driver.findElement(By.xpath("//*[text()=' Customers']")).click();
			driver.findElement(By.xpath("//ul[@class='collapse in']//a[text()='Customers']")).click();
			
			//Showing 1 to 20 of 900 (45 Pages) how to convert and extract the pages from one by one
			
			//String s= "Showing 1 to 20 of 900 (45 Pages)";
			
		//	s.substring(start from 0 count, start from 1 count)
			
			//s.indexOf("(")+1       =====starting
			//s.indexOf("Pages")-1   ===last one
			
		//	s.substring(s.indexOf("(")+1,s.indexOf("Pages")-1)
			
			//String s= "Showing 1 to 20 of 900 (45 Pages)";
			String text=driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
			
			int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
			
			
			//repeating pages
			for(int p=1;p<=total_pages;p++)
			{
				
				if(p>1)
				{
					WebElement active =driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
					active.click();
				}
			//reading data from the page
				
			 int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
				
			 for(int i=1;i<=rows;i++)
			 {
				String customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[2]")).getText();
				 
				String Email= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[3]")).getText();
				
				System.out.println(customername+"\t"+ Email);
  			 }
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}		
	}