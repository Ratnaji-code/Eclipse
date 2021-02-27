import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearhFunctions {

	WebDriver driver;
	private WebDriverWait wait;
public void launch() {
		
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		//driver.findElement("//*[@id='searchbox']/button");
	}
	
	public void search() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("Printed Summer Dress");

		Thread.sleep(30);
		System.out.println("*****Select the value from the list***************");
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='index']/div[2]"));
		System.out.println("*****Search Box list of values***************");

		Thread.sleep(30);
		System.out.println("Elements in the list:"+list.size());
		Thread.sleep(30);
		for(WebElement ele:list) {
			System.out.println("Elements in the list:"+ele.getText());
			if(ele.getText().equalsIgnoreCase("Summer Dress > Printed Summer Dress ")) {
				ele.click();
				
				break;
				
			}
		}
		
		
//		Thread.sleep(30);
//		driver.findElement(By.xpath("//*[@id='search_query_top']")).click();
//		Thread.sleep(30);
		
	}
	
//	public void selectProduct() {
//		
//		WebElement selectDress=driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", selectDress);
//		js.executeAsyncScript("arguments[0].click();", selectDress);
//	}
//	
//	public void add2Cart() {
//		driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
//		
//		// Switching to Alert 
//		Alert al= driver.switchTo().alert();
//		
//		String alertMessage=driver.switchTo().alert().getText();
//		
//		System.out.println("Product added to cart:"+alertMessage);
		
//        al.accept();	
		
//	}
}
