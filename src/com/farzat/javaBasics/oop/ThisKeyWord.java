/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaBasics.oop;

public class ThisKeyWord {
	
	int age;
	String name;
	static String company = "FARZAT";
	
	// This word key
	public ThisKeyWord(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public void showThisKeyWord() {
		System.out.println( name + " / " + age + " / " + company );
	}
	
	

}
