package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListerners implements ITestListener{
	
    //click on ctrl+on link to default class open
	//listeners== are interfaces that can listen to events in a script and modify the system behavior
	//ITestListener is interface and TestAdaptorListener is class
	//i xml file we write listener and class name 
	
	public void onStart(ITestContext context) {  //it is executed only once 
		  System.out.println("onstart .......");  
		
		  }
	 
	 public void onTestStart(ITestResult result) {              //it is exected  multiple runs @ test after
		 System.out.println("onstart test is started ......."); 
		 
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("test passed.......");  
		 
		  }
	  
	 public void onTestFailure(ITestResult result) {
		 System.out.println("test failed .......");  
		 
			  }
	 
	 public void onTestSkipped(ITestResult result) {
		    
		 System.out.println("test skipped ......."); 
		  }
	  
	 public void onFinish(ITestContext context) {
		 System.out.println("execution is completed .......");  
		 
		  }
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
