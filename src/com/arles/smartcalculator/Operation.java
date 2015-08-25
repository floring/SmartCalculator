package com.arles.smartcalculator;

public enum Operation {
	plus("+"), minus("-"), multiply("*"), divide("/");

	private String mOperation;

	Operation(String operation) {
		mOperation = operation;
	}

	public String getOperation() {
		return mOperation;
	}

	public static boolean contains(String text) {
		if (text != null) {
			for (Operation op : Operation.values()) {
				if (text.equalsIgnoreCase(op.mOperation)) {
					return true;
				}
			}
			return false;
		}
		throw new IllegalArgumentException("No constant with text " + text
				+ " found");
	}
}
