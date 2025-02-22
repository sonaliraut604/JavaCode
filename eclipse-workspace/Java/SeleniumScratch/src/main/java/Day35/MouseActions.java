package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
	
	// mouse over ,right click ,double click ,drag and drop
    //Actions - it is predefined class in selenium
		
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://testautomationpractice.blogspot.com/");
	 driver.manage().window().maximize();
	 
	WebElement mouse= driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
	WebElement mac=driver.findElement(By.xpath("//a[contains(.,'Mobiles')]"));
	
    Actions act=new Actions(driver);
    
    //mouse over actions
    Thread.sleep(5000);
    act.moveToElement(mouse).moveToElement(mac).click().build().perform();
    
    //build=create an actions
    //perform =complete an action
    
    //mouse over === moveToElement(element)
    //right click ===contextclick(element)
    //double click ==doubleclick(element)
    //dragand drop==draganddrop(elememt)
    
    //Actions-class,Actions is predefinred class provided in selenium will be used to perform mouse actions
    //Action -interface, it is used to store created actions
    
    //interface=webelement,action,option,alert,takescreenshot,javascriptexecutor
    
    //gettext()= returns the inner txt of the web element
    //getAttribute()=returns value of the attribute
    
    //keyboard actions
    
    //act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
    
    //tab -shift to 2 box
	 //act.keyDown(Keys.TAB).keyUp(Keys.TAB);
    
    //ctrl+shift+a
  //  act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
    
  
	
	 
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
