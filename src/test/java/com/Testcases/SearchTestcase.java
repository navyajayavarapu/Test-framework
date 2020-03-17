package com.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.WrapperEx;
import com.Page.Search;

public class SearchTestcase extends WrapperEx
{
	@BeforeClass
	public void start()
	{
		launchApplication("chrome","https://www.amazon.in/");
	}
	@Test
	public void search1()
	{
		Search s=new Search(driver);
		s.movement("mobile");
	}
	@AfterClass
	public void close() 
	{
		quit();
	}
}
