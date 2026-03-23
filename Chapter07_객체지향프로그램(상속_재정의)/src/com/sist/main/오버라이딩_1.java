package com.sist.main;
class Parent {
	int a=10;
	public void display() {
		System.out.println("Parent:display() Call..");
	}
}
class Child extends Parent {
	int a=100;
	public void display() {
		System.out.println("Child:display() Call..");
	}
}
public class 오버라이딩_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		System.out.println("p.a="+p.a);
		p.display();
		Child c=new Child();
		System.out.println("c.a="+c.a);
		c.display();
		
		Parent pp=new Child();
		//변수:parent		메서드:child
		System.out.println("pp.a="+pp.a);
		pp.display();
		//변수 => 클래스에 존재
		//메서드 => 생성자 타입 따라감
		//상속 => 기본 목적 => 객체 1개 생성 => 여러개의 클래스를 모아서 관리
		//A~Z => Object
	}

}
