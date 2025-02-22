package Day47;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsingPageFactory {

	WebDriver driver;
	
	UsingPageFactory(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
    WebElement txt_passwoprd;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	 WebElement  txt_login;
	
	@FindBy(tagName="a")
	List<WebElement>links;
	
	public void setuser(String user)
    {
		txt_username.sendKeys(user);
    }
    
    
    public void setpass(String pass)
    {
    	
    	txt_passwoprd.sendKeys(pass);
    }
    
    
    public void setlog()
    {
    	txt_login.click();
    }
    
}
