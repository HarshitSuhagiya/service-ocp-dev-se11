package com.ocp.dev.set11.datatypes;

/**
 * JAVA PARENTHESES INTRODUCTION
 * 
 * @author Harshit Suhagiya
 */
public class Parentheses {

	// The balanced parentheses problem is one of the common programming problems
	// that is also known as Balanced brackets.

	// Characters such as "(", ")", "[", "]", "{", and "}" are considered brackets
	public static void main(String[] args) {
		Parentheses parentheses = new Parentheses();
		parentheses.checkParenthesesString("{()()}");
	}

	/**
	 * VALIDATE PARENTHESES STRING
	 * 
	 * @param inputStr
	 */
	// EX: '{()()}' -> Balanced Parentheses
	// EX: '{()()}}' -> Unbalanced Parentheses
	public void checkParenthesesString(String inputStr) {
		int i, length, j = 0, count = 0;
		char current;

		// get length of inputStr
		length = inputStr.length();

		// create an empty stack
		char[] stack = new char[length];

		// use for loop for iterating input string
		for (i = 0; i < length; i++) {

			current = inputStr.charAt(i);

			// check whether current is '(', '{', or '['
			if (current == '(' || current == '{' || current == '[') {
				stack[j] = current;
				j++; // increment counter j
				count = 1; // set count to 1
			} else if (current == ')') { // if current char is ')'
				if (count == 1) // if count is 1, decrement counter j
					j--;
				if (!handle(count, j, stack, '(')) {
					return;
				}
			} else if (current == '}') { // if current char is '}'
				if (count == 1) // if count is 1, decrement counter j
					j--;
				if (!handle(count, j, stack, '{')) {
					return;
				}
			} else if (current == ']') { // if current char is '}'
				if (count == 1) // if count is 1, decrement counter j
					j--;
				if (!handle(count, j, stack, '[')) {
					return;
				}
			}
		}
		if (j > 0) {
			System.out.println("\nUnbalanced Parentheses!");
		} else {
			System.out.println("\nBalanced Parentheses.");
		}
	}

	private boolean handle(int count, int j, char[] stack, char reverse) {
		if (j < 0) {
			System.out.println("\nUnbalanced Parentheses!");
			return false;
		}
		char ch = stack[j]; // store stack[j] to ch
		if (stack.length == 0 || ch != reverse) { // if stack is empty or ch is an opening bracket '[', parentheses
			System.out.println("\nUnbalanced Parentheses!");
			return false;
		}
		return true;
	}
}
