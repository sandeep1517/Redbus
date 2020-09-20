 package com.Redbus.Pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.Redbus.Utility.BrowersFactory;
import com.Redbus.Utility.CaptureScreenshot;
import com.Redbus.Utility.ExcelDataProvider;
import com.Redbus.Utility.HelperScreenShot;
import com.Redbus.Utility.confiqFile;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass
{
	public WebDriver driver;
	public ExcelDataProvider excel;
	public confiqFile config;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void setuplogin() throws Exception
	{
		  excel=new ExcelDataProvider();
		  config=new confiqFile();
		  ExtentHtmlReporter extent=new ExtentHtmlReporter(new File("./Reports/gmail.html"));
		  report=new ExtentReports();
		  report.attachReporter(extent);
		  
	}

	@BeforeClass
     public void setup()
     {

 	  driver=BrowersFactory.startApplication(driver,config.getBrowers(),config.getappUrl());	    
     }
    @AfterClass
	public void closeWeb() throws Exception
	{
    	Thread.sleep(2000);
		BrowersFactory.closeApplication(driver);
		System.out.println("brower close===");
	}
    
    @AfterMethod
    public void Screenshot(ITestResult result) throws Exception
    {
    	if(result.getStatus()==ITestResult.SUCCESS)
    	{
    		logger.pass("To PassTestCase",MediaEntityBuilder.createScreenCaptureFromPath(HelperScreenShot.captureScreenShot(driver)).build());
    	} 
    	else if(result.getStatus()==ITestResult.FAILURE)
    	{
    		logger.fail("To FailTestCase",MediaEntityBuilder.createScreenCaptureFromPath(HelperScreenShot.captureScreenShot(driver)).build());
    	}
    	report.flush();
    }
    
	

}
