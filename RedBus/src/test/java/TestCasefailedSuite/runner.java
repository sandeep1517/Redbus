package TestCasefailedSuite;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class runner {

	@Test
	public void FailedTest() 
	{
	
		TestNG runner=new TestNG();
		
		List<String> list=new ArrayList<String>();
		
		list.add("C:\\Users\\dude\\git\\GmailFreamWork\\RedBus\\test-output\\testng-failed.xml");
		
		runner.setTestSuites(list);
		
		runner.run();
		
        System.out.println("Failed Test Suite Runner.......");
		
	}

}



















