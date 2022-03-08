package com.javaex.day4;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Song s1 = new Song();
//		
//		s1.setArtist("아이유");
//		s1.setTitle("좋은날");
//		s1.setAlbum("Real");
//		s1.setYear(2010);
//		s1.setTrack(3);
//		s1.setComposer("이민수");
//		
//		s1.showInfo();
//		
//		Song s2 = new Song();
//		
//		s2.setArtist("BIGBANG");
//		s2.setTitle("거짓말");
//		s2.setAlbum("Always");
//		s2.setYear(2007);
//		s2.setTrack(2);
//		s2.setComposer("G-DRAGON");
//		
//		s2.showInfo();
//		
//		Song s3 = new Song();
//		
//		s3.setArtist("버스커버스커");
//		s3.setTitle("벚꽃엔딩");
//		s3.setAlbum("버스커버스커 1집");
//		s3.setYear(2012);
//		s3.setTrack(4);
//		s3.setComposer("장범준");
//		
//		s3.showInfo();
		
		Song s4 = new Song("아이유", "좋은날", "Real", "이민수", 2010, 3);
		s4.showInfo();
		
		
		Song s5 = new Song("dd", "ff");
		s5.showInfo();
		
	}

}
