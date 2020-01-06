/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaBasics;

import com.farzat.javaBasics.calculator.MathOperator;
import com.farzat.javaBasics.calculator.SelectOperator;
import com.farzat.javaBasics.oop.ConstructorMethods;

public class MainClass {

	public static void main(String[] args) {

		// please active this row to run javaBasics Methods
		// basicsMain();
			
		// please active this row to run calculator Methods
		// calculator();
		

		ConstructorMethods suliman1 = new ConstructorMethods("Suliman", "Farzat");
		ConstructorMethods suliman2 = new ConstructorMethods("Kasem", "Farzat", 300);
		suliman1.show();
		suliman2.show();

	}


	
	
	
	
	

	// run calculator Methods
	private static void calculator() {
		int operNum = MathOperator.insertOperator();
		SelectOperator.operators(operNum);
	}

	
	
	// run javaBasics Methods
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
