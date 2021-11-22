package com.mindtree.testObject;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.mindtree.pageObject.Gifts;
import com.mindtree.reusableComponents.Base;

public class GiftsTest extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeClass
	public void start() throws Exception
	{
		driver=initializer();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void giftproduct() throws Exception
	{
		Gifts g=new Gifts(driver);
		log.info("giftproduct test");
		
		
		g.personalgift().click();
		g.product().click();
		Thread.sleep(500);
		log.info("details for customization");
		g.name().sendKeys("such");
		g.addtocart().click();
		
		
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}

}
