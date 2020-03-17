package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Search 
{
	WebDriver driver;
	By search=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	public Search(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void movement(String value)
	{
		driver.findElement(search).sendKeys(value);
		Actions d=new Actions(driver);
		d.sendKeys(Keys.DOWN).build().perform();
		d.sendKeys(Keys.DOWN).build().perform();
		d.sendKeys(Keys.DOWN).build().perform();
		d.sendKeys(Keys.ENTER).build().perform();
	}
}
