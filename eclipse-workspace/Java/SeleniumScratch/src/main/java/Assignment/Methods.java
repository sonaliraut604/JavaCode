package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String name=driver.getTitle();
		System.out.println(name);
		
		String val=driver.getCurrentUrl();
		System.out.println(val);
		
		String abc=driver.getWindowHandle();
		System.out.println(abc);
		
		WebElement display=driver.findElement(By.xpath("//a[text()='GUI Elements']"));
		System.out.println("logo is displayes "+ display.isDisplayed());
		
		WebElement enable=driver.findElement(By.id("name"));
		
		System.out.println(enable.isEnabled());
		
		//selected
		
		WebElement select=driver.findElement(By.xpath("//input[@id='monday']"));
		System.out.println("check box is selected: "+ select.isSelected());
		
//		String page1=driver.getPageSource();
//		System.out.println(page1);
	}

}
