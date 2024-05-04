package com.util;

public class Validators {

	public static boolean isEmpty(String str) {
		if (str == null || str.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean isAlpha(String str) {
		String alphaReg = "[a-zA-Z]+";
		return str.matches(alphaReg);
	}
}
