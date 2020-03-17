package com.Baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperEx 
{
	public WebDriver driver;
	public void launchapp(String browser,String url)
	{
		try
		{
			if(browser.equalsIgnoreCase("chrome"))
			{	
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			}
			
		}
		
		finally
		{
			System.out.println("The browser cannot be launched");
		}
	}
	public void screenshot() throws IOException
	{
		driver = new ChromeDriver();
		 TakesScreenshot ts=((TakesScreenshot)driver);
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(source,new File("D:\\Selenium\\sampleframework\\Screenshot.png"));
	}
}
