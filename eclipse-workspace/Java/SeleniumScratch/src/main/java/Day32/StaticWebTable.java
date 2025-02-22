package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
			driver.get("https://testautomationpractice.blogspot.com/");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			
			//find total no of rows in table
			int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
			
			
			//total no of column
			int column=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
			System.out.println(column);
			
			//read data from specific row and cloumn
			String name=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]")).getText();
			System.out.println(name);
			
			//read data from all the rows and cloumn
			
			for(int r=2;r<=rows;r++)
			{
				
				for(int c=1;c<=column;c++)
				{
					String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(value+"\t");
				}
				System.out.println();
			}
			
			//book name whose author name is mukesh
			
//			for(int r=2;r<=rows;r++)
//			{
//				String Author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//				
//				if(Author.equals("Mukesh"))
//				{
//					String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//					System.out.println(book +"\t" +Author);
//				}
//			}
			
			// total price price 
			int total=0;
			for(int r=2;r<=rows;r++)
				{
					String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
					
					total=total+Integer.parseInt(price);
				}
			System.out.println(total);
			
			
	}

}
