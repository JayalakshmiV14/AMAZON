package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsonMethods {

	public WebDriver driver;
	
	@Test(dependsOnMethods = "propertyset")
	private void browserlaunch() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}
	@Test
	private void propertyset() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91996\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();

	}
	
	@Test(dependsOnMethods = "browserlaunch")
	private void username()
	{
		WebElement user = driver.findElement(By.xpath("(//table[@class='login']/tbody/tr/following-sibling::tr//input)[1]"));
		user.sendKeys("Bala112233");

	}
	
	@Test( dependsOnMethods = "username")
	private void password() {
		WebElement pass = driver.findElement(By.xpath("//table[@class='login']/tbody/tr/following-sibling::tr//input[@type='password']"));
		pass.sendKeys("B953RN");

	}
}
