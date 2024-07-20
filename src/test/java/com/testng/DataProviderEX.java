package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEX {
public WebDriver driver;
	@Test
	private void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91996\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			

	}
	
	@Test(dataProvider ="userCrendentials")
	private void credentials(String username, String password) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

	}
	
	@DataProvider
	private Object[][] userCrendentials() {
		return new Object[][] {
			{"test12345","123456"},
			{"facebook123","456789"},
			{"insta123","7894563"}
			
		};
		
	

	}
}
