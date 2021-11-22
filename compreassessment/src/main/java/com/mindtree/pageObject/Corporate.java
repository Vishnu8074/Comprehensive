package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.CorporateUI;

public class Corporate extends CorporateUI {
	public static WebDriver driver;
	
	public Corporate(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement corpbtn()
	{
		return driver.findElement(cbutn);
	}
	public WebElement name()
	{
		return driver.findElement(name);
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement pnumber()
	{
		return driver.findElement(enquiry);
	}
	public WebElement enquiry()
	{
		return driver.findElement(enquiry);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}

}
