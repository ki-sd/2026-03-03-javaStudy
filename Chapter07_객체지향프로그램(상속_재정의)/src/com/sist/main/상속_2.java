package com.sist.main;
/*
 *    상속 => 다른 클래스의 변수/메서드는 사용 가능
 *                        ----
 *                        | 프로그램에 맞지 않는 경우
 *                        | 변경해서 사용 : 오버라이딩
 *    오버라이딩 : 변경해서 덮어쓴다
 *      1. 상속이 존재
 *      2. 메서드명 동일
 *      3. 매개변수 동이
 *      4. 리턴형 동일
 *      5. 접근지정어 => 확대(o),축소(x)
 *         public > protected > default > private
 */
class Super {
	int a,b;
	public void display() {
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
}
class Sub extends Super {
	int c;
	int a,b;     // 변수 오버라이딩 => this/super를 따로 제어
	public Sub() {
		super.a=100;
		super.b=200;
	}
	public void print() {
		super.display();
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
}
public class 상속_2 {
class Animal {
	public void run() {
		System.out.println("두발로 걷는다");
	}
	public void eat() {
		System.out.println("먹는다");
	}
}
class Dog extends Animal {
	public void run() {
		System.out.println("네발로 걷는다");
	}
	public void eat() {
		System.out.println("개같이 먹는다");
	}
}
class Pig extends Animal {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s=new Sub();
		s.print();
	}

}
