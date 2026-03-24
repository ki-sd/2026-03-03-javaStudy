package com.sist.main;
/*
 *    1. 수정/추가 => 오버라이딩/오버로딩
 *    => 오버라이딩은 메서드 동일
 *    => 오버로딩 => 리턴형/접근지정어는 관계X
 *                메서드명 동일/매개변수가 다름
 *       final => 상수
 *       
 *       static / private / protected / public
 *       -------------------------------------
 *       | 클래스 영역에서만 사용 가능
 *       | 지역변수 / 클래스 => final
 *       
 *         final => 데이터베이스 주소 / 네트워크 서버 주소
 *                  PORT번호 / UserName / Password
 *           | => 대문자
 *       => final class => 상속 불가
 *          final method()  => 오버라이딩 불가
 *          
 *       -----------------------------------------
 *       
 *       306p
 *       형변환 : 클래스는 반드시 상속 / 포함이 있는 상태에서만
 *              클래스 크기를 잴 수 있다
 *              
 *          상속
 *           = 상속 내리는 클래스 : Super
 *           = 상속 받는 클래스 : Sub
 *           
 *           => Super > Sub
 *           
 *          포함
 *           = 포함하고있는 클래스 : A
 *           = 포함되는 클래스 : B
 *           
 *           => A>B
 *           
 *           
 *         => 자동 형변환 => UpCasting
 *            상속내리는 클래스=상속받은 클래스
 *            -----------  ----------
 *             큰 클래스      작은 클래스
 *         => 강제 형변환 => DownCasting
 *            class A
 *              |
 *            class B extends A
 *            
 *            A > B
 *            
 *            A a=new B
 *            
 *            B b=(B)new A
 *            
 */
class A {
	
}
class B extends A {
	
}
class C extends A {
	
}
class D extends A {
	
}
public class 다형성_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();  //가장 많이 사용
		// 상속 => 재사용, 관련된 클래스 모아서 관리
		// 웹
		A c=new B();
		c=new C();
		c=new D();
	}

}
