package com.crm.qa.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() throws FileNotFoundException, IOException 
	{
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signupBtn;
	
	@FindBy(xpath="//img[contains(class,'img-responsive')]")
	WebElement crmLogo;
	
	
	public String validateLoginPageTitle()
	{
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public boolean validateCRMLogo()
	{
		System.out.println(crmLogo);
		System.out.println(crmLogo.isDisplayed());
		return crmLogo.isDisplayed();
	}
	
	public HomePage Login(String userName, String passWord)
	{
		username.sendKeys(userName);
		password.sendKeys(passWord);
		loginBtn.click();
		
		return new HomePage();
	}
}
