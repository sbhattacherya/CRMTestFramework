package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {

	protected static WebDriver driver;
    protected static Properties prop;
	
	
	public TestBase() throws FileNotFoundException, IOException
	{
		prop = new Properties();
		FileInputStream ip =  new FileInputStream("C:\\Users\\Sourav\\eclipse-workspace\\FreeCRMTest\\src\\main"
				+ "\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(ip);
	}
	
	public static void Initialization()
	{
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		//String browserName = "chrome";
		String url =prop.getProperty("url");
		System.out.println(url);
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sourav\\Desktop\\Sourav\\Selenium_Setup"
					+ "\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		
		//driver.get(prop.getProperty("url"));
		driver.get(url);
	}
	
}
