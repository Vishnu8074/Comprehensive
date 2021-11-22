package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.WhatsNewUI;

public class WhatsNew extends WhatsNewUI {
	public static WebDriver driver;

	public WhatsNew(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement wbutton()
	{
	return driver.findElement(wbutton);
	}
	public WebElement gettext()
	{
		return driver.findElement(text);
	}
	public WebElement postal()
	{
		return driver.findElement(postal);
	}
	public WebElement checkbutton()
	{
		return driver.findElement(checkbutton);
	}
	public WebElement avail()
	{
		return driver.findElement(availability);
	}

}

	