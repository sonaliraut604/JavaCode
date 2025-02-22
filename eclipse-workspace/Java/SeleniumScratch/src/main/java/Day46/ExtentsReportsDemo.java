package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentsReportsDemo implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;    //UI of the Report
	public ExtentReports extent;     //populate common info on the page
	public ExtentTest test;     //creatong test case in the report and update status of the test method
	
	
	 public void onStart(ITestContext context) {
	  
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//MyReports.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report for selenium"); //title of the page
		sparkReporter.config().setReportName("Regression Testing"); //name of the report
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("computer", "1111");
		extent.setSystemInfo("edge", "2222");
		extent.setSystemInfo("chrome", "3333");
		extent.setSystemInfo("mobile", "4444");
		extent.setSystemInfo("Mac", "5555");
		
	  }
	
	
	public void onTestSuccess(ITestResult result) {
		   
		test= extent.createTest(result.getName()); //create new entry in the report
		test.log(Status.PASS, "Test Case passed is:" +result.getName()); //update status
	  }
	 
	public void onTestFailure(ITestResult result) {
		 test= extent.createTest(result.getName());
		 test.log(Status.FAIL, "Test case Failed is:" +result.getName());
		 test.log(Status.FAIL, "Test case Fail is:" +result.getThrowable());
		  }
	
	public void onTestSkipped(ITestResult result) {
		   test=extent.createTest(result.getName());
		   test.log(Status.SKIP, "Test case is skipped is:"+ result.getName());
		  }
	 
	public void onFinish(ITestContext context) {
		  extent.flush();
		  }
	
}
