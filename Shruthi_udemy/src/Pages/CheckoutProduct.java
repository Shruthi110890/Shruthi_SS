package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutProduct extends LoginFlipKart
{
	
	CheckoutProduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void addQuantity(String Quantity)
	{
		driver.findElement(By.xpath("//input[@class='_2csFM9']")).click();
		driver.findElement(By.xpath("//input[@class='_2csFM9']")).clear();
		System.out.println(Quantity);
	driver.findElement(By.xpath("//input[@class='_2csFM9']")).sendKeys(Quantity);
	}
	
	public void placeOrder()
	{
		driver.findElement(By.xpath("*//span[text()='Place Order']")).click();
	}
	
	public void selectDeliveryAddress()
	{
		driver.findElement(By.xpath("*//button[text()='Deliver Here']")).click();
	}
	

}
