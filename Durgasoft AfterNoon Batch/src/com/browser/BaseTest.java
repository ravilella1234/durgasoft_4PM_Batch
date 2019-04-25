package com.browser;


import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties p;
	public static Properties or;
	public static FileInputStream fis=null;
	
	
	//Extent Report Initialization
		public static ExtentReports e = ExtentManager.getInstance();
		public static ExtentTest test;
	
	public static void init() throws Exception
	{
		p=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"//data.properties");
		p.load(fis);
		
		or=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"//OR.properties");
		or.load(fis);
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"//log4j.properties");
		
	}
	
	
	public static void launch(String browserKey)
	{
		if(p.getProperty(browserKey).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe" );
			driver=new ChromeDriver();
		}else if(p.getProperty(browserKey).equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(p.getProperty(browserKey).equals("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else if(p.getProperty(browserKey).equals("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	public static void navigate(String url)
	{
		driver.get(p.getProperty(url));
	}
	
	
	public static WebElement getElement(String locatorKey)
	{
		WebElement element=null;
		
		if(locatorKey.endsWith("_id")) {
			element=driver.findElement(By.id(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element=driver.findElement(By.name(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_classname")) {
			element=driver.findElement(By.className(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element=driver.findElement(By.xpath(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_css")) {
			element=driver.findElement(By.cssSelector(or.getProperty(locatorKey)));
		}
		return element;
		
		
	}
	
	public static void selectOption(String locatorKey, int item) 
	{
		WebElement loc = getElement(locatorKey);
		Select s=new Select(loc);
		s.selectByIndex(item);
	}
	
	
	public static void type(String locatorKey, String value) 
	{
		getElement(locatorKey).sendKeys(value);		
	}

	
	public static void click(String locatorKey) 
	{
		getElement(locatorKey).click();
	}

}
