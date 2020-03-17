package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	 WebDriver driver;
	 	By hellosignin=By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a[2]/span[2]");
	  By email=By.id("ap_email");
	  By continues=By.xpath("//*[@id=\"continue\"]");
	  By password=By.id("ap_password");
	  By login=By.id("//*[@id=\"signInSubmit\"]");
	  	public Login(WebDriver driver)
	  	{
	  		this.driver=driver;
	  	}
	  	
	  	public void signin()
	  	{
	  		driver.findElement(hellosignin).click();
	  	}
	  	public void emailid()
	  	{
	  		driver.findElement(email).sendKeys("9000566059");
	  	}
	 
	  	public void continuetosignin()
	  	{
	  		driver.findElement(continues).click();
	  	}
	  	public void enterpw()
	  	{
	  		driver.findElement(password).sendKeys("navya123");
	  	}
	  	public void login()
	  	{
	  		driver.findElement(login).click();
	  	}
}
