package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetails 
{
	WebDriver driver;
	By product=By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span");
	By getdetails=By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div[4]/div[29]/div/ul");
	public ProductDetails(WebDriver driver)
	{
		this.driver=driver;
	}
	public void selectedthing()
	{
		driver.findElement(product).click();
	}
	public void details()
	{
		WebElement a=driver.findElement(getdetails);
		a.getText();
		System.out.println("details of the product :" +a);
	}
}
