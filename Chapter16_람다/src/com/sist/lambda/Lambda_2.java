package com.sist.lambda;
/*
 *     1. 람다식이란
 *        1) 람다식 = 익명의 함수
 *        2) 메서드처럼 매개변수 전달 가능
 *        3) 코드 간결화
 *        4) 함수형 프로그램 스타일
 *     2. 기본문법
 *        (매개변수)->{실행문}
 *        public 리턴형 메서드명(매개변수)
 *        {
 *            실행문
 *        }
 *     3. 규칙 존재
 *        데이터형 생략
 *        (int a,int b)(x) => (a,b)
 *        리턴형 {return a} => {a} => 자동으로 리턴인식
 *     4. 인터페이스로 제작
 *        ------------ 사용자 정의 보다는 스트림을 주로 사용
 *     5. 사용위치
 *        => 메서드 => 한번만 사용하고 버리는 경우(재사용X)
 *                   List에 저장된 데이터 변환이 많은 경우
 *                   ----------------------------
 *                   데이터베이스 : 출연
 *                => 메서드 구현시 10줄이상 => 메서드 (람다x)
 */
// => 이미 만들어진 라이브러리 사용이 많음 => 사용자 정의는 특수한 경우
import java.util.*;
@FunctionalInterface  // 람다용으로 사용 선언
interface Calc {
	// 반드시 메서드는 한개 (추상메서드)
	int calc(int a,int b);
	// default는 가능 => 재사용
	default int sum(int a,int b) {
		return a+b;
	}
}
/*
 *    속도가 빠름 => C언어 도입
 *    클래스                    람다
 *      => .class 파일 생성       .class파일 생성X
 *      => 메모리 커짐             메모리 작음
 *      => this참조              외부 클래스 참조
 *      => 재사용                 재사용 불가
 *      
 *      람다 객체 생성 가능 => 클래스 파일 생성X
 */
public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc add=(a,b)->a+b;
		Calc minus=(a,b)->a-b;
		Calc mul=(a,b)->a*b;
		Calc div=(a,b)->a/b;
		
		System.out.println(add.calc(10,20));
		System.out.println(minus.calc(100,20));
		System.out.println(mul.calc(10,20));
		System.out.println(div.calc(10,3));
	}

}
