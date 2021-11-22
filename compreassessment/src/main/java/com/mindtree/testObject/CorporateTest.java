package com.mindtree.testObject;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.pageObject.Corporate;
import com.mindtree.reusableComponents.Base;

public class CorporateTest extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	
	@BeforeClass
	public void initial() throws Exception
	{
		driver=initializer();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	@Test
	public void corporategifts()
	{
		Corporate c=new Corporate(driver);
		log.info("corporate gifts test");
		
		c.corpbtn().click();
		c.name().sendKeys("vihsnu");
		c.email().sendKeys("vardhan@gmail.com");
		c.pnumber().sendKeys("12345678989");
		c.enquiry().sendKeys("gift price100 dryfruit");
		c.submit().click();
		log.info("corporate gift  test completed");
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
	

}
