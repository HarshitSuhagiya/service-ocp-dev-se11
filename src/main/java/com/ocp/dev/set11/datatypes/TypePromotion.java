package com.ocp.dev.set11.datatypes;

/**
 * INTRODUCTION OF TYPE PROMOTION
 * 
 * @author Harshit Suhagiya
 * 
 */

// THE NAME TYPE PROMOTION SPECIFIES THAT A SMALL SIZE DATATYPE CAN BE PROMOTED TO A LARGE SIZE DATATYPE. 
// I.E., AN Integer DATA TYPE CAN BE PROMOTED TO long, float, double, etc. 
// THIS AUTOMATIC TYPE PROMOTION IS DONE WHEN ANY METHOD WHICH ACCEPTS A HIGHER SIZE DATA TYPE ARGUMENT IS CALLED WITH THE SMALLER DATA TYPE
public class TypePromotion {

	// TYPE PROMOTION RULES
	// WIDENING CONVERSIONS DO NOT LOSE INFORMATION ABOUT THE MAGNITUDE OF A VALUE.
	// FOR EXAMPLE, AN int VALUE IS ASSIGNED TO A double VARIABLE. THIS CONVERSION
	// IS LEGAL BECAUSE doubles ARE WIDER THAN ints.

	// JAVA'S WIDENING CONVERSIONS ARE...
	// From a byte to a short, an int, a long, a float, or a double
	// From a short to an int, a long, a float, or a double
	// From a char to an int, a long, a float, or a double
	// From an int to a long, a float, or a double
	// From a long to a float or a double
	// From a float to a double

	// WIDENING CONVERSIONS:
	// 1. char->int
	// 2. byte->short->int->long->float->double
	public static void main(String[] args) {
		TypePromotion promotion = new TypePromotion();
		promotion.sample1();
		promotion.sample2();
		promotion.sample3();
	}

	/**
	 * IN THE FOLLOWING CODE, f * b, b IS PROMOTED TO A float AND THE RESULT OF THE
	 * SUBEXPRESSION IS float
	 */
	public void sample1() {
		byte b = 4;
		float f = 5.5f;
		float result = (f * b);
		System.out.println("SAMPLE 1 O/P --------->" + result);

		// IF WE CAST ABOVE CALCULATION IN THE BYTE THEN ITS SHOWING BELOW COMPILE TIME
		// ERROR
		// Type mismatch: cannot convert from float to byte
		// byte result = (f * b);
	}

	/**
	 * IN THE FOLLOWING PROGRAM, c IS PROMOTED TO int, AND THE RESULT IS OF TYPE
	 * int.
	 */
	public void sample2() {
		char c = 'a';
		int i = 50000;
		int result = i / c;
		System.out.println("SAMPLE 2 O/P  --------->" + result);
	}

	/**
	 * IN THE FOLLOWING CODE THE VALUE OF s IS PROMOTED TO double, AND THE TYPE OF
	 * THE SUBEXPRESSION IS double.
	 */
	public void sample3() {
		short s = 1024;
		double d = .1234;
		double result = d * s;
		System.out.println("SAMPLE 3 O/P  --------->" + result);
	}
}
