package com.demo;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class StaticUtils {
//	
//	public static List<Integer> range(int start,int end) {
//		List list=Arrays.asList(1,2,3,4,5,6,7);
//		return List;
//	}
//	
//	public String GetTest(String msg) {
//		return StaticUtils.privateTest(msg);
//	}
//	
//	private String privateTest(String msg) {
//		return "Building";
//	}
//}
//
//
////reflection apis are mainly used to call private method and constructor from outside the class.

import java.util.Arrays;
import java.util.List;

public class StaticUtils {
//	public static List<Integer> range(int start, int end){
//		List list = Arrays.asList(1,2,3,4,5,6);
//		return list;
//	}
	
	
	public static String range(){
		return "msg";
	}
	
	public String getTest(String msg) {
		return privateTest(msg);
	}
	private String privateTest(String msg) {
		
		return "Building";
	}
}