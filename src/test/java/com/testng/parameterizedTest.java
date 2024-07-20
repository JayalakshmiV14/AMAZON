package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizedTest {

	public WebDriver driver;
	@Test(priority = 1)
	private void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91996\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();


	}
	@Test(priority = 2)
	@Parameters({"username","password"})
	private void credentials(String username,String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();

	}
}
