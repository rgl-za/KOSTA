package com.javaex.problem05;

public class StringUtilApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray = {"SuperMan", "BatMan", "SpiderMan"};
        String resultStr = StringUtil.concatString(strArray);
        
        System.out.println("결과 문자열:" + resultStr);

	}

}
