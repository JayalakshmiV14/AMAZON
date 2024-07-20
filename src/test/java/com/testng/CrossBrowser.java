package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CrossBrowser {

	public WebDriver driver;
	@Test
	private void chromebrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91996\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();

	}
	
	@Test
	private void edge() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91996\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();


	}
	
}
