package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
public WebDriver driver;
	@Test
	private void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91996\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");

	}
	
		@Test
		private void insta() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91996\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
				driver.get("https://www.instagram.com/");
		
		}
		@Test
		private void google() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91996\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
				driver.get("https://adactinhotelapp.com/");
		}
}
