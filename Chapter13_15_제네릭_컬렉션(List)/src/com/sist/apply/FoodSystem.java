package com.sist.apply;
import java.util.*;
import java.io.*;
public class FoodSystem {
	private static ArrayList<Food> fList=new ArrayList<Food>();
	/*
	 *    <> : 데이터형 변경
	 *         형변환의 문제 발생 방지
	 *    데이터형을 모르는 경우 <?>
	 *    ---------------------------
	 *    1. 소스가 간결
	 *    2. 형변환 X
	 *    3. 가독성 => 어떤 데이터가 들어가는지 확인 용이
	 *    4. 컬렉션에서 데이터형 안정성을 가지고 있음
	 *       => 컴파일시 변경
	 *          변수/매개변수/리턴형
	 *       => 컬렉션 / 함수형 인터페이스(람다)
	 *       => 클래스에 있는 모든 데이터형 통일
	 *       T => String
	 *       -- Object => 모든 데이터 가능 => 프로그램 불안정
	 */
	static {
		
	}
	//기능
	// 1. 목록 => 페이지 subList
	// 2. 상세보기
	// 3. 검색
	// => 출력 : main => 윈도우 => 브라우저
}
