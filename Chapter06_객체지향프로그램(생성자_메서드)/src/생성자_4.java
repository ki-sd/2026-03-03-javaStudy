/*
 * 		생성자 229p
 * 		  => 자신의 생성자를 호출 가능
 * 		  => this() => 자신의 생성자 => 상속 super()
 * 		  => this => 객체(자신) => 상속 내린 클래스 : super
 * 
 * 		class A {
 * 			int a,b,c,d,e,f;
 * 			A(){
 * 				a=1;
 * 				b=2;
 * 				c=3;
 * 				d=4;
 * 				e=5;
 * 				f=6;		
 * 
 * 		}
 * 
 * 		=====> 1. 반복 제거 => for / 메서드 / 생성자
 * 				------------------------------
 * 				공통모듈 => 수정 편리
 * 				
 * 		
 */
class Member2 {
	int mno;
	String name;
	String address;
	// static{}, static 메서드 안에서는 사용 불가
	// static => 모든곳에서 사용 가능
	// ctrl+클릭 => 현재 선언된 메서드 위치로 이동
	Member2() {
		mno = 1;
		name = "홍길동";
		address = "서울";
	}
	Member2(String n) {
		this();// 생성자안에서만 사용 가능
			   // 중복코딩이 많은 경우
			   // 반드시 첫번째줄에서 사용
		name = n;
	}
	Member2(String n, String a) {
		this(n);
		name = n;
		address = a;
	}
}
public class 생성자_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 m1 = new Member2();
		System.out.println("회원번호:"+m1.mno);
		System.out.println("이름:"+m1.name);
		System.out.println("주소:"+m1.address);
		Member2 m2 = new Member2("심청이");
		System.out.println("회원번호:"+m2.mno);
		System.out.println("이름:"+m2.name);
		System.out.println("주소:"+m2.address);
		Member2 m3 = new Member2("박문수","부산");
		System.out.println("회원번호:"+m3.mno);
		System.out.println("이름:"+m3.name);
		System.out.println("주소:"+m3.address);
	}

}
