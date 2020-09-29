package com.Redbus.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Redbus.Pages.BaseClass;
import com.Redbus.Pages.TravelPages;
import com.Redbus.Utility.BrowersFactory;
import com.Redbus.Utility.ExcelDataProvider;
import com.Redbus.Utility.HelperScreenShot;
import com.aventstack.extentreports.MediaEntityModelProvider;

public class LoginTestRedbus extends BaseClass
{
	
	TravelPages tra;
	
    @Test(priority=1)
	public void loginpage() throws Exception //firefox
	{
	    logger=report.createTest("Log To Gmail-");
	    tra=PageFactory.initElements(driver, TravelPages.class);	 
	    logger.info("Strating Gmail.com");
	    tra.test1(excel.getStringdata("Login",0,0),excel.getStringdata("Login",0,1));
	    logger.pass("login Success");
	}
    @Test(priority=2)
     public void login2()
    {
    	
   	 logger=report.createTest("Send Mail Process");
     logger.info("Created SendmailBox");	 
     tra.test3();
     logger.pass("Send Mail Successful");
     	 
     }
    
    
    @Test(priority=3)
	public void loginpage2() throws Exception //firefox
	{
	    logger=report.createTest("Log To Gmail_In_P");
	    tra.test2();
	    logger.info("Process to Gmail Dashboord");
	    logger.pass("logOut Success");
	}
    

  

    
}  
    
	
