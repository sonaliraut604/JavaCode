package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMDemo {

	//POM id design pattern not a framework
	//dublication ofelements locators
	//for overcome that issue we create page object class for different senariaos
	//page object class contains web elemnt and actions
	//1=identify the pages--2-we will create page object classes for each pages-3--create test case
   //it is using withoit pagefactory and page factory
	
	//constructor
	
	WebDriver driver;
	POMDemo(WebDriver driver)
	{
		this.driver=driver;		
	}
	
	//Locators
	

	By txt_username=By.xpath("//input[@placeholder='Username']");
	By txt_passwoprd=By.xpath("//button[normalize-space()='Login']");
    By txt_login=By.xpath("//input[@placeholder='Password']");
	
    
   //Actions
    
    public void setuser(String user)
    {
    	driver.findElement(txt_username).sendKeys(user);
    }
    
    
    public void setpass(String pass)
    {
    	
    	driver.findElement(txt_passwoprd).sendKeys(pass);
    }
    
    
    public void setlog()
    {
    	driver.findElement(txt_login).click();
    }
    
    
    
    
    
    
    
    
    
    
    
	
}
