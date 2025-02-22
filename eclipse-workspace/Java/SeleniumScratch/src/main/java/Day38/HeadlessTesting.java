package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //headles testing
		
      ChromeOptions options=new ChromeOptions();
      
      options.addArguments("--headless=new");
//      options.addArguments("--incognito");
      
       WebDriver driver=new ChromeDriver(options);
		//open url
		 driver.get("https://demo.opencart.com/");
		 
		 driver.manage().window().maximize();
		 
		 //validate the title
		 String act_title=driver.getTitle();
		 
		 if(act_title.equals("Your Store"))
		 {
			 System.out.println("test passed");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 driver.quit();
		
	}

}
