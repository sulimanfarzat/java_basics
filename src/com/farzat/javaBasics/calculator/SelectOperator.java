/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaBasics.calculator;

public class SelectOperator {
	 
	
	// Operators
	public static void operators(int num) {
		switch (num) {
		case 1:
			MathOperator.addAddi();
			break;
		case 2:
			MathOperator.addSub();
			break;
		case 3:
			MathOperator.addMult();
			break;
		case 4:
			MathOperator.addDiv();
			break;
		case 5:
			MathOperator.addMod();
			break;

		default:
			break;
		}
	}

}
