package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertificte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //secure socket layer
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		System.out.println("get the title"+ driver.getTitle());
		
		
		
		
		
	}

}
