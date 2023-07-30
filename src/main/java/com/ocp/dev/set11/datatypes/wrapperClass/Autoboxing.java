package com.ocp.dev.set11.datatypes.wrapperClass;

import java.util.ArrayList;
import java.util.List;

/**
 * DATA TYPES AUTOBOXING INTRODUCTION
 * 
 * @author Harshit Suhagiya
 */
public class Autoboxing {

	// DEFINATION: THE AUTOMATIC CONVERSION OF PRIMITIVE DATA TYPE INTO ITS
	// CORRESPONDING WRAPPER CLASS IS KNOWN AS AUTOBOXING

	// EXAMLE: byte to Byte, char to Character, int to Integer, long to Long, float
	// to Float, boolean to Boolean, double to Double, and short to Short.

	// SHORT: JAVA PROGRAM TO CONVERT PRIMITIVE INTO INTEGER
	/**
	 * BASIC EXAMPLE OF AUTOBOXING
	 */
	public void intro() {
		int i = 30;
		Integer j = Integer.valueOf(i);// CONVERTING int INTO Integer EXPLICITLY (OLD)
		Integer intobj = i; // AUTOBOXING, NOW COMPILER WILL WRITE Integer.valueOf(a) INTERNALLY (NEW)
		System.out.println("AUTOBOXING INTEGER ----------->" + intobj);

		byte b = 10;
		Byte byteobj = b;
		System.out.println("AUTOBOXING BYTE ----------->" + byteobj);

		short s = 20;
		Short shortobj = s;
		System.out.println("AUTOBOXING SHORT ----------->" + shortobj);

		long l = 40;
		Long longobj = l;
		System.out.println("AUTOBOXING LONG ----------->" + longobj);

		float f = 50.0F;
		Float floatobj = f;
		System.out.println("AUTOBOXING FLOAT ----------->" + floatobj);

		double d = 60.0D;
		Double doubleobj = d;
		System.out.println("AUTOBOXING DOUBLE ----------->" + doubleobj);

		char c = 'a';
		Character charobj = c;
		System.out.println("AUTOBOXING CHARACTER ----------->" + charobj);

		boolean b2 = true;
		Boolean boolobj = b2;
		System.out.println("AUTOBOXING BOOLEAN ----------->" + boolobj);
	}

	/**
	 * AUTOBOXING EXAMPLE WITH COLLECTION
	 */
	public void withCollection() {
		int number = 456;

		List<Integer> numberList = new ArrayList<>();

		// AUTOBOXING BECAUSE ARRAYLIST STORES ONLY OBJECTS
		numberList.add(number);
		System.out.println("WITH COLLECTION AUTOBOXING --------->" + numberList.get(0));

	}

	public static void main(String[] args) {
		Autoboxing autoboxing = new Autoboxing();
		autoboxing.intro();
		autoboxing.withCollection();
	}
}
