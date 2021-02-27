package com.ecommerce.pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CreateAnAccountLibrary {
	
	public static WebDriver driver;
public void launch() {
		
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		//driver.findElements("//*[@id='searchbox']/button");
	}
	public void Login() {
		driver.findElement(By.linkText("Sign in")).click();

	}
	
	public void yourPersonlInformation(String firstName,String lastName,String email,String password,String Days,String Months,String Years) {
		driver.findElement(By.xpath("//div[@id='uniform-id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='days']")).sendKeys(Days);
		driver.findElement(By.xpath("//input[@id='months']")).sendKeys(Months);
		driver.findElement(By.xpath("//input[@id='years']")).sendKeys(Years);
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		
	}
	public void yourAddress(String FirstName,String LastName,String Company,String Address1,String Address2,
			String City,String State,String Postcode,String Country,String Other,String Phone,String Mobile,String Alias) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys(Company);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(Address1);
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(Address2);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(City);
		driver.findElement(By.xpath("//input[@name='id_state']")).sendKeys(State);
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys(Postcode);
		driver.findElement(By.xpath("//input[@name='id_country']")).sendKeys(Country);
		driver.findElement(By.xpath("//input[@name='other']")).sendKeys(Other);;
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Phone);;
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys(Mobile);;
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys(Alias);
		driver.findElement(By.xpath("//*[@id='submitAccount']/span")).click();

	}
	public void Authentication(CharSequence[] emailAddress) {
		String	ActualText=driver.findElement(By.name("CREATE AN ACCOUNT")).getText();
		String ExpectedText="CREATE AN ACCOUNT";
		Assert.assertEquals(ExpectedText,ActualText);
		driver.findElement(By.id("email_create")).sendKeys(emailAddress);
		driver.findElement(By.xpath("//*[@id='SubmitCreate']/span")).click();

		
		
	}
}
