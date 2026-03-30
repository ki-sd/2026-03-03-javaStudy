package com.sist.lang;

import java.util.Objects;

// equals / hashCode
// 객체비교 / 객체 식별자
/*
 *    1. toString() : 문자열 변환 => 생략가능
 *    2. clone() : 복제 => 새로운 메모리 생성
 *       Spring => prototype()
 *    3. finalize() : 소멸자 => 메모리에서 해제
 *       => 자동호출 => System.gc()
 *    4. equals/hashCode
 *       => 객체비교/식별자
 *    5. getClass => 기존의 객체 읽기
 */
/*
 *   java.lang
 *      => 자바 소스 기본이 되는 클래스 집합 => import 생략가능
 *      => 컴파일러 자동추가
 *        1. import java.leng.*
 *        2. extends Object
 *        3. 메서드 => void => return
 *        4. 기본생성자
 *        5. 생성자에서 => super()
 *      => Object클래스는 모든 클래스에 상속내리는 최상위클래스
 *        ------------ 데이터형중 가장 큰 데이터
 *        ------------ 데이터베이스 연동
 *         Object o=new Object()
 *         o=1, o=10.5, o=true... 통합가능
 *         ----------------------
 *         => let a=10 a=20.5 a="aaa" => TypeScript
 *         => let a:number=10
 */
// equlas : 객체비교
class Human {
	String id,name;
	public Human(String id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name); //메모리 주소가 동일
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Human h=(Human)obj;
		return name.equals(h.name) && id.equals(h.id);
	}
	// 문자열 => String은 Object의 equals => 재정의
	// 값만 비교 => 재정의 (오버라이딩)
	// => 재정의해서 사용
}


// 중복이 없는 객체 생성 => Set
public class Object_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1=new Human("hong", "홍길동");
		Human h2=new Human("hong", "홍길동");
		// equals => 값이 아니라 주소값을 비교
		System.out.println("h1="+h1);
		System.out.println("h2="+h2);
		
		System.out.println("h1="+h1.hashCode());
		System.out.println("h2="+h2.hashCode());
		if(h1.equals(h2)) {
			System.out.println("같은 사람");
		}else {
			System.out.println("다른 사람");
		}
	}

}
