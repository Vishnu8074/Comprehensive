package com.mindtree.testObject;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.pageObject.GiftIdeas;
import com.mindtree.reusableComponents.Base;

public class GiftIdeasTest extends Base {
	
	@BeforeClass
	public void start() throws Exception
	{
		driver=initializer();
		driver.get(prop.getProperty("url"));
		
		
	}
	
	@Test
	public void giftideatest()
	{
		GiftIdeas g=new GiftIdeas(driver);
		g.giftida().click();
		Select s=new Select(g.ddown());
		s.selectByValue("best-selling");
		System.out.println(g.prodname().getText());
		//log.info(g.prodname().getText());
		System.out.println(g.prodprice().getText());
		//log.info(g.prodprice().getText());
		
		
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
		driver=null;
	}

}
