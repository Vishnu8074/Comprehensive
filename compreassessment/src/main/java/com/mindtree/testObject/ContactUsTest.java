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

import com.mindtree.pageObject.ContactUs;
import com.mindtree.reusableComponents.Base;

public class ContactUsTest extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeClass
	public void start() throws Exception
	{
		driver=initializer();
		driver.get(prop.getProperty("url"));
		
		
		
	}
	
	@Test
	public void contacttest() throws InterruptedException
	{
		ContactUs c=new ContactUs(driver);
		log.info("contacttest");
		c.contact().click();
		Thread.sleep(1000);
		c.name().sendKeys("vishsuch");
		c.email().sendKeys("abcdsuch@gmail.com");
		c.message().sendKeys("using this website for automation testing");
		Thread.sleep(2000);
		c.send().click();
		log.info("contact test worked as expected");
	}
	@AfterClass
	public void close()
	{
		driver.close();
		driver=null;
	}

}
