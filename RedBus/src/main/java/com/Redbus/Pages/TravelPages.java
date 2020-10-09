package com.Redbus.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TravelPages 
{
    WebDriver driver;
	public TravelPages(WebDriver ldriver)
	{
		
		this.driver=ldriver;
		
	}

	@FindBy(id="identifierId")  WebElement emailTab;
	@FindBy(className="VfPpkd-RLmnJb")  WebElement click1Tab;
	@FindBy(name="password")WebElement passtab;
	@FindBy(className="VfPpkd-RLmnJb")WebElement click2Tab;
	@FindBy(xpath="//div[@class='T-I T-I-KE L3']") WebElement ComposeTab;
	@FindBy(xpath="//textarea[@id=':rc']")WebElement tabSendMail; //textarea[@id=':rc']
	@FindBy(xpath="//div[@id=':v7']")WebElement textSendMail; 
	
	@FindBy(xpath="//input[@placeholder='Search mail']") WebElement serchtab;
    @FindBy(xpath="//img[@class='gb_Ia gbii']") WebElement logtab;
    @FindBy(id="gb_71")WebElement logOut;
	
	public void test1(String email,String pass) throws Exception
	{
		emailTab.sendKeys(email);
		click1Tab.click();
		Thread.sleep(2000);
		passtab.sendKeys(pass);
	    click2Tab.click();
	}
	public void test2()
	{
	 
	   serchtab.sendKeys("hi");;
	   logtab.click();
	   logOut.click();	
	   Alert alt= driver.switchTo().alert();
	   alt.accept();
	}
	
	public void test3() throws Exception
	{
		
	  ComposeTab.click();
	  Thread.sleep(2000);
	  tabSendMail.sendKeys("sandeep.mahadik1717@gmail.com"); 
	  textSendMail.sendKeys("sansasn");
	  
	}
	
}
