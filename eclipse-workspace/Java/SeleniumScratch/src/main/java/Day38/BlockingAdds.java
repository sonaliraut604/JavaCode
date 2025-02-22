package Day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockingAdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		File files=new File("C:\\Users\\SONRAUT\\Downloads\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		options.addExtensions(files);
		
	     WebDriver driver=new ChromeDriver(options);
		//open url
		 driver.get("https://text-compare.com/");
		 
		 driver.manage().window().maximize();
	}

}
