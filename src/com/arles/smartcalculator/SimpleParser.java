package com.arles.smartcalculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * This class implements parsing of given expression.
 * The expression is a character-numeric string, whose value should be calculated.
 * The string consists of numbers separated by round brackets - '(', ')', arithmetic operations - '+', '-', '*', '/' and whitespaces. 
 * For example: (23 + 5.6) * 2.
 * @author Admin
 *
 */
public class SimpleParser extends Parser {

	private List<String> mTokens = new ArrayList<>();
	private int mCurrentPosition;
	private final String DELEMITERS = "()+-*/";
	
	public SimpleParser(String expression) {
		splitIntoTokens(expression);
	}

	@Override
	public double parse() {
		double result = expr();
		return result;
	}

	private double expr() {
		double leftOperand = fact();
		if(ArithmeticOperation.isAdditionOrSubstraction(peekNext())) {
			ArithmeticOperation operation = ArithmeticOperation.fromString(readNext());
			double rightOperand = expr();
			return Calculator.evaluate(operation, leftOperand, rightOperand);
		}
		return leftOperand;
	}

	private double fact() {
		double leftOperand = term();
		if(ArithmeticOperation.isMultiplyOrDivision(peekNext())) {
			ArithmeticOperation operation = ArithmeticOperation.fromString(readNext());
			double rightOperand = fact();
			return Calculator.evaluate(operation, leftOperand, rightOperand);
		}
		return leftOperand;
	}
	
	private double term() {
		String token = peekNext();
		if(StringUtil.isNumber(token)) {
			return Double.parseDouble(readNext());
		} else {
			if(StringUtil.isOpenRoundBracket(peekNext())) {
				readNext();
				double result = expr();
				if(StringUtil.isCloseRoundBracket(peekNext())) {
					readNext();
					return result;
				} else {
					throw new InputMismatchException("Error. Brackets mismatching.");
				}
			}
		}
		throw new InputMismatchException("Error. Invalid input expression.");
	}
	
	private String peekNext() {
		return (mCurrentPosition < mTokens.size()) ? mTokens.get(mCurrentPosition) : "";
	}
	
	private String readNext() {
		return mTokens.get(mCurrentPosition++);
	}
	
	private void splitIntoTokens(String expression) {
		StringTokenizer st = new StringTokenizer(expression, DELEMITERS, true);
		while (st.hasMoreTokens()) {
			mTokens.add(st.nextToken());
	     }
	}

}
