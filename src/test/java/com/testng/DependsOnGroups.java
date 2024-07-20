package com.testng;

import org.testng.annotations.Test;

public class DependsOnGroups {

	@Test(groups = "smoke")
	private void loginpage() {
		System.out.println("Username");

	}
	@Test(groups = "smoke")
	private void signup() {
		System.out.println("Firstname");

	}
	@Test(groups = "sanity")
	private void homepage() {
		System.out.println("DP");

	}
	@Test(groups = "sanity")
	private void paymentpage() {
		System.out.println("Online Payment");

	}
}
