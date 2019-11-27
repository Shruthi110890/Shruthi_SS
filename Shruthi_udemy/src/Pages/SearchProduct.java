package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProduct extends LoginFlipKart
{

	SearchProduct(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	driver.findElement(By.xpath("//div/input[@title='Search for products, brands and more']")).sendKeys(itemToSearch);
	driver.findElement(By.xpath("//div/button[@type='submit']")).click();

}
