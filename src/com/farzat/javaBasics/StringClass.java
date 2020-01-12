/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/


package com.farzat.javaBasics;

import java.util.Scanner;

public class StringClass {
	
	//  string equals and equivalent ignoring case
	public void stringEquals() {
        System.out.println("\n------------string equals ------------\n");
        
		String s1 = "Suliman Farzat";
		String s2 = new String("SULIMAN Farzat");
		String s3 = new String("Suliman Farzat");
		System.out.println(s1);
		
		if (s1.equals(s3)) System.out.println("s3 Match !");
        	
        if(s1.equalsIgnoreCase(s2)){
        	System.out.println("They Match !");
        }else{
        	System.out.println("No Match !!");
        }
        
	}
	
	
	// Converts string to a new character array 
	public void StringChar() {
        System.out.println("\n------------character array ------------\n");

		String str = "Suliman";
		char[] ch = str.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		
	}
	
	
	// StringBuilder append text
	public void stringBuilder() {
        System.out.println("\n------------StringBuilder append-------------\n");

		String str = "Suliman Farzat";
		StringBuilder sb = new StringBuilder(str);
		sb.append(" & Kasem Farzat");
		System.out.println(sb);
		
	}
	
	
	// Java String methods
	public void stringMethods() {
	    System.out.println("\n------------String methods-------------\n");

		String str = "i live in Germany                ";
		String word = "in";
		
		int len = str.length();
		int pos = str.indexOf(word);
		String sub = str.substring(pos);
		String search = str.substring(pos, pos + word.length() );
		String noSpaces = str.trim();
		int lenNoSpaces = noSpaces.length();
	    String lastLetter = noSpaces.substring(lenNoSpaces - 1);
	    
	    System.out.println("text length : " + len + "\n" +
	    		"live position : " + pos + "\n" +
	    		"substring live : " + sub + "\n" +
	    		"search word : " + search + "\n" +
	    		"text without spaces : " + noSpaces + "\n" +
	    		"length without spaces: " + lenNoSpaces + "\n" +
	    		"last letter of text : " + lastLetter );
	    
	}
	
	
	
	// scanner
	public void stringScanner() {
		System.out.println("\n------------Scanner-------------\n");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("insert value 1: ");
		double d1 = in.nextDouble();
		System.out.println("insert value 2: ");
		double d2 = in.nextDouble();
		double result  = d1 + d2;
		
		System.out.println(result);
		
		in.close();
	}
	

}
