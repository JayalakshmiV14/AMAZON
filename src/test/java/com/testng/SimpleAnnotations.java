package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	@AfterSuite
	private void asuite() {
		System.out.println("aftersuite");

	}

	@BeforeSuite
	private void bsuite() {
		System.out.println("Beforesuite");

	}

	@AfterClass
	private void aclass() {
		System.out.println("afterclass");

	}

	@BeforeClass
	private void bclass() {
		System.out.println("beforeclass");

	}

	@BeforeMethod
	private void bmethod() {
		System.out.println("beforeMethod");

	}

	@AfterMethod
	private void amethod() {
		System.out.println("afterMethod");

	}

	@Test
	private void test1() {
		System.out.println("test1");
	}

	@Test
	private void test2() {
		System.out.println("test2");
	}

}
