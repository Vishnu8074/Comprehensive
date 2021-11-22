package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.GiftsUI;

public class Gifts extends GiftsUI {
	public static WebDriver driver;
	public Gifts(WebDriver driver)
	{
		this.driver=driver;
	}
	/**public WebElement giftbtn()
	{
		return driver.findElement(gift);
	}**/
	public WebElement personalgift()
	{
		return driver.findElement(personalized);
	}
	public WebElement product()
	{
		return driver.findElement(lamp);
	}
	public WebElement name()
	{
		return driver.findElement(name);
	}
	public WebElement addtocart()
	{
		return driver.findElement(cart);
	}

}
