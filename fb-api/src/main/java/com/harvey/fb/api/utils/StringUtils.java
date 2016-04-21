package com.harvey.fb.api.utils;

import java.io.UnsupportedEncodingException;

public class StringUtils {
	
	public static boolean isNotBlank(String str){
		if (str != null && str.trim().length() > 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isBlank(String str){
		if (str == null || str.trim().length() == 0) {
			return true;
		}
		return false;
	}
	
	
	public static String decode(String str){
		String result="";
		if(StringUtils.isBlank(str)){
			return result;
		}else{
			try {
				result=java.net.URLDecoder.decode(str, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
