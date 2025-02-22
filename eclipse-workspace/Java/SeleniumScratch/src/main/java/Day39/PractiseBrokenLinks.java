package Day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseBrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       int Noofbrokrnlinks=0;
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("size of the element" + links.size());  //48
		
		for(WebElement linkelement:links)
		{	
			String hrefvalue=linkelement.getAttribute("href");
			
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				System.out.println("links are not possible to check");
				continue;
			}
		//hit the url
	  try
	  {
		URL urllinks=new URL(hrefvalue);
		
		HttpURLConnection conn=(HttpURLConnection) urllinks.openConnection();
		conn.connect();
		
		if(conn.getResponseCode()>400)
		{
			System.out.println(hrefvalue +"=====Broken links");
			Noofbrokrnlinks++;
		}
		else
		{
			System.out.println(hrefvalue +"======Not a Broken links");
		}
	}
	  catch(Exception e) 
	  {
		  
	 }
	  System.out.println("No of total brokrn links: "+Noofbrokrnlinks);
	  
	  
	  
 }
	}

}
