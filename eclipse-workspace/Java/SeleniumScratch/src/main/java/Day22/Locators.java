package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	
		
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://demo.opencart.com/");
		 
		 driver.manage().window().maximize();
		 
		 
		 //name
		 driver.findElement(By.name("search")).sendKeys("Mac");
		 
		 //id
		 Boolean val=driver.findElement(By.id("logo")).isDisplayed();
		 System.out.println(val);
		 
		 //linktext & partiallinktext --it is used to whole word from page1
		 
		 driver.findElement(By.linkText("Tablets")).click();
		 
		 //partiallink text--it used for take partial text from file
		 
//		 driver.findElement(By.partialLinkText("Compo")).click();
		 
		 
		 //tagname
		 
		 List<WebElement> links=driver.findElements(By.className("list-inline-item"));
		 System.out.println(links.size());
		 
		 List<WebElement> tag=driver.findElements(By.tagName("a"));
		 System.out.println(tag.size());
		 
	}

}
