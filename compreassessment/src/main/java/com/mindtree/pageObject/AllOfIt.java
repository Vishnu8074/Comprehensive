package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.AllOfItUI;

public class AllOfIt extends AllOfItUI {
	public static WebDriver driver;
	public AllOfIt(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement allof()
	{
		return driver.findElement(allofit);
	}
	public WebElement dropdown()
	{
		return driver.findElement(dropdown);
	}
	public WebElement prodname()
	{
		return driver.findElement(prodname);
	}
	public WebElement prodprice()
	{
		return driver.findElement(prodprice);
	}

}
