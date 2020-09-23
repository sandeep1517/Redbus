package com.Redbus.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowersFactory
{
    
	public static WebDriver startApplication(WebDriver driver,String BrowersName,String appUrl)
	{
		
		if(BrowersName.equalsIgnoreCase("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
			 driver=new FirefoxDriver();	
		}
		else if(BrowersName.equalsIgnoreCase("IE"))
		{
			 System.setProperty("webdriver.gecko.driver",".//Drivers//IEDriverServer.exe");
		     driver=new InternetExplorerDriver();
		}
		else if(BrowersName.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		     driver=new ChromeDriver();
			
		}
		else
		{
			System.out.println("We do Not Support Driver==>>");
		}

       // driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	} 
	
   

	public static void closeApplication(WebDriver driver)
	{

	driver.quit();
		
	}

	
}
