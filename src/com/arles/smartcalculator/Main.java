package com.arles.smartcalculator;

/**
 * Entry point of program.
 * @author Admin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputString = "(20+34)*3/2";
		inputString = StringUtil.trimWhitespaces(inputString);
		
		Calculator calculator = new Calculator(inputString);
		double result = calculator.calculate();
		System.out.println(result);
	}

}
