package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.demo.TestVoidMethod;

public class TestVoidMethodTestCase {
	
	 TestVoidMethod testVoidMethod = new TestVoidMethod();
	
	@BeforeEach
	public void init() {	
		testVoidMethod.add("apple");
		testVoidMethod.add("banana");
	}
	
	
	@Test
	public void testVoidMethod() {
		assertEquals(2, testVoidMethod.size());
	}
	
}
