package com.sist.main;

/*
 * 
 *      1. 생성자 매개변수 여부
 *      2. class A
 *         class B extends A
 *         
 *         => A a=new A() (X)
 *         => B b=new B()
 *            A c=new B()
 *            --- -------
 *                |메서드 관리
 *            |변수관리
 */
class Saram {
	String name;
	String sex;
	static int age;
	public Saram(String name,String sex) {
		this.name=name;
		this.sex=sex;
		age=20;
	}
}
class Member extends Saram {
	/*
	 *    상속
	 *    = 생성자 => default 생성자는 자동 호출
	 *    = 매개변수가 있는 경우에는 super()
	 */

	public Member(String name, String sex) {
		super(name, sex);
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("이름:"+super.name);
		System.out.println("성별:"+super.sex);
		Member.age=25;
		System.out.println("나이:"+Member.age);
	}
	
}
/*
 *     1. 상속내리는 클래스 => 매개변수가 있는 생성자가 있는 경우
 *        => 상속받는 클래스에서 반드시 super(값...)
 *     2. 변수 상속시 => super / this 구분 없음
 *        => 구분 : 상속받은 클래스에서 변수를 다시 설정
 */
public class 재사용_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m=new Member("홍길동", "남자");
		m.display();
	}

}
