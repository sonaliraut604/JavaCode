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

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		//broken link is link which doesn't having resource in server which is return status code >400
		
	    //if status is greater than >400 then it is broken link
	    //if status is less than <400 then it is having resource in server =not broken link
	    //link --server--status code
		
  //condition href="hrrps://xyz.com is having in links
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("size of the element" + links.size());
	
	 int Noofbrokenlink=0;
     for(WebElement linkelement:links)
     {
    	 String hrefvalue=linkelement.getAttribute("href");
    	 
    	 if(hrefvalue==null || hrefvalue.isEmpty())
    	 {
    		 System.out.println("print links not possible to check");
    		 continue;
    	 }
    	 //hit the url
    	 try
    	 {
    	 URL linkurl=new URL(hrefvalue); //converted href value from to url format
    	 HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection(); //open connection to the server
    	 conn.connect();
    	 
    	if(conn.getResponseCode()>=400)
    	{
    		System.out.println(hrefvalue+"=============Broken link");
    		Noofbrokenlink++;
    	}
    	else
    	{
    		System.out.println(hrefvalue +"===========Not a Broken link");
    	}
     }
    	 catch(Exception e)
    	 {
    		 
    	 }
  	 System.out.println("Number of broken link "+Noofbrokenlink);
   	 
    	 
    	 
    	 
     
     }
	}
}

