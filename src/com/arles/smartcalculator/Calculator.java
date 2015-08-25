package com.arles.smartcalculator;

public class Calculator {
	
	private String mInputString;
	
	public Calculator(String string) {
		mInputString = string;
	}
	
	public double calculate() {
		SimpleParser parser = new SimpleParser(mInputString);
		
		parser.parse();
		return 0.0;
	}
	
	public static double evaluate(ArithmeticOperation operation, double leftOperand, double rightOperand) {
		return 0;
		
	}

}
