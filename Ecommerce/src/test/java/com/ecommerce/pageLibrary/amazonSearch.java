package com.ecommerce.pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonSearch {
	
    public static WebDriver driver;
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("Printed Summer Dress");
//		driver.findElement(By.xpath("//*[@id='searchbox']/button")).click();
//		
//      JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement selectDress=driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"));
//		js.executeScript("arguments[0].scrollIntoView();", selectDress);
//		js.executeAsyncScript("arguments[0].click();", selectDress);
//		System.out.println("Dress is Selected  :"+selectDress);
		
		
//		Boolean wait=new WebDriverWait(driver, 20)
//        .ignoring(StaleElementReferenceException.class)
//        .until((WebDriver d) -> {
//            d.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")).click();
//            return true;
//        });
//		
//		System.out.println("Dress is Selected  :"+wait);

		WebElement women=	driver.findElement(By.xpath("//*[@title='Women']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(women).build().perform();
		WebElement blouses=	driver.findElement(By.xpath("//*[@title='Blouses']"));
		a.moveToElement(blouses).click();
		//a.click();
		a.build().perform();
		WebElement color=driver.findElement(By.xpath("//*[@id='color_8']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", color);
		js.executeScript("arguments[0].click();", color);
		
		
	}
}
