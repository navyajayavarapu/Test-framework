package com.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.WrapperEx;
import com.Page.ProductDetails;

public class ProductTestcase extends WrapperEx
{
	@BeforeClass
	public void start()
	{
		launchApplication("chrome","https://www.amazon.in/");
	}
	@Test
	public void product()
	{
		ProductDetails p=new ProductDetails(driver);
		p.details();
		p.selectedthing();
	}
	public void close()
	{
		close();
	}
}
