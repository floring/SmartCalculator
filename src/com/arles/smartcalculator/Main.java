package com.arles.smartcalculator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputString = "(23 + 34) * 5";
		inputString = StringUtil.trimWhitespaces(inputString);
		
		Parser parser = new SimpleParser();
		Calculator calculator = new Calculator(parser, inputString);
		double result = calculator.calculate();
		
		System.out.println(result);
	}

}
