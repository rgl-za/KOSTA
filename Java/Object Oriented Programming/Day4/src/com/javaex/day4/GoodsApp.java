package com.javaex.day4;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera = new Goods(); // Goods 객체 생성
		
		// 생성된 객체의 값 세팅
//		camera.name = "Nikon";
//		camera.price = 400000;
		
		// 메소드를 통해 접근하여 값 세팅
		camera.setName("Nickon");
		camera.setPrice(400000);
		
		// 객체 값 출력 
//		System.out.println("상품명: "+camera.name);
//		System.out.println("가격: "+camera.price+"원");
		camera.showInfo();
		
		
		
		// 추가 문제: 데이터 추가하기 (클래스 변경 없어야 함): 그냥 객체 추가 생성하면 됨 
		Goods laptop = new Goods();
		Goods cup = new Goods();
		
//		laptop.name = "LG gram"; 
//		laptop.price = 900000;
		laptop.setName("LG gram");
		laptop.setPrice(900000);
//		
//		System.out.println("상품명: "+laptop.name);
//		System.out.println("가격: "+laptop.price+"원");
		laptop.showInfo();
//		
//		cup.name = "Mugcup";
//		cup.price = 2000;
		cup.setName("Mugcup");
		cup.setPrice(2000);
//		
//		System.out.println("상품명: "+cup.name);
//		System.out.println("가격: "+cup.price+"원");
		cup.showInfo();
		
		
		// 인자 값으로 초기값을 넘기면 훨씬 간단하게 작성 가능
		Goods coffee = new Goods("ediya", 1000);
		coffee.showInfo();
		
		
		
		
	}

}
