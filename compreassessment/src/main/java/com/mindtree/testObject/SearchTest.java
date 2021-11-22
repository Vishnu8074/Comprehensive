package com.mindtree.testObject;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.pageObject.Search;
import com.mindtree.reusableComponents.Base;

public class SearchTest extends Base {
	@BeforeClass
	public void initial() throws Exception
	{
		driver=initializer();
		driver.get(prop.getProperty("url"));
	
	}
	@Test
	public void searchtest() throws InterruptedException
	{
		
		Search s=new Search(driver);
		s.search().sendKeys("Ring");
		s.searchbtn().click();
		Thread.sleep(5000);
		s.ringproduct().click();
		
		//new WebDriverWait(driver,4000).until(ExpectedConditions.elementToBeClickable(s.ringproduct())).click();
		
		s.cart().click();
		s.wishlist().click();
		
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}

}
