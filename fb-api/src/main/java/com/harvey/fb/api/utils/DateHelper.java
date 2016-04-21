package com.harvey.fb.api.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateHelper {
	
	public static String dateToString(Date time ,String formate, Locale lang){ 
		if(time==null){
			return "";
		}
		SimpleDateFormat formatter; 
		formatter = new SimpleDateFormat (formate,lang); 
		String ctime = formatter.format(time); 
		return ctime; 
	}
	public static String dateToString(Date time ,String formate){ 
		if(time==null){
			return "";
		}
	    SimpleDateFormat formatter; 
	    formatter = new SimpleDateFormat (formate); 
	    String ctime = formatter.format(time); 
	    return ctime; 
	}
	
	public static Date StrToDate(String str,String dateFormate) {
		  
		SimpleDateFormat format = new SimpleDateFormat(dateFormate);
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String DateStrEnToNum(String str) {
		String reg = "(\\d+)-([a-zA-Z]+)-(\\d+)";
	     String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	     String d1 = str;
	     String m = d1.replaceAll(reg, "$2");
	     int index = -1;
	     for(int i = 0; i < months.length; i++)
	     {
	         if(m.equals(months[i]))
	         {
	             index = i + 1;
	             break;
	         }
	     }
	     String d2 = d1.replaceAll(reg, "$1-"+index+"-$3");
		
		return d2;
	}
	   
	public static Date getDateBefore(Date d, int day) {      
        Calendar now = Calendar.getInstance();      
        now.setTime(d);      
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);      
        return now.getTime();      
    }     
      
    public static Date getDateAfter(Date d, int day) {      
       Calendar now = Calendar.getInstance();      
        now.setTime(d);      
       now.set(Calendar.DATE, now.get(Calendar.DATE) + day);      
       return now.getTime();      
    } 
}
