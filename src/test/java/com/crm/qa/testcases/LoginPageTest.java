package com.crm.qa.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.RediffHomePage;

public class LoginPageTest extends TestBase 
{
	//public LoginPage loginPage;
	LoginPage loginPage;
	HomePage homePage;
	RediffHomePage rediffHome;

	public LoginPageTest() throws FileNotFoundException, IOException {
		super();

	}
	
	@BeforeMethod
	public void Setup() throws FileNotFoundException, IOException
	{
		Initialization();
		//loginPage = new LoginPage();
		rediffHome = new RediffHomePage();
	}
	
	@Test
	public void MailTitleTest()
	{
		rediffHome.clickMailLink();
		String pageTitle = rediffHome.getCurrentTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Rediffmail");
	}
	
/*	@Test(priority=1)
	public void LoginPageTitleTest()
	{
		System.out.println(loginPage);
		String pageTitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(pageTitle, "#1 Free CRM software in the cloud for sales and service");
	}*/
	
	/*@Test(priority=2)
	public void crmLogoImageTest()
	{
		System.out.println(loginPage);
		boolean flag = loginPage.validateCRMLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		//homePage = loginPage.Login(System.getProperty("username"), System.getProperty("password"));
		System.out.println(loginPage);
		homePage = loginPage.Login("naveenk", "test@123");
		Assert.assertEquals(homePage, new HomePage());
	}*/
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
