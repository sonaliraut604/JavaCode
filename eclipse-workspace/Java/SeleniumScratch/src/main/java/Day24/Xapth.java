package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xapth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mac");
		
		//we can used * insted of tagname
//		driver.findElement(By.xpath("//*[@placeholder='Search store']")).click();
		
		//by using text we can used linked text text as text()
//		driver.findElement(By.xpath("//*[text()='Search']")).click();
	//	driver.findElement(By.xpath("//*[text()='Computers']" )).click();
		
		boolean xyz=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	     System.out.println(xyz);
	     
	     //contains text 
	     String val=driver.findElement(By.xpath("//a[text()='Build your own computer']")).getText();
	     System.out.println(val);
	     
	     //And or or method using for xpath
//	     driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search store']")).sendKeys("mobile");
	     
	     //or
//	     driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='Search']")).click();
	     
	     //contains text
	     
	     driver.findElement(By.xpath("//input[contains(@placeholder,'Search store')]")).sendKeys("mac");
	  
	     //starts with
//	     driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Search store')]")).sendKeys("mac");
	     
	     //handle the dyanmic attribute--to stop and start the buuton
	     
	     //*[@id='start' or @id='stop']
	     //*[contains(@id,'st')]
	     //*[strts-with(@id,'st')]
	     
	     //chained xpath
	    boolean abc= driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
	    System.out.println(abc);
	     
	    
	    //*[contains(.,'')];
	    //*[contains(text(),'')]   
	    
	    driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).sendKeys("mobile");
	     
	     
	    
		
	}

}
