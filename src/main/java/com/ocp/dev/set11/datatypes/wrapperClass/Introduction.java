package com.ocp.dev.set11.datatypes.wrapperClass;

/**
 * WRAPPER CLASS INTRODUCTION
 * 
 * @author Harshit Suhagiya
 */
public class Introduction {

	// ADVANTAGE
	// ONE: COLLECTIONS ALLOWED ONLY OBJECT DATA.
	// TWO: ON OBJECT DATA WE CAN CALL MULTIPLE METHODS compareTo(), equals(),
	// toString()
	// THREE: CLONING PROCESS ONLY OBJECTS
	// FOUR: OBJECT DATA ALLOWED NULL VALUES.
	// FIVE: SERIALIZATION CAN ALLOW ONLY OBJECT DATA.
	/**
	 * BASIC INTRODUCTION OF WRAPPER CLASSES
	 */
	public void intro() {
		// TYPES OF WRAPPER CLASS
		Boolean blValue = Boolean.TRUE;
		System.out.println("BOOLEAN VALUE ------------->" + blValue);

		Character cValue = 'A';
		System.out.println("CHARACTER VALUE ------------->" + cValue);

		Byte btValue = 100;
		System.out.println("BYTE VALUE ------------->" + btValue);

		Short sValue = 2000;
		System.out.println("SHORT VALUE ------------->" + sValue);

		Integer iValue = 65546;
		System.out.println("INTEGER VALUE ------------->" + iValue);

		Long lValue = 45845l;
		System.out.println("LONG VALUE ------------->" + lValue);

		Float fValue = 458.54f;
		System.out.println("FLOAT VALUE ------------->" + fValue);

		Double dValue = 584.65658;
		System.out.println("DOUBLE VALUE ------------->" + dValue);

	}

	public static void main(String[] args) {
		Introduction introduction = new Introduction();
		introduction.intro();
	}
}
