package com.test;
//
//public class StaticUtilTest {
//
//}

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.StaticUtils;

@ExtendWith(MockitoExtension.class)
public class StaticUtilTest {
	StaticUtils st = new StaticUtils();
	
	
	@Test
	public void testPrivateMethod() {
		assertEquals(st.getTest("hello"), "Building");
	}
	@Test
	public void testPrivateMethod1() throws NoSuchMethodError, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method method = StaticUtils.class.getDeclaredMethod("privateTest",String.class);
		method.setAccessible(true);
		StaticUtils staticUtils = new StaticUtils();
		String res = (String) method.invoke(staticUtils, "Hello");
		assertEquals(res, "Building");
	}
	
	
	public void staticTest() {
		try(MockedStatic mockStatic=Mockito.mockStatic(StaticUtils.class)) {
			mockStatic.when(StaticUtils::range).thenReturn("welcome");
			assertEquals(StaticUtils.range(), "welcome");
		}
	}
}