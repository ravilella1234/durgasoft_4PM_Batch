package com.browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunchers
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Drivers\\chromedriver.exe" );
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.amazon.in");
		
		//FF-46 drivers:-0.19.0
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\geckodriver.exe");
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.get("https://www.bestbuy.com");
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\IEDriverServer.exe");
		InternetExplorerDriver driver3=new InternetExplorerDriver();
		driver3.get("https://www.snapdeal.com");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\MicrosoftWebDriver.exe");
		EdgeDriver driver4=new EdgeDriver();
		driver4.get("https://www.ebay.com");
	}

}
