package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		
		//to freeze the screen then used a toggle disbutor
		//click on drop down
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("//span[text()='Content Specialist']")).click();
		
		//count the number of options
		List<WebElement>options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println(options.size());
		
		//all the text from options
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		
	}

}
