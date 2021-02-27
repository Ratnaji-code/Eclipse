package com.ecommerce.pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


//import junit.framework.Assert;


public class SearchRepository  {
	
	WebDriver driver;
	//TestBase tb= new TestBase();
	@Test
	public void launch() {
		
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		//driver.findElements("//*[@id='searchbox']/button");
	}
	@Test
	public void search() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("Printed Summer Dress");
		
		driver.findElement(By.xpath("//*[@id='searchbox']/button")).click();
		
		Thread.sleep(30);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
//		 wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul/li[2]/strong")));
		 
//		WebElement target=driver.findElement(By.xpath("//div/ul/li[2]/strong"));
//		List<WebElement> list=driver.findElements(By.xpath("//*[@id='index']/div[2]"));
//		
//		for(WebElement ele:list) {
//			System.out.println("Elements in the list:"+ele.getText());
//			if(ele.getText().equalsIgnoreCase("Summer Dress > Printed Summer Dress ")) {
//				ele.click();
//				
//				break;
//				
//			}
		}
		
	@Test
	@SuppressWarnings("deprecation")
	public void selectProduct() throws InterruptedException {
		//System.out.println("***************Select A Product Method from repository***********");

//		WebElement selectDress=driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", selectDress);
//		js.executeAsyncScript("arguments[0].click();", selectDress);
		
		new WebDriverWait(driver, 20)
		        .ignoring(StaleElementReferenceException.class)
		        .until((WebDriver d) -> {
		            d.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")).click();
		            return true;
		        });
		

	}
	
@Test
	@SuppressWarnings("deprecation")
	public void addtoCart() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		
		WebElement ele=driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span"));		
        js.executeScript("arguments[0].scrollIntoView();", ele);
		//js.executeAsyncScript("arguments[0].click();", ele);
		
		new WebDriverWait(driver, 20)
		        .ignoring(StaleElementReferenceException.class)
		        .until((WebDriver d) -> {
		            d.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
		            return true;
		        });

		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]"));
		
//***********************************Text compare after product added to cart************************************************
//		String ExpectedResult="Product successfully added to your shopping cart";
//		WebDriverWait wait = new WebDriverWait(driver, 20);    
//		wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2"))));
//		String ActualResult=driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2/text()")).getText();
//		wait.equals(ActualResult);
//		System.out.println("***********expected and Actual Results are matched************");
		
		//System.out.println("ActualResult:"+ActualResult.getText());
//		Assert.assertEquals(ExpectedResult, ActualResult);
//		System.out.println("ActualResult:"+ActualResult.getText());
		
//*****************************************Continue shoping*************************************************************
//		new WebDriverWait(driver, 20)
//        .ignoring(StaleElementReferenceException.class)
//        .until((WebDriver d) -> {
//            d.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
//            return true;
//        });
		WebElement checkout=driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
		WebDriverWait waitcheckout= new WebDriverWait(driver,20);
		waitcheckout.ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(checkout))).click();
		//System.out.println("checkout:"+checkout.getText());
		
		
//***********************close the pop up after validating text****************************************
//		WebElement e=driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/span"));
//		WebDriverWait close= new WebDriverWait(driver,20);
//		close.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(e)));
		



	}

}
