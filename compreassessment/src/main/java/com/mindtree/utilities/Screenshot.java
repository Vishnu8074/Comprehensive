package com.mindtree.utilities;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.mindtree.reusableComponents.Base;


public class Screenshot extends Base {
	public void screencapture(String result) throws Exception
	{
		File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\selenium\\selenium_programs\\compreassessment\\screenshot\\"+result+System.currentTimeMillis()+".png");
		
		FileHandler.copy(sourcefile, dest);
		//File dest=new File("E:\\testdata\\"+System.currentTimeMillis()+".png");
	}
// File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
}
