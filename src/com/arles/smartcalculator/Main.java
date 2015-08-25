package com.arles.smartcalculator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputString = "(23 + 34) * 5";
		inputString = StringUtil.trimWhitespaces(inputString);
		
		System.out.println(inputString);
	}

}
