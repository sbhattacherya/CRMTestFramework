package com.crm.qa.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class RediffHomePage extends TestBase {

	public RediffHomePage() throws FileNotFoundException, IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//u[contains(text(),'rediffmail')]")
	WebElement mailLink;
	
	
	public void clickMailLink()
	{
		mailLink.click();
	}
	
	public String getCurrentTitle()
	{
		String getTitle = driver.getTitle();
		return getTitle;
	}
	
}
