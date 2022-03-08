package com.javaex.day4;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	
	// 생성자
	public Song(String title, String artist, String album, String composer, int year, int track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	
	// Song 클래스에서 노래 제목과 가수만 입력받아 필드를 초기화하는 생성자 오버라이딩
	public Song(String title, String artist) {
//		this.title = title;
//		this.artist = artist;
		this(title, artist,"","",0,0);
	}
	
	
	
	
	public void showInfo() {
		System.out.println(getArtist()+", "+getTitle()+" ("+getAlbum()+", "+getYear()+", "+getTrack()+"번 track, "+ getComposer()+" 작곡)");
	}
}
