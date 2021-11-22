package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.GiftIdeasUI;

public class GiftIdeas extends GiftIdeasUI {
	public static WebDriver driver;
	public GiftIdeas(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement giftida()
	{
		return driver.findElement(gid);
	}
	public WebElement ddown()
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
