

package com.mindtree.testObject;

import org.testng.annotations.Test;


import org.testng.annotations.Test;

import com.mindtree.pageObject.SignIn;
import com.mindtree.reusableComponents.Base;




import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class SignInTest extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	
	 @BeforeClass
	  public void beforeTest() throws Exception {
		  driver=initializer();
		  driver.get(prop.getProperty("url"));
		 
	  }
  @Test
  public void signin() throws Exception {
	  SignIn s=new SignIn(driver);
	  s.signin().click();
	  
	  log.info("details of signin");
	  HashMap<String, String> data = s.getTestData();
	  for (Entry<String, String> entry : data.entrySet()) {
			s.giveemail().sendKeys(entry.getKey());

			s.givepassword().sendKeys(entry.getValue());

		}
	  
	 
	  
	  
	  s.signup().click();
	  log.info("sigintest successfull");
	  
  }
 

  @AfterClass
  public void afterTest() {
	  driver.close();
  }
}
 

