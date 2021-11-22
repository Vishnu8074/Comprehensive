package com.mindtree.reusableComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static Properties prop;
	public static WebDriver driver;
	

	public WebDriver initializer() throws Exception
	{
		prop=new Properties();
		FileInputStream fi=new FileInputStream(".\\src\\main\\resources\\data.properties");
		prop.load(fi);
		String name=prop.getProperty("browser");
		if(name.equalsIgnoreCase("google"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			 driver=new ChromeDriver(opt);
			
			
			
		}
		 else if (name.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();

			} 
		 else if (name.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+ "\\driver\\msedgedriver.exe");
				driver = new EdgeDriver();

			} 
		 else {
				System.out.println("the browser mentioned is not present");

			}

		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		return driver;
		
		
	}
}
