package com.sist.manager;

public class Music {
	private int mno;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	private String title;
	private String singer;
	private String album;
	private String state;
	private String poster;
	private int idcrement;
	// 데이터 변경, 손실 방지 => 은닉화
	// 필요한 경우엔 사용이 가능하게 => getter/setter
	// 변수+메서드 => 하나로 묶어서 처리
}
