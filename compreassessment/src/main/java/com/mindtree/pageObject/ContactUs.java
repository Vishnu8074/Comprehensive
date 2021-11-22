package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.ContactUsUI;

public class ContactUs extends ContactUsUI {
	public static WebDriver driver;
	public ContactUs(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement contact()
	{
		return driver.findElement(contact);
	}
	public WebElement name()
	{
		return driver.findElement(name);
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement message()
	{
		return driver.findElement(message);
	}
	public WebElement send()
	{
		return driver.findElement(send);
	}

}
