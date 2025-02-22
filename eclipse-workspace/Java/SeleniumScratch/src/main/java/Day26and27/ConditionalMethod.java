package Day26and27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//conditional method
		
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Felectronics");
	 driver.manage().window().maximize();
	 
	 //isdisplayed
	  WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	  System.out.println("display status:"+logo.isDisplayed());
	  
	 //isEnabled
	  
	 boolean status=driver.findElement(By.id("FirstName")).isEnabled();
	 System.out.println(status);
	 
	 //isselected
	  WebElement select=driver.findElement(By.id("gender-male"));
	  System.out.println(select.isSelected());
	 
	 driver.findElement(By.id("gender-male")).click();
	 
	 WebElement select1=driver.findElement(By.id("gender-male"));
	 System.out.println("after selecting:" +select1.isSelected());
	 
	 
	 WebElement abc=driver.findElement(By.xpath("//input[@name='Newsletter']"));
	 System.out.println(abc.isSelected());
	 
	 
	}

}
