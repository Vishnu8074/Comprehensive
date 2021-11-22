package com.mindtree.testObject;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.pageObject.CreateAccount;
import com.mindtree.reusableComponents.Base;

public class CreateAccountTest extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeClass
	public void start() throws Exception
	{
		driver=initializer();
		driver.get(prop.getProperty("url"));
	
	}
	
	@Test(dataProvider="inputdata")
	public void accounttest(String fname,String lname,String email,String passw)
	{
		CreateAccount c=new CreateAccount(driver);
		c.signin().click();
		c.createacc().click();
		log.info("enter the details to create account");
		c.fname().sendKeys(fname);
		c.lname().sendKeys(lname);
		c.email().sendKeys(email);
		c.password().sendKeys(passw);
		c.createbtn().click();
		log.info("account cretaed with details",  fname, lname, email, passw);
	}
	
	@DataProvider(name="inputdata")
	public Object[][] datafunc(){
		Object[][] ob=new Object[1][4];
		ob[0][0]="vishnu";
		ob[0][1]="vardhan";
		ob[0][2]="vishnu@gmail.com";
		ob[0][3]="1234567892";
		return ob;
				
		
		}
	/** 
	  @DataProvider
		public Object[][] getdata()
		{
			Object[][] ob=new Object[3][2];
			ob[0][0]="1111@gmail.com";
			ob[0][1]="111111111user";
			ob[1][0]="2222@gmail.com";
			ob[1][1]="2222222user";
			ob[2][0]="3333@gmail.com";
			ob[2][1]="333333user";
			return ob;

	}
	**/
	
	@AfterClass
	public void close()
	{
		driver.close();
		driver=null;
	}

}
