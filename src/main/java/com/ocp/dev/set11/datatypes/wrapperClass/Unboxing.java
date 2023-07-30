package com.ocp.dev.set11.datatypes.wrapperClass;

import java.util.ArrayList;
import java.util.List;

/**
 * DATA TYPES UNBOXING INTRODUCTION
 * 
 * @author Harshit Suhagiya
 */
public class Unboxing {

	// DEFINATION: THE AUTOMATIC CONVERSION OF WRAPPER TYPE INTO ITS CORRESPONDING
	// PRIMITIVE TYPE IS KNOWN AS UNBOXING. IT IS THE REVERSE PROCESS OF AUTOBOXING.
	// SINCE JAVA 5, WE DO NOT NEED TO USE THE intValue() METHOD OF WRAPPER CLASSES
	// TO CONVERT THE WRAPPER TYPE INTO PRIMITIVES.

	// EXAMLE: Integer to int, Long to long, Double to double, etc.
	// SHORT: JAVA PROGRAM TO CONVERT OBJECT INTO PRIMITIVE
	/**
	 * BASIC EXAMPLE OF UNBOXING
	 */
	public void intro() {
		Integer intobj = 30;
		int i = intobj.intValue();// CONVERTING Integer TO int EXPLICITLY (OLD)
		int intV = intobj;// UNBOXING, NOW COMPILER WILL WRITE intObj.intValue() INTERNALLY
		System.out.println("UBNBOXING INTEGER ----------->" + intV);

		Byte byteobj = 10;
		byte byteV = byteobj;
		System.out.println("UBNBOXING BYTE ----------->" + byteV);

		Short shortobj = 20;
		short shortV = shortobj;
		System.out.println("UBNBOXING SHORT ----------->" + shortV);

		Long longobj = 40l;
		long longV = longobj;
		System.out.println("UBNBOXING LONG ----------->" + longV);

		Float floatobj = 50.45f;
		float floatV = floatobj;
		System.out.println("UBNBOXING FLOAT ----------->" + floatV);

		Double doubleobj = 465.5246d;
		double doubleV = doubleobj;
		System.out.println("UBNBOXING DOUBLE ----------->" + doubleV);

		Character charobj = 'B';
		char charV = charobj;
		System.out.println("UBNBOXING CHAR ----------->" + charV);

		Boolean blobj = Boolean.TRUE;
		boolean blV = blobj;
		System.out.println("UBNBOXING BOOLEAN ----------->" + blV);

	}

	/**
	 * AUTOBOXING EXAMPLE WITH COLLECTION
	 */
	public void withCollection() {
		int number = 456;
		// AUTOBOXING- PRIMITIVE TO INTEGER OBJECT CONVERSION
		Integer numObj = number;

		List<Integer> numberList = new ArrayList<>();

		// AUTOBOXING BECAUSE ARRAYLIST STORES ONLY OBJECTS
		numberList.add(numObj);

		int num1 = numberList.get(0);
		System.out.println("WITH COLLECTION AUTOBOXING --------->" + num1);

	}

	public static void main(String[] args) {
		Unboxing unboxing = new Unboxing();
		unboxing.intro();
		unboxing.withCollection();
	}

}
