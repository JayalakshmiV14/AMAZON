package com.testng;

import org.testng.annotations.Test;

public class TimeOut {

	
	@Test(timeOut = 4000)
	private void method1() throws InterruptedException {
		Thread.sleep(1500);
		System.out.println("dropdown");

	}
	@Test(timeOut = 5000)
	private void method2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("alert");

	}
}
