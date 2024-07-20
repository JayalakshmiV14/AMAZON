package com.testng;

import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class ExceptionEx {

	@Test(expectedExceptions = Exception.class)
	private void arithmetic() {
		int i=10;
		System.out.println(i/0);

	}
	
	@Test(expectedExceptions = Exception.class)
	private void nullpointer() {
		Map<String, Integer>m=new TreeMap<String, Integer>();
		m.put("english", 80);
		m.put(null, 86);
		System.out.println(m);

	}
}
