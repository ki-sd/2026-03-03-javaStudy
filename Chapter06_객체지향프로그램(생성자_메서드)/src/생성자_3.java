/*
 * 	생성자 선언 => 모든 클래스에서 제작하는건 아님
 * 				필요시에만 만든다
 * 	=> 없는 경우 자동으로 생성됨
 * 
 */
class Student {
	int hakbun;
	String name;
	int kor,eng,math;
	// => 변수값을 다르게 저장
	Student(int h,String n,int k,int e,int m) {
		hakbun=h;
		name=n;
		kor=k;
		eng=e;
		math=m;
	}
	Student(int hakbun, String name) {
		this.hakbun=hakbun;
		// this => 자신의 객체 => lee
		// 
		this.name=name;
	}
	/*
	 * 	변수찾기 순서
	 * 	=> 1. 지역변수
	 * 	=> 2. 인스턴스변수
	 */
}
public class 생성자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student(1, "홍길동", 90, 90, 90);
		Student shim = new Student(2, "심청이", 80, 80, 80);
		Student park = new Student(3, "박문수", 70, 70, 70);
		
		System.out.println(hong.hakbun+" "+hong.name+" "+hong.kor+" "+hong.eng+" "+hong.math);
		System.out.println(shim.hakbun+" "+shim.name+" "+shim.kor+" "+shim.eng+" "+shim.math);
		System.out.println(park.hakbun+" "+park.name+" "+park.kor+" "+park.eng+" "+park.math);
		
		Student lee = new Student(4, "이순신");
		
		System.out.println(lee.hakbun+" "+lee.name);
	}

}
