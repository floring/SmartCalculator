package com.arles.smartcalculator;

import java.util.Scanner;
import java.util.StringTokenizer;

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
		String inputString = "(23     + 5.6) / 2 *    1";
		inputString = StringUtil.trimWhitespaces(inputString);
		
		StringTokenizer st = new StringTokenizer(inputString, "+-()*/", true);
		while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
		
		
		
//		Calculator calculator = new Calculator(inputString);
//		double result = calculator.calculate();
//		System.out.println(result);
		
	}

}
