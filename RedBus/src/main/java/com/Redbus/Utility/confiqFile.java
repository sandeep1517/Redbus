package com.Redbus.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class confiqFile {

	Properties pro;
	
	public confiqFile() throws Exception
	{
		File src=new File("./Config/Config.properties");
		
		FileInputStream fis= new FileInputStream(src);
		
		pro=new Properties();
		
		pro.load(fis);
		
	}
	
	public String getBrowers()
	{
		String data=pro.getProperty("Browers");
	
        return data;   	
    }
	public String getappUrl()
	{
		String data=pro.getProperty("appUrl");
	
        return data;   	
    }
	
}
