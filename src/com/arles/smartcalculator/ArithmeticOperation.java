package com.arles.smartcalculator;

public enum ArithmeticOperation {
	plus("+"), minus("-"), multiply("*"), divide("/");

	private String mOperation;

	ArithmeticOperation(String operation) {
		mOperation = operation;
	}

	public String getOperation() {
		return mOperation;
	}
	
	public static ArithmeticOperation fromString(String text) {
	    if (text != null) {
	      for (ArithmeticOperation op : ArithmeticOperation.values()) {
	        if (text.equalsIgnoreCase(op.mOperation)) {
	          return op;
	        }
	      }
	    }
	    throw new IllegalArgumentException("No constant with text " + text + " found");
	  }
	
	public static boolean isAdditionOrSubstraction(String text) {
		if (text != null) {
			if(text.equals(ArithmeticOperation.plus.getOperation()) 
					|| text.equals(ArithmeticOperation.minus.getOperation())) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isMultiplyOrDivision(String text) {
		if (text != null) {
			if(text.equals(ArithmeticOperation.multiply.getOperation()) 
					|| text.equals(ArithmeticOperation.divide.getOperation())) {
				return true;
			}
		}
		return false;
	}
}
