/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaBasics.calculator;

import java.util.Scanner;


public class MathOperator {
	
	private static Scanner in;
	private static Scanner in1;
	private static Scanner in2;
	private static Scanner in3;
	private static Scanner in4;
	private static Scanner in5;
	
	
	// insert number of Operator to select it and calculate the values
	public static int insertOperator() {
		System.out.println("\n-------------insert number of Operator---------------\n");
		
		in = new Scanner(System.in);
		System.out.println("1:Add, 2:Sub, 3:Mult, 4:Div, 5:Mod");
		int num = in.nextInt();
		return num;
	}
	

	// add Addition Operator
	public static void addAddi() {
		System.out.println("\n-------------Addition---------------\n");
		
		in1 = new Scanner(System.in);
		
		System.out.println("Enter the First No. : ");
		double d1 = in1.nextDouble();
		
		System.out.println("Enter the Second No. : ");
		double d2 = in1.nextDouble();
		
		double result = d1 + d2 ;
		System.out.println(result);
	}

	
	
	// add Subtraction Operator
	public static void addSub() {
		System.out.println("\n-------------Subtraction---------------\n");
		
		in2 = new Scanner(System.in);
		
		System.out.println("Enter the First No. : ");
		double d1 = in2.nextDouble();
		
		System.out.println("Enter the Second No. : ");
		double d2 = in2.nextDouble();
		
		double result = d1 - d2 ;
		System.out.println(result);
	}
	
	
		
	// add Multiplication Operator
	public static void addMult() {
		System.out.println("\n-------------Multiplication---------------\n");
		
		in3 = new Scanner(System.in);
		
		System.out.println("Enter the First No. : ");
		double d1 = in3.nextDouble();
		
		System.out.println("Enter the Second No. : ");
		double d2 = in3.nextDouble();
		
		double result = d1 * d2 ;
		System.out.println(result);
	}
	
	
	
	// add Division Operator
	public static void addDiv() {
		System.out.println("\n-------------Division----------------\n");
		
		in4 = new Scanner(System.in);
		
		System.out.println("Enter the First No. : ");
		double d1 = in4.nextDouble();
		
		System.out.println("Enter the Second No. : ");
		double d2 = in4.nextDouble();
		
		double result = d1 / d2 ;
		System.out.println(result);
	}
	
	
	// add Remainder / Modulo Operator
	public static void addMod() {
		System.out.println("\n-------------Remainder / Modulo---------------\n");
		
		in5 = new Scanner(System.in);
		
		System.out.println("Enter the First No. : ");
		double d1 = in5.nextDouble();
		
		System.out.println("Enter the Second No. : ");
		double d2 = in5.nextDouble();
		
		double result = d1 % d2 ;
		System.out.println(result);
	}
	
	
	
}
