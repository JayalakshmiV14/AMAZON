package com.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

	
	@Test(enabled=false)
	private void searchbar() {
		System.out.println("mobiles");

	}
	
	@Test
	private void categor() {
		System.out.println("Flip");

	}
	
	@Test
	private void paymentmethod() {
		System.out.println("COD");

	}
}
