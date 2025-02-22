package Day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShandowDOM {

	public static void main(String[] args) throws InterruptedException {
	 
	//document contains---shadow host contains--shadow root--element
	//dom-document object model or shadow root
	// xpath cannot handle shadow dom elements only throught CSS handle
		
		
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://books-pwakit.appspot.com/");
	 driver.manage().window().maximize();
	
	 
	 //This Element is inside single shadow DOM.
	 
	 SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
	 Thread.sleep(1000);
	 shadow.findElement(By.cssSelector("#input")).sendKeys("welcome");
	 
	 

	}

}
