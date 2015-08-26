package com.arles.smartcalculator;

/**
 * Calculator class invokes parse method and evaluate expression, which is returned.
 * @author Admin
 *
 */
public class Calculator {

	private String mInputString;

	public Calculator(String string) {
		mInputString = string;
	}

	public double calculate() {
		SimpleParser parser = new SimpleParser(mInputString);

		double res = parser.parse();
		return res;
	}

	public static double evaluate(ArithmeticOperation operation,
			double leftOperand, double rightOperand) {
		double result = 0;
		switch (operation) {
		case plus:
			result = leftOperand + rightOperand;
			break;
		case minus:
			result = leftOperand - rightOperand;
			break;
		case multiply:
			result = leftOperand * rightOperand;
			break;
		case divide:
			result = leftOperand / rightOperand;
			break;
		default:
			break;
		}
		return result;
	}

}
