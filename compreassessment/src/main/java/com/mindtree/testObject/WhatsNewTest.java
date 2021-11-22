package com.mindtree.testObject;

import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;



import com.mindtree.pageObject.WhatsNew;
import com.mindtree.reusableComponents.Base;

public class WhatsNewTest extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeClass
	public void start() throws Exception
	{
		driver=initializer();
		driver.get(prop.getProperty("url"));
		
				
	}
	
	@Test
	public void Wbutton() throws Exception
	{
		WhatsNew w=new WhatsNew(driver);
		log.info("test for checking the cod is available");
	
		w.wbutton().click();
		Thread.sleep(500);
		w.gettext().click();
		w.postal().sendKeys("518543");
		log.info("pincode to check to avilability of cod");
		Thread.sleep(500);
		w.checkbutton().click();
		Thread.sleep(5000);
		String cd=w.avail().getText();
		System.out.println(cd);
		Assert.assertEquals(cd, "Cash on Delivery is available.");
		log.info("cash on delivery is available for this location");
		
		
	}
	@AfterClass
	public void end()
	{
		driver.close();
	}

}
