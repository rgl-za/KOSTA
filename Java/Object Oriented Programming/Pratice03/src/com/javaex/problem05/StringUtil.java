package com.javaex.problem05;

public class StringUtil {
	
	private static String str="";

	public static String concatString(String[] strArray) {
		
		for(int i=0; i<strArray.length; i++) {
			str+=strArray[i];
		}

		return str;
	}

}
