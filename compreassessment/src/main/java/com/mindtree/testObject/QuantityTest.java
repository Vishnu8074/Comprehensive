package com.mindtree.testObject;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.mindtree.pageObject.Quantity;
import com.mindtree.reusableComponents.Base;



public class QuantityTest extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeClass
	public void start() throws Exception
	{
		driver=initializer();
		driver.get(prop.getProperty("url"));
		
		
	}
	
	@Test
	public void quantitytest()
	{
		Quantity qu=new Quantity(driver);
		qu.chrbutton().click();
		qu.prduct().click();
		for(int i=1;i<10;i++)
		{
		qu.add().click();
		}
		log.info("+ clicked 10 times");
		for(int i=1;i<6;i++)
		{
			qu.minus().click();
			
		}
		log.info("- button clicked 5 times");
		String cnt=qu.quantity().getAttribute("value");
		AssertJUnit.assertEquals(cnt, "5");
		log.info("quantity expected is 5 times");
		System.out.println(cnt);
		
	}
	@AfterClass
	public void close()
	{
		driver.close();
		driver=null;
	}

}
