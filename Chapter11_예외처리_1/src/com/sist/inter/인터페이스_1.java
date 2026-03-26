package com.sist.inter;
/*
 *     기본
 *      = 클래스 : 설계 도구
 *      = 객체 : 실제로 만들어진 것 => 사용
 *      = 인스턴스 : 객체가 만들어질때 생기는 하나의 실체
 *                 -------------------------
 *                   메모리에 저장된 상태
 *        클래스 ========= 메모리
 *              인스턴스화  ----
 *                       인스턴스
 *                         |
 *                        A a => 객체
 *     예시)
 *      스마트폰 설계 => 클래스
 *        모델명
 *        색상
 *        저장용량
 *        카메라
 *      --------- 메모리에 저장
 *        S26
 *        빨간색
 *        128GB
 *        12MP
 *      --------- 인스턴스
 *      스마트폰 구매
 *      --------- 사용 : 객체
 *      
 *      
 *      1. 인터페이스 / 추상클래스
 */
// 특별한 경우가 아니면 => 인터페이스는 거의 라이브러리
// 계속
interface 도형 {
	String COLOR="black";
	public void draw();
	
}
class 선 implements 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR+"를 이용하여 선을 그린다");
	}
	
}
class 사각형 implements 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR+"를 이용하여 사각형을 그린다");
	}
	
}
class 삼각형 implements 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR+"를 이용하여 삼각형을 그린다");
	}
	
}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 a=new 선();
		a.draw();
		
		a=new 사각형();
		a.draw();
		
		a=new 삼각형();
		a.draw();
	}

}
