package com.testng;

import org.testng.annotations.Test;

public class PriorityTest {

	
	@Test(priority=2)
	private void login() {
		System.out.println("Login the app");

	}
	
	@Test(priority=1)
	private void signup() {
		System.out.println("Create an account");

	}
	
	@Test(priority=-1)
	private void browserLaunch() {
		System.out.println("Logged in");

	}
}
