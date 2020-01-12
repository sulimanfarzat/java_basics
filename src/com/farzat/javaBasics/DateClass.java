/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaBasics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;  


public class DateClass {
	
	// format date GregorianCalendar
	public void dateFormat() {
		System.out.println("\n------------format date GregorianCalendar-------------\n");

		Date dt = new Date();
		System.out.println(dt);
		
		GregorianCalendar gc = new GregorianCalendar(2020, 1, 1);
		gc.add(GregorianCalendar.DATE, 1);
		
		Date dt2 = gc.getTime();
		
		DateFormat d1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String d2 = d1.format(dt2);
		System.out.println(d2);
		
	}
	
	
	// Java SimpleDateFormat Example: Date to String 
	public void dateToString () {
	    System.out.println("\n-----------Date to String--------------\n");

		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");  
	    String strDate= formatter.format(date);
	    System.out.println(date);  
	    System.out.println(strDate);  
		
	}

	
	// Java SimpleDateFormat Example: String to Date
	public void stringToDate() {
	    System.out.println("\n------------String to Date-------------\n");

		String str = "01.01.2020";
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");  
	    try {  
	        Date date = formatter.parse(str);  
	        System.out.println("Date is: "+date);  
	    } catch (ParseException e) {e.printStackTrace();} 
	    
	}
	
}
