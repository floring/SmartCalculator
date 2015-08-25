package com.arles.smartcalculator;

public class Calculator {
	
	private String mInputString;
	private Parser mParser;
	
	public Calculator(Parser parser, String string) {
		mParser = parser;
		mInputString = string;
	}
	
	public double calculate() {
		throw new UnsupportedOperationException();
	}

}
