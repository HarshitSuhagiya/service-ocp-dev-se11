package com.ocp.dev.set11.datatypes.prmitiveTypes;

/**
 * PRIMITIVE DATA TYPE INTRODUCTION
 * 
 * @author Harshit Suhagiya
 */
public class Introduction {

	/**
	 * BASIC INTRODUCTION OF ALL THE PRIMITIVE TYPES
	 */
	public void intro() {

		// SIZE: 1 byte
		// DEFAULT: 0
		// DESCRIPTION: Stores whole numbers from -128 to 127
		byte byteV = 100;
		System.out.println("BYTE VALUE ----------" + byteV);

		// SIZE: 2 bytes
		// DEFAULT: 0
		// DESCRIPTION: Stores whole numbers from -32,768 to 32,767
		short shortV = 1000;
		System.out.println("SHORT VALUE ----------" + shortV);

		// SIZE: 4 bytes
		// DEFAULT: 0
		// DESCRIPTION: Stores whole numbers from -2,147,483,648 to 2,147,483,647
		int intV = 5000;
		System.out.println("INT VALUE ----------" + intV);

		// SIZE: 2 bytes
		// DEFAULT: \u0000
		// DESCRIPTION: Stores a single character/letter or ASCII values
		char charV = 'A';
		System.out.println("CHAR VALUE ----------" + charV);

		// SIZE: 2 bytes
		// DEFAULT:\u0000
		// DESCRIPTION: Stores a single character/letter or ASCII values
		char charASCIIV = 65;
		System.out.println("CHAR ASCII VALUE ----------" + charASCIIV);

		// SIZE: 8 bytes
		// DEFAULT: 0L
		// DESCRIPTION: Stores whole numbers from -9,223,372,036,854,775,808 to
		// 9,223,372,036,854,775,807
		long longV = 5000;
		System.out.println("CHAR ASCII VALUE ----------" + longV);

		// SIZE: 4 bytes
		// DEFAULT: 0.0f
		// DESCRIPTION: Stores fractional numbers.Sufficient for storing 6 to 7 decimal
		// digits
		float floatV = 12.45f;
		System.out.println("FLOAT VALUE ----------" + floatV);

		// SIZE: 8 bytes
		// DEFAULT: 0.0d
		// DESCRIPTION: Stores fractional numbers. Sufficient for storing 15 decimal
		// digits
		double doubleV = 1000.4565465d;
		System.out.println("DOUBLE VALUE ----------" + doubleV);

		// SIZE: 1 bit
		// DEFAULT: false
		// DESCRIPTION: Stores true or false values
		boolean booleanV = true;
		System.out.println("BOOLEAN VALUE ----------" + booleanV);
	}

	public static void main(String[] args) {
		Introduction introduction = new Introduction();
		introduction.intro();
	}
}
