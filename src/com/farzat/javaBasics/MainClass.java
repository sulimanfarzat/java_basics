/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaBasics;

import com.farzat.javaBasics.calculator.MathOperator;
import com.farzat.javaBasics.calculator.SelectOperator;
import com.farzat.javaBasics.oop.ConstructorMethods;
import com.farzat.javaBasics.oop.StaticMethods;
import com.farzat.javaBasics.oop.ThisKeyWord;

public class MainClass {

	public static void main(String[] args) {

		// please active this row to run javaBasics Methods
		// basicsMain();
			
		// please active this row to run calculator Methods
		// calculator();
		

		// Constructor Methods
		System.out.println("\n------------Constructor Methods------------\n");
		ConstructorMethods suliman1 = new ConstructorMethods("Suliman", "Farzat");
		ConstructorMethods suliman2 = new ConstructorMethods("Kasem", "Farzat", 300);
		suliman1.show();
		suliman2.show();
		
		
		// Static Methods word key
		System.out.println("\n------------Static Methods-------------\n");
		StaticMethods emp1 = new StaticMethods( 34, "Suliman");
		StaticMethods emp2 = new StaticMethods( 28, "Jochen");
		StaticMethods emp3 = new StaticMethods( 25, "Aime");
		emp1.showStatic();
		emp2.showStatic();
		emp3.showStatic();
		
		// Static Methods word key change static field
		System.out.println("\n------------Static Methods change field-------------\n");
		StaticMethods.changeCompany();
		emp1.showStatic();
		emp2.showStatic();
		emp3.showStatic();
		
		// Static Methods math, print in the method
		System.out.println("\n------------Static Methods Math-------------\n");
		new StaticMethods();
		new StaticMethods();
		new StaticMethods();
		
		
		// This word key
		System.out.println("\n------------Static Methods-------------\n");
		ThisKeyWord emp11 = new ThisKeyWord( 40, "Suliman");
		ThisKeyWord emp22 = new ThisKeyWord( 20, "Kasem");
		emp11.showThisKeyWord();
		emp22.showThisKeyWord();
		

	}


	
	
	
	
	
	
	
	

	// method to run calculator class
	private static void calculator() {
		int operNum = MathOperator.insertOperator();
		SelectOperator.operators(operNum);
	}

	
	
	// method to run javaBasics class
	private static void basicsMain() {
		StringClass clsStr = new StringClass();
		DateClass clsDat = new DateClass();
		ErrorsClass clsErr = new ErrorsClass();
		ArraysClass clsArr = new ArraysClass();
		
				
		clsStr.stringEquals();
		clsStr.StringChar();
		clsStr.stringBuilder();
		clsStr.stringMethods();
		clsStr.stringScanner();
		
		clsDat.dateFormat();
		clsDat.dateToString();
		clsDat.stringToDate();
		
		try {
			clsErr.thrwingError();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("there is an error !! out of bounds ");
		}
		System.out.println("\n------------throwing error-------------\n");
		clsErr.urlError();
		clsErr.uriError();
		
		clsArr.simpleArray();
		clsArr.fixArray();
		clsArr.dynamic2dArray();
		clsArr.fillInDynamic2dArray();
		clsArr.listArray();
		clsArr.hashMapArray();
		clsArr.listIteratorsArray();
		clsArr.iteratorsArray();
	}
	

}
