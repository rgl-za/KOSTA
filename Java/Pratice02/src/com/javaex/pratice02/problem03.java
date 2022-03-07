package com.javaex.pratice02;

public class problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
		
		for(int i=0; i<c.length; i++)
			System.out.print(c[i]);
			System.out.println("");
		
		for(int i=0; i<c.length; i++) {
			if(c[i] == ' ') {
				c[i] = ',';
			}
			System.out.print(c[i]);
		}
	}

}
