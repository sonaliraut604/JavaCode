package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Firsttc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//launch the monitor
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
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
		 
//		 driver.quit();
		 
	}

}
