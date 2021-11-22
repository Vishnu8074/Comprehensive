package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.QuantityUI;

public class Quantity extends QuantityUI {
	public static WebDriver driver;
	public Quantity(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement chrbutton()
	{
		return driver.findElement(cgift);
	}
	public WebElement prduct()
	{
		return driver.findElement(prduct);
	}
	public WebElement add()
	{
		return driver.findElement(plus);
	}
	public WebElement minus()
	{
		return driver.findElement(minus);
	}
	public WebElement quantity()
	{
		return driver.findElement(quantity);
	}
	

}
