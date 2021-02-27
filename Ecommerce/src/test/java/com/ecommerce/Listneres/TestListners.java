package com.ecommerce.Listneres;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import com.google.common.io.Files;

public class TestListners implements ITestListener {
	WebDriver driver;
	String path = "E:\\Ratnaji\\Ecommerce\\screenShots";

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Error"+result.getName()+"Test has failed");
		String methodName=result.getName().toString().trim();
		ITestContext context=result.getTestContext();
		WebDriver driver =(WebDriver)context.getAttribute("driver");
		takeScreenshots(methodName,driver);
		
	}
	public void takeScreenshots(String methodName,WebDriver driver) {
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(srcFile,new File("path"+methodName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("***Placed screen shot in "+path+" ***");
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
