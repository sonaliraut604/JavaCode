package Day41;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties proobj=new Properties();
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Data.properties");
		
		//loading file
		  proobj.load(file);
		
		//reading data from file
		  
		 String url= proobj.getProperty("appurl");
		 String email= proobj.getProperty("email");
		 String password= proobj.getProperty("password");
		 String orderid= proobj.getProperty("orderid");
		 String customerid= proobj.getProperty("customerid");
		 
		 System.out.println(url+" "+email+" "+password+" "+orderid+" "+customerid);
			
		//reading all the keys from properties
		 
		Set<Object> keys= proobj.keySet();
		System.out.println(keys);
		
		//reding value from file
		
		Collection<Object> value=proobj.values();
		System.out.println(value);
				
			
		
		
		
	}

}
