/*
 *   객체지향 => 설계
 *   1) 요구사항 분석
 *      => 데이터보다는 기능 중심
 *         (변수)    (메서드)  => 인터페이스/추상클래스
 *   2) 객체 도출 (생성)
 *   3) 클래스마다 역할 / 책임(단일 책임)
 *      => 한가지 기능을 모아서 관리
 *   4) 관계설정
 *      => 상속/포함
 *   5) 구현 => 리팩토링
 *      => 중복제거 / 객체 설계에 대한 위반 여부
 *   6) 실행
 *   
 *   객체지향의 4대 특성
 *   => 데이터 보호 : 캡슐화
 *      변수는 private(은닉화)
 *      => 외부에서도 사용 가능 => getter/setter
 *      => 메모리에 저장되면 해킹 위험↑
 *      캡슐화의 목적
 *      1. 데이터 보호=> 잘못된값 설정 방지(손실, 변경)
 *         => 데이터베이스 : 무결정 원칙
 *        ----------------------
 *      2. 유지보수 용이 => 내부 변경 불가
 *      3. 코드 안정성 향상
 *      3. 구현
 *         변수는 private으로 선언
 *         getter/setter 접근 연습 : lombok
 *         ** 전체를 만드는 것보다는 필요한 부분에서만 설정
 *         => 윈도우: Button/TextField ...
 *         => 다른 메서드를 사용할 수 있다.
 *      => 캡슐화는 대이터를 
 *       --------------------------------------
 *     2. 상속: 재사용 일종
 *            ----
 *            상속 : is-a : 수정해서 확장 => 20%
 *                  => 윈도우 / 쓰레드 / 네트워크
 *            포함 : has-a :있는 그대로
 *                         => 라이브러리 => 표준화
 *                         => 80%
 *                  => 데이터베이스 / 빅데이터 / 크롤릴
 *                  => 외부 라이브러리
 *                  => 자바에서 지원하는 라이브러리
 *                  => 외부업체에서 맏는 라이브러리
 *                     ---- mvnrepository.com
 *                     ---- 우리나라에서 만든 라이브러리 (꼬꼬마)
 *      1) 개념
 *         1. 기존의 클래스의 멤버변수 / 메서드를 받아 확장하는 프로그래밍
 *         2. 코드 재사용 / 확장성 높이는 방법
 *         3. 상속의 키워드 => extends
 *      2) 특징
 *         1. 단일 상속 (다중 상속 => 중복된 메서드, 변수 => 충돌)
 *            => 다중 상속을 하려면 인터페이스를 사용한다
 *         2. 상속 예외
 *            = 생성자
 *            = 초기화 블록
 *            = static
 *            = private
 *         3. super 키워드 이용해서 생성자/메서드 호출 가능
 *            ---------------
 *             ----super----
 *             상속받은 변수/메서드
 *             ---this----
 *             상속 외 자체에 있는 변수 / 메서드
 *             -----------
 *            -------------
 *      3) 장점
 *      4) 단점   
 *   
 *    
 *    
 */
package com.sist.main;

import java.util.*;
class Super {
	int a,b,c;
	public void display() {
		System.out.println("Super:display() Call");
	}
}

class Sub extends Super {
	// int a,b,c; => 내리상속 => 모든 : 생성자, 초기화블록, static
	// private : 접근 불가 => getter/setter
	int d;
	public void display() {
		System.out.println("Sub:display() Call");
	}
}

public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();
		System.out.println("sub.a="+sub.a);
		System.out.println("sub.b="+sub.b);
		System.out.println("sub.c="+sub.c);
		System.out.println("sub.d="+sub.d);
		sub.display();
		Super su=new Super();
		su.display();
		Super s=new Sub();
		s.display();
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("aaa");
		list.add('A');
		list.add(new Sub());
		
		Object o=list.get(3);
		Sub sss=(Sub)list.get(3);
	}

}
