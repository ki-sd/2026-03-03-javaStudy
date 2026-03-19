// 객체의 생명주기
/*
 * 	설계 :class{} ==== 변수의 초기화 ====== 메모리 저장 ======= 활용 ======== 소멸
 * 	 변수 / 메서드		  생성자/static{}	   new 생성자()	  객체.메서드	   객체=null / System.gc()
 * 													  객체.변수명
 * 	변수의 초기화
 * 	 => 다른 값 설정 => 생성자
 * 
 * 	생성자의 특징: 클래스명과 동일 / 리턴형 없음
 * 
 * 	1) 생성자
 * 	   class A {
 * 	   		A(){}
 * 			A(int a){}
 * 			  -------- 여러개의 생성자 만들수있음 (오버로딩)
 * 	   }
 * 
 * 
 * 
 */
class Member {
	int a;
	Member() {
		a=100;
		System.out.println("Member 생성자 호출=a:"+a);
	}
	void display() {
		System.out.println("객체 활용");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸...");
	}
	
}
public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		m.display();
		m=null;
		System.gc();
	}

}
