package com.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.WrapperEx;
import com.Page.Login;

public class Logintopage extends WrapperEx
{
	@BeforeClass
	public void startup()
	{
		launchapp("chrome","https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
	}

	@Test
	public void login()
	{
		Login lpage=new Login(driver);
		lpage.signin();
		lpage.emailid();
		lpage.continuetosignin();
		lpage.enterpw();
		lpage.login();
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}

	

}
