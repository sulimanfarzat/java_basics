/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaBasics.oop;

public class ConstructorMethods {
	
	String first_name;
	String last_name;
	int salary;
	
	
	
	public ConstructorMethods(String s1, String s2) {
		first_name = s1;
		last_name = s2;		
	}



	public ConstructorMethods(String s3, String s4, int n) {
		first_name = s3;
		last_name = s4;
		salary = n;
	}

	public void show() {
		System.out.println( "First Name: " + first_name + 
							"\nLast Name: " + last_name + 
							"\nSalary: " + salary + "\n++++++++");
	}
	
}
