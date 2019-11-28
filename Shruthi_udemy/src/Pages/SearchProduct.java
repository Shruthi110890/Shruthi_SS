package Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchProduct extends LoginFlipKart
{
	String itemToSearch="Mobile Covers for redmi note 5 pro";
	SearchProduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void searchItem()
	{
	driver.findElement(By.xpath("//div/input[@title='Search for products, brands and more']")).sendKeys(itemToSearch);
	driver.findElement(By.xpath("//div/button[@type='submit']")).click();
	}
	public void selectRating()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,1000)");
		WebElement ele= driver.findElement(By.xpath("//div[@title='Mi Redmi Note 5 Pro']//input"));
		Actions action= new Actions(driver);
		action.moveToElement(ele).click();
		action.perform();
		
		if(!driver.findElement(By.xpath("//div[@title='Mi Redmi Note 5 Pro']//input")).isSelected())
		{
		driver.findElement(By.xpath("//div[@title='Mi Redmi Note 5 Pro']//input")).click();
		}
		else
		{
		System.out.println("rating already selected!");
		}
		
	}
	
	public String selectProduct()
	{
		WebElement product=driver.findElement(By.linkText("Flipkart SmartBuy Back Cover for Mi Redmi Note 5 Pro"));
		WebElement rating=driver.findElement(By.xpath("//div/span/div[text()='4.4']"));
		if(product.isDisplayed())
		{
			if(rating.isDisplayed())
			{
				product.click();
				return driver.getCurrentUrl();
			}
		}
		
		return null;
			
	}
	
	public void addToCart(String pinCode)
	{
		String mainWindow=driver.getWindowHandle();
	Set allwindows=driver.getWindowHandles();
	Iterator <String>i=allwindows.iterator();
		
		while(i.hasNext())
		{
			String i1=  i.next();
			if(!mainWindow.equalsIgnoreCase(i1))
			{
			driver.switchTo().window(i1);
			driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys(pinCode);
			driver.findElement(By.xpath("//div[@class='_1k1QCg _3QNwd7']/ul/li/button")).click();
			
			}
		}
		
		
	}

}
