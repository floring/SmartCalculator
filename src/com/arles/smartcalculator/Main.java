package com.arles.smartcalculator;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputString = "( 23 + 34 ) * 5";
		
		Calculator calculator = new Calculator(inputString);
		double result = calculator.calculate();
		
		System.out.println(result);
		
	}

}
