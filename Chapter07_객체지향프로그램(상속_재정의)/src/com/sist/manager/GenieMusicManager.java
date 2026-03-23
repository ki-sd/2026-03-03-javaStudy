package com.sist.manager;

public class GenieMusicManager {
	public static Music[] musics=new Music[100];
	public void init() {  // 크롤링 후 배열에 저장
		
	}
	// 목록 출력
	public Music[] musicAllData() {
		return musics;
	}
	// 상세 보기
	public Music musicDetail(int mno) {
		Music m=new Music();
		for(Music mm:musics) {
			if(mm.getMno()==mno) {
				m=mm;
				break;
			}
		}
		return m;
	}
	// 검색
	public Music[] musicFind(String type, String fd) {
		
		return musics;
	}
	// 동영상
	public String musicKey(String title) {
		String key="";
		return key;
	}
}
