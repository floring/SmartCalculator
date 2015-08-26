package com.arles.smartcalculator;

/**
 * This class contains methods for strings handling.
 * 
 * @author Admin
 * 
 */
public class StringUtil {

	private static final String SPACE_CHAR = "\\s+";

	/*
	 * Removes whitespaces in a string
	 */
	public static String trimWhitespaces(String string) {
		return string.replaceAll(SPACE_CHAR, "");
	}

	public static boolean isNumber(String inputString) {
		return inputString.matches("-?\\d+(\\.\\d+)?");
	}

	public static boolean isOpenRoundBracket(String inputString) {
		return inputString.equals("(");
	}

	public static boolean isCloseRoundBracket(String inputString) {
		return inputString.equals(")");

	}

}
