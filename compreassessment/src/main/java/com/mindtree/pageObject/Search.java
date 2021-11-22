package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.SearchUI;

public class Search extends SearchUI {
	public static WebDriver driver;
	public Search(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement searchbtn()
	{
		return driver.findElement(searchbutton);
	}
	public WebElement ringproduct()
	{
		return driver.findElement(ringproduct);
	}
	public WebElement cart()
	{
		return driver.findElement(cart);
	}
	public WebElement wishlist()
	{
		return driver.findElement(wishlist);
	}
	/**public WebElement checkout()
	{
		return driver.findElement(checkout);
	}**/

}
