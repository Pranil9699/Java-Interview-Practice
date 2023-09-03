package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

	private static DriverInit driverInit=null;
	private WebDriver driver;
	
	private DriverInit() {
		
	}
	public WebDriver openBrowser() {
		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome_proxy.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static DriverInit getInstance() {
		if(driverInit==null)
			driverInit = new DriverInit();
		return driverInit;
	}
	
}
