package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSScelector {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag#id -not compulsory to mentioned tag name
		
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		//tag.classname
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
		
		//tag [attribute name='value']
		
//	    driver.findElement(By.cssSelector("button[type='submit']")).click(); 
	    
//	    driver.findElement(By.cssSelector("input[class='search-box-text']")).sendKeys("mac");
		
	    
	    //tag.class attribute   tag.classname[attribute='value']
	    
		driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).sendKeys("t-shirt");
	    
	    
	    
		
	}

}
