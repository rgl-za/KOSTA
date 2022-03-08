package com.javaex.pratice02;

public class problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Lotto = new int[6];
		
		for(int i=0; i<Lotto.length; i++) {
			Lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j=0; j<i; j++) { // 배열의 기존 원소(i)를 방금 삽입한 수(j)와 비교해
				if(Lotto[i]==Lotto[j]) { // 같은 수가 있다면 i를 앞으로 밀어
					i--; // 다음 반복에서 같은 칸에 다른 수를 쓰도록 합니다.
					break;
				}
			}
		}
		for(int i=0; i<Lotto.length; i++)
			System.out.print(Lotto[i]+" ");
	}
}
