/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaBasics.oop;

public class StaticMethods {
	
	// static key word 
	int age;
	String name;
	static String company = "FARZAT";
	
	
	public StaticMethods(int n, String s) {
		age = n;
		name = s;
	}
	
	public void showStatic() {
		System.out.println( name + " / " + age + " / " + company );
	}
	
	public static void changeCompany() {
		company = "FRITZ";
	}
	
	
	
	// static key word math
	static int count = 0;
	
	public StaticMethods() {
		count++;
		System.out .println(count);
	}
	
	
	
	
	

}
