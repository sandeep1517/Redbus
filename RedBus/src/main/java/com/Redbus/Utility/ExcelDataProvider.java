package com.Redbus.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	
	 public ExcelDataProvider() throws Exception
		
	{
	
		 //hi
		File srs=new File("./Testdata/Data.xlsx");
		
		FileInputStream fis =new FileInputStream(srs);
		
		wb=new XSSFWorkbook(fis);
		
	}
	 
	 public String getStringdata(String sheetname,int row,int colum)
	 {
		String data= wb.getSheet(sheetname).getRow(row).getCell(colum).getStringCellValue();
	    return data;
	 }
	 
	 public double getnumericdata(String sheetname,int row,int colum)
	 {
		 double data= wb.getSheet(sheetname).getRow(row).getCell(colum).getNumericCellValue();
         return data;
	 }
}
