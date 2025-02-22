package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	
	static void selectFutureDate(WebDriver driver,String month,String year,String date)
	
	{
	while(true)
	{
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//month
		
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(currentmonth.equals(month) && currentyear.equals(year))
		{
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	}
	
			List<WebElement> currentdate=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr//td//a"));
			
			for(WebElement dt:currentdate)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
				}
			}
	 }
	
	
  static void selectPastDate(WebDriver driver,String month,String year,String date)
	
	{
	while(true)
	{
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//month
		
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(currentmonth.equals(month) && currentyear.equals(year))
		{
			break;
		}
//		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	}
	
			List<WebElement> currentdate=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr//td//a"));
			
			for(WebElement dt:currentdate)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
				}
			}
	 }
	
	
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		    driver.get("https://jqueryui.com/datepicker/");
			driver.manage().window().maximize();
			
			//switch to frame
			driver.switchTo().frame(0);
			
			// method 1: using sendkeys
//			driver.findElement(By.xpath("//input[@class='hasDatepicker']")).sendKeys("04/05/2024"); //mm/dd/yyyy
			
			//method 2
		   String year="2021";
		   String month="April";
		   String date="30" ;
				   
			driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
			
//			selectFutureDate(driver,month,year,date);
       		selectPastDate(driver,month,year,date);
	
		
			
	}

}
