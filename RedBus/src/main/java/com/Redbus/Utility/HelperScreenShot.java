package com.Redbus.Utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import freemarker.template.SimpleDate;

public class HelperScreenShot 
{
    static String ScreenShot="./Screenshots/gmail.com "+getdateFormat()+ ".png";
	
	public static String captureScreenShot(WebDriver driver) throws Exception
	{
		
	File fis=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(fis,new File(ScreenShot));
	return ScreenShot;
	}
	
	public static String getdateFormat()
	{
		DateFormat CustomFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date Currentdate=new Date();
		
		return CustomFormat.format(Currentdate);
	}
	
}
