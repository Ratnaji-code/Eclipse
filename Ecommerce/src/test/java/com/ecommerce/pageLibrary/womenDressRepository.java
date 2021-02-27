package com.ecommerce.pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class womenDressRepository {
	
	public static WebDriver driver;
	public static Actions a;
	public static JavascriptExecutor js;
	
	@Test
    public void launch() {
		
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		//driver.findElements("//*[@id='searchbox']/button");
	}
		@Test
	public void selectWomenDress() {
	WebElement women=	driver.findElement(By.xpath("//*[@title='Women']"));
	
	a=new Actions(driver);
	a.moveToElement(women).build().perform();
	}
	@Test
	public void selectBlouses() {
	WebElement blouses=	driver.findElement(By.xpath("//*[@title='Blouses']"));
	a.moveToElement(blouses).click();
	a.build().perform();
	}
	@Test
	public void selectBlouseColor() {
	WebElement color=driver.findElement(By.xpath("//*[@id='color_8']"));
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", color);
	js.executeScript("arguments[0].click();", color);
	}
	@Test
//select the size
	public void selectSize() {
	WebElement size= driver.findElement(By.xpath("//*[@id='group_1']"));
	Select s=new Select(size);
	s.selectByValue("3");
	}
	
	
	public void addtoCart() {
	Boolean flag=new WebDriverWait(driver,20)
			.ignoring(StaleElementReferenceException.class)
			.until((WebDriver d)->{
				d.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
				return true;
			});

	}
	

}
