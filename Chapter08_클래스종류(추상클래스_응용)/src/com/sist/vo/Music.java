package com.sist.vo;

import lombok.Getter;
import lombok.Setter;
// 데이터베이스 컬럼과 반드시 일치해야함
@Getter@Setter
public class Music {
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String state;
	private String poster;
	private int idcrement;
}
