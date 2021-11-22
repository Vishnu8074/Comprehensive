package com.mindtree.testObject;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.mindtree.pageObject.AllOfIt;
import com.mindtree.reusableComponents.Base;

public class AllOfItTest extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeClass
	public void start() throws Exception
	{
		driver=initializer();
		driver.get(prop.getProperty("url"));
	
				
	}
	
	@Test
	public void alloftest()
	{
		AllOfIt a=new AllOfIt(driver);
		log.info("alloftest ");
		a.allof().click();
	
		WebElement drdown=a.dropdown();
		Select s=new Select(drdown);
		s.selectByValue("price-ascending");
		System.out.println(a.prodname().getText());
		AssertJUnit.assertEquals("Traditional Pocket Diary", a.prodname().getText());
		log.info(" lowest price product name correct as expected");
		System.out.println(a.prodprice().getText());
		AssertJUnit.assertEquals("Rs. 120", a.prodprice().getText());
		log.info("expected as usual");
		
		
		
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
		driver=null;
	}

	
	
}
