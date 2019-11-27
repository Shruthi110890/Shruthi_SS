package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFlipKart {
	WebDriver driver;
	String userName="shruthisssridhar@gmail.com";
	
	String passWord="Aditri1612*";
	String login_pop_up="//div[@class='_1XBjg- row']";
	
	LoginFlipKart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shruthi.srinivas\\eclipse-workspace\\Shruthi\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
	}
	
	void setUsername(String userName)
	{
		if(driver.findElement(By.xpath(login_pop_up)).isDisplayed())
		{
			driver.findElement(By.xpath("//div[@class='_39M2dM JB4AMj']/input[@class='_2zrpKA _1dBPDZ']")).sendKeys(userName);
			driver.findElement(By.xpath("//div/button/span[text()='Login']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//div[text()='My Account']")).isDisplayed())
			{
	System.out.println("Logged in successfully");
			}
			else
			{
				System.out.println("Unsuccessful login");
			}
		}
	}
	
	void setPassword(String passWord)
	{
		driver.findElement(By.xpath("//div[@class='_39M2dM JB4AMj']/input[@type='password']")).sendKeys(passWord);
	}
	
	void clickLogin()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//div[text()='My Account']")).isDisplayed())
		{
			System.out.println("Logged in successfully");
		}
		else
		{
			System.out.println("Unsuccessful login");
		}
	}
	
	public void loginToFlipKart(String userName,String PassWord)
	{
		setUp();
		setUsername(userName);
		setPassword(passWord);
		clickLogin();
	}

}
