package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.CreateAccountUI;

public class CreateAccount extends CreateAccountUI {
	public static WebDriver driver;
	public CreateAccount(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	public WebElement createacc()
	{
		return driver.findElement(caccnt);
	}
	public WebElement fname()
	{
		return driver.findElement(fname);
	}
	public WebElement lname()
	{
		return driver.findElement(lname);
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement createbtn()
	{
		return driver.findElement(creat);
	}

}
