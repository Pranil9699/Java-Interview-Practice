package com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestPage {

	WebDriver driver;

	@Before
	public void setUp() {
		DriverInit instance = DriverInit.getInstance();
		driver = instance.openBrowser();
	}

	@Test
	public void testM1() throws InterruptedException {
		driver.get("https://www.flipkart.com");
		
		System.out.println(driver.getPageSource());
		Thread.sleep(5000);
		
		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);

	}

	@After
	public void shutDown() {
		driver.quit();
	}
}
