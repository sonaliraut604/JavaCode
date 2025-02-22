package Day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticatepopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(1000);
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		
	}

}
