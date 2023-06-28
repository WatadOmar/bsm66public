package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.demo.CaseConverter;

public class CaseConverterTest {
	CaseConverter c;
	
	
	
	@BeforeEach
	void init() {
		c= new CaseConverter();		
	}
	
	
	@Test
	public void testConvertCase() {
		assertEquals(c.ConvertCase("hello"), "hello");
	}
	
	@Test
	public void testConvertCase2() {
		assertEquals(c.ConvertCase("hello"), "HELLO");
	}
	
	@Test
	public void testConvertCase3() {
		assertEquals(c.ConvertCase(""), "");
	}
	
	@Test
	public void testConvertCase4() {
		assertEquals(c.ConvertCase(null), "");
	}
	@Test
	public void testConvertCase5() {
		assertEquals(c.ConvertCase("7"), "7");
	}
	
}
