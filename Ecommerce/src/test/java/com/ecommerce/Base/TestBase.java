package com.ecommerce.Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class TestBase {

	public static WebDriver driver;
	public static Actions a;
	public static JavascriptExecutor js;
	@BeforeClass
	public void browserInitialization() {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
	}
	
	
	

}
