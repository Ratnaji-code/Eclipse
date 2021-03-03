package stepDefination;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
public class LoginSteps {
	WebDriver driver;
    @Given("^User enter URL and navigarted to website$")
    public void user_enter_url_and_navigarted_to_website() throws Throwable {
       // throw new PendingException();
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER PC\\Downloads\\chromedriver.exe");
    	 driver=new ChromeDriver();
    	driver.get("http://automationpractice.com/index.php");
    	driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @When("^user should click on Login link$")
    public void user_should_click_on_login_link() throws Throwable {
        //throw new PendingException();
    	driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
    }

    @Then("^user should enter \"([^\"]*)\" & \"([^\"]*)\"$")
    public void user_should_enter_something_something(String strArg1, String strArg2) throws Throwable {
        //throw new PendingException();
    	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(strArg1);
    	driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(strArg2);

    }
    @And("^click on Submit button$")
    public void click_on_submit_button() throws Throwable {
       // throw new PendingException();
    	//*[@id="SubmitLogin"]/span
    	driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();

    }

    @Then("^click on logout button$")
    public void click_on_logout_button() throws Throwable {
       // throw new PendingException();
    	//*[@id="header"]/div[2]/div/div/nav/div[2]/a
    	driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();

    }

   
}
