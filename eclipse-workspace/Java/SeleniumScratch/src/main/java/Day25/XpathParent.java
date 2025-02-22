package Day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//child xpath
		 driver.findElement(By.xpath("//div[@id='search']/child::button")).sendKeys("mac");
		 
		 //parent xpath
		  driver.findElement(By.xpath("//button[@class='btn btn-lg btn-inverse btn-block dropdown-toggle']/parent::div")).click();
		  
		 //ancestor
		  
		 boolean img= driver.findElement(By.xpath("//img[@title='Your Store']/ancestor::div[1]")).isDisplayed();
		 System.out.println(img);
		 
		 //descendant
		boolean val= driver.findElement(By.xpath("//*[@class='col-12 text-center']/descendant::img[1]")).isDisplayed();
		System.out.println(val);
		
		//following-sibbling
		
		boolean abc=driver.findElement(By.xpath("//input[@name='search']/following-sibling::button")).isDisplayed();
		
		System.out.println(abc);
		
		//preceding sibling
		
		driver.findElement(By.xpath("//button[@class='btn btn-light btn-lg']/preceding-sibling::input"));
		
	}

}
