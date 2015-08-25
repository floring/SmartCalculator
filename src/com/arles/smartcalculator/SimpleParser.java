package com.arles.smartcalculator;

import java.util.List;
import java.util.Scanner;

public class SimpleParser extends Parser {
	
	private String[] operations = {"+", "-"};

	private List<String> mTokens;
	private int mCurrentPosition;
	
	public SimpleParser(String expression) {
		splitIntoTokens(expression);
	}

	@Override
	public void parse() {
		expr();
		
	}

	private double expr() {
		double leftOperand = fact();

		return 0.0;
	}

	private double fact() {
		double leftOperand = term();

		return 0.0;
	}
	
	private double term() {

		return 0.0;
	}
	
	private String peek() {
		if(mCurrentPosition < mTokens.size()) return mTokens.get(mCurrentPosition);
		throw new IndexOutOfBoundsException("Token's size less than current position");
	}
	
	private void splitIntoTokens(String expression) {
		Scanner scanner = new Scanner(expression);
		while (scanner.hasNext()) {
			mTokens.add(scanner.next());
		}
		scanner.close();
	}

}
