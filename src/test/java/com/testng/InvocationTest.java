package com.testng;

import org.testng.annotations.Test;

public class InvocationTest {

	
	@Test(invocationCount = 2)
	private void searchbar() {
		System.out.println("phone");

	}
	@Test
	private void categories() {
		System.out.println("all mobiles");

	}
	@Test
	private void count() {
		System.out.println("20");

	}
}
