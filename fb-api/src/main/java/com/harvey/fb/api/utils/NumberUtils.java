package com.harvey.fb.api.utils;


public class NumberUtils {
	
	public static Double parseDouble(String value){
		try {
			return Double.parseDouble(value);
		} catch (Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}
	

}
